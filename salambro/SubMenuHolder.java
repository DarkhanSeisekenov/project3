package salambro;

import java.util.Scanner;

public class SubMenuHolder {
    static Scanner scanner = new Scanner(System.in);
    static final int LENGTH = 10;

    SubMenu[] subMenus = null;
    int size = 0;

    public SubMenuHolder() {
        subMenus = new SubMenu[LENGTH];
    }

    public void add() {
        System.out.println("\nWrite the names of categories separated by coma (c1, c2, ...)");
        System.out.print("> ");
        String[] texts = scanner.nextLine().split(" ,");

        for (int i = 0; i < texts.length; i++) {
            if (subMenus.length == size) {
                subMenus = lengthen(subMenus);
            }

            subMenus[size] = new SubMenu(texts[i]);
            size++;
        }
    }

    public void remove() {

        System.out.println("\nTip: write the indexes separated by comma (i1, i2, ...)");
        display();
        System.out.print("\n> ");
        String[] indexes = scanner.nextLine().split(" ,");
        int temp;
        for (int i = 0; i < indexes.length; i++) {
            temp = Integer.parseInt(indexes[i]);
            if (temp < size) {
                shift(subMenus, temp, size);
                size--;
            }
        }
    }

    public void changePrices() {
        System.out.println("\nChoose subcategories for which you want to change prices: ");
        System.out.println("\nTip: write the indexes seperated by comma (i1, i2, ...)");
        System.out.print(">");
        String[] indexes = scanner.nextLine().split(" ,");
        int temp;

        for (int i = 0; i < indexes.length; i++) {
            temp = Integer.parseInt(indexes[i]);
            if (temp < size) {
                System.out.print("\nEnter a new price for " + subMenus[i] + ": ");
                subMenus[i].changePrice(scanner.nextInt());
                scanner.nextLine();
            }
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("\nYou don't have subcategories in this category.");
        }

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(subMenus[i].getName()+".");
        }
    }

    public void displayPrices(){
        for(int i=0;i<size;i++){
            System.out.print((i+1)+". "+subMenus[i].getName());
            System.out.println(subMenus[i].getPrice()+" - kzt.");
        }
    }

    public int getSize() {
        return size;
    }

    public static SubMenu[] lengthen(SubMenu[] subMenus) {
        SubMenu[] newSubmenus = new SubMenu[subMenus.length + LENGTH];
        for (int i = 0; i < subMenus.length; i++) {
            newSubmenus[i] = subMenus[i];
        }
        return newSubmenus;
    }

    public static void shift(SubMenu[] subMenus, int index, int size) {
        for (int i = index + 1; i < size - 1; i++) {
            subMenus[i] = subMenus[i + 1];
        }

        subMenus[size - 1] = null;
    }
}