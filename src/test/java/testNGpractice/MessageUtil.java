package testNGpractice;

public class MessageUtil {

	private String message;
	
	public MessageUtil(String message) {
		this.message = message;
		
	}
	
	public String getMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage() {
		message = "hi "+message;
		System.out.println(message);
		return message;
	}
	
}
