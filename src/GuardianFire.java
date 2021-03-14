
public class GuardianFire implements GuardianState {
	
	private final Guard guard;
	
	public GuardianFire(Guard guard) {
		this.guard = guard;
	}

	@Override
	public void cover() {
		// TODO Auto-generated method stub
		System.out.println("Taking cover...");
		guard.setState(guard.getGuardianAdvance());
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("Firing...");
		
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		System.out.println("Can't return fire...");
		
	}

}
