package logging;

public class Error extends Loghandler{
	public void handleLog(String message) {
        if (message.contains("ERROR")) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(message);
        }
    }

}
