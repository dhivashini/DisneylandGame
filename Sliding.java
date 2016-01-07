public class Sliding extends ActorStrategy 
{
    // instance variables - replace the example below with your own
    public Sliding()
    {
    }
    public void movement(Hero hero)
    {
      //  if(hero.getY() !=  460)
        {
            hero.setImage("Figureright6.png");
            hero.setLocation(hero.getX(),465);
        }
        
    }
}
