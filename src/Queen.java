import java.util.ArrayList;

public class Queen extends Bee {

    public Queen() {}

    public Queen(int healthScore) {
        this.healthScore = healthScore;
    }

    public void damage() {
        for (int i = 0; i < 10; i++) {
            int score = randomDamage();
            queenList.get(i).setHealthScore(queenList.get(i).getHealthScore()
                    - score);
            int currentScore = queenList.get(i).getHealthScore();
            if (currentScore < 0) {
                currentScore = 0;
            }
            System.out.print(currentScore + " ");
            if (currentScore < 20) {
                System.out.println("are dead");
            } else {
                System.out.println("are alive");
            }
        }
    }

    public void setBeeList() {
        queenList.clear();
        System.out.println("Queen List: ");
        for (int i = 0; i < 10; i++) {
            int score = randomHealthScore();
            queenList.add(new Queen(score));
            System.out.print(queenList.get(i).getHealthScore() + " ");
        }
        System.out.println();
    }

    public void setQueenList(ArrayList<Queen> queenList) {
        this.queenList = queenList;
    }
}