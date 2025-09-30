package subject;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;


public class Channel implements Subject {
    private String name;
    private List<Observer> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(name, videoTitle);
        }
    }

    public void uploadVideo(String title) {
        System.out.println("Channel '" + name + "' uploaded a new video: " + title);
        System.out.println("------------------------------------------------------");
        notifyObservers(title);
    }
}
