import java.util.List;

public class porpoise extends fish{

    private int howManyEaten;
    private List<List<tile>> Map;
    private int targetX;
    private int targetY;
    porpoise(int positionX,int positionY,List<List<tile>> Map){
        super(2,3,positionX,positionY);
        this.Speed = 2;
        this.isAggresive=true;
        this.Map=Map;
        this.Type=type.porpoise;
    }
    void hunt(){
        /**
         * responsible for the hunting behavior of porpoise
         */
        for(int i =-1;i<2;i++){
            for(int j=-1;j<2;j++){
                targetX=positionX+i;
                targetY=positionY+j;
                if(targetX>0&&targetX<Map.size()&&targetY>0&&targetY<Map.size()){//checking if attacks in bounds
                    if(!Map.get(targetX).get(targetY).getFish().isEmpty()){

                        for(fish fish:Map.get(targetX).get(targetY).getFish()){
                            if(fish.isAlive&&!fish.isAggresive){
                                this.howManyEaten++;
                                fish.isAlive=false;

                            }//checking if fish hasn't already been killed and killing it if it hasn't

//
                        }


                    }
                }
            }
        }


    }
    int returnEaten(){
        return this.howManyEaten;
    }
}
