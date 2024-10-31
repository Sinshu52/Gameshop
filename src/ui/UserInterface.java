package ui;

import models.Game;
import models.User;
import Services.Store;

import java.util.Scanner;

public class UserInterface {
    private Store store;
    private User user;
    private Scanner scanner;

    public UserInterface(Store store, User user) {
        this.store = store;
        this.user = user;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nWelcome, " + user.getName() + "! Please choose an option:");
            System.out.println("1. View available games");
            System.out.println("2. Buy a game");
            System.out.println("3. View purchased games");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    // Отобразить список доступных игр
                    store.listGames();
                    break;
                case 2:
                    // Покупка игры
                    System.out.print("Enter the title of the game you want to buy: ");
                    String gameTitle = scanner.nextLine();
                    Game gameToBuy = store.findGameByTitle(gameTitle);
                    if (gameToBuy != null) {
                        user.buyGame(gameToBuy);
                    }
                    break;
                case 3:
                    // Отобразить список купленных игр
                    System.out.println("\nGames purchased by " + user.getName() + ":");
                    if (user.getPurchasedGames().isEmpty()) {
                        System.out.println("No games purchased yet.");
                    } else {
                        for (Game game : user.getPurchasedGames()) {
                            System.out.println(game);
                        }
                    }
                    break;
                case 4:
                    // Выход из программы
                    System.out.println("Thank you for visiting the store! Goodbye!");
                    scanner.close();
                    return; // Завершение программы
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
