package salambro;

import java.util.Scanner;

public class MenuHolder {
    static Scanner scanner = new Scanner(System.in);
    static final int LENGTH = 10;

    String welcomeMessage = "";
    Menu[] menus = null;
    int size = 0;

    public MenuHolder() {
        menus = new Menu[LENGTH];
    }

    public void changeWelcomeMessage() {
        System.out.println("\nPlease, type the message that clients will see when they enter menu:");
        System.out.println("Tip: use underscore (_) as a splitter");
        welcomeMessage = scanner.nextLine().replace("_", "\n");
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
        System.out.println("Choose categories you want to remove by its index shown below:");
        display();
        System.out.println("\nTip: write the indexes separated by comma (i1, i2, ...)");
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

    public void addSubMenu() {
        System.out.println("\nChoose a category for which you want add subcategories:");
        display();
        System.out.print("\n> ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < size) {
            menus[index].addSubMenu();
        } else {
            System.out.println("Wrong index!");
        }
    }

    public void removeSubMenu() {
        if (size == 0) {
            System.out.println("\nYou don't have a menu yet.");
            return;
        }

        System.out.println("\nChoose a category for which you want remove subcategories:");
        display();
        System.out.print("\n> ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < size) {
            menus[index].removeSubMenu();
        } else {
            System.out.println("Wrong index!");
        }
    }

    public void changePrice() {
        if (size == 0) {
            System.out.println("\nYou don't have a menu yet.");
            return;
        }

        System.out.println("\nChoose a category for which you want to change prices of subcategories:");
        display();
        System.out.print("\n>");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < size) {
            menus[index].changePrices();
        } else {
            System.out.println("wrong index!");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("\nYou don't have a menu yet.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(menus[i].getName() + ".");
        }
    }

    public void displaySubMenu() {
        if (size == 0) {
            System.out.println("\nYou don't have a menu yet.");
            return;
        }

        System.out.println("\nChoose a category for which you want to see its subcategories:");
        display();
        System.out.print("\n> ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < size) {
            menus[index].displaySubMenu();
        } else {
            System.out.println("wrong index!");
        }
    }

    public void displayPrices(){
        if(size == 0){
            System.out.println("\nYou don't have a menu yet.");
            return;
        }

        System.out.println("\nChoose the category for whitch you want to see its subcategoris's prices: ");
        display();
        System.out.print("\n> ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index < size){
            menus[index].displaySPrices();
        }else{
            System.out.println("Wrong index!");
        }
    }


    public void displayWelcome() {
        System.out.println(welcomeMessage);
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