package com.fathyelshemy.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTest {

	DoublyLinkedList<Integer>doublyLinkedList=new DoublyLinkedList<Integer>();
	
	@Before
	public void setUp() throws Exception {
		doublyLinkedList.add(5);
		doublyLinkedList.add(4);
		doublyLinkedList.add(7);
	}

	@Test
	public void testIsEmpty() {
		assertFalse(doublyLinkedList.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(3, doublyLinkedList.size());
	}

	@Test
	public void testClear() {
		doublyLinkedList.clear();
		assertTrue(doublyLinkedList.isEmpty());
	}

	@Test
	public void testAddFirst() {
		doublyLinkedList.addFirst(1);
		assertEquals((Integer)1, (Integer)doublyLinkedList.peekFirst());
	}

	@Test
	public void testAddLast() {
		doublyLinkedList.addLast(10);
		assertEquals((Integer)10, (Integer)doublyLinkedList.peekLast());
	}

	@Test
	public void testAdd() {
		doublyLinkedList.clear();
		assertTrue(doublyLinkedList.isEmpty());

		doublyLinkedList.add(1);
		assertEquals(1L, doublyLinkedList.size());
	}

	@Test
	public void testRemoveFirst() {
		assertEquals((Integer)5, (Integer)doublyLinkedList.removeFirst());
	}

	@Test
	public void testRemoveLast() {
		assertEquals((Integer)7, (Integer)doublyLinkedList.removeLast());
	}

	@Test
	public void testPeekFirst() {
		assertEquals((Integer)5, (Integer)doublyLinkedList.peekFirst());
	}

	@Test
	public void testPeekLast() {
		assertEquals((Integer)7, (Integer)doublyLinkedList.peekLast());
	}


}
