/** 
 * A simple Java class of BigNum.
 * @author Melis Atun 
 * @version 18.12.2019
 */
public class BigNum 
{ 
  final static int SIZE = 4; 
  final static int BASE = 16; 
  int[] number = new int[SIZE]; 
  
  // Empty constructor creating a BigNum representing zero 
  public BigNum() 
  { 
  } 
  
  // Constructor creating the BigNum from a String value of a number
  public BigNum( String value ) 
  { 
    for ( int i = 0 ; i <= value.length() - 1 ; i++ ) 
    { 
      number[i] = Character.getNumericValue( value.charAt( value.length() - 1 - i ) ); 
    } 
  } 
  
  // Copy Constructor 
  public BigNum( BigNum other ) 
  { 
    for ( int i = 0 ; i < SIZE ; i++ ) 
    { 
      this.number[i] = other.number[i] ; 
    } 
  } 
  
  // toString method 
  /** 
   * We return to String.
   * @return the value.
   */
  public String toString() 
  { 
    String value = ""; 
//    for ( int a = SIZE -1; a >= 0; a-- )
//    for ( int a = 0; a < SIZE - 1; a++ )
//    { 
//      value = value + number[a]; 
//      if ( number[a] < 10 )
//      {
//        value = value + number[a];
//      }
//      else
//      {
//        value = value + (char)(number[a] + 55);
//      }
//    } 
//    return value; 
    for ( int i = SIZE -1; i >= 0; i-- )
    {
      value = Integer.toHexString(number[i]) + value;
    }
    return value;
  } 
  
  
  // Equals method
  /** 
   * We make the numbers equal and check the condition.
   * @return the condition of the loop.
   */
  public boolean equals( BigNum other ) 
  { 
    for ( int i = 0 ; i < SIZE ; i++ ) 
    { 
      if ( this.number[i] != other.number[i] ) 
      { 
        return false; 
      } 
    } 
    return true; 
  } 
  
  // isZero method
  /** 
   * We check whether the number is zero or not.
   * @return the condition of the loop.
   */
  public boolean isZero() 
  { 
    for ( int i = 0 ; i < SIZE ; i++ ) 
    { 
      if ( number[i] != 0 ) 
      { 
        return false; 
      } 
    } 
    return true; 
  } 
  
  // shift method 
  /** 
   * We shift the numbers and indexes. 
   */
  public void shift( boolean left ) 
  { 
    int[] newNumber = new int[SIZE]; 
    
    if ( left == true ) 
    { 
      for ( int i = 0 ; i < SIZE - 1 ; i++ ) 
      { 
        newNumber[i + 1] = number[i]; 
      } 
      newNumber[0] = 0; 
    } 
    else if ( left == false ) 
    { 
      for ( int i = 0 ; i < SIZE - 1 ; i++ ) 
      { 
        newNumber[i] = number[i + 1]; 
      } 
      newNumber[SIZE - 1] = 0; 
    }   
    number = newNumber; 
  } 
  
  // add method 
  /** 
   * We add the numbers.
   * @return the overflow value. 
   */
  public int add ( BigNum other ) 
  {
    int overflow;
    overflow = 0;
    for ( int i = 0; i < SIZE; i++ )
    {
      int sum;
      sum = this.number[i] + other.number[i];
      if ( (sum + overflow) >= BASE )
      {
        this.number[i] = sum + overflow - BASE;
        overflow = 1;
      }
      else
      {
        this.number[i] = sum + overflow;
        overflow = 0;
      }
    }
    return overflow;
  }
  
  /**
   * This is a method to compare the numbers.
   * @param other is used to represent the other BigNum
   * @return the condition of the loops.
   */
  public boolean isLessThan( BigNum other )
  {          
    // variables
    int v1;
    int v2;
    
    // Initializing variables
    v1 = 0;
    v2 = 0;
    
    for ( int i = 0; i < SIZE; i++ )
    {
      if ( this.number[i] != other.number[i] )
      {
        return this.number[i] < other.number[i];
      }
      
    }
    return false;
//    for ( int i = SIZE - 1; i >= 0; i-- )
//    {
//      int  timesNumber;
//      timesNumber = number[i];
//      
//      for ( int times = 0; times < i; times++ )
//      {
//        timesNumber = timesNumber * BASE;
//        v1 = v1 + timesNumber;
//      }
//    }
//    for ( int i = SIZE - 1; i >= 0; i-- )
//    {
//      int timesNumber;
//      timesNumber = other.number[i];
//      
//      for ( int times = 0; times < i; times++ )
//      {
//        timesNumber = timesNumber * BASE;      
//        v2 = 2 + timesNumber;
//      }
//    }    
//    if ( v1 < v2 )
//    {
//      return true;
//    }
//    else
//    {
//      return false; 
//    }
//  }
  }
}

