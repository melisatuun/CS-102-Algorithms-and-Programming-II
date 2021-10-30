/** 
 * A simple Java class to loan, return and loan a book. 
 * @author Melis Atun 
 * @version 09.12.2019
 */
public class LibraryBook 
{ 
  // properties
  private String title; 
  private String author; 
  private String dueDate; 
  private int timesLoaned; 
  private boolean isLoaned; 
  
  // constructor
  public LibraryBook( String title, String author, int timesLoaned ) 
  { 
    this.title = title; 
    this.author = author;  
    this.dueDate = ""; 
    this.timesLoaned = timesLoaned; 
    isLoaned = false; 
  }
  
  // Cloning the book method
  /**
   * We clone the book.
   */
  public LibraryBook( LibraryBook clone )  
  { 
    this.title = clone.title; 
    this.author = clone.author; 
    this.dueDate = clone.dueDate; 
    this.timesLoaned = clone.timesLoaned; 
    isLoaned = false; 
  }
  
  // Loaning the book method 
  /** 
   * We loan the book. 
   */
  public void loanBook( String dueDate ) 
  { 
    if ( isLoaned == false ) 
    { 
      this.dueDate = dueDate; 
      timesLoaned++; 
      isLoaned = true; 
    } 
    else 
    { 
      System.out.println( this.title + " is already have been loaned!" ); 
    }     
  } 
  
  // Returning the book method 
  /** 
   * We return the book. 
   */
  public void returnBook() 
  { 
    if ( isLoaned == true ) 
    { 
      dueDate = ""; 
      isLoaned = false; 
    } 
    else 
    { 
      System.out.println( this.title + " is already have been returned!" ); 
    } 
  } 
  
  // Counting the times that the book is loaned 
  /** 
   * We count how many times that the book is loaned. 
   * @return the number of times that the book is loaned. 
   */
  public int getTimesLoaned() 
  { 
    return timesLoaned; 
  } 
  
  // Checking whether the book is on loan or not 
  /** 
   * We check whether the book is on loan or not. 
   * @return true or false according to the loop. 
   */
  public boolean onLoan() 
  { 
    if ( isLoaned == true ) 
    { 
      return true; 
    } 
    else 
    { 
      return false; 
    } 
  } 
  
  // Converting to String 
  /** 
   * We use the method toString() to get accurate results. 
   * @return the information about the book. 
   */
  public String toString() 
  { 
    return title + " by " + author + " had been loaned " + timesLoaned + " times" + " " + dueDate; 
  } 
  
  // Checking the two of them.
  /**
   * We check whether the book and its clone are equal or not.
   * @return true or false according to the loop.
   */
  public boolean equals( LibraryBook clone ) 
  { 
    
    if ( clone.title == this.title && clone.author == this.author ) 
    { 
      return true; 
    } 
    else  
    { 
      return false; 
    }  
  } 
  
  // Checking the two of them.
  /**
   * We check whether the book's and its clone's authors are equal or not.
   * @return true or false according to the loop.
   */
  public boolean hasSameTitle( LibraryBook clone ) 
  { 
    if ( clone.title == this.title ) 
    { 
      return true; 
    } 
    else 
    { 
      return false; 
    } 
  } 
  // Checking the two of them.
  /**
   * We check whether the book's and its clone's authors are equal or not.
   * @return true or false according to the loop.
   */
  public boolean hasSameAuthor( LibraryBook clone ) 
  { 
    if ( clone.author == this.author ) 
    { 
      return true; 
    } 
    else 
    { 
      return false; 
    } 
  }
  // Getting title method.
  /**
   * We get the title since it is a private property.
   * @return the title.
   */
  public String getTitle()
  {
    return title;
  }
}
