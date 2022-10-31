package arrrayutil;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		int[] a = {90,260,30,60};
		
		
		//System.out.println("before sorting array"+a);
		for (int i : a) {
			System.out.println("before sorting array"+i);
		}
		Arrays.sort(a);
		//System.out.println("after sorting array"+a);
		for (int i : a) {
			System.out.println("after sorting array"+i);
		}
		
		String[] s= {"Z","A","D","C","B"};
		System.out.println("before sorting string array  ");
		for (String string : s) {
			System.out.println(string);
		}
		
		Arrays.sort(s);
		System.out.println("afetr sorting string array  ");
		for (String string : s) {
			System.out.println(string);
		}
		
		Arrays.sort(s,new Mycomparator());
		System.out.println("after reverse sorting string array  ");
		for (String string : s) {
			System.out.println(string);
		}
	}

}
