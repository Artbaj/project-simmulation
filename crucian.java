import java.util.List;

public class crucian extends fish {
   public boolean resistant = true;
   crucian(int Speed,double weight,int positionX,int positionY){
       super(Speed,weight,positionX,positionY);
       this.Speed = 2;
       this.prefferedBait=2;
       this.Type = type.crucian;
   }

}
