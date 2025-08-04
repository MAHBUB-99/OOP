package ObserverDesignPattern_Weather;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String weather);
}
