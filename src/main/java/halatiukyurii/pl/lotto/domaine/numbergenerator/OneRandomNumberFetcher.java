package halatiukyurii.pl.lotto.domaine.numbergenerator;

public interface OneRandomNumberFetcher {
    OneRandomNumberResponseDto retrieveOneRandomNumber(int lowerBand, int upperBand);

}
