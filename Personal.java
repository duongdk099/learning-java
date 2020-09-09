
public class Personal extends Person {

	public Personal(String n, int a, String adresse) {
		super(n, a, adresse);
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String pseudo;
	private String password;
	private int right;
	
	public boolean hasRight(int r)
	{
		if (r == this.right)
		{
			return true;
		}
		else return false;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	public void isPasswordCorrect(String p)
	{
		if(p == this.password)
		{
			System.out.print("Bravo!!");
		}
		else 	System.out.print("Sorry :(((");

	}
}
