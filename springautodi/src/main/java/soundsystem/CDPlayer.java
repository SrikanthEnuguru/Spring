package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
	@Autowired
	//@Inject
	public CDPlayer(CompactDisc cd) {		
		this.cd = cd;
	}

	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
	
	@Autowired(required=false)
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}
}
