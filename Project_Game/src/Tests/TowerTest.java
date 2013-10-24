package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Entity.Tower;
public class TowerTest {
 
	Tower Gattling = new Tower("Gattling Gun",10,100,100,100,100,100);
	@Test
	public void testGetName() {
		
		assertEquals("Gattling Gun",Gattling.getName());
		
	
	}
	@Test
	public void testSetName(){
		Gattling.setName("Gattling");
		assertEquals("Gattling",Gattling.getName());
	}
	
	@Test
	public void testGetPower() {
		assertEquals(10,Gattling.getPower());
	}
	@Test
	public void testSetPower(){
		Gattling.setPower(20);
		assertEquals(20,Gattling.getPower());
	}
	@Test
	public void testGetRPM() {
		assertEquals(100,Gattling.getRPM());
	}
	@Test
	public void testSetRPM(){
		Gattling.setRPM(110);
		assertEquals(110,Gattling.getRPM());
	}
	@Test
	public void testGetHealth() {
		assertEquals(100,Gattling.getHealth());
	}
	@Test
	public void testSetHealth(){
		Gattling.setHealth(110);
		assertEquals(110,Gattling.getHealth());
	}
	@Test
	public void testGetMaxhealth () {
		assertEquals(100,Gattling.getHealth());
	}
	@Test
	public void testSetMaxhealth(){
		Gattling.setMaxhealth(110);
		assertEquals(110,Gattling.getMaxhealth());
	}
	@Test
	public void testGetRepaircost() {
		assertEquals(100,Gattling.getRepaircost());
	}
	@Test
	public void testSetRepaircost(){
		Gattling.setRepaircost(110);
		assertEquals(110,Gattling.getRepaircost());
	}
	@Test
	public void testGetUpgradecost() {
		assertEquals(100,Gattling.getUpgradecost());
	}
	@Test
	public void testSetUpgradecost(){
		Gattling.setUpgradecost(110);
		assertEquals(110,Gattling.getUpgradecost());
	}
	
}
