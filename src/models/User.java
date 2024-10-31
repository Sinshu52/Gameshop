package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Game> purchasedGames;

    public User(String name) {
        this.name = name;
        this.purchasedGames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Game> getPurchasedGames() {
        return purchasedGames;
    }

    public void buyGame(Game game) {
        if (game.isAvailable()) {
            purchasedGames.add(game);
            game.setStock(game.getStock() - 1);
            System.out.println("Game " + game.getTitle() + " purchased successfully!");
        } else {
            System.out.println("Game " + game.getTitle() + " is out of stock.");
        }
    }
}
