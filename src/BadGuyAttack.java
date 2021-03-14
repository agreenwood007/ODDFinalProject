
public abstract class BadGuyAttack {

	private String attacker;
	private double amtDamage;
	
	public String getAttacker() {return attacker;}
	public void setAttacker(String newAttacker) {attacker = newAttacker;}
	
	public double getDamage() {return amtDamage;}
	public void setDamage(double newDamage) {amtDamage = newDamage;}
	
	public void attackTheCastle() {
		System.out.println(getAttacker() + " is approaching the castle");
		}
	public void displayBadGuys() {
		System.out.println(getAttacker() + " is in position"); 
	}
	public void badGuyFires() {
		System.out.println(getAttacker() + " Fires and does" + getDamage() + " damage to castle");
	}
	
	
}
