package Entity;

public class Entity {

	public String getObjectName(){
		if(this.getClass().getName() == "Entity.Tower"){
			return "Tower";
		}else if(this.getClass().getName() == "Entity.Enemy"){
			return "Enemy";
		}else if(this.getClass().getName() == "Entity.Path"){
			return "Path";
		}else if(this.getClass().getName() == "Entity.air"){
			return "air";
		}else{
			return "Invalid";
		}
		
	}
	public char getName(){
		
			return this.getName();
		
	}
	public int getPosNum(){
		return this.getPosNum();
	}
	
	
}
