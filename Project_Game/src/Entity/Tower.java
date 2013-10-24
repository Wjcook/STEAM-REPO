package Entity;


public class Tower extends Entity{
	private char name;
	private int damage;
	private int RPM;
	private int health;
	private int maxhealth;
	private int repaircost;
	private int upgradecost;
	private boolean dead;
	private int xPos;
	private int yPos;
	private int range;
	

	public Tower(char name,int damage,int RPM, int health, int maxhealth, int repaircost, int upgradecost) {
		this.setName(name);
		this.setDamage(damage);
		this.setRPM(RPM);
		this.setHealth(health);
		this.setMaxhealth(maxhealth);
		this.setRepaircost(repaircost);
		this.setUpgradecost(upgradecost);
	}
	
	public Tower(char name) {
		this.setName(name);
	}
	public Tower(int range){
		this.setRange(range);
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDamage(int power) {
		this.damage = power;
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

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	

}
