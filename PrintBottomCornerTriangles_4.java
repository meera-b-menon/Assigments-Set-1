package com.training.assignment;

public class PrintBottomCornerTriangles_4 {
	public static void main(String [] args) {
		int n = 14;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++ ) {
				if ((i >= (n-2)/2 && i - j >= (n-2)/2) || (i >= (n-2)/2 && i + j >= (n + 5))) {
				   System.out.print("*");
			   } else {
				   System.out.print(" ");
			   }
			}
			System.out.println("");
		}
	}

}
