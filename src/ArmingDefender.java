
public abstract class ArmingDefender implements Defender {
	
	protected Defender tempDefender;
	
	public ArmingDefender(Defender newDefender) {
		tempDefender = newDefender;
	}
	
	public String getDescription() {
		return tempDefender.getDescription();
		
	}
	
	public int getArrows() {
		return tempDefender.getArrows();
	}

}
