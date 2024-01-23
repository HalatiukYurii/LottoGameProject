package halatiukyurii.pl.lotto.domaine.numberreceiver;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
record Ticket(String hash, Set<Integer> numbers, LocalDateTime drawDate) {
}
