package ObserverDesignPattern_Weather;

public class TVDisplay implements Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    public void display(){
        System.out.println("TV Display: Weather Updated - "+weather);
    }
}
