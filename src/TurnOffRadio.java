
public class TurnOffRadio implements Command {

	DisruptorDevice theDevice;
	
	public TurnOffRadio(DisruptorDevice newDevice) {
		theDevice = newDevice;
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.radioOff();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.radioOn();
	}

}
