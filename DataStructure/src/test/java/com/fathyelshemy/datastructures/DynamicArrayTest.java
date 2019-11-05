package com.fathyelshemy.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {

	DynamicArray<Integer>dynArray= new DynamicArray<Integer>();
	
	@Before
	public void setUp() throws Exception {
		dynArray.add(5);
		dynArray.add(2);
	}

	@Test
	public void testSize() {
		assertEquals(2, dynArray.size());
	}

	@Test
	public void testGet() {
		
		assertEquals(5L, (long)dynArray.get(0));
	}

	@Test
	public void testSet() {
		dynArray.set(0, 7);
		assertEquals(7L, (long)dynArray.get(0));
	}

	@Test
	public void testClear() {
		dynArray.clear();
		assertEquals(0, dynArray.size());
	}

	@Test
	public void testIsEmpty() {
		assertFalse(dynArray.isEmpty());
	}

	@Test
	public void testRemove() {
		assertEquals(5L, (long)dynArray.remove(5));
	}

	@Test
	public void testRemoveAt() {
		assertEquals(5L, (long)dynArray.removeAt(0));
	}

	@Test
	public void testIndexOf() {
		dynArray.add(3);
		assertEquals(2L, (long)dynArray.indexOf(3));
	}

	@Test
	public void testContains() {
		assertTrue(dynArray.contains(5));
	}

}
