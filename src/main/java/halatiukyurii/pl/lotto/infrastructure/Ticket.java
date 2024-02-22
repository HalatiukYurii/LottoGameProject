package halatiukyurii.pl.lotto.infrastructure;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Ticket(String id) {
}
