import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    StartText startText = null;
    boolean gamePaused = false;
    Background maingame = null;
    PauseText pauseText = null;
    GameMenuFacade gameMenuFacade = null;

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    

        super(800, 600, 1);
        startText = new StartText();
        pauseText = new PauseText();
        gameMenuFacade = new GameMenuFacade(this,maingame);
        addObject(new StartScreenBG(),400,300);
        addObject(startText,400,300);
    }
    
    public void act()
    {
//        setImage(gif.getCurrentImage());
        /* if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse.getX() > 260 && mouse.getX() < 540 && mouse.getY() > 20 && mouse.getY() < 320) {
                Greenfoot.setWorld(new Background());
            }
            //System.out.println(mouse.getX() + " " + mouse.getY());
        }*/
        if(!gamePaused){
            if(Greenfoot.mouseMoved(startText)){
                GreenfootImage image = startText.getImage();
                image.scale(600,150);
                startText.setImage(image);
            }
            
                if(Greenfoot.mouseClicked(startText)){
                    
                    gameMenuFacade.startGame();
                }
        }
        else if(gamePaused)
        {
            if(Greenfoot.mouseClicked(pauseText)){
                gameMenuFacade.resumeGame();
            }
            if(Greenfoot.mouseClicked(startText)){
               gameMenuFacade.replayGame();
            }
        }
        
       
        
    }
    
    public void setGame(Background maingame)
    {
        this.maingame = maingame;
    }
    
    public void setGamePaused(boolean gamePaused)
    {        
        this.gamePaused = gamePaused;
    }
    
    public PauseText getPausedText()
    {
        return this.pauseText;
    }
    
    public StartText getStartText()
    {
        return this.startText;
    }
}
