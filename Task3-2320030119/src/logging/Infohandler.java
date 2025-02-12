package logging;

public class Infohandler extends Loghandler{
	  public void handleLog(String message) {
	        if (message.contains("INFO")) {
	            System.out.println("INFO: " + message);
	        } else if (nextHandler != null) {
	            nextHandler.handleLog(message);
	        }
	    }

}
