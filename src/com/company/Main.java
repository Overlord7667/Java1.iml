package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		//for (int i = 100; i > 10; i -= 10)
		//	System.out.println(i);

		boolean isTrue = true;
		int j = 0;
		while (j < 100) {
			j += 1;
			if (j % 2 == 0)
				continue;
				System.out.println(j);

		}
//		int x = 13;
//		do {
//			x--;
//			System.out.println(x);
//		}while (x > 10);
	}
}
