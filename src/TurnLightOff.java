
public class TurnLightOff implements Command {
	
	DisruptorDevice theDevice;
	
	public TurnLightOff(DisruptorDevice newDevice) {
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.lightOff();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.lightOn();
	}

}
