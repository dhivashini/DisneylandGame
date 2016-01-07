import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hurdle extends SpeedObserver
{
    
   public void updateSpeed(int speed)
    {
       this.speed  = -speed;
    }
    
    public void act(){
    
    setLocationForHurdle();
    removeHurdle();
    
    }
    
    public void setLocationForHurdle(){
    
        setLocation(getX()+this.speed,getY());
    }
    
    public void removeHurdle(){
    
        if(getX()==0){
        getWorld().removeObject(this);
        }
    }
   
}
