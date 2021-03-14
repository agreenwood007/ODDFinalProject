
public class GuardCharlie extends ArmingDefender {
	
	public GuardCharlie(Defender newDefender) {
		super(newDefender);
		System.out.println("Guard Heading to Charlie!");
	}
	
	public String getDescription() {
		return tempDefender.getDescription() ;
	}
	
	public int getArrows() {
		System.out.println("Charlie Guard Received a Quiver of Arrows!");
		return tempDefender.getArrows() +10;
	}

}
