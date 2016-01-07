import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Goodies extends SpeedObserver
{
    public void updateSpeed(int speed)
    {
       this.speed  = -speed;
    }
    public Goodies(){
        GreenfootImage image = getImage() ;
        image.scale(40, 40);
    }
    public void act() 
    {  
        move();
        if (getX() == 0)
        {
            Background bgWorld = (Background) getWorld() ;
            bgWorld.removeObject( this ) ;
            bgWorld.getSpeedNotifier().detachSpeedObserver(this);
        }
    }    
    
    public Goodies getRandomGoodies(){
       int i = Greenfoot.getRandomNumber(5);
       Goodies c = null;
       switch(i) {
           case 0: c = new Gift();
                    break;
           case 1: c = new Balloon();
                    break;
           case 2: c = new Star();
                    break;
           case 3: c = new Icecream();
                    break;
           case 4: c = new Bells();
                    break;
        }
        return c;
    }
}
