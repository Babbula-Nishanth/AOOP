package logging;

public class Debug extends Loghandler{
	public void handleLog(String message) {
        if (message.contains("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(message);
        }
    }

}
