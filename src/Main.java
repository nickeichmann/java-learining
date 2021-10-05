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

      // xxxxxxxxxxxxxxxxxxxxxxxxxx Working with Math xxxxxxxxxxxxxxxxxxxxxxxxx

      // find the largest or smalles number
      max_numb = Math.max(1,2,10,20); // max_numb = 20
      min_numb = Math.min(1,2,10,20); // min_numb = 1

      // Square root
      root = Math.sqrt(64); // root = 8

      // make numbers absolute (positive)
      pos = Math.abs(-4.7); // pos = 4.7

      // Random Nuber
      rand = Math.random(); // rand will be between 0 and 1
      int rand_50 = (int)(Math.random() * 51);

    }
    }
