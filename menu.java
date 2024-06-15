import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class menu {
    int p=1;
    int x;
    int y;
    public menu(List<List<tile>> Map,fisherman fisherman){
        while(p!=0){
            System.out.println("choose:\n1:fishermans balance\n2.check tile\n3.print Map\n4.pollution map\n0.next iteration");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));


            try {
                p = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException | IOException e){
                System.out.println("niepoprawny wybór");
            }
            if(p==1){
               fisherman.bilans();
            }
            if(p==2){
                System.out.println("choose X coordinate");
                try {
                    x = Integer.parseInt(reader.readLine());
                }catch (NumberFormatException | IOException e){
                    System.out.println("niepoprawny wybór");
                }
                System.out.println("choose Y coordinate");
                try {
                    y = Integer.parseInt(reader.readLine());
                }catch (NumberFormatException | IOException e){
                    System.out.println("niepoprawny wybór");
                }
                System.out.println(Map.get(x).get(y).getFish());
            }
            if(p==3){
                for (int i=0;i<Map.size();i++){
                    for (int j=0;j<Map.size();j++){
                        if(Map.get(i).get(j).getFish().size()!=0){
                            if(Map.get(i).get(j).getFish().get(0).isAggresive){
                                System.out.print("[P]");
                            }
                           else{
                                System.out.print("[F]");
                            }
                        }

                        else{
                            System.out.print("[ ]");
                        }
                    }
                    System.out.println();
                }
            }
            if(p==4){
                for(List<tile> r :Map){
                    for(tile t:r){
                        System.out.print("["+t.getPollution()+"]");
                    }
                    System.out.println();
                }
            }
        }

    }
}
