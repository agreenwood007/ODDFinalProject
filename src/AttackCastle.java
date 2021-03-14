import java.util.Scanner;


public class AttackCastle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Command Pattern
		DisruptorDevice newDevice = LineCutter.getDevice();
		
		TurnOnRadio onCommand = new TurnOnRadio(newDevice);
		DeviceTrigger onPressed = new DeviceTrigger(onCommand);
		onPressed.press();
		
		TurnOffRadio offCommand = new TurnOffRadio(newDevice);
		onPressed = new DeviceTrigger(offCommand);
		onPressed.press();
		
		TurnLightOn onCommand1 = new TurnLightOn(newDevice);
		DeviceTrigger onPressed1 = new DeviceTrigger(onCommand1);
		onPressed1.press();
		
		TurnLightOff offCommand1 = new TurnLightOff(newDevice);
		onPressed1 = new DeviceTrigger(offCommand1);
		onPressed1.press();
		
		
		//Factory Pattern
		
		BadGuyArmory GuyArmory = new BadGuyArmory();
		
		BadGuyAttack theBadGuy = null;
		@SuppressWarnings("resource")
		Scanner userKeys = new Scanner(System.in);
		System.out.println("How to proceed? Foot, Boat, Tank");
		
		if (userKeys.hasNextLine()) {
			String typeOfEngagement = userKeys.nextLine();
			theBadGuy = GuyArmory.makeBadGuyAttack(typeOfEngagement);
			
			if (theBadGuy != null) {
				makeGuy(theBadGuy);
				
			} else System.out.print("Should have entered Foot, Boat, or Tank");
			
		}
			
			
		//Decorator Pattern
		
		Defender basicDefender = new GuardDelta(new GuardCharlie(new GuardBravo(new GuardAlpha(new PlainDefender()))));
		
		System.out.println("Armory: " + basicDefender.getDescription());
		System.out.println("Armament: " + basicDefender.getArrows());

	
	}

	private static void makeGuy(BadGuyAttack theBadGuy) {
		// TODO Auto-generated method stub
		theBadGuy.displayBadGuys();
		theBadGuy.badGuyFires();
		theBadGuy.getDamage();
	}
	
	{
		//State Pattern
		Guard guard = new Guard();
		guard.cover();
		guard.fire();
		guard.cover();
		guard.retreat();
	
	}
}
