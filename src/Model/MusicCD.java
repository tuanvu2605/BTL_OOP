package Model;

public class MusicCD extends Item{
	private Singer singer;
	public MusicKind kind;
	
	
	public MusicCD (String name , Price price , Singer singer , MusicKind kind)
	{
		this.setName(name);
		this.setPrice(price);
		this.setSinger(singer);
		this.kind = kind;
				
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer = singer;
	}

}
