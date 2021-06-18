
/**
 * Write a description of class ItemNotFoundException here.
 *
 * @author Nikita Patel
 * @version 1
 */
//create ItemNotFundException
public class ItemNotFoundException extends RuntimeException{
    /**
     * Constructor for objects of class ItemNotFoundException
     */
    public ItemNotFoundException(String input){
        //call super 
        super(input);
    }
}
