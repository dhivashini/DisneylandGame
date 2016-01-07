import java.util.HashMap;
public class HurdleFactory extends Factory
{
    Hurdle obs ;
   
    public HurdleFactory(){}
    
    public Hurdle createHurdle(String hurdle) {
        if (hurdle.equalsIgnoreCase("dragon")) {
            obs = new HurdleDragon();
        } else if (hurdle.equalsIgnoreCase("fence")) {
            obs = new HurdleFence();
        }else if (hurdle.equalsIgnoreCase("plant")) {
            obs = new HurdlePlant();
        } 
        else if (hurdle.equalsIgnoreCase("ball")) {
            obs = new HurdleBall();
        }
         else if (hurdle.equalsIgnoreCase("fire")) {
            obs = new HurdleFire();
        }
        else if (hurdle.equalsIgnoreCase("animal")) {
            obs = new HurdleAnimal();
        }
        return obs;        
    }
    
    public Goodies createGoodies(String s){
        return null;
    }
}
