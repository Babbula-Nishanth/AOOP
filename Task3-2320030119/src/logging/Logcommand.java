package logging;

public class Logcommand implements Command{
	 private Loghandler handler;

	    public Logcommand(Loghandler handler) {
	        this.handler = handler;
	    }

	    public void execute(String message) {
	        handler.handleLog(message);
	    }

}
