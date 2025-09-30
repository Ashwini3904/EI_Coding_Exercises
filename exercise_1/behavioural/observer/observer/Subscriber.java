package observer;

public class Subscriber implements Observer {
    private String username;

    public Subscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(username + " received notification: \n" + "New video '" + videoTitle + "' uploaded on channel '" + channelName + "'");
    }
}