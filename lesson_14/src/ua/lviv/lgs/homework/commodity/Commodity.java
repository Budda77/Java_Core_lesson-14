package ua.lviv.lgs.homework.commodity;

public class Commodity implements Comparable<Commodity>{
	private String name;
	private int lengthOfItem;
	private int widthOfItem;
	private int weigthOfItem;
	public Commodity(String name, int lengthOfItem, int widthOfItem, int weight) {
		super();
		this.name = name;
		this.lengthOfItem = lengthOfItem;
		this.widthOfItem = widthOfItem;
		this.weigthOfItem = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLengthOfItem() {
		return lengthOfItem;
	}
	public void setLengthOfItem(int lengthOfItem) {
		this.lengthOfItem = lengthOfItem;
	}
	public int getWidthOfItem() {
		return widthOfItem;
	}
	public void setWidthOfItem(int widthOfItem) {
		this.widthOfItem = widthOfItem;
	}
	public int getWeigthOfItem() {
		return weigthOfItem;
	}
	public void setWeigthOfItem(int weigthOfItem) {
		this.weigthOfItem = weigthOfItem;
	}
	@Override
	public String toString() {
		return "Commodity [name= " + name + ", length= " + lengthOfItem + ", width= " + widthOfItem
				+ ", kilo= " + weigthOfItem + "]";
	}
	
	@Override
	public int compareTo(Commodity o) {
		
		return this.name.compareTo(o.getName());
	}
	
	
	

}
