package Services;

import models.Game;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Game> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }

    public void addGame(Game game) {
        inventory.add(game);
    }

    public void listGames() {
        System.out.println("Available Games in Store:");
        for (Game game : inventory) {
            System.out.println(game);
        }
    }

    public Game findGameByTitle(String title) {
        for (Game game : inventory) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        System.out.println("Game with title " + title + " not found.");
        return null;
    }
}
