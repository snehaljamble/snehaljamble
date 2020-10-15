public class JAVAD2AsEmployee
	{
		String name;
		int age;
		String city;
		
		JAVAD2AsEmployee(String name,int age,String city)
		{
			this.name=name;
			this.age=age;
			this.city=city;
		}

		public void display()
		{
			System.out.println("The Name is "+this.name);
		}

		public static void main(String[] args)
		{
			JAVAD2AsEmployee E1=new JAVAD2AsEmployee("Navnath",21,"Karjat");
			E1.display();

			JAVAD2AsEmployee E2=new JAVAD2AsEmployee("Snehal",21,"Karjat");
			E2.display();
		}
	}

	/*
navnath@Navnath:~/Documents/LetsUpgrade/JAVA$ javac JAVAD2AsEmployee.java 
navnath@Navnath:~/Documents/LetsUpgrade/JAVA$ java JAVAD2AsEmployee 
The Name is Navnath
The Name is Snehal
navnath@Navnath:~/Documents/LetsUpgrade/JAVA$ 





	*/