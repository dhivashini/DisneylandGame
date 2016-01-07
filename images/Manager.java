import greenfoot.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Manager  
{
    Factory colFactory;
    Factory obsFactory;
    Map<String, Goodies> colMap;
    Map<String, Obstacle> obsMap;
    ObstacleWrapper obsWrapper;
    GoodiesWrapper colWrapper;
    String[] colList = {"balloon","star","gift","bells","icecream"};
    public Manager(){
        colMap = new HashMap<String, Goodies>();
        obsMap = new HashMap<String, Obstacle>();
        colFactory = new GoodiesFactory();
        obsFactory = new ObstacleFactory();
    }
    
    public List<GoodiesWrapper> getRandomGoodies(){
       
       int x = 0;
       int y = 0;
       int numOfGoodiess = Greenfoot.getRandomNumber(6);
       String colType = null;
       List<GoodiesWrapper> list = new ArrayList<GoodiesWrapper>();
       
       do{
           colType = colList[Greenfoot.getRandomNumber(colList.length)];
           Goodies c = colMap.get(colType);
           if( c == null) {
               c = colFactory.createGoodies(colType);
               colMap.put(colType, c);
            }
           x = 1000 +100*list.size();
           y = 300 + 70*(Greenfoot.getRandomNumber(3));
           
           colWrapper = new GoodiesWrapper();
           colWrapper.setX(x);
           colWrapper.setY(y);
           colWrapper.setGoodies(c);
           
           list.add(colWrapper);
           
        } while (--numOfGoodiess>0);
       
       
       return list;
    }
    
    
    
    public ObstacleWrapper getRandomObstacle(World world){
        String [] obsList = {"plant","brick","fence","ball","wheel","animal"};
        int obstacleType = Greenfoot.getRandomNumber(5);
        Obstacle c = obsMap.get(obsList[obstacleType]);
        if( c == null) {
            c = obsFactory.createObstacle(obsList[obstacleType]);
            obsMap.put(obsList[obstacleType], c);
        }
        obsWrapper = new ObstacleWrapper();
        obsWrapper.setObstacle(c); 
        if(obsList[obstacleType].equals("ball")){
            obsWrapper.setX(((world.getWidth())-200));
            obsWrapper.setY((world.getHeight()-570));
        }else if(obsList[obstacleType].equals("plant")){
            obsWrapper.setX(((world.getWidth())));
            obsWrapper.setY((world.getHeight()-200));

        }else if(obsList[obstacleType].equals("fence")){
            obsWrapper.setX(((world.getWidth())));
            obsWrapper.setY((world.getHeight()-140));}
        else{
            obsWrapper.setX((world.getWidth()));
            obsWrapper.setY((world.getHeight()-160)); }
        return obsWrapper; 
    }
}
