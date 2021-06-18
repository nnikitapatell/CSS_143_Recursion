import java.io.File;
/**
 * We’ll just be interested in the file names here, and we’ll want perform a brute force 
 * (i.e., sequential) search of these files looking for a specific file. The way in which we’ll get 
 * file information from the operating system will involve no ordering; as a result, a linear search 
 * is the best we can do. We’d like to search for a target file given a specified path and return the 
 * location of the file, if found. 
 *
 * @author Nikita Patel
 * @version 1
 */
//create class called FindFile
public class FindFile{
    //private instance variables
    //preivate int variable set to 0
    private int maxFiles = 0;
    //private int count varaible set to 0
    private int count = 0;
    //private string array
    private String [] foundLocations;
    
    /**
     * FindFile Constructor- This constructor accepts the maximum number of files to find.
     *
     * @param maxFiles A parameter
     */
    public FindFile(int maxFiles){
        //initalize variables
        this.maxFiles = maxFiles;
        this.count = 0;
        //initialize the array
        foundLocations = new String[maxFiles];
    }
    
    /**
     * Method directorySearch- The parameters are the target file name to look for and the directory 
     * to start in.
     *
     * @param target A parameter
     * @param dirName A parameter
     */
    public void directorySearch(String targetFile, String dirName) throws Exception{
        //create a instance of File class 
        File newDirectory = new File(dirName);
        
        //check if dir is not directory
        if(!newDirectory.isDirectory()){
            //throw exception
            throw new IllegalArgumentException("not a valid dirctory");
        }
        
        //list of files in the path
        String list[] = newDirectory.list();
        
        //check is list array is not null
        if (list != null){
            //iterate through the array list
            for (int i = 0; i < list.length; i++){
                //check if the current file is the target file we are looking for
                if (list[i].equalsIgnoreCase(targetFile)){
                    // add to the found location files path
                    foundLocations[count] = dirName + "\\" + targetFile;
                    
                    //increment count
                    count++;
                    if (count == maxFiles){
                        //Throw an exception if you've found the MAX_NUMBER_OF_FILES_TO_FIND 
                        throw new Exception("Maximum files have been found");
                    }
                }
                //otherwise
                else{
                    //create a file object
                    File theFile = new File(dirName + "\\" +list[i]);
                    if(theFile.isDirectory()){
                        //call directorySearch reursively
                        directorySearch(targetFile, theFile.getAbsolutePath());
                    }
                }
            }
        }
    }

    /**
     * Method getCount- This accessor returns the number of matching files found
     *
     * @return The return value
     */
    public int getCount(){
        //return count
        return count;
    }
    
    /**
     * Method setCount- this method sets the count of the number of matching files fount
     *
     * @param count A parameter
     */
    public void setCount(int count){
        //set this.count to count input parameter
        this.count = count;
    }
    
    /**
     * Method getFiles- This getter returns the array of file locations, up to maxFiles in size.
     *
     * @return The return value
     */
    public String[] getFiles() {
        //return foundLocations
        return foundLocations;
    }
    
    /**
     * Method setFiles- this mehtod set the array of the file location
     *
     * @param foundLocations A parameter
     */
    public void setFiles(String[] foundLocations){
        //set this.foundLocations to input String array parameter
        this.foundLocations = foundLocations;
    }    
}