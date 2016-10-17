public class Superhero extends Protagonist	
	{
	protected int numberOfVillainsThwarted = 200;
	
	public Superhero()
		{
		System.out.println("My planet sends you greetings");
		}
	public Superhero(String name)
		{
		System.out.println("It is " + name + " who has saved you");
		}
	
	public void utterTagline()
		{
		//super.utterTagline();
		System.out.println("Shazam");
		}
	public void useSuperpower()
		{
		System.out.println("(Insert graphic novel sound here)");
		}
 	public void getNumberOfVillainsThwarted() 
		{
		System.out.println(super.numberOfVillainsThwarted); 
		System.out.println(numberOfVillainsThwarted); 
		}
	}