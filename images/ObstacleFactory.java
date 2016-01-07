import java.util.HashMap;
public class ObstacleFactory extends Factory
{
    Obstacle obs ;
   
    public ObstacleFactory(){}
    
    public Obstacle createObstacle(String obstacle) {
        //System.out.println("*****************Inside Object Factory**************************");
        if (obstacle.equalsIgnoreCase("brick")) {
            //System.out.println("[][][][][][][][][]Creating Brick object first time[][][][][][][][][]");
            obs = new ObstacleBrick();
        } else if (obstacle.equalsIgnoreCase("fence")) {
            //System.out.println("##################Creating Fence object first time##################");
            obs = new ObstacleFence();
        }else if (obstacle.equalsIgnoreCase("plant")) {
            //System.out.println("@@@@@@@@@@@@@@@@@@Creating Fence object first time@@@@@@@@@@@@@@@@@@");
            obs = new ObstaclePlant();
        } 
        else if (obstacle.equalsIgnoreCase("ball")) {
            //System.out.println("@@@@@@@@@@@@@@@@@@Creating Fence object first time@@@@@@@@@@@@@@@@@@");
            obs = new ObstacleBall();
        }
         else if (obstacle.equalsIgnoreCase("wheel")) {
            //System.out.println("@@@@@@@@@@@@@@@@@@Creating Fence object first time@@@@@@@@@@@@@@@@@@");
            obs = new ObstacleWheel();
        }
        else if (obstacle.equalsIgnoreCase("animal")) {
            //System.out.println("@@@@@@@@@@@@@@@@@@Creating Fence object first time@@@@@@@@@@@@@@@@@@");
            obs = new ObstacleAnimal();
        }
        return obs;        
    }
    
    public Goodies createGoodies(String s){
        return null;
    }
}
