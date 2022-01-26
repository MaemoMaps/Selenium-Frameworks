package coreJava;

import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Arrays
		//declaring and using way 1
		int[] arr = new int [5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		
		//declaring and using way 2
		int[] arr2 = {1,2,3,4,7};

		//For loop - used to itterate through the loop
		for(int i = 0; i< arr.length; i++) //first i is the initial value of loops, second i is the stop condition, the third one is the increment number
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			}
			
			else
			{
				System.out.println(arr2[i] + " - this is not a multiple of two");
			}
		}

		//ArrayList
		//dynamic way of instantiating an array, where size is not limited
		ArrayList<String> a = new ArrayList<String>(); //this is where we create a new object and allocate memory for it. memory allocation iks done by the keyword "new"
		a.add("Maemo");
		a.add("Mmatholo");
		a.add("Maponya");
		a.add("is");
		a.add("a");
		a.add("billionaire");
		System.out.println(a.get(3));


	}

}
