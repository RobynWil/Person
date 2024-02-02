public class Person 
{
	String fName;
	String lName;
	int age;
	
	
	public Person(String fName, String lName, int age)
	{
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}


	public String getfName()
	{
		return fName;
	}


	public void setfName(String fName)
	{
		this.fName = fName;
	}


	public String getlName()
	{
		return lName;
	}


	public void setlName(String lName)
	{
		this.lName = lName;
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age)
	{
		this.age = age;
	}


	@Override
	public String toString()
	{
		return "Person: " + fName + " " + lName + ", " + age;
	}
	

	public Person makePerson(Person other) throws UnderAgeException
	{
		if (age < 18 || other.age < 18) 
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.fName, other.lName, 0);
		return child;
	}
	
	public static void main(String[] args) 
	{
		Person r = new Person("Romeo", "Mon", 15);
		
		System.out.println("R " + r);
	}
	
	
}









