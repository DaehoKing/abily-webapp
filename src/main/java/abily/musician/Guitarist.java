package abily.musician;

import org.springframework.stereotype.Component;

/**
 * Created by abily on 2017. 7. 5..
 */
@Component
public class Guitarist implements Musician{
	public void playMusic() {
		System.out.println("Playing Guitar!!");
	}
}
