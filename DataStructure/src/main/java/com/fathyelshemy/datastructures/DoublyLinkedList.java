package com.fathyelshemy.datastructures;

/*
 * @auther fathyelshemy , email: fathyelshemy8@gmail.com
*/
public class DoublyLinkedList<T> implements Iterable<T> {

	private int size = 0;
	private Node<T> head;
	private Node<T> tail;

	private static class Node<T> {
		T data;
		private Node<T> next;
		private Node<T> prev;

		public Node(T data, Node<T> prev, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}

	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void clear() {

		Node<T>trav=head;
		while(trav!= null) {
			Node<T>next=trav.next;
			trav.next=null;
			trav.prev=null;
			trav.data=null;
			trav=next;
		}
		head=null;
		tail=null;
		size=0;
		
	}
	
	public void addFirst(T data) {

		if (isEmpty()) {
			head = tail = new Node<T>(data, null, null);
		} else {
			head.prev = new Node<T>(data, null, head);
			head = head.prev;
		}
		size++;
	}

	public void addLast(T data) {
		if (isEmpty()) {
			head = tail = new Node<T>(data, null, null);
		} else {
			tail.next = new Node<T>(data, tail, null);
			tail = tail.next;
		}
		size++;
	}

	public void add(T data) {

		addLast(data);
	}

	public T removeFirst() {
		if (isEmpty())
			throw new RuntimeException("list is empty");
		T data = head.data;
		head = head.next;
		size--;
		if (isEmpty())
			tail = null;
		else {
			head.prev = null;
		}
		return data;
	}

	public T removeLast() {
		if (isEmpty())
			throw new RuntimeException("emptyList");
		T data = tail.data;
		tail = tail.prev;
		size--;
		if (isEmpty())
			head = null;
		else {
			tail.next = null;
		}
		return data;
	}

	public T peekFirst() {
		if(isEmpty())throw new RuntimeException("empty list");
		return head.data;
	}
	
	public T peekLast() {
		if(isEmpty()) throw new RuntimeException("emptyList");
		return tail.data;
	}
	
	
	public T remove() {
		return null;
	}

	public java.util.Iterator<T> iterator() {
		return new java.util.Iterator<T>() {
			private Node<T> trav = head;

			public boolean hasNext() {
				return trav != null;
			}

			public T next() {
				T data = trav.data;
				trav = trav.next;
				return data;
			}
		};
	}

}
