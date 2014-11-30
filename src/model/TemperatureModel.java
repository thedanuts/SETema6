package model;
import java.util.Random;

/**
 * Created by Danuts on 11/30/2014.
 */
public class TemperatureModel {
    private int mDegrees;
    private int mWindSpeed;

    public int random(){
        Random rnd = new Random();

        int rand = rnd.nextInt(50);

        return rand;
    }

    public void setDegrees(){
        mDegrees = random();
    }

    public int getDegrees(){
        return mDegrees;
    }

    public void setWindSpeed(){
        mWindSpeed=random();
    }

    public int getWindSpeed(){
        return mWindSpeed;
    }
}
