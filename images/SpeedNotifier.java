import java.util.ArrayList;
public class SpeedNotifier implements SpeedNotifierIfc
{
   int globalSpeed = 1;
   
   private ArrayList<SpeedObserverIfc> speedObservers = new ArrayList<SpeedObserverIfc>();
    
    public SpeedNotifier()
    {
    }
    
    public void attachSpeedObserver(SpeedObserverIfc observer){
        speedObservers.add(observer);
        observer.updateSpeed(globalSpeed);
    }
    
    public void detachSpeedObserver(SpeedObserverIfc observer){
        speedObservers.remove(observer);
    }
    
    public void notidySpeedObservers(){
        
        for(SpeedObserverIfc speedObserver : speedObservers)
        {
            speedObserver.updateSpeed(globalSpeed);
        }
        
    }
    
    public int getGlobalSpeed(){
        return globalSpeed;
    }
    
    public void setGlobalSpeed(int globalSpeed){
        this.globalSpeed = globalSpeed;
        notidySpeedObservers();
    }
}
