import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Walking extends  ActorStrategy
{
   int counter=0;
    public Walking(){
       
    }
    
    public void movement(Hero hero) 
    {
         counter++;
            if(counter==0){
               hero.setImage("Figureright1.png");
            }
            if(counter==10){
                hero.setImage("Figureright2.png");
            }
            if(counter==20){
               hero.setImage("Figureright4.png");
            }
            if(counter==30){
                hero.setImage("Figureright3.png");
            }
            if(counter==40){
                counter=0;
            }
        
        
    }
}
