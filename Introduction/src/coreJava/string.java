package coreJava;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//even though the there are two different strings declared, the fact that their values are the same, the computer wont create two memory spaces. It will point s1 to s.
		//literal declaration
		String s = "Maemo Mmatholo Maponya";
		String s1 = "Maemo Mmatholo Maponya";  
		
		//new, using the new keyword means even if the strings are the same, a new memory space will be created every time
		String s3 = new String("Maemo Mmatholo Maponya");
		String s4 = new String("Maemo Mmatholo Maponya");  
				
		//creating array from string using split
		String p = "Maemo Mmatholo Maponya";
		String[] splittedString = p.split(" ");	
		String[] splittedString1 = p.split("Mmatholo");	
		System.out.println("");

		
		//splitting by space
		System.out.println("splitting by space");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println("");

		//splitting by Mmatholo
		System.out.println("splitting by Mmatholo");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		System.out.println("");

		//trimming spaces
		System.out.println("trimming spaces");
		System.out.println(splittedString1[1].trim());
		System.out.println("");

		
		//printing each character
		System.out.println("printing each character");
		
		for(int i = 0; i<s.length();i++) 
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("");


		//reverse printing
		System.out.println("reverse printing");
		
		for(int i =s.length()-1; i>=0; i--) 
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("");


		
		
		
		
		
		





		
		
		
		}

}
