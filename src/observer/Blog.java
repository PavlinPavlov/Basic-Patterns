package observer;

import java.util.ArrayList;
import java.util.List;

class Blog implements Subject {

    private List<Observer> observers;
    private Post post;
    private boolean isNewMsg;
    private final Object key = new Object();

    public Blog() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer obs) {
        if (obs != null) {
            synchronized (key) {
                observers.add(obs);
            }

            obs.setSubject(this);
        }
    }

    @Override
    public void unsubscribe(Observer obs) {
        if (obs != null) {
            synchronized (key) {
                if (!observers.contains(obs))
                    observers.remove(obs);
            }
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;

        synchronized (key) {
            if (!isNewMsg)  return;
            observersLocal = new ArrayList<>(this.observers);
            this.isNewMsg = false;
        }

        for (Observer obs : observersLocal) {
            obs.update();
        }
    }

    @Override
    public Post getUpdate() {
        return this.post;
    }

    public void createNewPost(Post post) {
        this.post = post;
        isNewMsg = true;
        notifyObservers();
    }
}
