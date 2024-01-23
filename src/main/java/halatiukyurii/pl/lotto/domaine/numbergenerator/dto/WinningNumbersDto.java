package halatiukyurii.pl.lotto.domaine.numbergenerator.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class WinningNumbersDto {
    private Set<Integer> winningNumbers;
    private LocalDateTime date;
}
