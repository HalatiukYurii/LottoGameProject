package halatiukyurii.pl.lotto.domaine.numbergenerator;

public interface RandomNumberGenerable {
    SixRandomNumbersDto generateSixRandomNumbers(int count, int lowerBand, int upperBand);

}
