import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseText extends Actor
{
    /**
     * Act - do whatever the PauseText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       /* if(Greenfoot.mouseMoved(this)){
            this.setImage("pause3.png");
        }
       else if(Greenfoot.getMouseInfo().getActor() != this){
            this.setImage("pause1.png");
        }*/
    }  
    
    private boolean setSecondImage(){
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        GreenfootImage image = this.getImage();
            if (mouse.getX() > (this.getX()+(image.getWidth()/2)) && 
                mouse.getX() < (this.getX()-(image.getWidth()/2)) && 
                mouse.getY() > (this.getY()+(image.getHeight()/2)) && 
                mouse.getY() < (this.getY()-(image.getHeight()/2))) {

                    System.out.println("In condition");
                                        return true;
            }
            else{
                
                return false;
            }
        
    }
}
