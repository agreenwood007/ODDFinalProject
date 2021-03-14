
public class Guard implements GuardianState {
	
	private GuardianState guardianAdvance;
	private GuardianState guardianFire;
	private GuardianState guardianRetreat;
	private GuardianState guardianStandby;
	
	private GuardianState state;
	
	public Guard() {
		this.guardianAdvance = new GuardianAdvance(this);
		this.guardianFire = new GuardianFire(this);
		this.guardianRetreat = new GuardianRetreat(this);
		this.guardianStandby = new GuardianStandby(this);
		
		this.state = guardianAdvance;
	}
	
	public void setGuardianState(GuardianState state) {
		this.state = state;
	}

	@Override
	public void cover() {
		// TODO Auto-generated method stub
		state.cover();
		setState(getGuardianStandby());
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		state.fire();
		setState(getGuardianStandby());
	}

	

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		state.retreat();
		setState(getGuardianStandby());
		
	}
	
		

	public GuardianState getGuardianAdvance() {
		return guardianAdvance;
	}
	
	public void setGuardianAdvance(GuardianState guardianAdvance) {
		this.guardianAdvance = guardianAdvance;
	}
	public GuardianState getGuardianFire() {
		return guardianFire;
	}
	public void setGuardianFire(GuardianState guardianFire) {
		this.guardianFire = guardianFire;
	}
	public GuardianState getGuardianRetreat() {
		return guardianRetreat;
	}
	public void setGuardianRetreat(GuardianState guardianRetreat) {
		this.guardianRetreat = guardianRetreat;
	}
	public GuardianState getState() {
		return state;
	}
	public void setState(GuardianState state) {
		this.state = state;
	}
	public GuardianState getGuardianStandby() {
		return guardianStandby;
	}
	public void setGuardianStandby(GuardianState guardianStandby) {
		this.guardianStandby = guardianStandby;
	}

	
}
	
	























