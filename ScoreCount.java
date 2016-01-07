import greenfoot.*;  
import java.awt.Color;
public class ScoreCount extends ScoreBoard
{
    private int score = 0;
    
    // life changes - START
    public ScoreCount(){
    }
    
    public ScoreCount(String scoreElement){
        if(scoreElement.equals("Life"))
            score = 3;
    }
    // life changes - END
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public GreenfootImage getScoreImage(int size) 
    {
        GreenfootImage g = new GreenfootImage(""+score, size, Color.white, null);
        return g;
    }
    
    public void incrementScore()
    {
        score++;
    }
    
    public int getScore()
    {
        return score;
    }
    
    // life changes - START    
    public void decrementScore(){
        score--;
    }
    // life changes - END
}
