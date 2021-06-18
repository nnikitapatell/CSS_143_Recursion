
/**
 * Write a description of class BinarySearch here.
 * The binary search algorithm can be accomplished in a number of ways, but the basic algorithm is outlined below. You must implement this iteratively and recursively.
 * While LowIndex is less than or equal to HighIndex
 * If the target word is before the word at MidIndex, then set HighIndex to MidIndex - 1
 * If the target word is after the word at MidIndex, then set LowIndex to MidIndex + 1
 * Set MidIndex to be equal to half way between the low and high index
 * If the target word matches the word at MidIndex, return MidIndex (first case)
 * If the target word was not found, throw an ItemNotFoundException (you create this class)
 *
 * @author Nikita Patel
 * @version 1
 */
public class BinarySearch extends SearchAlgorithm{
    /**
     * Method recSearch
     *
     * @param words A parameter
     * @param wordToFind A parameter
     * @return The return value
     */
    public int search(String[] words, String wordToFind) throws ItemNotFoundException{
        //int lowIndex is set to 0
        int lowIndex = 0;
        //highIndex is set to the length of String array - 1
        int highIndex = words.length - 1;
        //call resetCount method
        resetCount();
        
        //while the low index is less than or equal to the high index
        while(lowIndex <= highIndex){
            //call incrementCount method
            incrementCount();
            
            //midIndex is set to the lowIndex plus highIndex divided by 2
            int midIndex = (lowIndex + highIndex) / 2;
            
            //check and compare the word of the midIndex to the wordTofind word 
            //if they are the same return 0 
            if (words[midIndex].compareTo(wordToFind) == 0){
                //return the midIndex
                return midIndex;
            }
            //otherwise check and compare the word of the midIndex to the wordTofind word 
            //if they are the greater than 0
            else if (words[midIndex].compareTo(wordToFind) > 0){
                //set highIndex to midIndex-1
                highIndex = midIndex-1;
            }
            //otherwise
            else{
                //set lowIndex to midIndex+1
                lowIndex = midIndex +1;
            }
        }
        
        //throw an exception if the item is not found
        throw new ItemNotFoundException("Item not found");
    }
    
    /**
     * Method recSearch
     *
     * @param words A parameter
     * @param wordToFind A parameter
     * @return The return value
     */
    public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException{
        // int lowIndex is set to 0
        int lowIndex = 0;
        // int highIndex is set to 0
        int highIndex = 0;
        // int midIndex variable
        int midIndex;  
        
        //check if getCOunt is set to 0
        if (getCount() == 0){
            //set lowIndex is set to 0
            lowIndex = 0;
            //set highIndex is set to length of the array -1
            highIndex = words.length - 1;
        }
        
        //midIndex is set to the lowIndex plus highIndex divided by 2
        midIndex = (lowIndex + highIndex) / 2;
        //call incrementCount method
        incrementCount();
        
        //check is the lowIndex is less than or equal to highIndex
        if (lowIndex <= highIndex){
            //check and compare the word of the midIndex to the wordTofind word 
            //if they are the same return 0 
            if (words[midIndex].compareTo(wordToFind) == 0){
                //return midIndex
                return midIndex;
            }
            //otherwise check and compare the word of the midIndex to the wordTofind word 
            //if they are the greater than 0
            else if (words[midIndex].compareTo(wordToFind) > 0){
                //set highIndex to midIndex-1
                highIndex = midIndex-1;
                //recursive call
                return recSearch(words, wordToFind);
            }   
            //otherwise
            else{
                //set lowIndex to midIndex+1
                lowIndex = midIndex +1;
                //recursive call
                return recSearch(words, wordToFind);
            }
        }
        //otherwise, if lowIndex is greater than or equal to highIndex
        else{
            //throw an exception if the item is not found
            throw new ItemNotFoundException("Item not found");
        }
    }
}
