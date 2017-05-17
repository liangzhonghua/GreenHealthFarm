package bean;

import java.util.Date;

public class rentOrders {
	private int orderId; //租地订单Id号
	private String userId;  //用户Id
	private int gardenId;  //菜园编号
	private byte state;   //状态（0代表已处理，1代表未处理）
	private Date time;  //租地日期时间
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getGardenId() {
		return gardenId;
	}
	public void setGardenId(int gardenId) {
		this.gardenId = gardenId;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
