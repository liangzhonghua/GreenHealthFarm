package bean;

public class Garden {
	private int gardenId;  //菜园编号
	private String type;   //托管类型
	private int acreage;   //面积（平方米）
	private int price;     //价格（元）
	private byte state;     //状态
	
	
	public int getGardenId() {
		return gardenId;
	}
	public void setGardenId(int gardenId) {
		this.gardenId = gardenId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAcreage() {
		return acreage;
	}
	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
	
}
