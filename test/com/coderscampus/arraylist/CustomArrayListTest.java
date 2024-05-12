package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	// 1 - write a failing test
	// 2 - write the business logic to make the test pass
	// 3 - Refactor your code
	@Test
	void should_add_one_item_to_list() {
		// arrange, act, assert

		// arrange
		CustomList<Integer> itemContents = new CustomArrayList<>();

		// act
		itemContents.add(10);

		// assert
		// expected = Integer 10
		assertEquals(10, itemContents.get(0));
		assertEquals(1, itemContents.getSize());
	}

	@Test
	void should_add_one_item_to_index() {
		// arrange, act, assert

		// arrange
		CustomList<Integer> itemContents = new CustomArrayList<>();

		// act
		itemContents.add(1);
		itemContents.add(0, 10);

		// assert
		// expected = Integer 10 at index 5, and Integer 1 shifted to the right
		assertEquals(10, itemContents.get(0));
		assertEquals(1, itemContents.get(1));
	}

	@Test
	void should_remove_one_item_from_index() {
		// arrange, act, assert

		// arrange
		CustomList<Integer> itemContents = new CustomArrayList<>();

		// act
		itemContents.add(1);
		itemContents.add(0, 10);
		itemContents.remove(0);

		// assert
		// expected = Integer 1 shifted to the left after removal of Integer 10 at index
		// 0
		assertEquals(1, itemContents.get(0));
	}

	@Test
	void should_throw_index_out_of_bounds_exception_exception() {
		// arrange
		CustomList<Integer> itemContents = new CustomArrayList<>();

		// act and assert = throw index out of bounds exception when removing from invalid index via add (T item)
		assertThrows(IndexOutOfBoundsException.class, () -> {
			itemContents.add(11, 5);
		});
	}
	
    @Test
    void should_throw_index_out_of_bounds_exception_when_getting_invalid_index() {
    	// arrange
        CustomList<Integer> itemContents = new CustomArrayList<>();
        
        // act
        itemContents.add(0, 1);
        
        // assert = throw index out of bounds exception when removing from invalid index via add(int index, T item)
        assertThrows(IndexOutOfBoundsException.class, () -> {
            itemContents.get(1);
        });
    }
	
	@Test
	void should_throw_index_out_of_bounds_exception_when_removing_invalid_index() {
		// arrange
		CustomList<Integer> itemContents = new CustomArrayList<>();
		
		//act and assert = expected to throw index out of bounds exception when removing from invalid index
        assertThrows(IndexOutOfBoundsException.class, () -> {
            itemContents.remove(0);
        });
	}	
	
	@Test
	void should_add_item_to_full_array() {
	    // arrange
	    CustomList<Integer> itemContents = new CustomArrayList<>();

	    for (int i = 0; i < 10; i++) {
	        itemContents.add(i);
	    }
	    
	    // act
	    itemContents.add(10, 10);
	    
	    // assert = Check if the item was added at the specified index and if the size increased
	    assertEquals(10, itemContents.get(10));
	    assertEquals(11, itemContents.getSize());
	}
	
	@Test
	void should_remove_item_from_index() {
		// arrange
		CustomList<Integer> itemContents = new CustomArrayList<>();
		itemContents.add(1);
		itemContents.add(2);
		itemContents.add(3);
		
		// act
		Integer removedItem = itemContents.remove(1);
		
		// assert
	    assertEquals(2, removedItem);
	    assertEquals(2, itemContents.getSize());
	    assertEquals(1, itemContents.get(0));
	    assertEquals(3, itemContents.get(1));
	}
	
}
