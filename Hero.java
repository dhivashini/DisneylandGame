import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor implements ScoreSubject
{
    private ActorStrategy hero;
    private ActorStrategy walkingHero;
    private ActorStrategy jumpingHero;
    private ActorStrategy slidingHero;

    private int jumpCounter = 0;
    private ArrayList<ScoreObserver> observers = new ArrayList();
    boolean gameOver = false;
    
    //life observer changes - START
    private int lifecounter=3;
    //life observer changes - END
    
    public Hero(){
        walkingHero = new Walking();
        jumpingHero = new Jumping();
        slidingHero = new Sliding();
        hero = walkingHero;
        
    }

    public void act() 
    {
        if(getY() == 440) {
            jumpCounter = 0;
        }
        hero = walkingHero;
        hero.movement(this);
        
        if(Greenfoot.isKeyDown("up") && jumpCounter < 120){
            hero = jumpingHero;
            hero.movement(this);
            incrementCounter();
        } else if(getY() < 440){
            setImage("Figureright3.png");
            setLocation(getX(),getY()+2);
        }
        
        if(Greenfoot.isKeyDown("down")) {
            hero = slidingHero;
            hero.movement(this);
        } else if(getY() > 440) {
            setLocation(getX(),440);
            hero = walkingHero;
        }
        
        Goodies goodies = (Goodies)getOneIntersectingObject( Goodies.class ) ;
        if(goodies != null)
        {
            Background bgWorld = (Background) getWorld() ;
            bgWorld.removeObject(goodies) ;
            bgWorld.getSpeedNotifier().detachSpeedObserver(goodies);
            
            this.notifyObservers(goodies.getClass().getName());
        }
        
        //life observer changes - START
        Hurdle hurdle = (Hurdle)getOneObjectAtOffset(3,3,Hurdle.class ) ;
        
        if(hurdle!=null)
        {
            lifecounter=lifecounter-1;
            Background bgWorld = (Background) getWorld() ;
            //bgWorld.removeObject(hurdle);
            //bgWorld.getSpeedNotifier().detachSpeedObserver(hurdle);
            this.setLocation(getX(),getY()-280);
            this.notifyObservers("Life");    
            if(lifecounter==0){
                gameOver = true;
            }
        }
        
        
        if(gameOver) {
            Background background = (Background)getWorld();
            background.getGameMenuFacade().stopGame();
        }
        //life observer changes - END
    }
    
    public void incrementCounter()
    {
        jumpCounter++;
    }
    
    public void attach(ScoreObserver obj)
    {
        this.observers.add(obj);
    }
    
    public void detach(ScoreObserver obj)
    {
        this.observers.remove(obj);
    }
    
    public void notifyObservers(String scoreElement)
    {
        for(ScoreObserver observer : observers) 
        {
            observer.update(scoreElement);
        }
    }
}