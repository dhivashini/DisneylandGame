import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreenBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreenBG extends Actor
{
    GifImage gif = new GifImage("bg.gif");
    public void act() 
    {
        GreenfootImage bgImage = gif.getCurrentImage();
        bgImage.scale(800,600);
        setImage(bgImage);
    }    
}
