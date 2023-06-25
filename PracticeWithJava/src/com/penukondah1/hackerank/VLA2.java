package com.penukondah1.hackerank;

import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2>{
	int dishSize;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VLA2[] va = {
				new VLA2(40),new VLA2(200),new VLA2(60)};
		Arrays.parallelSort(va,va[0]);
		int index = Arrays.binarySearch(va, new VLA2(40),va[0]);
		System.out.println(index+"");
		index = Arrays.binarySearch(va, new VLA2(80),va[0]);
		System.out.println(index);
		
	}

	@Override
	public int compare(VLA2 o1, VLA2 o2) {
		// TODO Auto-generated method stub
		return o2.dishSize - o1.dishSize;
	}
	
	VLA2(int d){
		dishSize = d;
	}

}
