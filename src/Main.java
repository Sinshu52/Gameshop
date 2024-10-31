import models.Game;
import models.User;
import Services.Store;
import ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addGame(new Game("The Witcher 3", 29.99, 10));
        store.addGame(new Game("Cyberpunk 2077", 59.99, 5));
        store.addGame(new Game("Minecraft", 19.99, 15));

        // Создаем пользователя
        User user = new User("Denis");

        // Запускаем интерфейс пользователя
        UserInterface ui = new UserInterface(store, user);
        ui.start();
    }
}
