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
		Hosteller h1 = new Hosteller();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the details: ");
	
	System.out.println("Student Id");
	
	int a1 = sc.nextInt();
	
	System.out.println("Student Name");
	
	sc.nextLine();
	
	String b1=sc.nextLine();
	
	System.out.println("Department Id"); 
	int c1 = sc.nextInt();
	
	System.out.println("Gender");
	
	sc.nextLine();
	
	String d1=sc.nextLine();
	
	System.out.println("Phone Number");
	
	String e1 = sc.nextLine();
	
	System.out.println("Hostel Name");
	
	String f1=sc.nextLine();
	System.out.println("Room Number");
	
	int g1=sc.nextInt();
	
	h1.setStudentId(a1);
	
	h1.setName(b1);
	
	h1.setDepartmentId(c1);
	
	h1.setGender(d1);
	
	h1.setPhone(e1);
	
	h1.setHostelName(f1);
	
	h1.setRoomNumber(g1);
	
		
		Arrays.sort(s,new Mycomparator());
		System.out.println("after reverse sorting string array  ");
		for (String string : s) {
			System.out.println(string);
		}
	}

}
