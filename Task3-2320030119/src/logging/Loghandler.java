package logging;

public abstract class Loghandler {
	protected Loghandler nextHandler;

    public void setNextHandler(Loghandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleLog(String message);

}
