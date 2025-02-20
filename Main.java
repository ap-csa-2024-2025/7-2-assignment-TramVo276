import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    // arraylist way
    ArrayList<Integer> foo = new ArrayList<Integer>();

    foo.add(New Integer(1));
    foo.add(New Integer(1));
    foo.add(New Integer(1));


    for (int i = 0; i < foo.size(); i++)
    {
      System.out.println(foo.get(i));
    }

    for (Integer N : foo)
    {
      System.out.println(N); //toString()
      System.out.println(N.intValue()); //intValue returns the value as int

    }

    
      //classic way
    int[] monkey = {8, 9, 5, 6, 5};
    for (int i = 0; i < monkey.length; i++)
    {
      System.out.println(monkey[i]); //print out every value in the list
    
    }

    for (int n : jennys) // n can be any 
    {
      System.out.println(n); //print the element
    }







    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    ArrayList<Integer> hai = new ArrayList<Integer>();

    Integer n = new Integer(0);

    for (Integer N : arr)
    {
      if ()
      {
        

      }
    }
  }

  // Problem 3 - getEvens
  // Return an ArrayList with ONLY the even numbers from arr
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (Integer N : arr)
    {
      if (N.intValue() % 2 == 0)
      {
        ans.add(N);
      }
    }

    return ans;


   
  }
}
