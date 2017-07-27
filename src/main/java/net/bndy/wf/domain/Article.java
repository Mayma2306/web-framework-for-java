package net.bndy.wf.domain;

public class Article extends _BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private long userId;
	private long boTypeId;
	private String title;
	private String content;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getBoTypeId() {
		return boTypeId;
	}
	public void setBoTypeId(long boTypeId) {
		this.boTypeId = boTypeId;
	}
}
