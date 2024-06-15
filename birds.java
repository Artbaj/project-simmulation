import java.util.List;
import java.util.Random;

public class birds {
    Random random = new Random();
    private List<List<tile>> Map;
    private int possibility=0;
    private int targetX;
    private int targetY;

    public birds(List<List<tile>> Map){
        this.Map=Map;

    }
    void hunt(){
        /**
         * responsible for the hunting of birds
         */
        int roundPossibility = random.nextInt(20);
        if(roundPossibility>=possibility){
            possibility=0;
            this.targetX=random.nextInt(Map.size());
            this.targetY=random.nextInt(Map.size());
            if(!Map.get(targetX).get(targetY).getFish().isEmpty()){

                for(fish fish:Map.get(targetX).get(targetY).getFish()){
                    if(fish.isAlive&&!fish.isAggresive){
                        fish.isAlive=false;
                        possibility=0;

                    }//checking if fish hasnt aleady been killed and killing it if it hasnt
                    System.out.println("birds attacked");

                }


            }
        }
        else{
            possibility++;
        }//making the possibility of attack greater each round
    }
}
