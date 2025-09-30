package client;
import observer.Subscriber;
import subject.Channel;

public class YouTubeApp {
    public static void main(String[] args) {
        Channel channel = new Channel("TechExplained");

        Subscriber s1 = new Subscriber("Angelina");
        Subscriber s2 = new Subscriber("Levin");
        Subscriber s3 = new Subscriber("Smith");

        channel.addObserver(s1);
        channel.addObserver(s2);
        channel.addObserver(s3);

        channel.uploadVideo("OOPS playlist");
        System.out.println();

        channel.removeObserver(s2);

        channel.uploadVideo("Design Patterns");
    }
}
