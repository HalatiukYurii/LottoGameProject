package halatiukyurii.pl.lotto.domaine.numberreceiver;

import java.time.LocalDateTime;
import java.util.Set;

 record Ticket(String ticketId, LocalDateTime drawDate, Set<Integer> numbersFromUser  ) {
}