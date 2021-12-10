package salambro;
import java.util.Scanner;

public class MenuHolder {
    static Scanner scanner = new Scanner(System.in);
    static final int LENGTH = 10;

    Menu[] menus = null;
    int size = 0;

    public MenuHolder() {
        menus = new Menu[LENGTH];
    }


    public void add() {
        System.out.println("\nWrite the names of categories separated by coma (c1, c2, ...)");
        System.out.print("> ");
        String[] texts = scanner.nextLine().split(" ,");

        for (int i = 0; i < texts.length; i++) {
            if (menus.length == size) {
                menus = lengthen(menus);
            }

            menus[size] = new Menu(texts[i]);
            size++;
        }
    }


    public void remove() {
        System.out.println("\nTip: write the indexes separated by comma (i1, i2, ...)");
        display();
        System.out.print("> ");
        String[] indexes = scanner.nextLine().split(" ,");
        int temp;
        for (int i = 0; i < indexes.length; i++) {
            temp = Integer.parseInt(indexes[i]);
            if (temp < size) {
                shift(menus, temp, size);
                size--;
            }
        }
    }


    public void changePrice() {
        
    }


    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(menus[i].getName());
        }
    }


    public int getSize(){
        return size;
    }


    public static Menu[] lengthen(Menu[] menus) {
        Menu[] newMenus = new Menu[menus.length + LENGTH];
        for (int i = 0; i < menus.length; i++) {
            newMenus[i] = menus[i];
        }
        return newMenus;
    }


    public static void shift(Menu[] menus, int index, int size) {
        for (int i = index + 1; i < size - 1; i++) {
            menus[i] = menus[i + 1];
        }

        menus[size - 1] = null;
    }
}