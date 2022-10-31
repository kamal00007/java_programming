package arrrayutil;

import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		String[] s= {"Z","A","D","C","B"};
		System.out.println("after sorting string array  ");
		Arrays.sort(s);
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("enter a number:");

		int n =s.nextInt();
		boolean primeFlag=true;
		if(n<=1) {
			System.out.println("is not prime");
		}
		for(i=2;i<=n-1;i++)

		{

		if(n%i==0)

		{

		primeFlag=false;}
		}

		if(primeFlag == true)
		{

		System.out.println(n+" is prime");

		}
		else{

		System.out.println(n+"is not prime");


	}
		
		List<String> list = Arrays.asList(s);
		//s[1]="E";
		System.out.println("after converting into list  "+list);
		// changes to list also reflect on array
		// changes to array also reflect on list
		s[1]="E";
		list.set(2,"Y");
		System.out.println("after converting into list  "+list);
		for (String string : s) {
			System.out.println(string);
		}
		
		void testRemoveCartItem() throws CartEmptyException
	{
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1,1);
		cartDao.getAllCartItems(1);
		ArrayList<MenuItem> menuItemList=cartDao.getAllCartItems(1);
		for(MenuItem x:menuItemList)
		{
			System.out.println(x);
		}
	}
		
	}

}
