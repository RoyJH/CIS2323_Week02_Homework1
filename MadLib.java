import java.util.Scanner;

public class MadLib{
	public static void main (String[] args){
		String user, Adjective1, Animal, Adjective2, Name, Adjective3, 
		Adjective4, Adjective5, Adjective6, VerbEd1, VerbEd2, Noun, Verb, Celeb;
		
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Hello there stranger.  What is your name?");
		user = inputDevice.nextLine();
		System.out.println("Hello " + user + ", it's nice to meet you!");
		System.out.println("I have a Mad Lib for you to try.");
		System.out.println("Key in the type of words I ask for, followed by enter.");
		
		System.out.println("Give me an adjective.");
			Adjective1 = inputDevice.nextLine();
		System.out.println("Enter a type of animal.");
			Animal = inputDevice.nextLine();
		System.out.println("Let's have another adjective");
			Adjective2 = inputDevice.nextLine();
		System.out.println("Now type in a name.");
			Name = inputDevice.nextLine();
		System.out.println("Another Adjective Please!");
			Adjective3 = inputDevice.nextLine();
		System.out.println("And another.");
			Adjective4 = inputDevice.nextLine();
		System.out.println("And yet another.");
			Adjective5 = inputDevice.nextLine();
		System.out.println("Now one more Adjective.  Last one I promise.");
			Adjective6 = inputDevice.nextLine();
		System.out.println("Give me a verb ending in \"ED\'");
			VerbEd1 = inputDevice.nextLine();
		System.out.println("Another verb ending in \"ED\"");
			VerbEd2 = inputDevice.nextLine();
		System.out.println("Next lets have a noun.");
			Noun = inputDevice.nextLine();
		System.out.println("Would you kindly enter a verb?");
			Verb = inputDevice.nextLine();
		System.out.println("and finally, enter the name of a famous person!");
			Celeb = inputDevice.nextLine();
			
			System.out.println("Once, there was a/an " + Adjective1 + " " + Animal + " and his " + Adjective2 + " owner, " + Name + ". The owner,");
			System.out.println(Name + ", thought his " + Animal + " was very " + Adjective3 +". \nThe " + Animal + " disagreed. The " + Animal + " thought he was very "); 
			System.out.println(Adjective4+  ", " + Adjective5 + ", and " + Adjective6 + ". The " + Animal + " " + VerbEd1 + " the owner. The owner had no idea");
			System.out.println("that the " + Animal + " could speak! The owner " + VerbEd2 + " out of his " + Noun + " in amazement!\n\"Yeah, I can " + Verb + ".\"");
			System.out.println("said the " + Animal + ".  \"Yeah\" said the owner. \"You " + Verb + " just like " + Celeb + "!");
			
	}
}