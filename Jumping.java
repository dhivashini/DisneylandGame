import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jumping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumping extends  ActorStrategy
{
    public void movement(Hero hero) 
    {
        if(hero.getY()!= 350)
        {
            hero.setImage("Figureright2.png");
            hero.setLocation(hero.getX(),hero.getY()-9);
        } 
    }
}