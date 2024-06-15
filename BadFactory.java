import java.util.List;

public class BadFactory {
    private List<List<tile>> pollutedFields;
    private int targetX=0;
    private int targetY=0;

    public BadFactory(List<List<tile>> Map){
        this.pollutedFields=Map;
        pollutedFields.get(0).get(0).pollute();
    }

    /**
     *pollutes tiles
     */
    void pollute(){
       for(int i=0;i<targetX;i++){
           for(int j=0;j<targetY;j++){
               if(targetY<pollutedFields.size()&&targetX<pollutedFields.size()){
                   pollutedFields.get(i).get(j).pollute();

               }


           }
       }
        targetY++;
        targetX++;




    }


}
