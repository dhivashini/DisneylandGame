public class ObstacleWrapper
{
    private int x;
    private int y;
    private Hurdle obstacle;
     
    public void setX(int x){
        this.x =x;
    }
    
    public void setY(int y){
        this.y =y;
    }
    
    public void setObstacle(Hurdle obs){
        obstacle = obs;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Hurdle getObstacle(){
        return obstacle;
    }
}
