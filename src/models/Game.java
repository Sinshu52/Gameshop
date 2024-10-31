package models;

public class Game {
    private String title;
    private double price;
    private int stock;

    public Game(String title, double price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Метод для уменьшения количества игр на складе
    public void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }

    // Метод для установки нового количества игр
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    // Метод для проверки доступности игры
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public String toString() {
        return title + " - $" + price + " (" + stock + " in stock)";
    }
}
