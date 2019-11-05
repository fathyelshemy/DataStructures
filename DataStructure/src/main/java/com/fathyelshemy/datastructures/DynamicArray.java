package com.fathyelshemy.datastructures;

import java.util.Arrays;

/*
 *@author fathyelshemy, fathyelshemy8@gmail.com
*/

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T> {

	private T[] arr;
	private int len = 0;
	private int capacity;

	public DynamicArray() {
		this(16);
	}

	public DynamicArray(int capacity) {
		if (capacity == 0)
			throw new IllegalArgumentException("invalid index :" + capacity);
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}

	public int size() {
		return len;
	}

	public T get(int index) {
		return arr[index];
	}

	public void set(int index, T elem) {
		arr[index] = elem;
	}

	public void clear() {
		for (int i = 0; i < len; i++)
			arr[i] = null;
		this.len = 0;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(T elem) {
		if (len + 1 >= capacity) {
			if (capacity == 0)
				capacity = 1;
			else
				this.capacity *= 2;
			T[] new_arr = (T[]) new Object[capacity];
			for (int i = 0; i < len; i++)
				new_arr[i] = arr[i];
			arr = new_arr;
		}

		arr[len++] = elem;
	}

	public T remove(Object obj) {
		int i = indexOf(obj);
		T removedElem = removeAt(i);
		return removedElem;
	}

	public T removeAt(int rm_index) {
		if (rm_index >= len || rm_index < 0)
			throw new IndexOutOfBoundsException();
		T data = arr[rm_index];
		T[] new_arr = (T[]) new Object[len - 1];
		for (int i = 0, j = 0; i < len; i++, j++) {
			if (i == rm_index)
				j--;
			else new_arr[j] = arr[i];
		}
		arr = new_arr;
		capacity = len--;
		return data;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < len; i++) {
			if (obj == null) {
				if (arr[i] == null)
					return i;
			} else {
				if (obj.equals(arr[i]))
					return i;
			}
		}
		return -1;
	}

	public boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}

	public java.util.Iterator<T> iterator() {

		return new java.util.Iterator<T>() {
			int index = 0;

			public boolean hasNext() {
				if(len > index)
					return true;
				return false;
			}

			public T next() {
				index++;
				return arr[index++];
			}
		};
	}

	@Override
	public String toString() {
		return "DynamicArray [arr=" + Arrays.toString(arr) + "]";
	}

}
