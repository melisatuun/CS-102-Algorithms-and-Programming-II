import java.util.Scanner;
public class Lab06
{
   
   // 1st method
   /**
    * We write a method called power that computes and returns x to the power y.
    * @param x is the real number which we want to raise to a power. 
    * @param y is the integer number which is the power of x.
    * @return the result of x to the power of y.
    */
   public static double power( double x, int y) 
   {
      // variables
      double result;
      
      // program code
      result = x;
      if ( y > 0 )
      {
         for ( int k = 1; k < y; k++)
         {
            result = result * x;
         }
         return result; 
      }
      else if ( y == 0 )
      {
         return 1;
      }
      {
         System.out.println( "Error! The power has to be positive! Try again.");
         return 0;
      }
   }
   
   // 2nd method
   /**
    * We write a method to compute n factorial.
    * @param n is the integer number which we find the factorial of. 
    * @return the factorial of the integer n.
    */
   public static double factorial( int n)
   {
      // variables
      int result;
      
      // program code
      if ( n > 0 )
      {
         result = n;
         for ( int m = n - 1; m > 0; m-- )
         {
            result = result * m;
         }
         return result;
      }
      else
      {
         System.out.println( "Error! n must be positive!");
         return 0;
      }
   }
   
   // 3rd method
   /**
    * We write a method reverse that takes a String parameter called s, and returns a String that is the reverse of s.
    * @param s is the String we want to reverse.
    * @return the reversed String.
    */
   public static String reverse( String s)
   { 
      
      // variables
      int a;
      String reverse;
      
      // program code
      reverse = "";
      a = s.length();
      
      for ( int i = a - 1; i >= 0; i-- )
      {
         reverse = reverse + s.charAt(i);
      }
      return reverse;
   }
   
   // 4th method
   /**
    * We write a method with the signature that converts the given base2 String to its decimal (base10) equivalent.
    * @param base2 is the String we want to return as base10.
    * @param base10 is an integer which is the decimal version of the String base2.
    * @return base10 is an integer which is the decimal version of the String base2.
    */
   public static int toDecimal( String base2)
   {
      // variables
      int value;
      int lengthOfWord;
      char b;
      int base10;
      int decimal;
      int valueOfDecimal;
      
      // program code
      lengthOfWord = base2.length();
      value = 0;
      decimal = 0;
      valueOfDecimal = 1;
      base10 = 0;
      
      for ( int a = lengthOfWord - 1; a >= 0; a-- ) 
      {
         b = base2.charAt(a);
         decimal++;
         if ( b == '0' )
         {
            value = 0;
         }
         if ( b == '1')
         {
            value = 1;
         }
         for ( int f = decimal - 1; f > 0; f-- ) 
         {
            valueOfDecimal = valueOfDecimal * 2; // because multiplying by the power of 2.
         }
         base10 = base10 + ( valueOfDecimal * value );
         valueOfDecimal = 1;
      }
      return base10;
   }
   
   // 5th method
   /**
    * We write a method that converts a positive decimal integer value into the corresponding binary String.
    * @param base10 is the inputted integer as a decimal.
    * @return base2 which is a String, the binary version of base10.
    */
   public static String toBinary( int k)
   {
      // constants
      String b;
      String Melis;
      
      // variables
      int a;
      
      // program code
      Melis = "";
      b = "";
      
      for ( int n = k; n > 0; n = n / 2 )
      {
         a = n % 2;
         if ( a == 0 )
         {
            b = "0";
         }
         if ( a == 1 )
         {
            b = "1";
         }
         Melis = b + Melis; 
      }
      return Melis;  
   }
   
   // 6th method
   /**
    * This is a brief description of the method.
    * @param x is the inputted double for sin(x).
    * @return base2 which is a string, binary version of base10.
    */
   public static double sin(double x)
   {
      // variables
      double term = 0;
      double sumOfTerms = 0;
      
      for ( int n = 0; n <= 10; n++ )
      {
         if ( n == 0 )
         {
            term = power( -1 , n ) * power( x , 2 * n + 1 ) / factorial ( 2 * n + 1 );
         }
         else
         {
            term = term * ( -1 ) * x * x / ( 2 * ( n - 1 ) + 2 ) / ( 2 * ( n - 1 ) + 3 );
         }
         sumOfTerms = sumOfTerms + term;
      }
      return sumOfTerms;
   }
   
