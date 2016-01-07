import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class GameMenuFaced here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenuFacade  
{
    StartScreen startscreen = null;
    Background mainGame = null;
    GreenfootSound sound = null;
    GameOver gameoverScreen = null;
    GreenfootSound gameoverSound = null;
    
    public GameMenuFacade(StartScreen startscreen,Background mainGame)
    {
        this.startscreen = startscreen;
        this.mainGame = mainGame;
        this.sound = new GreenfootSound("audio.mp3");
        this.gameoverScreen = new GameOver();
        this.gameoverSound = new GreenfootSound("gameover.mp3");
    }
    
    public GameMenuFacade()
    {
        
    }
    
    public void pauseGame(){
        startscreen.setGame(this.mainGame);
        startscreen.setGamePaused(true);
        Greenfoot.setWorld(startscreen); 
        sound.pause();
    }
    
    public void resumeGame(){
        Greenfoot.delay(50);
        Greenfoot.setWorld(mainGame);
        sound.playLoop();
    }
    
    public void replayGame(){
         mainGame = new Background();
         mainGame.setGameMenuFacade(this);
         mainGame.setStartScreen(startscreen);
         Greenfoot.setWorld(mainGame);
         sound.playLoop();
    }
    
    public void startGame()
    {
        PauseText pauseText = startscreen.getPausedText();
        StartText startText = startscreen.getStartText();
        startscreen.removeObject(pauseText);
        pauseText.setImage("play.png");
        startText.setImage("replay.png");
        startscreen.addObject(pauseText,250,300);
        startscreen.addObject(startText,650,300);

        mainGame = new Background();
        mainGame.setGameMenuFacade(this);
        mainGame.setStartScreen(startscreen);
        Greenfoot.setWorld(mainGame);
        sound.playLoop();
    }
    
    public void setStartScreen(StartScreen startscreen)
    {
        this.startscreen = startscreen;
    }
    
    public void setMainGame(Background maingame)
    {
        this.mainGame = maingame;
   
    }
    
    public void stopGame()
    {
        gameoverScreen.setGameMenuFacade(this);
        Greenfoot.setWorld(gameoverScreen);
        sound.stop();
        gameoverSound.play();
        gameoverScreen.showScore(mainGame.getScoreBoard().getFinalScore());
    }
}
