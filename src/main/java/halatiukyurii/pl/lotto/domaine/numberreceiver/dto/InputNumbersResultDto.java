package halatiukyurii.pl.lotto.domaine.numberreceiver.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
public record InputNumbersResultDto(String message, LocalDateTime drawDate, String ticketId, Set<Integer> numbersFromUser) {
}