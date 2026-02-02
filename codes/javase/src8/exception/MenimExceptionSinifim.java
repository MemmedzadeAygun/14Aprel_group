package exception;

public class MenimExceptionSinifim extends Exception {

	private String myMessage;
	
	public MenimExceptionSinifim(String message) {
		this.myMessage = message;
	}
	
	public String getMyMessage() {
		return myMessage;
	}
}
