package chatapplication;

public class Message {
	
	private String name;
	private String content;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
}
