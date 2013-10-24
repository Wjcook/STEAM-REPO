package Tests;

import static org.junit.Assert.*;

import org.junit.Test;


import Entity.Enemy;


public class EnemyTest {
	Enemy Bunny = new Enemy('g', 50 , 1, 1, false, 0,(byte) 0);
	
	@Test
	public void testGetDrop() {
		assertEquals(1,Bunny.getDrop());
	}
	@Test
	public void testGetName() {
		assertEquals("Bunny",Bunny.getName());
	}
	@Test
	public void testSetDrop() {
		Bunny.setDrop(2);
		assertEquals(2,Bunny.getDrop());
	}

	@Test
	public void testSetName() {
		Bunny.setName('B');
		assertEquals('B',Bunny.getName());
	}

	@Test
	public void testGetHealth() {
		assertEquals(50,Bunny.getHealth());
	}

	@Test
	public void testSetHealth() {
		Bunny.setHealth(100);
		assertEquals(100,Bunny.getHealth());
	}

	@Test
	public void testGetSpeed() {
		assertEquals(1,Bunny.getSpeed());
	}

	@Test
	public void testSetSpeed() {
		Bunny.setSpeed(3);
		assertEquals(3,Bunny.getSpeed());
	}

	@Test
	public void testIsRegen() {
		assertEquals(false,Bunny.isRegen());
	}

	@Test
	public void testSetRegen() {
		Bunny.setRegen(true);
		assertEquals(true,Bunny.isRegen());
	}
	@Test
	public void testGetMaxHealth() {
		assertEquals(50,Bunny.getMaxHealth());
		assertEquals(Bunny.getHealth(),Bunny.getMaxHealth());
	}
	@Test
	public void testSetMaxHealth() {
		Bunny.setMaxHealth(40);
		assertEquals(40,Bunny.getMaxHealth());
	}

	@Test
	public void testIsDead() {
		assertEquals(false,Bunny.isDead());
		Bunny.setHealth(0);
		assertEquals(true,Bunny.isDead());
	}

	@Test
	public void testRegen() {
		Bunny.setRegen(false);
		Bunny.setHealth(50);
		Bunny.setMaxHealth(100);
		Bunny.Regen(1);
		assertEquals(50,Bunny.getHealth());
		
		Bunny.setRegen(true);
		Bunny.Regen(1);
		assertEquals(55,Bunny.getHealth());
		
		Bunny.Regen(2);
		assertEquals(65,Bunny.getHealth());
		
		Bunny.setMaxHealth(68);
		Bunny.Regen(1);
		assertEquals(68,Bunny.getHealth());
	}

}