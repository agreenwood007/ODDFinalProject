
public class TurnLightOn implements Command {
	
	DisruptorDevice theDevice;
	
	public TurnLightOn(DisruptorDevice newDevice) {
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.lightOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.lightOff();
	}

}
