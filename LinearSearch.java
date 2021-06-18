
/**
 * This class should loop through the words from beginning to end, comparing the current string with
 * the target string at each step. 
 *
 * @author Nikita Patel
 * @version 1
 */
public class LinearSearch extends SearchAlgorithm{
    /**
     * Method search
     *
     * @param words A parameter
     * @param wordToFind A parameter
     * @return The return value
     */
    public int search(String[] words, String wordToFind) throws ItemNotFoundException{
        //int count is set to 0
        int count = 0;

        // if word is an element of words array
        for (String word : words) {
            //call the incrementCOunt method            
            incrementCount();
            //check is word equals wordToFind
            if (word.equals(wordToFind)) {
                //return count
                return count;
            }
            //increment count
            count++;
        }
        //throw exception
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
        //call search method with 3 parameters
        return search(words,wordToFind, 0);
    }

    /**
     * Method search
     *
     * @param words A parameter
     * @param wordToFind A parameter
     * @param index A parameter
     * @return The return value
     */
    public int search(String[] words, String wordToFind, int index) throws ItemNotFoundException{
        //call incrementCount method
        incrementCount();

        //check if index is equal to teh length of the array words
        if(index == words.length){
            //throw an exception
            throw new ItemNotFoundException("Item not found");
        }
        //check if the index of words is equal to wordToFind
        if (words[index].equals(wordToFind)){
            //return index
            return index;
        }
        //otherwise
        else{
            //increment index
            index++;
            //recursive call
            return search(words, wordToFind,index);
        }
    }
}
