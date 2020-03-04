package com.epam.CollectionFramework;

public class MyList<T> {
	
	public int listSize = 0;
	public static final int InitialSIZE = 10;
	public Object listValues[];
	
	public MyList() {
		listValues = new Object[InitialSIZE];
    }
	
	
	public int size() {
		return listSize;
	}
	

}
