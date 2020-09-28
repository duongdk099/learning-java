public abstract class Person {

	/**
	* class Person: model a person
	*/

	private int id;
	private String name;
	private int age;
	private String adress;
	private String password;

	public Person(String name, int age, String address)  {
		this.name = name;
		this.age = age;
		this.adress = address;
		this.password = "toto";
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isOlder(Person person) {
		return this.age > person.age;
	}

	private void setPassword(String password) {
		this.password = password;
	}

}
