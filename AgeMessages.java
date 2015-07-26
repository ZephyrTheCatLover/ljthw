import java.util.Scanner;

public class AgeMessages
{
  public static void main( String [] args )
  {
    Scanner keyboard = new Scanner(System.in);
    
    int age;
    
    System.out.print( "How old are you? ");
    age = keyboard.nextInt();
    
    if ( age < 13 )
    {
      System.out.println( "You are too young to create a Facebook account. " );
    }
    if ( age < 16 )
    {
      System.out.println( "You are too young to get a driver's licence. " );
    
    }
    if ( age < 18 )
    {
      System.out.println( "You are too young to get a tattoo. " );
    }
    if ( age < 21 )
    {
      System.out.println( "You are a derpling. " );
    }
    if ( age < 35 )
    {
      System.out.println( "You are too young to run for the President of the United Kingdom. " );
    }
    if ( age != 314 )
    {
      System.out.println( "You are not a pastry." );
    }
    if ( age == 314 )
    {
      System.out.println( "Nom Nom Nom Nom Nom... " );
      System.out.println( "Game Over " );
    }
  }
}