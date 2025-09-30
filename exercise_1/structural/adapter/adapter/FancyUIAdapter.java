package adapter;

import adaptee.FancyUI;
import target.RestaurantApp;

public class FancyUIAdapter implements RestaurantApp {
    private final FancyUI fancyUI;

    public FancyUIAdapter() {
        this.fancyUI = new FancyUI();
    }

    @Override
    public void showMenu(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        fancyUI.showMenuWithJson(jsonData);
    }

    @Override
    public void showRecommendations(String xmlData) {
        fancyUI.showRecommendationsWithJson("{}");
    }

    private String convertXmlToJson(String xmlData) {
        System.out.println("Adapter: Converting XML to JSON...");

        String json = xmlData
                .replace("<menu>", "{\n \"menu\": ")
                .replace("</menu>", " }")
                .replaceAll("<item>(.*?)</item>", "{ \"item\": \"$1\" }");

        return json;
    }
}
