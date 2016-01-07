/**
 * Write a description of class SpeedNotifierIfc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface SpeedNotifierIfc  
{
    public void attachSpeedObserver(SpeedObserverIfc observer);
    public void detachSpeedObserver(SpeedObserverIfc observer);
    public void notidySpeedObservers();
}
