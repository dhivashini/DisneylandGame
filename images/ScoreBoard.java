import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.HashMap;

public class ScoreBoard extends Actor implements ScoreObserver
{
    private HashMap<String, ScoreCount> scoreObjects= new HashMap<String, ScoreCount>();
    
    public void act() 
    {
    }
    
    public void update(String scoreElement)
    {
        //life observer changes - START     
        if(scoreElement!=null && scoreElement.equals("Life"))
            updateLifeScore();
        //life observer changes - END        
        else{
        ScoreCount score = scoreObjects.get(scoreElement);
        score.incrementScore();
        score.setImage(score.getScoreImage(20));
        //updateYogurtScore();
        }
    }
    
    public void addScoreObject(String elementName, ScoreCount element)
    {
        scoreObjects.put(elementName, element);
    }
    
    public void updateYogurtScore()
    {
        ScoreCount yogurtScore = scoreObjects.get("Yogurt");
        boolean wonYogurt = true;
        for(String currentKey : scoreObjects.keySet())
        {
            if(!currentKey.equals("Yogurt"))
            {
                if(scoreObjects.get(currentKey).getScore() - yogurtScore.getScore() == 0)
                {
                    wonYogurt = false;
                    break;
                }
            }
        }
        
        if(wonYogurt)
        {
            yogurtScore.getWorld().addObject(new Yogurt(),400,150);
            yogurtScore.incrementScore();
            yogurtScore.setImage(yogurtScore.getScoreImage(40));
        }
    }
    
    //life observer changes - START
    public void updateLifeScore(){
        ScoreCount lifeScore = scoreObjects.get("Life");
        lifeScore.getWorld().addObject(new Life(),400,150); 
        lifeScore.decrementScore();
        lifeScore.setImage(lifeScore.getScoreImage(40));
    }
    //life observer changes - END
    
    public HashMap<String, ScoreCount> getFinalScore()
    {
        return this.scoreObjects;
    }
}
