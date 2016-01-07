public class GoodiesFactory  extends Factory
{
    public Goodies createGoodies(String goodies) {
       int i = 4;
       Goodies c = null;
       if(goodies.equals("gift"))
                c = new Gift();
       else if(goodies.equals("balloon"))
                c = new Balloon();
       else if(goodies.equals("star"))
                 c = new Star();
       else if(goodies.equals("icecream"))
                c = new Icecream();
       else if(goodies.equals("bells"))
                c = new Bells();
       return c;
    }
    
    public Obstacle createObstacle(String s){
        return null;
    }
}
