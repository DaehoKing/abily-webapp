package abily.musician;

import org.springframework.stereotype.Component;

/**
 * Created by User on 2017-07-10.
 */
@Component
public class Man implements Audience{
    int encoreCount;
    public int requestEncore() {
        System.out.println("HEY~ Encore!");
        return this.countEncore();
    }

    private int countEncore(){
        return ++encoreCount;
    }
}
