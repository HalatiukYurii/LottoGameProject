package halatiukyurii.pl.lotto.domaine.numberreceiver;

import halatiukyurii.pl.lotto.domaine.numberreceiver.dto.TicketDto;

public class TicketMapper {

    public static TicketDto mapFromTicket(Ticket ticket){
        return TicketDto.builder()
                .numbersFromUser(ticket.numbersFromUser())
                .ticketId(ticket.ticketId())
                .drawDate(ticket.drawDate())
                .build();
    }
}
