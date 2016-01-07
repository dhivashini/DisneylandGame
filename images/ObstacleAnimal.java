import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ObstacleAnimal extends Obstacle
{

    int x;
    int count=0;
    ObstacleAnimal(){

        x=3;

    }
    
    public void updateSpeed(int speed)
    {
       this.speed  = -speed;
    }

    public void act() 
    {
        setLocation(getX()-4,getY());
        move(6);
        right();
        left();
        //removeObstacle();   
    }    

    public void move(int distance)
    {
        double angle = Math.toRadians( getRotation()); 
        System.out.println("Angle: "+angle);
        /*        int y = (int) Math.round(getY() + Math.cos(angle) * distance);
        int x = (int) Math.round(getX() + Math.sin(angle) * distance);*/

        int y = (int) Math.round(getY());//0
        int x = (int) Math.round(getX() - Math.sin(angle) * distance);//1
        setLocation(x, y);
    }

    private void right(){
        System.out.println("Right X for animal: "+getX());
        System.out.println(" RIght Y for animal: "+getY());
        if(getX()==0)
        {

            // setImage("C:/Users/userraina/Desktop/spike_animal_modified_1.png");

            setRotation(270);

            count++;
            //System.out.println("Count is : "+count);
            if(count==2){
                removeObstacle();

            }
        }
    }
    private void left(){
        if(getX()==799)
        {

            setRotation(0);
            // setImage("croco.png");
        }

    }

    /*private void removeObstacle(){
        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }*/
}
