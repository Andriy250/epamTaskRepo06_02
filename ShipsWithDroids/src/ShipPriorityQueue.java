import java.util.LinkedList;

public class ShipPriorityQueue<T extends Droid> {

    private LinkedList<T> queue;
    private String[] posts = {"00","01","11"};

    public ShipPriorityQueue() {
        queue = new LinkedList<>();
    }

    public ShipPriorityQueue(LinkedList<T> queue) {
        this.queue = queue;
    }

    public T peek(){
        for (int i = 0; i < posts.length; ++i) {
            for (T bot : queue)
                if (((Droid) bot).getPost().equals(posts[i])) return bot;
        }
        return queue.get(queue.size() - 1);
    }

    public T poll(){

        for (int i = 0; i < posts.length; ++i) {
            for (T bot : queue)
                if (((Droid) bot).getPost().equals(posts[i])) return bot;
        }
        T bot = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return bot;
    }

    public LinkedList<T> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<T> queue) {
        this.queue = queue;
    }
}
