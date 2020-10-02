package company;

public abstract class Person {

	/**
	* class company.Person: model a person
	*/

	private int id;
	private String name;
	private int age;
	private String adress;
	protected String password;

	public Person(String name, int age, String address, int id, String password)  {
		this.name = name;
		this.id = id;
		this.age = age;
		this.adress = address;
		this.password = password;
	}

	public String getname() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isOlder(Person person) {
		return this.age > person.age;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isPasswordCorrect (String p){
		return this.password == p;
	}
}
