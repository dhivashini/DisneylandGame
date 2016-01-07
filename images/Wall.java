import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // moveBG();
       
       // if(Greenfoot.isKeyDown("right"))
       // {
            //System.out.println(getX());
            setLocation(getX()-1,getY());
            //move(-1);
       // }
        
       // if(Greenfoot.isKeyDown("left"))
       // {
       //     setLocation(getX()+1,getY());
       // }
        if(getX()==(getWorld().getWidth())-1)
        {
            setLocation(400,550);

        } 
         if(getX()==0)
        {
            //System.out.println("if x -1 -"+getX());
            setLocation(400,550);

        } 
        
    }    
}
