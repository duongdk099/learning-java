public class Person {
	private String name;
	private int age;
	private String adress;

	public Person(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.adress = address;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isOlder() {
		if(this.age >65 )
		{
			return true;
		}
		return false;
	}
}
