import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public interface ScoreSubject
{
    public void attach(ScoreObserver obj);
    public void detach(ScoreObserver obj);
    public void notifyObservers(String scoreElement);
}
