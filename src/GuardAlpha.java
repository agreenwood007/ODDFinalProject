
public class GuardAlpha extends ArmingDefender {
	
	public GuardAlpha(Defender newDefender) {
		super(newDefender);
		System.out.println("Guard Heading to Alpha!");
	}
	
	public String getDescription() {
		return tempDefender.getDescription()  ;
	}
	
	public int getArrows() {
		System.out.println("Alpha Guard Received a Quiver of Arrows!");
		return tempDefender.getArrows() +10;
	}

}
