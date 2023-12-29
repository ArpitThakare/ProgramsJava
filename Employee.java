package CollectionEx;
  
 class User{//parent Class
	public int id; //initialization
	public	String Name;
	
	public User(int id,String name) {// parameterized Constructor
		this.id=id;
		this.Name=name;
		System.out.println("id: "+id+" name: "+name);
		
	}
}

class Emp extends User{
	
	double sallary;
	public Emp(int id, String name, double sallary) {
		super(id, name);
		this.sallary=sallary;
		System.out.println("Salary: "+sallary);
		
	}
	
	public double calculateAnnualSalary() { //method 
	     return sallary*12;
	}
	
}

class Employee{
	public static void main(String[] args) {
		
		Emp e=new Emp(1,"Arpit",2000);
		
		
		
	}
}















