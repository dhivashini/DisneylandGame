import greenfoot.*;
public class Life extends Actor
{
    private int scale;
    private int transparency;
    private GreenfootImage lifeImage; 
    
    public Life(){
        scale = 180;
        transparency = 255;
        lifeImage = new GreenfootImage("./images/heart.png");
        lifeImage.scale(scale,scale);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(transparency == 1)
        {
            getWorld().removeObject(this);
        }
        lifeImage.setTransparency(transparency);
        this.setImage(lifeImage);
        transparency -=1;
    }     
}
