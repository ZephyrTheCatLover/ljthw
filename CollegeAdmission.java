import java.util.Scanner;
import static java.lang.System.*;

public class CollegeAdmission
{
  public static void main( String[] args )
  {
    //I really wanted to waste your time putting in this message leleleelelelelelel.
    
    Scanner keyboard = new Scanner(System.in);
    int ty;
    
    out.println( "Welcome to Blah, Blah, Blah, Blah, Interface!" );
    out.println( "Please enter your SIT actions score (1-1000): " );
    ty = keyboard.nextInt();
    
    out.print( "Status: " );
    
    if ( ty >= 999 )
      out.print( "Boy/Girl, YOU'RE SMART" );
    else if ( ty >= 800 )
      out.print( "CERTAIN" );
    else if ( ty >= 390 )
      out.print( "COULD BE" );
    else if ( ty >= 1 )
      out.print( "No" );
    else // below 1
      out.print( "Mouse-brain!" );
      
    out.println();
  }
}
