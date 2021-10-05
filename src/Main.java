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
      System.out.println(x_float);

      // narowing a variable
      double z = 10.56;
      z += 10; // add 10 to z
      int z_narrowed = (int) z;
      System.out.println(z_narrowed);



      // xxxxxxxxxxxxxxxxxxxxxxxxxx Working with Strings xxxxxxxxxxxxxxxxxxxxxxxxx

      // Working with Strings
      String text = "Hallo ich bin Nick";
      String text2 = " Wer bist du?";
      System.out.println("THe length of the String 'text' is: " + text.length());
      
      /* other usefull functions are:
      text.toUpperCase() -> makes the whole String upper case
      text.toLowerCase() -> makes the whole String lower case
      text.indexOf("ich") -> returns the index value of "ich" in the String text #6
      text.concat(text2) -> binds the two strings together */

      /* And important textual elements:

      \' =	'	= Single quote
      \" = "	= Double quote
      \\ = \	= Backslash

      \n	New Line	
      \r	Carriage Return	
      \t	Tab	
      \b	Backspace	
      \f	Form Feed
      */

      // xxxxxxxxxxxxxxxxxxxxxxxxxx Working with Arrays xxxxxxxxxxxxxxxxxxxxxxxxx
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      System.out.println(cars[1]); // would output BMW
      cars[0] = "Opel"; // Changes value "Volvo" to "Opel"
      System.out.println(cars.length); // outputs the length of the array

      // xxxxxxxxxxxxxxxxxxxxxxxxxx Working with Math xxxxxxxxxxxxxxxxxxxxxxxxx
      // all matho functions https://www.w3schools.com/java/java_ref_math.asp

      // find the largest or smalles number
      int max_numb = Math.max(10,20); // max_numb = 20
      int min_numb = Math.min(10,20); // min_numb = 1

      // Square root
      double root = Math.sqrt(64); // root = 8

      // make numbers absolute (positive)
      double pos = Math.abs(-4.7); // pos = 4.7
      //System.out.println(pos);

      // Random Nuber
      double rand = Math.random(); // rand will be between 0 and 1
      double rand_50 = (int)(Math.random() * 51);
      //System.out.println(rand_50);


      // xxxxxxxxxxxxxxxxxxxxxxxxxx If...else Statement xxxxxxxxxxxxxxxxxxxxxxxxx

      int time = 20;
      if (time < 18) {
        System.out.println("Good day.");}
      else {
          System.out.println("Good evening.");


      // xxxxxxxxxxxxxxxxxxxxxxxxxx Switch Statement xxxxxxxxxxxxxxxxxxxxxxxxx
      //The switch statement activates one specific case
      int day = 4;
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Number not in range 1-7");


      // xxxxxxxxxxxxxxxxxxxxxxxxxx While loops xxxxxxxxxxxxxxxxxxxxxxxxx

      int i = 0;
      while (i < 5) {
        System.out.println(i);
        i++; // increase by one
      }

      int n = 0;
      do {
        System.out.println(i);
        n++; // increase by one
        }
      while (n < 5);
      
      // xxxxxxxxxxxxxxxxxxxxxxxxxx For loops xxxxxxxxxxxxxxxxxxxxxxxxx
}     /*
      for (statement 1; statement 2; statement 3) {
        // code block to be executed
      }

      Statement 1 is executed (one time) before the execution of the code block.
      Statement 2 defines the condition for executing the code block.
      Statement 3 is executed (every time) after the code block has been executed.
      */

      for (int i = 0; i < 5; i++) {
        System.out.println(i);
      } // prints numbers from 0 - 4

      
      // loop through an array
      String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
      for (String i : car) {
      System.out.println(i);
      
}

    
    }
    }
    }
