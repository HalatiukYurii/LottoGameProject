package halatiukyurii.pl.lotto.domaine.resultannouncer;

import halatiukyurii.pl.lotto.domaine.resultchecker.ResultCheckerFacade;

import java.time.Clock;

public class ResultAnnouncerConfiguration {
    ResultAnnouncerFacade createForTest(ResultCheckerFacade resultCheckerFacade, ResponseRepository responseRepository, Clock clock) {
        return new ResultAnnouncerFacade(resultCheckerFacade, responseRepository, clock);
    }
}
