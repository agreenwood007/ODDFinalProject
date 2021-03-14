
public class GuardianAdvance implements GuardianState {

	private final Guard guard;
	
	public GuardianAdvance(Guard guard) {
		this.guard = guard;
	}
	
	
	@Override
	public void cover() {
		// TODO Auto-generated method stub
		System.out.println("Taking cover...");
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("Firing...");
		guard.setState(guard.getGuardianFire());
		
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		guard.setState(guard.getGuardianRetreat());
		System.out.println("Falling back...");
		
	}

}
