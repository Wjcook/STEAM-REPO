package World;

public class Resources {
	private int resources;
	

	public int getResources() {
		return resources;
	}

	public void setResources(int resources) {
		this.resources = resources;
	}
	public void Recources (int i) {
		for(int j=0; j < i;j++){	
		this.setResources(this.resources + 1);
	}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	

}
}
