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
    Map<String, Hurdle> obsMap;
    HurdleWrapper obsWrapper;
    GoodiesWrapper colWrapper;
    String[] colList = {"balloon","star","gift","bells","icecream"};
    public Manager(){
        colMap = new HashMap<String, Goodies>();
        obsMap = new HashMap<String, Hurdle>();
        colFactory = new GoodiesFactory();
        obsFactory = new HurdleFactory();
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
    
    
    
    public HurdleWrapper getRandomHurdle(World world){
        String [] obsList = {"plant","dragon","fence","ball","fire","animal"};
        int hurdleType = Greenfoot.getRandomNumber(5);
        Hurdle c = obsMap.get(obsList[hurdleType]);
        if( c == null) {
            c = obsFactory.createHurdle(obsList[hurdleType]);
            obsMap.put(obsList[hurdleType], c);
        }
        obsWrapper = new HurdleWrapper();
        obsWrapper.setHurdle(c); 
        if(obsList[hurdleType].equals("ball")){
            obsWrapper.setX(((world.getWidth())-200));
            obsWrapper.setY((world.getHeight()-570));
        }else if(obsList[hurdleType].equals("plant")){
            obsWrapper.setX(((world.getWidth())));
            obsWrapper.setY((world.getHeight()-200));

        }else if(obsList[hurdleType].equals("fence")){
            obsWrapper.setX(((world.getWidth())));
            obsWrapper.setY((world.getHeight()-140));}
        else{
            obsWrapper.setX((world.getWidth()));
            obsWrapper.setY((world.getHeight()-160)); }
        return obsWrapper; 
    }
}
