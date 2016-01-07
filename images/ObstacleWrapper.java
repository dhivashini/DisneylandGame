public class ObstacleWrapper
{
    private int x;
    private int y;
    private Obstacle obstacle;
     
    public void setX(int x){
        this.x =x;
    }
    
    public void setY(int y){
        this.y =y;
    }
    
    public void setObstacle(Obstacle obs){
        obstacle = obs;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Obstacle getObstacle(){
        return obstacle;
    }
}
