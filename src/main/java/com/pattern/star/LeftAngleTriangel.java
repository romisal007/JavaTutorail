package com.pattern.star;

public class LeftAngleTriangel {

	public static void main(String[] args) {

		int i, j, rows = 6;

		for (i = 0; i <= rows; i++) {

			for (j = (rows - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

/*		int n = 6;
		// inner loop
		for (int i1 = 0; i1 <= n; i1++) {
			// outer loop
			for (int j1 = 1; j1 <= n - i1; j1++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
*/
	}
}
