package salambro;

import java.util.Scanner;

public class Admin {
    static Scanner scanner = new Scanner(System.in);

    MenuHolder holder = null;

    public Admin(MenuHolder holder) {
        this.holder = holder;
    }

    public int start(){
        int state = 0;
        while(state == 0){
            state = run();
        }

        return state;
    }

    public int run() {
        displayHome();
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 0:
                return 2;
            case 1:
                holder.changeWelcomeMessage();
                break;

            case 2:
                displayActivity("category");
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose == 1) {
                    holder.add();
                } else if (choose == 2) {
                    holder.remove();
                }
                break;

            case 3:
                displayActivity("subcategory");
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose == 1) {
                    holder.addSubMenu();
                } else if (choose == 2) {
                    holder.removeSubMenu();
                }
                break;

            case 4:
                holder.changePrice();
                break;

            case 5:
                holder.displayWelcome();
                break;

            case 6:
                holder.display();
                break;

            case 7:
                holder.displaySubMenu();
                break;

            case 8:
                holder.displayPrices();
                break;

            case 9:
                return 1;
        }

        return 0;
    }

    public static void displayHome() {
        System.out.println("\n0. Exit.");
        System.out.println("1. Change Welcome Message.");
        System.out.println("2. Change Menu.");
        System.out.println("3. Change SubMenu.");
        System.out.println("4. Change Prices.");
        System.out.println("5. Display Welcome Message.");
        System.out.println("6. Display Menu.");
        System.out.println("7. Display SubMenu.");
        System.out.println("8. Display Prices.");
        System.out.println("9. Switch to Client Mode (coming soon).");
        System.out.print("\nChoose an activity: ");
    }

    public static void displayActivity(String type) {
        System.out.println("\nHere you can do the following activities:");
        System.out.println("0. Go Back.");
        System.out.println("1. Add " + type + ".");
        System.out.println("2. Remove " + type + ".");
        System.out.print("\nYour choice: ");
    }
}
