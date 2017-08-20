public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, z;
		double seconds, e, checking, fuel;
		String firstName, lastName, title, favoriteSport, chillTime;
		
		x = 10;
		y = 400;
		age = 39;
		z = 65;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		fuel = 1.92;
		
		firstName = "Trevor";
		lastName = "Campbell";
		title = "Mr.";
		favoriteSport = "Cycling";
		chillTime = "Relax";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational  # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + firstName + lastName );
		System.out.println( "The cost of petrol these days is $" + fuel + "!" );
		System.out.println( "I am hoping to retire at " + z );
		System.out.println( "I also have a great love for " + favoriteSport );
		System.out.println( "The rest of today i just plan to " + chillTime );
	}
}