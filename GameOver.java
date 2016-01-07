import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    GameMenuFacade gameFacade = null;
    StartText startText = null;
    ScoreImage yogurt = null;
    ScoreCount yogurtScore = null;
    ScoreImage fruites = null;
    ScoreCount totalScore = null;
    
    public GameOver()
    {    
        super(800, 600, 1); 
        addObject(new StartScreenBG(),400,300);
        startText = new StartText();
        startText.setImage("../images/replay.png");
        addObject(startText, 400, 450);
 
        
        fruites = new ScoreImage();
        GreenfootImage g = new GreenfootImage("./images/Figureright1.png");
        g = new GreenfootImage("Yaay !!! Your Collection", 70, Color.yellow, null);
        g.scale(300,50);
        fruites.setImage(g);
        addObject(fruites, 350,170);
              
        totalScore = new ScoreCount();
        g = new GreenfootImage(""+0, 100, Color.yellow, null);
        totalScore.setImage(g);
        addObject(totalScore, 550,170);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(startText)){
                gameFacade.replayGame();
        }
    }
    
    public void setGameMenuFacade(GameMenuFacade gameFacade)
    {
        this.gameFacade = gameFacade;
    }
    
    public void showScore(HashMap<String, ScoreCount> scoreObjects)
    {
        /*int yogurtCount = scoreObjects.get("Yogurt").getScore();
        GreenfootImage g = new GreenfootImage(""+ yogurtCount, 100, Color.yellow, null);
        //System.out.println(yogurtCount);
        yogurtScore.setImage(g);*/
        
        int score = 0;
        
        for(String currentKey : scoreObjects.keySet())
        {
            if(!currentKey.equals("Yogurt"))
            {
               score += scoreObjects.get(currentKey).getScore();
            }
        }
        
        GreenfootImage g = new GreenfootImage(""+ score, 70, Color.red, null);
        totalScore.setImage(g);
    }
}
