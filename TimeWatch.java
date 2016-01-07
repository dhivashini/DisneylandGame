import java.util.concurrent.*;
/**
 * Write a description of class TimeWatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeWatch  
{
    long starts;

    public static TimeWatch start() {
    	return new TimeWatch();
    }

    private TimeWatch() {
    	reset();
    }

    public TimeWatch reset() {
    	starts = System.currentTimeMillis();
    	return this;
    }

    public long time() {
    	long ends = System.currentTimeMillis();
    	return ends - starts;
    }

public long time(TimeUnit unit) {
	return unit.convert(time(), TimeUnit.MILLISECONDS);
}
}
