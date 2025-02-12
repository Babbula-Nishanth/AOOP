package logging;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loghandler infoHandler = new Infohandler();
        Loghandler debugHandler = new Debug();
        Loghandler errorHandler = new Error();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Command logInfoCommand = new Logcommand(infoHandler);
        Command logDebugCommand = new Logcommand(debugHandler);
        Command logErrorCommand = new Logcommand(errorHandler);

        Logger logger = new Logger();

        logger.addCommand(logInfoCommand);
        logger.addCommand(logDebugCommand);
        logger.addCommand(logErrorCommand);

        logger.executeCommands();
    }

	}


