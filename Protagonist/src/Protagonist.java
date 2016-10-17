public class Protagonist
	{
	protected int numberOfVillainsThwarted = 20;
	
	public Protagonist()
		{
		System.out.println("We win in the end");
		}
	public Protagonist(String name)
		{
		System.out.println("It is " + name + " who has saved you");
		}
	
	public void utterTagline()
		{
		System.out.println("Go, good guys");
		}
	public void rideOffIntoTheSunset()
		{
		System.out.println("Adios, Amigos");
		}
	}