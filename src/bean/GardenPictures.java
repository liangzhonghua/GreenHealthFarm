package bean;

import java.util.Date;

public class GardenPictures {
	private int pictureId;  //菜园图片Id
	private int gardenId;  //菜园Id
	private String picture;  //菜园图片地址
	private Date time;  //上传时间
	
	
	public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	public int getGardenId() {
		return gardenId;
	}
	public void setGardenId(int gardenId) {
		this.gardenId = gardenId;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
