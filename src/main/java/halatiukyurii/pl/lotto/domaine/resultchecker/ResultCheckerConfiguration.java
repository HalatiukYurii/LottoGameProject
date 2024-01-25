package halatiukyurii.pl.lotto.domaine.resultchecker;

import halatiukyurii.pl.lotto.domaine.numbergenerator.WinningNumbersGeneratorFacade;
import halatiukyurii.pl.lotto.domaine.numberreceiver.NumberReceiverFacade;

public class ResultCheckerConfiguration {
    ResultCheckerFacade createForTest(WinningNumbersGeneratorFacade generatorFacade, NumberReceiverFacade receiverFacade, PlayerRepository playerRepository) {
        WinnersRetriever winnerGenerator = new WinnersRetriever();
        return new ResultCheckerFacade(generatorFacade, receiverFacade, playerRepository, winnerGenerator);
    }
}
