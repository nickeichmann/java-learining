// here I add a comment

/* Here I add a
multi line comment*/

//another line

public class Main {
    public static void main(String[] args) {
      String hw = "Hello World variable";
      int number = 12; // if I would add a final in front of int, it would not be overwritable
      number = 13;
      System.out.println(hw + " " + number);

      // add a calculator
      int x = 10;
      int y = 20;
      System.out.println(x+y);

      // Transform a variable
      double x_float = x;
      System.out.println(x);

      // narowing a variable
      double z = 10.56;
      z += 10; // add 10 to z
      int z_narrowed = (int) z;
      System.out.println(z_narrowed);
    }
    }
