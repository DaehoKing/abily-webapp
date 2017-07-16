package abily.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by abily on 2017. 7. 5..
 */
@Aspect
@Component
public class MyAspect {
	@Before("execution(* abily.musician.Musician.playMusic(..))")
	public void tune(){
		System.out.println("Tuning Instrument..");
	}
}
