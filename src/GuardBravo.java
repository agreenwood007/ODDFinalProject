
public class GuardBravo extends ArmingDefender {
	
	public GuardBravo(Defender newDefender) {
		super(newDefender);
		System.out.println("Guard Heading to Bravo!");
	}
	
	public String getDescription() {
		return tempDefender.getDescription() ;
	}
	
	public int getArrows() {
		System.out.println("Bravo Guard Received a Quiver of Arrows!");
		return tempDefender.getArrows() +10;
	}

}
