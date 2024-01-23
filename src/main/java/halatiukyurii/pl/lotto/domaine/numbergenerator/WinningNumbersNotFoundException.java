package halatiukyurii.pl.lotto.domaine.numbergenerator;

public class WinningNumbersNotFoundException extends RuntimeException {
    WinningNumbersNotFoundException(String message) {
        super(message);
    }
}
