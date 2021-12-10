package com.company;

import java.util.Scanner;

public class projectProtect {
    //Darkhan Seisekenov - 210113008
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String startingWelcomeMessage = "Welcome to the Admin Panel of Salam Bro Fast Food Station!\nHere you can do the following activites:";
        System.out.println(startingWelcomeMessage);
        String myWelcomeHomeMessage = "";
        String menuHome = "";
        String subMenu = "";
        int subLengthCount = 0;
        String[][] arraySubMenu = new String[20][20];
        String[][] arrayPrice = new String[20][20];
        for (int i = 0; i < arrayPrice.length; i++) {
            for (int j = 0; j < arrayPrice[i].length; j++) {
                arrayPrice[i][j] = "0";
            }
        }
        boolean a = true;
        do {
            System.out.println("\n0. Exit.");
            System.out.println("1. Change Welcome Message.");
            System.out.println("2. Change Menu.");
            System.out.println("3. Change SubMenu.");
            System.out.println("4. Change Prices.");
            System.out.println("5. Display Welcome Message.");
            System.out.println("6. Display Menu.");
            System.out.println("7. Display SubMenu.");
            System.out.println("8. Display Prices");
            System.out.println("9. Switch to client mode(Coming soon).");
            System.out.print("\nChoose an activity: ");
            int chooseNumber = scan.nextInt();
            if (chooseNumber == 0) break;
            switch (chooseNumber) {
                case 1:
                    System.out.println("Please, type the message that clients will see when they enter the menu:");
                    System.out.println("Tip: use underscore (_) as a splitter");
                    System.out.print(">");
                    scan.nextLine();
                    String newWelcomeMessage = scan.nextLine();
                    newWelcomeMessage = newWelcomeMessage.replaceAll("_", "\n");
                    myWelcomeHomeMessage = newWelcomeMessage;
                    continue;
                case 2:
                    System.out.println("\nHere you can do the following activities:\n0. Go Back");
                    System.out.println("1. Add categories");
                    System.out.println("2. Remove categories");
                    int num = scan.nextInt();
                    if (num == 0) continue;
                    if (num == 1) {
                        System.out.println("\nWrite the names of categories separated by coma (c1, c2, ...)");
                        if (menuHome != ("")) {
                            menuHome += ", ";
                        }
                        scan.nextLine();
                        String addCategoryInArray = scan.nextLine();
                        menuHome += addCategoryInArray;
                    }
                    if (num == 2) {
                        if (menuHome.equals("")) {
                            System.out.println("\nYou don't have a menu yet");
                        } else {
                            String[] showMenu = menuHome.split(", ");
                            for (int i = 0; i < showMenu.length; i++) {
                                System.out.print((i + 1) + ".");
                                System.out.println(" " + showMenu[i] + ".");
                            }
                            String s = "";
                            int chooseInMenu = scan.nextInt();
                            String[] arr = menuHome.split(", ");
                            if (arr.length == chooseInMenu) {
                                s = menuHome.replaceAll(arr[chooseInMenu - 1], "");
                            } else {
                                s = menuHome.replaceAll(arr[chooseInMenu - 1] + ", ", "");
                            }
                            menuHome = s;
                        }
                    }
                    continue;
                case 3:
                    String[] menu = menuHome.split(", ");
                    System.out.println("\nHere you can do the following activities:");
                    System.out.println("0. Go Back.");
                    System.out.println("1. Add subcategories.");
                    System.out.println("2. Remove subcategories.");
                    System.out.print(">");
                    int chooseSubMenu = scan.nextInt();
                    if (chooseSubMenu == 0) continue;
                    if (chooseSubMenu == 1) {
                        if (menuHome.equals("")) {
                            System.out.println("\nYou don't have a menu yet");
                        } else {
                            for (int i = 0; i < menu.length; i++) {
                                System.out.println((i + 1) + "." + " " + menu[i] + ".");
                            }
                            int chooseSubMenu1 = scan.nextInt();
                            System.out.println("Write the name of subcategories separated by comma (j1, j2, ...)");
                            System.out.print(">");
                            scan.nextLine();
                            subMenu = scan.nextLine();
                            String[] newArraySubMenu = subMenu.split(", ");
                            subLengthCount = newArraySubMenu.length;
                            for (int i = 0; i < newArraySubMenu.length; i++) {
                                int j = chooseSubMenu1 - 1;
                                arraySubMenu[j][i] = newArraySubMenu[i];
                            }
                        }
                    }
                    if (chooseSubMenu == 2) {
                        if (menuHome.equals("")) {
                            System.out.println("\nYou don't have a menu yet");
                        } else {
                            for (int i = 0; i < menu.length; i++) {
                                System.out.println((i + 1) + "." + " " + menu[i] + ".");
                            }
                            int choose1 = scan.nextInt();
                            if (arraySubMenu[choose1 - 1][0] == null) {
                                System.out.println("\nYou don't have a subcategory in this category");
                            } else {
                                for (int i = 0; i < subLengthCount; i++) {
                                    int j = choose1 - 1;
                                    System.out.println((i + 1) + "." + " " + arraySubMenu[j][i] + ".");
                                }
                                int chooseSubMenu2 = scan.nextInt();
                                String changeSubMenu = subMenu.replaceAll(arraySubMenu[choose1 - 1][chooseSubMenu2 - 1], "");
                                subMenu = changeSubMenu;
                            }
                        }
                    }
                    continue;
                case 4:
                    if (menuHome.equals("")) {
                        System.out.println("\nYou don't have a menu yet");
                    } else {
                        System.out.println("Choose a category for which you want to change prices of subcategories:");
                        String[] menu1 = menuHome.split(", ");
                        for (int i = 0; i < menu1.length; i++) {
                            System.out.print((i + 1) + ".");
                            System.out.println(" " + menu1[i] + ".");
                        }
                        int choose1 = scan.nextInt();
                        if (arraySubMenu[choose1 - 1][0] == null) {
                            System.out.println("\nYou don't have a subcategory in this category");
                            continue;
                        }
                        String[] arraySubPrice = subMenu.split(", ");
                        for (int i = 0; i < arraySubPrice.length; i++) {
                            int j = choose1 - 1;
                            System.out.println((i + 1) + "." + " " + arraySubMenu[j][i] + " " + arrayPrice[i][j] + "kzt" + ".");
                        }
                        System.out.println("Tip: write the indexes separated by comma (i1, i2, ...)");
                        scan.nextLine();
                        String choosePrice = scan.nextLine();
                        String[] newArraySubPrice = choosePrice.split(", ");
                        for (int i = 0; i < newArraySubPrice.length; i++) {
                            int j = choose1 - 1;
                            arrayPrice[i][j] = newArraySubPrice[i];
                        }
                    }
                    continue;
                case 5:
                    if (myWelcomeHomeMessage == ("")) {
                        System.out.println("\nYou don't have menu yet!");
                    }
                    System.out.println(myWelcomeHomeMessage);
                    continue;
                case 6:
                    if (menuHome.equals("")) {
                        System.out.println("\nYou don't have a menu yet");
                    } else {
                        String[] showMenu = menuHome.split(", ");
                        if (menuHome.equals(" ")) System.out.println("\nYou don't have a menu yet");
                        else {
                            for (int i = 0; i < showMenu.length; i++) {
                                System.out.print((i + 1) + ".");
                                System.out.println(" " + showMenu[i] + ".");
                            }
                        }
                    }
                    continue;
                case 7:
                    if (menuHome.equals("")) {
                        System.out.println("\nYou don't have a menu yet");
                    } else {
                        System.out.println();
                        System.out.println("Choose the category for which you want to see its subcategories:");
                        System.out.print(">");
                        String[] showSubCategories = menuHome.split(", ");
                        for (int i = 0; i < showSubCategories.length; i++) {
                            System.out.print((i + 1) + ".");
                            System.out.println(" " + showSubCategories[i] + ".");
                        }
                        int choose3 = scan.nextInt();
                        if (arraySubMenu[choose3 - 1][0] == null) {
                            System.out.println("\nYou don't have a subcategory in this category");
                            break;
                        }
                        String[] arraySub7 = subMenu.split(", ");
                        subLengthCount = arraySub7.length;
                        for (int i = 0; i < subLengthCount; i++) {
                            int j = choose3 - 1;
                            System.out.println((i + 1) + "." + " " + arraySubMenu[j][i] + ".");
                        }
                    }
                    continue;
                case 8:
                    if (menuHome.equals("")) {
                        System.out.println("\nYou don't have a menu yet");
                    } else {
                        String[] showArrayMenu = menuHome.split(", ");
                        String[] showArraySubMenu = subMenu.split(", ");
                        for (int i = 0; i < showArrayMenu.length; i++) {
                            System.out.print((i + 1) + ".");
                            System.out.println(" " + showArrayMenu[i] + ".");
                        }
                        int choose4 = scan.nextInt();
                        if (arraySubMenu[choose4 - 1][0] == null) {
                            System.out.println("\nYou don't have subcategory in this category");
                        }
                        for (int i = 0; i < showArraySubMenu.length; i++) {
                            int j = choose4 - 1;
                            System.out.println((i + 1) + "." + " " + arraySubMenu[j][i] + " " + arrayPrice[i][j] + "kzt" + ".");
                        }
                    }

            }
        } while (a);
    }
}
