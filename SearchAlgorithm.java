
/**
 * Write a description of class SearchAlgorithm here.
 *
 * @author Nikita Patel
 * @version 1
 */
/**
 * 
 * SearchAlgorithm 
 *	A class used to delegate a search strategy or style
 *
 * @author: originally by cfolsen, this version modified by rnash
 */
public abstract class SearchAlgorithm {

    /**
     * Method search: a "to-be-defined" method used to implement a specific search strategy over the given array looking for the target word
     * Precondition: words is a nonempty array and target is a non-null string
     * Postcondition: if the target word is found, return its index.  
     *                If not found, throw an ItemNotFoundException (a subclass which you have to make)
     * 
     */
    public abstract int search(String[] words, String wordToFind) throws ItemNotFoundException;

    /**
     * Method recSearch
     *
     * @param words A parameter
     * @param wordToFind A parameter
     * @return The return value
     */
    public abstract int recSearch(String[] words, String wordToFind) throws ItemNotFoundException;

    /**
     * Utility Features: This class can be used to track the number of search comparisons
     *                   for use in comparing two different search algorithms
     */
    //instance of class Search algorithm
    private int count = 0;
    /**
     * Method incrementCount
     *
     */
    public void incrementCount() {
        this.count++;
    }

    /**
     * Method getCount
     *
     * @return The return value
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Method resetCount
     *
     */
    public void resetCount() {
        this.count = 0;
    }
}
