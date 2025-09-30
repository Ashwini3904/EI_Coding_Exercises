package  client;
import adapter.FancyUIAdapter;
import java.nio.file.*;
import target.BasicRestaurantApp;
import target.RestaurantApp;

public class Client {
    public static void main(String[] args) throws Exception {
        String sampleXml = Files.readString(Path.of("menu.xml"));

        RestaurantApp basicApp = new BasicRestaurantApp();
        basicApp.showMenu(sampleXml);
        basicApp.showRecommendations(sampleXml);

        System.out.println("------------------------------------------------------");

        RestaurantApp fancyApp = new FancyUIAdapter();
        fancyApp.showMenu(sampleXml);
        fancyApp.showRecommendations(sampleXml);
    }
}
