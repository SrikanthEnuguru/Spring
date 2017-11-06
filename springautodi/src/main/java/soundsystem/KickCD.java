package soundsystem;

import org.springframework.stereotype.Component;

@Component
//@Component("kickMovieAlbum")
//@Named("lonelyHeartsClub")

public class KickCD implements CompactDisc {
	private String title = "Kick Movie Songs Album";
	private String artist = "Thaman";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
