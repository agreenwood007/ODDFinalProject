
public class TurnOnRadio implements Command{

	DisruptorDevice theDevice;
	
	public TurnOnRadio(DisruptorDevice newDevice) {
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.radioOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.radioOff();
	}

}
