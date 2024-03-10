package halatiukyurii.pl.lotto;

import halatiukyurii.pl.lotto.domaine.numbergenerator.WinningNumbersGeneratorFacadeConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({WinningNumbersGeneratorFacadeConfigurationProperties.class})
public class LottoSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(LottoSpringBootApplication.class, args);
    }
}