   // 7th method
   /**
    * This is a brief description of the method.
    * @param x is the inputted double for sin(x).
    * @return base2 which is a string, binary version of base10.
    */
   public static String pad(String input , int length , char pc)
   {
      int pLength = length - input.length();
      
      for ( int counter = 0; counter < pLength; counter++ )
      {
         input = pc + input;
      }
      return input;
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // variables
      int n;
      int blanks;
      int sum;
      int startIndex;
      int endIndex;
      double term;
      double x;
      double sumOfTerms;
      String cell;
      String base2;
      String text;
      
      // 1. Task: Printing a table with n & n^4
      
      cell = "";
      System.out.println( pad ( "    n^1    n^2    n^3    n^4" , 10 , ' ') );
      for ( n = -1; n <= 10; n++ )
      {
         for ( int p = 1; p <= 4; p++ )
         {
            // System.out.print( pad (String.valueOf( n ) , 7 , ' ') );
            System.out.print( pad (String.valueOf( power (n,p) ) , 8 , ' ') );
         }
         System.out.println();
      }
      
      // 2. Task: Printing a table with n and its factorial
      
      System.out.println( "Second task of Lab06 runs...");
      System.out.print( pad( "n" , 3 , ' ' ) );
      System.out.println( pad( "factorial" , 15 , ' ') );
      for ( n = 1; n <= 15; n++ )
      {
         System.out.print( pad( String.valueOf(n) , 3 , ' ' ) );
         System.out.println( pad( String.valueOf(factorial (n) ) , 15 , ' ') );
      }
      System.out.println( "Second task of Lab06 finished.");
      System.out.println( "*********************************************");
      
      // 3. Task: Reading, converting and adding 2 binary strings
      
      System.out.println( "Third task of Lab06 runs...");
      sum = 0;
      
      for ( int a = 0; a < 2; a++ )
      {
         System.out.println( "Please enter a binary number:");
         base2 = scan.nextLine();
         sum = sum + toDecimal(base2);
      }
      System.out.println( "The sum of 2 binary numbers is: " + toBinary(sum) );
      System.out.println( "Third task of Lab06 finished.");
      System.out.println( "*********************************************");
      
      // 4. Task: Reading a line by spelling each word of the line reversed
      
      System.out.println( "Fourth task of Lab06 runs...");
      System.out.println( "Please enter some words you want:");
      text = scan.nextLine();
      endIndex = 0;
      
      for ( startIndex = 0; startIndex <= text.length() - 1; startIndex++ )
      {
         if ( text.charAt(startIndex) == (' ') )
         {
            System.out.print(reverse(text.substring(endIndex,startIndex) ) + " " );
            endIndex = startIndex;
         }
      }
      System.out.println(reverse(text.substring(endIndex,text.length() )));
      System.out.println( "Fourth task of Lab06 finished.");
      System.out.println( "*********************************************");
      
      // 5. Task: Raw calculations of sin(x)
      
      System.out.println( "Fifth task of Lab06 runs...");
      sumOfTerms = 0;
      System.out.println( "Please enter x for the calculation of sin(x)");
      x = scan.nextDouble();
      
      System.out.print( pad( "n" , 6 , ' ' ) );
      System.out.print( pad( "power" , 20 , ' ' ) );
      System.out.print( pad( "numerator", 45 , ' ' ) );
      System.out.print( pad( "denominator" , 45 , ' ' ) );
      System.out.print( pad( "term" , 45 , ' ' ) );
      System.out.println( pad( "sum of all terms" , 45 , ' ' ) );
      
      for ( n = 0; n <= 10; n++ )
      {
         
         term = power( -1 , n ) * power( x , 2 * n + 1 ) / factorial ( 2 * n + 1 );
         sumOfTerms = sumOfTerms + term;
         System.out.print( pad( String.valueOf ( n ) , 6 , ' ' ) );
         System.out.print( pad( String.valueOf ( power( -1 , n ) ) , 20 , ' ' ) );
         System.out.print( pad( String.valueOf ( power( x , 2 * n + 1 ) ) , 45 , ' ' ) );
         System.out.print( pad( String.valueOf ( factorial ( 2 * n + 1 ) ) , 45 , ' ' ) );
         System.out.print( pad( String.valueOf ( term ) , 45 , ' ' ) );
         System.out.println( pad( String.valueOf ( sumOfTerms) , 45 , ' ' ) );
         
      }
      System.out.println( "The raw calculation for sin(" + x + ") is " + sumOfTerms);
      System.out.println( "Fifth task of Lab06 finished.");
      System.out.println( "*********************************************");
      
      // 6. Task: sin(x) but each term calculated from the previous one
      
      System.out.println( "Sixth task of Lab06 runs...");
      System.out.println( "Please enter x for a more accurate calculation of sin(x)");
      x = scan.nextDouble();
      System.out.println( "The less raw calculation for sin(" + x + ") is " + sin(x) );
      System.out.println( "The answer is " + (Math.abs(sin(x) - Math.sin(x) )) + " far from the actual value");
      System.out.println( "Sixth task of Lab06 finished.");
      System.out.println( "*********************************************");
   }
}
