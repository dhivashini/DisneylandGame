import greenfoot.*;  
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class Background extends World
{
    private Manager manager;
    PauseText pauseText =null;
    StartText startText = null;
    boolean screenPaused = true;
    StartScreen startscreen = null;
    GameMenuFacade gameMenuFacade = null;
    int count = 0;
    SpeedNotifier speedNotifier = null;

    int speed = 1;
    Date currentDate=null;
    long currentTime = 0;
    int counter = 0;
    TimeWatch timeWatch= null;
    Crackers1 crackers1 = null;
    private final int MAX_SPEED = 10;
    ScoreBoard scoreboard = null;

    public Background()
    {    
        super(800, 600, 1);
        speedNotifier = new SpeedNotifier();
        crackers1 = new Crackers1();
        speedNotifier.attachSpeedObserver(crackers1);
        pauseText = new PauseText();
        startText = new StartText();
        addObject(new StartScreenBG(),400,300);

        addObject(crackers1,100,100);
        addObject(new Crackers2(),250,225);
        addObject(pauseText,50,50);
        addObject(new Wall(),400,550);
        Hero hero = new Hero();
        addObject(hero,100,440);
        currentDate = new Date();
        
        Greenfoot.start();
        timeWatch = TimeWatch.start();
        manager = new Manager();
        scoreboard = new ScoreBoard();
        hero.attach(scoreboard);
        addScoreBoard();
    }
    
     public void act()
    {
        
        currentTime = timeWatch.time(TimeUnit.SECONDS);
        if(currentTime == 30)
        {
            speedNotifier.setGlobalSpeed(speed < MAX_SPEED ? speed++ : speed);
            //speedNotifier.setGlobalSpeed(10);
            //System.out.println(speed);
            timeWatch.reset();
        }
        
        if(Greenfoot.mouseClicked(pauseText)){
            gameMenuFacade.pauseGame();                      
         }
         
        // if(Greenfoot.isKeyDown("right")) {
            if(count++ == 500){
              addNewGoodies();
              count = 0;
            }
    
            if(counter++ == 700){
           
              addNewHurdle();
              counter = 0;
            }
            
        }
    
    public void setStartScreen(StartScreen startscreen)
    {
        this.startscreen = startscreen;
    }
    
    public void setGameMenuFacade(GameMenuFacade gameMenuFacade)
    {
        this.gameMenuFacade = gameMenuFacade;
    }
    
    public GameMenuFacade getGameMenuFacade()
    {
        return this.gameMenuFacade;
    }
    
     public void addNewGoodies(){
        List<GoodiesWrapper> list = manager.getRandomGoodies();
        int i =1;
        for(GoodiesWrapper colWrapper : list){
            addObject(colWrapper.getGoodies(), colWrapper.getX(), colWrapper.getY());
             speedNotifier.attachSpeedObserver(colWrapper.getGoodies());
        }
        
    }
    
    public void addNewHurdle(){
        HurdleWrapper obsWrapper = manager.getRandomHurdle(this);
        addObject(obsWrapper.getHurdle(),obsWrapper.getX(),obsWrapper.getY());
        speedNotifier.attachSpeedObserver(obsWrapper.getHurdle());
    }
    
    public SpeedNotifier getSpeedNotifier() {
        return this.speedNotifier;
    }
    
    public void addScoreBoard() {
        ScoreImage star = new ScoreImage();
        star.setImage(getScoreImage("./images/star.gif"));
        addObject(star, 550,30);
        
        ScoreImage gift = new ScoreImage();
        gift.setImage(getScoreImage("./images/gift.gif"));
        addObject(gift, 600,30);
        
        ScoreImage balloon = new ScoreImage();
        balloon.setImage(getScoreImage("./images/balloon.gif"));
        addObject(balloon, 650,30);
        
        ScoreImage icecream = new ScoreImage();
        icecream.setImage(getScoreImage("./images/icecream.gif"));
        addObject(icecream, 700,30);
        
        ScoreImage bells = new ScoreImage();
        bells.setImage(getScoreImage("./images/bells.gif"));
        addObject(bells, 750,30);
       
        //life observer changes - START        
        ScoreImage life = new ScoreImage();
        GreenfootImage g = new GreenfootImage("./images/heart.png");
        g.scale(40,40);
        life.setImage(g);
        addObject(life, 400,30);
        //life observer changes - END
        
        ScoreCount starScore = new ScoreCount();
        starScore.setImage(starScore.getScoreImage(20));
        addObject(starScore, 570,30);
        this.scoreboard.addScoreObject("Star", starScore);
        
        ScoreCount giftScore = new ScoreCount();
        giftScore.setImage(giftScore.getScoreImage(20));
        addObject(giftScore, 620,30);
        scoreboard.addScoreObject("Gift",giftScore);
        
        ScoreCount balloonScore = new ScoreCount();
        balloonScore.setImage(balloonScore.getScoreImage(20));
        addObject(balloonScore, 670,30);
        scoreboard.addScoreObject("Balloon",balloonScore);
        
        ScoreCount icecreamScore = new ScoreCount();
        icecreamScore.setImage(icecreamScore.getScoreImage(20));
        addObject(icecreamScore, 720,30);
        scoreboard.addScoreObject("Icecream",icecreamScore);
        
        ScoreCount bellsScore = new ScoreCount();
        bellsScore.setImage(bellsScore.getScoreImage(20));
        addObject(bellsScore, 770,30);
        scoreboard.addScoreObject("Bells",bellsScore);

        ScoreCount lifeScore = new ScoreCount("Life");
        lifeScore.setImage(lifeScore.getScoreImage(40));
        addObject(lifeScore, 435,30);
        scoreboard.addScoreObject("Life",lifeScore);
        //life observer changes - END
    }
    
    public ScoreBoard getScoreBoard()
    {
        return this.scoreboard;
    }
    
    public GreenfootImage getScoreImage(String path) {
        GreenfootImage g = new GreenfootImage(path);
        g.scale(15,20);
        return g;
    }
}
