
public class BadGuyArmory {
	
	public BadGuyAttack makeBadGuyAttack(String newBadGuyType) {
		BadGuyAttack newBadGuy = null;
		
		if (newBadGuyType.equals("Foot")) {
			return new FootBadGuy();
			
		} else
			if (newBadGuyType.equals("Boat")) {
				return new BoatBadGuy();
			} else
				if (newBadGuyType.equals("Tank")) {
					return new TankBadGuy();
					
				}else return null;
		
		//If code looking weird at the end look at this 
		//return newBadGuy;
		
		
	}

}
