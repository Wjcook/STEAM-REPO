package Entity;

public class Enemy extends Entity{
	private char name;
	private int health;
	private int speed;
	private boolean regen;
	private boolean dead;
	private int maxhealth;
	private int drop;
	private int damage;
	private byte pos;
	
	public Enemy(char name, int health, int speed,int drop, boolean regen, int damag, byte pos) {
		this.name=name;
		this.damage = damag;
		this.maxhealth = health;
		this.health=this.maxhealth;
		this.speed=speed;
		this.regen=regen;
		this.dead = false;
		this.drop = drop;
		this.pos = pos;
	}
	public Enemy(char name) {
		this.name=name;
	}
	

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isRegen() {
		return regen;
	}

	public void setRegen(boolean regen) {
		this.regen = regen;
	}
	public void setMaxHealth(int max){
		this.maxhealth = max;
		
	}
	public int getMaxHealth(){
		return this.maxhealth;
	}
	public void setDead(boolean dead){
		this.dead=dead;
	}
	public boolean isDead(){
		if(this.getHealth() <= 0){
			this.setDead(true);
			return true;
		}else{
			this.setDead(false);
			return false;
			
		}
		
	}

	public void Regen(int i) {
		for(int j=0; j < i;j++){
			if(this.isRegen() == true){
				int health5 = this.health + 5;
				if(health5 >= this.maxhealth){
					this.health = this.maxhealth;
				}else{
					this.setHealth(health5);
			}
				//this is trying to use the Thread.sleep method and 
				//there is an exception(error) then it will crash and end the program
				//but because it is surrounded in a try it will allow the program
				//to still run without crashing
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
		}
		}
		
	}

	public int getDrop() {
		return drop;
	}

	public void setDrop(int drop) {
		this.drop = drop;
	}

	public int getDamage() {
		return damage;
	}

	public byte getPos() {
		return pos;
	}

	public void setPos(byte pos) {
		this.pos = pos;
	}

	
	
	

	



}
