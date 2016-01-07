public class HurdleWrapper
{
    private int x;
    private int y;
    private Hurdle hurdle;
     
    public void setX(int x){
        this.x =x;
    }
    
    public void setY(int y){
        this.y =y;
    }
    
    public void setHurdle(Hurdle obs){
        hurdle = obs;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Hurdle getHurdle(){
        return hurdle;
    }
}
