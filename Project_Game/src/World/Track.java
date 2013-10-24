package World;



import java.util.Arrays;
import Entity.Enemy;
import Entity.Entity;
import Entity.Path;
import Entity.Tower;
import Entity.air;
import World.Campaign;


public class Track {
	
	static Campaign cam;
	public Track(){
		cam = new Campaign();
		
	}
	
	
	public static Entity[][][] Track = new Entity[5][5][101];
	public static void FillTrack(){
		
		
for(int i=0; i < Track.length;i++){
			
			for(int j = 0; j < Track[i].length; j++){
				
					for(int h = 0;h < Track[i][j].length; h++){
					
					Track[i][j][h] = new air();
					
					}
				
				
				
			}
			
		}
		
		
		
	}
	
	public static void DrawTrack(Enemy Hunter){
		System.out.println(Hunter.getHealth());
		cam.clear();
		boolean count = false;
		boolean stop = false;
		for(int i=0; i < Track.length;i++){
			
			for(int j = 0; j < Track[i].length; j++){
				
					for(int h = 0;h < Track[i][j].length && stop == false; h++){
					
					if(Track[i][j][h].getObjectName() == "Path"){
						
					}else if(Track[i][j][h].getObjectName() == "air"){
						cam.write("X");
						stop = true;
					}else if(count == false){
						String derp = String.valueOf(Track[i][j][h].getName());
						cam.write(derp);
						count = true;
						stop = true;
					}else{
						//cam.write("M");
					}
					
					}
				
				stop = false;
				count = false;
			}
			cam.write("\n");
		}
		
	
	}
	public static void DrawTrack(){
		System.out.println();
		cam.clear();
		boolean count = false;
		boolean stop = false;
		for(int i=0; i < Track.length;i++){
			
			for(int j = 0; j < Track[i].length; j++){
				
					for(int h = 0;h < Track[i][j].length && stop == false; h++){
					
					if(Track[i][j][h].getObjectName() == "Path"){
						
					}else if(Track[i][j][h].getObjectName() == "air"){
						cam.write("X");
						stop = true;
					}else if(count == false){
						String derp = String.valueOf(Track[i][j][h].getName());
						cam.write(derp);
						count = true;
						stop = true;
					}else{
						//cam.write("M");
					}
					
					}
				
				stop = false;
				count = false;
			}
			cam.write("\n");
		}
		
	
	}
	public static boolean place(Tower tower,int xpos,int ypos){
		if(Track[ypos][xpos][0].getObjectName() == "air"){
			tower.setxPos(xpos);
			tower.setyPos(ypos);
			
			Track[ypos][xpos][0] = tower;
			return true;
		}else{
			//put whatever you want to happen when a tower cannot be placed here
			return false;
		}
	}
	
	public static void doDamage(Tower tower){
		
		for(int i = tower.getyPos()-tower.getRange(); i < (tower.getRange()*2)+(tower.getyPos()-tower.getRange())+1; i++){
			
			for(int j = tower.getxPos()-tower.getRange(); j < (tower.getRange()*2)+1+(tower.getxPos()-tower.getRange()); j++){
				for(int h = 0; h < Track[i][j].length;h++){
					if(i > 4 || j>4 || h>100){
						
					}else if(i < 0 || j < 0){
						
					}else if(Track[i][j][h].getObjectName() == "Enemy" ){
						((Enemy) Track[i][j][h]).setHealth(((Enemy)Track[i][j][h]).getHealth() - ((Tower)tower).getDamage());
						//Track[i][j] = 'F';
					}
						/*if(!(i >4) && !(j>4)){
							Track[i][j] = 'F';
						}*/
				}
				
				
				
				
				
			}
			
		}
	}	
	
	public static void remove(int x,int y){
		Track[y][x] = null;
	}
	
	
	public static boolean move(Enemy Enmy){
		boolean returner = false;
		int pos = 0;
			for(int i=0; i < Track.length;i++){
			
			for(int j = 0; j < Track[i].length; j++){
				
				for(int h = 0; h < Track[i][j].length; h++){
				
				if(Track[i][j][h] == Enmy){
					pos = Track[i][j][100].getPosNum();
					Track[i][j][h] = new air();
				}
				}
				
			}
			
		}
			
			
			
		for(int i=0; i < Track.length;i++){
			
			for(int j = 0; j < Track[i].length; j++){
				
				
				if(Track[i][j][100].getObjectName() == "Path"){
					if(Track[i][j][100].getPosNum() == pos+1){
					int h = 0;
					while(Track[i][j][h].getObjectName() != "air"){
						h++;
					}
					Track[i][j][h] = Enmy;
					
					returner = true;
					}
				}
				
			}
			
		}
		
		return returner;
	}
	

	public static void main(String[] args){
		FillTrack();
		new Track();
		Enemy Bunny1 = new Enemy('E');
		Bunny1.setHealth(100);
		Tower tower1 = new Tower('T');
		tower1.setDamage(1);
		place(tower1,1,1);
		tower1.setRange(1);
		
		
		
		
		Track[2][2][100]= new Path(3);
		Track[2][3][100]=new Path(4);
		Track[2][0][100]=new Path(1);
		Track[2][1][100]=new Path(2);
		Track[2][4][100]=new Path(5);
		DrawTrack();
		while(move(Bunny1)){
			DrawTrack(Bunny1);
			doDamage(tower1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		DrawTrack();
		
		
		//new FirstStartMenu();
		/*
		//object = null will delete the object
			Enemy Hunter = new Enemy('H',100,1,1,false,50,(byte) 0);
			Tower tower = new Tower("name",1,1,1,1,1,1);
			tower.setRange(2);
			
				
			place(tower,1,4);
			System.out.println(tower.getxPos());
			System.out.println(tower.getyPos());
			while(move(Hunter)){
				doDamage(tower,Hunter);
				DrawTrack(Hunter);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			
			DrawTrack(Hunter);
			
	
		*/
		/*new Track();
		ResetTrack();
		DrawTrack();*/
		
		
	}
	
}
