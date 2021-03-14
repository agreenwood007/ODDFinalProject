
public class DeviceTrigger {
	
	Command theCommand;
	
	public DeviceTrigger(Command newCommand) {
		theCommand = newCommand;
		
	}
	
	public void press() {
		theCommand.execute();
	}
	
	public void pressUndo() {
		theCommand.undo();
	}

}
