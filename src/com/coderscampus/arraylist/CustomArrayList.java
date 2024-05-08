package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {

		if (size == items.length) {
			Object[] newArray = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newArray[i] = items[i];
			}
			items = newArray;
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > size) {
			throw new IndexOutOfBoundsException("Index " + index + "is out of bounds");
		}
		
	    if (size == items.length) {
	        Object[] newArray = new Object[items.length * 2];
	        for (int i = 0; i < items.length; i++) {
	            newArray[i] = items[i];
	        }
	        items = newArray;
	    }
		
		for (Integer i = size; i > index; i--) {
			items[i] = items[i - 1];
		}

		items[index] = item;
		size++;

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + "is out of bounds");
		}
		
		T deletedItem = (T) items[index];
		
		for (Integer i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		
	    items[size - 1] = null;
	    size--;

	    return deletedItem;
	}

}
