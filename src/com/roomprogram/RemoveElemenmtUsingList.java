package com.roomprogram;

import java.util.ArrayList;

public class RemoveElemenmtUsingList {
   public static void main(String[] args) {
	ArrayList<String> arreyArrayList=new ArrayList<>();
	arreyArrayList.add("Anas");
	arreyArrayList.add("adil");
	arreyArrayList.add("Abrar");
	arreyArrayList.add("aamir");
	
	for(int i=0;i<arreyArrayList.size();i++) {
		if(arreyArrayList.get(i)=="Abrar") {
			arreyArrayList.remove(i);
			
		}
		
	}
	
	}

}
