import java.util.ArrayList;

public class Drone extends Bee {

    public Drone() {}

    public Drone(int healthScore) {
        this.healthScore = healthScore;
    }

    public void damage() {
        for (int i = 0; i < 10; i++) {
            int score = randomDamage();
            droneList.get(i).setHealthScore(droneList.get(i).getHealthScore()
                    - score);
            int currentScore = droneList.get(i).getHealthScore();
            if (currentScore < 0) {
                currentScore = 0;
            }
            System.out.print(currentScore + " ");
            if (currentScore < 50) {
                System.out.println("are dead");
            } else {
                System.out.println("are alive");
            }
        }
    }

    public void setBeeList() {
        droneList.clear();
        System.out.println("List Drone: ");
        for (int i = 0; i < 10; i++) {
            int score = randomHealthScore();
            droneList.add(new Drone(score));
            System.out.print(droneList.get(i).getHealthScore() + " ");
        }
        System.out.println();
    }

    public void setDroneList(ArrayList<Drone> droneList) {
        this.droneList = droneList;
    }
}