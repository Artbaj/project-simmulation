import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class fishing {
    private int bait;
    private int targetX;
    private int targetY;
    private int size;
    private List<fish> Fish;
    private fisherman fisherman;
    private List<List<tile>> Map;
    Random random =  new Random();
    public fishing(fisherman fisherman, int size,  List<List<tile>> Map,List<fish> Fish){
            this.size = size;
            this.Fish=Fish;
            this.fisherman=fisherman;
            this.Map=Map;

    }

    void fish(){
        this.bait = random.nextInt(3);
        this.targetX = random.nextInt(size);
        this.targetY = random.nextInt(size);
        for(fish fish : Fish){
            if(this.targetX==fish.getX() && this.targetY==fish.getY()&&fish.isAlive&&!fish.isCaught){
                if(this.bait==fish.prefferedBait){
                    fish.setX(fisherman.getX());
                    fish.setY(fisherman.getY());
                    fisherman.caught(fish);
                    fish.gotCaught();
                    Map.get(targetX).get(targetY).removeFish(fish);
                    Map.get(fisherman.getX()).get(fisherman.getY()).moveFish(fish);
                    System.out.println("fisherman caught:"+fish.fishType());
                }//checking if correct bait is used


            }



        }
    }
}
