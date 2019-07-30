package observer;

interface Subject<T> {

    void subscribe(Observer obs);

    void unsubscribe(Observer obs);

    void notifyObservers();

    Post getUpdate();
}
