package salambro;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    MenuHolder holder = null;
    int totalPrice = 0;
    String basket = "";

    public Client(MenuHolder holder) {
        this.holder = holder;
    }

    public void start() {
        holder.displayWelcome();
        int state = 0;
        while (state == 0) {
            state = run();
        }
    }

    public int run() {
        displayHome();
        int choose = scanner.nextInt();
        scanner.nextLine();
        if (choose == 0) {
            return 1;
        } else if (choose < holder.getSize()) {
            choose--;
            chooseSubMenu(choose);
        } else if (choose - 1 == holder.getSize()) {
            basket = "";
            totalPrice = 0;
        } else if (choose - 2 == holder.getSize()) {
            if (basket != "") {
                System.out.print("\n" + basket);
            }else{
                System.out.print("\nBasket is empty.");
            }
            System.out.println("\nTotal price: " + totalPrice);
        }
        return 0;
    }

    public void chooseSubMenu(int index) {
        if (holder.getSubSize(index) == 0) {
            System.out.println("\nOops, there doesn't have submenu :)");
            return;
        }

        System.out.println("\n0. Exit menu.");
        for (int i = 0; i < holder.getSubSize(index); i++) {
            System.out.print((i + 1) + ". ");
            System.out.print(holder.getSubMenu(index, i).getName() + " - ");
            System.out.println(holder.getSubMenu(index, i).getPrice()+" kzt.");
        }
        System.out.print("\nChoose a " + holder.getMenuName(index) + ": ");
        int subIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (subIndex < holder.getSubSize(index) && subIndex > -1) {
            basket = basket.concat(holder.getSubMenu(index, subIndex).getName() + " - ");
            basket = basket.concat(holder.getSubMenu(index, subIndex).getPrice()+" ktz.\n");
            totalPrice += holder.getSubMenu(index, subIndex).getPrice();
        } else {
            System.out.println("Wrong index~");
        }
    }

    public void displayHome() {
        System.out.println("\n0. Exit menu.");
        holder.display();
        System.out.println((holder.getSize() + 1) + ". Clear basket.");
        System.out.println((holder.getSize() + 2) + ". Check basket.");
        System.out.print("\nChoose one: ");
    }
}
