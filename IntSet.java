public interface IntSet{
	/**
* Adds another int to the set
*/
    void add(int n);
	
/**
* Returns true if the number is in the set, false otherwise
*/

   boolean contains(int n);

/**
* Returns true if the number is in the set, false otherwise.
  It also prints the value for every element that is checks
*/

   boolean containsVerbose(int n);	   

   /**
* Returns string representation of the values of the elements, separated by commas.
*/

   String toString();	  
}