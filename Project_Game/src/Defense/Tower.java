package Defense;



public class Tower {
	private String name;
	private int power;
	private int RPM;
	private int health;
	private int maxhealth;
	private int repaircost;
	private int upgradecost;
	private boolean dead;

	

	public Tower(String name,int power,int RPM, int health, int maxhealth, int repaircost, int upgradecost) {
		this.setName(name);
		this.setPower(power);
		this.setRPM(RPM);
		this.setHealth(health);
		this.setMaxhealth(maxhealth);
		this.setRepaircost(repaircost);
		this.setUpgradecost(upgradecost);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRPM() {
		return RPM;
	}

	public void setRPM(int rPM) {
		RPM = rPM;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxhealth() {
		return maxhealth;
	}

	public void setMaxhealth(int maxhealth) {
		this.maxhealth = maxhealth;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public int getRepaircost() {
		return repaircost;
	}

	public void setRepaircost(int repaircost) {
		this.repaircost = repaircost;
	}

	public int getUpgradecost() {
		return upgradecost;
	}

	public void setUpgradecost(int upgradecost) {
		this.upgradecost = upgradecost;
	}

	
}
