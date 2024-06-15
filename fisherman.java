import java.util.ArrayList;
import java.util.List;

public class fisherman {
    private int catchNum;
    public List<fish> caughtFish = new ArrayList<>();


    private int positionX;
    private int positionY;

    public fisherman(){

    }

    /**
     *sets position of the fisherman
     */
    void setPosition(int X,int Y){
        this.positionX=X;
        this.positionY=Y;
    }

    /**
     *
     * @returns X coordinate of the fisherman
     */
    int getX(){
        return this.positionX;
    }
    /**
     * @returns Y coordinate of the fisherman
     */
    int getY(){
        return this.positionY;
    }

    /**
     * adds caught fish to the list
     * @param Fish - fish that were caught
     */
    void caught(fish Fish){
        this.catchNum++;
        caughtFish.add(Fish);

    }

    /**
     * prints caught fish
     */
    void bilans(){
        for(fish f:caughtFish){
            System.out.println(f.fishType());
        }
    }



}
