public class Main {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.setBeeList();
        q.damage();

        Worker w = new Worker();
        w.setBeeList();
        w.damage();

        Drone d = new Drone();
        d.setBeeList();
        d.damage();
    }
}