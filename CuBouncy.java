import java.util.Scanner;

public class CuBouncy
{
  public static void main(String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    
    int age = 22;
    boolean onGuestList = false;
    double attractiveness = 7.5;
    String gender = "F";
    
    if ( onGuestList || age >= 21 || ( gender.equals("F") && attractiveness >= 8 ) )
    {
      System.out.println("Do the derp! Derp Derp Da Doo!");
    }
    else
    {
      System.out.println("You are a Derpling.");
    }
  }
}
