package Model;

public class SellItem {
	
	private Item item;
	private int count;
	private long time;
	
	public SellItem(Item item , int count , long time)
	{
		this.item = item;
		this.count = count;
		this.time = time;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	
	

}
