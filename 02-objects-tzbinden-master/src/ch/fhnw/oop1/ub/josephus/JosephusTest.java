package ch.fhnw.oop1.ub.josephus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JosephusTest {

	@Test
	public void testJosephus1() {
		assertEquals(0, Josephus.computeSurvivor(4, 3));
		assertEquals(0, Josephus.computeSurvivor(5, 4));
		assertEquals(3, Josephus.computeSurvivor(5, 3));
		assertEquals(1, Josephus.computeSurvivor(5, 5));
		assertEquals(4, Josephus.computeSurvivor(5, 1));
		assertEquals(0, Josephus.computeSurvivor(1, 3));
	}

}