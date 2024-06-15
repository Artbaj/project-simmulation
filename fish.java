public class fish {
    public int Speed;
    public int positionX;
    public int positionY;
    public int prefferedBait;
    public double weight;
    public double price;
    public boolean isAlive=true;
    public boolean isCaught=false;
    public boolean isAggresive=false;

    public enum type{
        carp,
        crucian,
        roach,
        porpoise
    }
    type Type;
    type fishType(){
        return this.Type;
    }

    public fish(){
        this.weight=0;
    }
    public fish(int Speed,double weight,int positionX,int positionY){
        this.weight=weight;
        this.positionX=positionX;
        this.positionY=positionY;

    }
    float price(){
        return (float) (this.weight/2.);
    }
    int getX(){
        return this.positionX;
    }
    int getY(){
        return this.positionY;
    }
    void setX(int X){
        this.positionX=X;
    }
    void setY(int Y){
        this.positionY=Y;
    }
    void gotCaught(){
        isCaught=true;
    }

}
