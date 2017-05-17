package bean;

import java.util.Date;

public class Message {
	private int messageId;  //聊天信息Id
	private String userId;  //用户Id
	private String chatContent; //消息内容
	private Date messageTime; //发送时间
	private byte state;  //状态（0代表已读，1代表未读）
	private byte messageType;  //消息类型（0代表发送的消息，1代表收到的消息）
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getChatContent() {
		return chatContent;
	}
	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}
	public Date getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
	public byte getMessageType() {
		return messageType;
	}
	public void setMessageType(byte messageType) {
		this.messageType = messageType;
	}
	
	
}
