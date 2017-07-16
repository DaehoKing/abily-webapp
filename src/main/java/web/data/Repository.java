package web.data;

import java.util.List;

/**
 * Created by User on 2017-07-16.
 */
public interface Repository {
    List<Spittle> findSpilttles(int max, int count);
}
