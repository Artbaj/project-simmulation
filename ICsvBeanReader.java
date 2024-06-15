import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ICsvBeanReader {
    private List<Integer> data = new ArrayList<>();
    /**
     * @param pathName - path of the file
     * responsible for reading csv files with parameters for the simulation
     */
    void read(String pathName){

        try {
            File myObj = new File(pathName);
           
            Scanner myReader = new Scanner(myObj);
            myReader.useDelimiter(",");
            while (myReader.hasNext()) {

                try {
                    data.add(Integer.parseInt(myReader.next()));
                }catch (NumberFormatException e){

                }
        ;

            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     *
     * @returns size for the simulation
     */
    int size(){

        return data.get(0);
    }

    /**
     * @returns fish ammount for the simulation
     */
    int fishAmount(){
        return data.get(1);
    }

    /**
     * @returns number of iteration
     */
    int itNum(){
        return data.get(2);
    }
    }


