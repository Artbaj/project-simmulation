import java.util.ArrayList;
import java.util.List;

public class tile {
    public double pollution=0;

    private List<fish> tileFish = new ArrayList<>();

    public tile(){
    }

    /**
     *responsible for moving fish into the tile
     * @param fish - fish moved into the tile
     */
    void moveFish(fish fish){
        tileFish.add(fish);
    }

    /**
     *responsible for removing fish from the tile
     * @param - fish moved out of the tile
     */
    void removeFish(fish fish){
        tileFish.remove(fish);
    }

    /**
     *
     * @returns fish that are currently in the tile
     */
    List<fish> getFish(){
        return tileFish;
    }

    /**
     * adds pollution if needed
     */
    void pollute(){
        if(this.pollution<1){
            pollution+=.2;
        }

    }

    /**
     * removes pollution if needed
     */
    void clean(){
        this.pollution=0;
    }

    /**
     *
     * @returns pollution from this tile
     */
    double getPollution(){
        return  this.pollution ;
    }
}
