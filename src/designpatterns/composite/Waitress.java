package designpatterns.composite;

/**
 * Created by dwifaulus on 14-12-03.
 */
public class Waitress {
    MenuComponent allItems;

    public Waitress(MenuComponent items) {
        this.allItems = items;
    }

    public void printMenu() {
        allItems.print();
    }
}
