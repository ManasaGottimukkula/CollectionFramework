package com.epam.CollectionFramework;

import java.util.Arrays;

public class MyList<T> {
	
	private int listSize = 0;
	private static final int InitialSIZE = 10;
	private Object listValues[];
	
	public MyList() {
		listValues = new Object[InitialSIZE];
    }
	
	public void add(T t) {
		
        listValues[listSize++] = t;
    }
	
	public int size() {
		return listSize;
	}
	


	
	  @Override
	    public String toString() 
	    {
			String str= "";
	         str += '[';
	         for(int i = 0; i < listSize ;i++) {
	             str += listValues[i].toString();
	             if(i<listSize-1){
	                 str += ",";
	             }
	         }
	         str += ']';
	         return str;
	    }
	
}
