package halatiukyurii.pl.lotto.domaine.numbergenerator;

import halatiukyurii.pl.lotto.domaine.numberreceiver.NumberReceiverFacade;

public class NumberGeneratorConfiguration {
    WinningNumbersGeneratorFacade createForTest(RandomNumberGenerable generator, WinningNumbersRepository winningNumbersRepository, NumberReceiverFacade numberReceiverFacade) {
        WinningNumberValidator winningNumberValidator = new WinningNumberValidator();
        return new WinningNumbersGeneratorFacade(generator, winningNumberValidator, winningNumbersRepository, numberReceiverFacade);
    }
}
