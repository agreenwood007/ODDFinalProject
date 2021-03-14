
public class GuardianRetreat implements GuardianState {
	
	private final Guard guard;
	
	public GuardianRetreat(Guard guard) {
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
		System.out.println("Hold your fire");
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		System.out.println("Fell back...");
	}

}
