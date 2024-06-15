
import org.jeasy.random.EasyRandom;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class pond {

    public static void main(String[] args) {

        ICsvBeanReader reader = new ICsvBeanReader();
        reader.read("src/main/java/params.csv");



        int size = reader.size();
        int fishAmount= reader.fishAmount();
        int itNum= reader.itNum();
        EasyRandom random =  new EasyRandom();
        fisherman fisher = new fisherman();
        List<fish> Fish = new ArrayList();
        List<List<tile>> Map= new ArrayList<>();
        /**
         * creates an empty map of tile objects
         */
        for(int i =0;i<size;i++){
            Map.add(i, new ArrayList<>(){{

                for(int j=0;j<size;j++){
                    add(new tile());
                }
            }});
        }
        moving move = new moving(Map,Fish);
        fishing fishing = new fishing(fisher,size,Map,Fish);
        birds birb = new birds(Map);
        porpoise killer = new porpoise(random.nextInt(size), random.nextInt(size),Map );
        Fish.add(killer);
        BadFactory factory = new BadFactory(Map);
        fisher.setPosition((int)Math.floor((double)size/2),(int)Math.floor((double)size/2));//ustawianie rybaka na srodku mapy
        /**
         * generates random fish
         */
        for(int i = 0; i<fishAmount;i++){
            int randomNumber = random.nextInt(3);
            int randomX = random.nextInt(size);
            int randomY = random.nextInt(size);
            fish generated;
            switch (randomNumber){
                case 0:
                    generated=new roach(3,4,randomX,randomY);
                    Fish.add(generated);
                    Map.get(randomX).get(randomY).moveFish(generated);
                    break;
                case 1:
                    generated=new crucian(2,5,randomX,randomY);
                    Fish.add(generated);
                    Map.get(randomX).get(randomY).moveFish(generated);
                    break;
                case 2:
                    generated=new carp(2,6,randomX,randomY);
                    Fish.add(generated);
                    Map.get(randomX).get(randomY).moveFish(generated);
                    break;
            }



        }




        for(int i=0;i<itNum;i++){
            killer.hunt();
            move.move();
            move.poison();
            birb.hunt();
            fishing.fish();
            factory.pollute();
            new menu(Map,fisher);


        }


        fisher.bilans();







    }


}
