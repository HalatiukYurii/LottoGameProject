package halatiukyurii.pl.lotto.domaine.resultchecker;

import halatiukyurii.pl.lotto.domaine.numbergenerator.WinningNumbersGeneratorFacade;
import halatiukyurii.pl.lotto.domaine.numbergenerator.dto.WinningNumbersDto;
import halatiukyurii.pl.lotto.domaine.numberreceiver.NumberReceiverFacade;
import halatiukyurii.pl.lotto.domaine.numberreceiver.dto.TicketDto;
import halatiukyurii.pl.lotto.domaine.resultchecker.dto.PlayersDto;
import halatiukyurii.pl.lotto.domaine.resultchecker.dto.ResultDto;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Set;

import static halatiukyurii.pl.lotto.domaine.resultchecker.ResultCheckerMapper.mapPlayersToResults;


@AllArgsConstructor
public class ResultCheckerFacade {
    WinningNumbersGeneratorFacade winningNumbersGeneratorFacade;
    NumberReceiverFacade numberReceiverFacade;
    PlayerRepository playerRepository;
    WinnersRetriever winnerGenerator;

    public PlayersDto generateWinners() {
        List<TicketDto> allTicketsByDate = numberReceiverFacade.retrieveAllTicketsByNextDrawDate();
        List<Ticket> tickets = ResultCheckerMapper.mapFromTicketDto(allTicketsByDate);
        WinningNumbersDto winningNumbersDto = winningNumbersGeneratorFacade.generateWinningNumbers();
        Set<Integer> winningNumbers = winningNumbersDto.getWinningNumbers();
        if (winningNumbers == null || winningNumbers.isEmpty()) {
            return PlayersDto.builder()
                    .message("Winning failed to retrieve")
                    .build();
        }
        List<Player> players = winnerGenerator.retrieveWinners(tickets, winningNumbers);
        playerRepository.saveAll(players);
        return PlayersDto.builder()
                .results(mapPlayersToResults(players))
                .message("Winners succeeded to retrieve")
                .build();
    }

    public ResultDto findByHash(String hash) {
        Player player = playerRepository.findById(hash).orElseThrow(() -> new RuntimeException("Not found"));
        return ResultDto.builder()
                .hash(hash)
                .numbers(player.numbers())
                .hitNumbers(player.hitNumbers())
                .drawDate(player.drawDate())
                .isWinner(player.isWinner())
                .build();

    }
}
