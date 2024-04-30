package com.coderscampus.arraylist;

public class Assignment7Application {
	
	public static void main(String[] args) {
		
		CustomList<String> itemContents = new CustomArrayList<>();
		
		populateElement(itemContents);
		for (int i=0; i<itemContents.getSize(); i++) {
			System.out.println(itemContents.get(i));
		}
		
	}

	private static void populateElement(CustomList<String> itemContents) {
		
		for (int i = 1; i <= 20; i++) {
		    itemContents.add("Element " + i);
		}
	}
}
