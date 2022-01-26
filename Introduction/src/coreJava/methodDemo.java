package coreJava;

public class methodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodDemo d = new methodDemo();
		d.getData();
		System.out.println("");
 
		
		String name = d.getData2();
		System.out.println(name);

			

	}
	
	//metods are put outside main args and executed in the main
	
	public void getData() 
	{
		System.out.println("Hello World");
	}

	public String getData2() 
	{
		System.out.println("Hello World");
		return "Maemo Mmatholo Maponya";
	}

}
