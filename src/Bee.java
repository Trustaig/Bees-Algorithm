import java.util.ArrayList;
import java.util.Random;

public class Bee {

    public float healthScore;

    ArrayList<Queen> queenList = new ArrayList<>();
    ArrayList<Worker> workerList = new ArrayList<>();
    ArrayList<Drone> droneList = new ArrayList<>();

    public int randomDamage(){
        Random random = new Random();
        int minimum = 0;
        int maximum = 80;
        return random.nextInt((maximum - minimum) + 1) + minimum;
    }

    public int randomHealthScore(){
        Random random = new Random();
        int minimum = 0;
        int maximum = 100;
        return random.nextInt((maximum - minimum) + 1) + minimum;
    }

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }
    public int getHealthScore() {
        return (int) healthScore;
    }
}
