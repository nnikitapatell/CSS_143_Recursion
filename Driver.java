
/**
 * Driver class to test FindFIle.
 * Try to find a file that exists once.
 * Try to find a file that doesn't exist.
 * Try to find a file that exists twice.
Try to find a file that exists MAX_NUMBER_OF_FILES_TO_FIND.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Driver{
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        //String variable named targetFile 
        String targetFile = "";
        //set target file to "hw.txt"
        targetFile = "hw.txt";
        //Create a String varaibel called pathToSearch
        String pathToSearch = "";
        //set pathToSearch to "C:\\Users\\niki3\\Desktop\\CSS 143"
        pathToSearch = "C:\\Users\\niki3\\Desktop\\CSS 143";
        
        String targetFile1 = "";
        //set target file to "hw.txt"
        targetFile1 = "DNE.txt";

        String targetFile2 = "";
        //set target file to "hw.txt"
        targetFile2 = "find.txt";
        
        //create a object of the FindFile class called finder
        FindFile finder = new FindFile(4);
        
        
        //try-catch block to catach any unforeseen exceptions
        //try
        try{
            //searching for the target file
            System.out.println("Searching for " + targetFile);
            //call the directorySearch method from FindFile class that has two parameter inputs
            finder.directorySearch(targetFile, pathToSearch);
            
            //searching for the target file
            System.out.println("Searching for " + targetFile1);
            //call the directorySearch method from FindFile class that has two parameter inputs
            finder.directorySearch(targetFile1, pathToSearch);
                        //searching for the target file
                        
            System.out.println("Searching for " + targetFile2);
            //call the directorySearch method from FindFile class that has two parameter inputs
            finder.directorySearch(targetFile2, pathToSearch);
            
        }
        // exception
        catch(Exception e){
             //print message
             System.out.println(e.getMessage());
        }
        
        //Print the results and count
        System.out.println("Results for target file: ");
        System.out.println("Count: " + finder.getCount());
        String [] files = finder.getFiles();
        //itterate through the array files 
        for(int i = 0; i < finder.getCount(); i++){
            //print out file elements
            System.out.println(files[i]);
        }
    }
}
