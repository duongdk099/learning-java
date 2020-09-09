
public class Person {
	private String name;
	private int age;
	private String adress;
	
	public Person(String n, int a, String adresse)
	{
		name =n;
		age = a;
		adress= adresse;
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
	public static void main (String [] args)
	{
		Person p1= new Person("John",50,"3 Camille Mathis");
		System.out.println(p1.adress);
	}
}


