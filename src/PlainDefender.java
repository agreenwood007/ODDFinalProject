
public class PlainDefender implements Defender {
	
	public String getDescription() {
		return "Light Armor and Ready for Battle!";
	}

	public int getArrows() {
		System.out.println("Number of Arrows: " +40);
		return 0;
	}
}
