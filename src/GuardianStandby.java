
public class GuardianStandby implements GuardianState {
	
	
	private final Guard guard;

	public GuardianStandby(Guard guard) {
		this.guard = guard;
	}
	
	@Override
	public void cover() {
		// TODO Auto-generated method stub
		System.out.println("Standing by...");
		guard.setState(guard.getGuardianAdvance());
		System.out.println("Taking cover...");
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("Standing by...");
		guard.setState(guard.getGuardianFire());
		System.out.println("Taking cover...");
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		System.out.println("Standing by...");
		guard.setState(guard.getGuardianRetreat());
		System.out.println("Falling back...");
	}

}
