package halatiukyurii.pl.lotto.domaine.resultannouncer;

import java.util.Optional;

public interface ResponseRepository {
    ResultResponse save(ResultResponse resultResponse);

    boolean existsById(String hash);

    Optional<ResultResponse> findById(String hash);
}
