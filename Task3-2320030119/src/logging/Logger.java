package logging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger {
	 private List<Command> commands = new ArrayList<>();

	    public void addCommand(Command command) {
	        commands.add(command);
	    }

	    public void executeCommands() {
	        Iterator<Command> iterator = commands.iterator();
	        while (iterator.hasNext()) {
	            Command command = iterator.next();
	            command.execute("INFO: System running smoothly.");
	            command.execute("DEBUG: Diagnosing the problem.");
	            command.execute("ERROR: Problem needs attention.");
	        }
	    }

}
