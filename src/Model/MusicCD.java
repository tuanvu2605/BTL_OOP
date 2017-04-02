package Model;

public class MusicCD extends Item{
	private Singer singer;
	public MusicKind kind;
	
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer = singer;
	}

}
