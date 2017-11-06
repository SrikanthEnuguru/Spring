package soundsystem;

import org.springframework.stereotype.Component;

@Component
//@Component("kickMovieAlbum")
//@Named("lonelyHeartsClub")

public class Kick2CD implements CompactDisc {
	private String title = "Kick 2 Movie Songs Album";
	private String artist = "Thaman";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
