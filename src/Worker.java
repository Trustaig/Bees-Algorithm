import java.util.ArrayList;

public class Worker extends Bee {

    public Worker() {}

    public Worker(int healthScore) {
        this.healthScore = healthScore;
    }

    public void damage() {
        for (int i = 0; i < 10; i++) {
            int score = randomDamage();
            workerList.get(i).setHealthScore(workerList.get(i).getHealthScore()
                    - score);
            int currentScore = workerList.get(i).getHealthScore();
            if (currentScore < 0) {
                currentScore = 0;
            }
            System.out.print(currentScore + " ");
            if (currentScore < 70) {
                System.out.println("are dead");
            } else {
                System.out.println("are alive");
            }
        }
    }

    public void setBeeList() {
        workerList.clear();
        System.out.println("List Worker: ");
        for (int i = 0; i < 10; i++) {
            int score = randomHealthScore();
            workerList.add(new Worker(score));
            System.out.print(workerList.get(i).getHealthScore() + " ");
        }
        System.out.println();
    }

    public void setWorkerList(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }
}