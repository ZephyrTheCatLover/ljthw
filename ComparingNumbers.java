import java.util.Scanner;

public class ComparingNumbers
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    double first, second;
    
    System.out.print( "Gimme 2 numbas. 1st: " );
    first = keyboard.nextDouble();
    System.out.print( "2nd: " );
    second = keyboard.nextDouble();
    
    if ( first < second )
    {
      System.out.println( first + " is less than " + second );
    }
    if ( first == second )
    {
      System.out.println( first + " is equal to " + second );
    }
    if ( first > second )
    {
      System.out.println( first + " is greater than " + second );
    }
    if ( first != second )
    {
      System.out.println( first + " is not equal to " + second );
    }
    if ( first == 314 )
    {
      System.out.println( "Nom Nom Nom No- oh, you're here...Er... Load save?" );
    }
    if ( second == 343 )
    {
      System.out.println( "Shut up! I'm playing Halo! Can it wait?! You made me die! argh!" );
      
    } 
  }
}
