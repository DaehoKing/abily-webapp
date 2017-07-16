package abily.musician;

import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2017-07-10.
 */
@Component
public interface Audience {
    @Retryable(maxAttempts = 2)
    int requestEncore();
}
