
public class GuardDelta extends ArmingDefender {
	
	public GuardDelta(Defender newDefender) {
		super(newDefender);
		System.out.println("Guard Heading to Delta!");
	}
	
	public String getDescription() {
		return tempDefender.getDescription() ;
	}
	
	public int getArrows() {
		System.out.println("Delta Guard Received a Quiver of Arrows!");
		return tempDefender.getArrows() +10;
	}

}
