package target;

public class BasicRestaurantApp implements RestaurantApp {

    @Override
    public void showMenu(String xmlData) {
        System.out.println("Basic Restaurant Menu (XML) ");
        System.out.println(xmlData);
    }

    @Override
    public void showRecommendations(String xmlData) {
        System.out.println("BasicRestaurantApp: Today's special is Pasta & Pizza!");
    }
}