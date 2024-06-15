import java.util.List;
import java.util.Random;

public class moving {
    Random random =  new Random();
    private List<List<tile>> Map;
    private List<fish> Fish;
     public   moving(List<List<tile>> Map, List<fish> Fish){
         this.Map=Map;
         this.Fish=Fish;


    }
    void move(){
        for(fish F : Fish){
            /**
             * responsible for fish movement and the rest of their behaviour
             */
            if(!F.isCaught&&F.isAlive){
                int nextposX;
                int nextposY;
                if(F.fishType()==fish.type.crucian){
                    Map.get(F.getX()).get(F.getY()).clean();
                }//cleaning current tile if its a crucian
                Map.get(F.getX()).get(F.getY()).removeFish(F);
                if(random.nextBoolean()){
                    if(random.nextBoolean()){
                        F.Speed*=-1;
                    }//changing their direction
                    if(F.getX()>= Map.size()-F.Speed||F.getX()+F.Speed<=0){
                        nextposX= F.getX()-F.Speed;
                    }
                    else{
                        nextposX = F.getX()+F.Speed;
                    }//check if out of bounds
                    nextposY=F.getY();
                }
                else{
                    if(random.nextBoolean()){
                        F.Speed*=-1;
                    }
                    if(F.getY()>= Map.size()-F.Speed||F.getY()+F.Speed<=0){
                        nextposY= F.getY()-F.Speed;
                    }
                    else{
                        nextposY = F.getY()+F.Speed;//check if out of bounds
                    }
                    nextposX = F.getX();
                }
                F.setX(nextposX);
                F.setY(nextposY);

                Map.get(F.getX()).get(F.getY()).moveFish(F);


            }
            }

    }
    void poison(){
        /**
         * responsible for fish behaviour in response to their surrounding
         */
        for(fish F:Fish){

             if(Map.get(F.getX()).get(F.getY()).pollution>0.7){
                 if(!F.isAggresive){
                     F.isAlive=false;
                     Map.get(F.getX()).get(F.getY()).removeFish(F);
                 }//not killing the porpoise
             }//checking if tile is polluted enough
         }
    }
    }

