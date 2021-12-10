import java.util.Scanner;

public class MenuClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there!\n");
        System.out.println("Welcome to the menu of \"Salam Bro\" Fast Food Station.");
        System.out.println("Here you can see our menu below.");

        String basket =" ";
        int price = 0;

        Scanner dark = new Scanner(System.in);

        System.out.println("0. Exit menu.");
        System.out.println("1. Burgers.");
        System.out.println("2. Hot dogs.");
        System.out.println("3. French fries.");
        System.out.println("4. Drinks.");
        System.out.println("5. Sauces.");
        System.out.println("6. Additives.");
        System.out.println("7. Clear basket.");
        System.out.println("8. Check basket.");
        System.out.println(" ");
        System.out.println("Choose one: ");
        int ddd = dark.nextInt();
        while(true){
            if(ddd==6){
                System.out.println("0. Exit menu.");
                System.out.println("1. Jalapeno - 100 kzt.");
                System.out.println("2. Cheese - 100 kzt.");
                System.out.println(" ");
                System.out.print("Choose an additive: ");
                int ddd1 = dark.nextInt();
                if(ddd1==1){
                    price=price+100;
                    String add1="Jalapeno - 100 kzt.";
                    basket=basket.concat(add1);
                }
                 if(ddd1==2){
                    price=price+100;
                    String add2="Cheese - 100 kzt.";
                    basket=basket.concat(add2);
                }

             }
              if(ddd==5){
                System.out.println("0. Exit menu.");
                System.out.println("1. Ketchup - 100 kzt.");
                System.out.println("2. Cheese sauce - 100 kzt.");
                System.out.println("3. BBQ sauce - 100 kzt.");
                System.out.println("4. Spicy sauce - 50 kzt.");
                System.out.println("5. Mustard sauce - 100 kzt.");
                System.out.println(" ");
                System.out.print("Choose a sauce: ");
                int ddd2 = dark.nextInt();
                if(ddd2==1){
                    price=price+100;
                    String sauce1="Ketchup - 100 kzt.";
                    basket=basket.concat(sauce1);
                }
                 if(ddd2==2){
                    price=price+100;
                    String sauce2="Cheese sauce - 100 kzt.";
                    basket=basket.concat(sauce2);
                }
                 if(ddd2==3){
                    price=price+100;
                    String sauce3="BBQ sauce - 100 kzt.";
                    basket=basket.concat(sauce3);
                }
                 if(ddd2==4){
                    price=price+50;
                    String sauce4="Spicy sauce - 50 kzt.";
                    basket=basket.concat(sauce4);
                }
                 if(ddd2==5){
                    price=price+100;
                    String sauce5="Mustard sauce - 100 kzt.";
                    basket=basket.concat(sauce5);

                }
             }
              if(ddd==4){
                System.out.println("0. Exit menu.");
                                System.out.println("1. Coca-cola 0.5l - 250 kzt.");
                                System.out.println("2. Fanta 0.5l - 250 kzt.");
                                System.out.println("3. Sprite 0.5l - 250 kzt.");
                                System.out.println("4. Fuse tea 0.5l - 250 kzt.");
                                System.out.println("5. Bon aqua 0.5l - 250 kzt.");
                                System.out.println("6. Raspberry compote 0.3l - 250 kzt.");
                                System.out.println("7. Currant compote 0.3l - 250 kzt.");
                                System.out.println("8. Piko pulpy 0.5l - 350 kzt.");
                                System.out.println(" ");
                                System.out.println("Choose a drink: ");
                                int ddd3 = dark.nextInt();

                if(ddd3==1){
                    price=price+250;
                    String drink1="Coca-cola 0.5l - 250 kzt.";
                    basket=basket.concat(drink1);
                }
                 if(ddd3==2){
                    price=price+250;
                    String drink2="Fanta 0.5l - 250 kzt.";
                    basket=basket.concat(drink2);
                }
                 if(ddd3==3){
                    price=price+250;
                    String drink3="Sprite 0.5l - 250 kzt.";
                    basket=basket.concat(drink3);
                }

                 if(ddd3==4){
                    price=price+250;
                    String drink4="Fuse tea 0.5l - 250 kzt.";
                    basket=basket.concat(drink4);
                }
                 if(ddd3==5){
                    price=price+250;
                    String drink5="Bon aqua 0.5l - 250 kzt.";
                    basket=basket.concat(drink5);
                }
                 if(ddd3==6){
                    price=price+250;
                    String drink6="Raspberry compote 0.3l - 250 kzt.";
                    basket=basket.concat(drink6);
                }
                 if(ddd3==7){
                    price=price+250;
                    String drink7="Currant compote 0.3l - 250 kzt.";
                    basket=basket.concat(drink7);
                }
                 if(ddd3==8){
                    price=price+350;
                    String drink8="Piko pulpy 0.5l - 350 kzt.";
                    basket=basket.concat(drink8);
                }
            }
             if(ddd==3){
                System.out.println("0. Exit menu.");
                System.out.println("1. French fries - 390 kzt.");
                System.out.println(" ");
                System.out.print("Choose one type of fries: ");
                int ddd4 = dark.nextInt();
                if(ddd4==1){
                    price=price+390;
                    String fries="French fries - 390 kzt.";
                    basket=basket.concat(fries);
                }
            }
             if(ddd==2){
                System.out.println("0. Exit menu.");
                System.out.println("1. Spicy hot dog - 590 kzt.");
                System.out.println("2. Hot dog - 590 kzt.");
                System.out.println(" ");
                System.out.print("Choose a hot dog: ");
                int ddd5 = dark.nextInt();
                if(ddd5==1){
                    price=price+590;
                    String hotdog1="Spicy hot dog - 590 kzt.";
                    basket=basket.concat(hotdog1);
                }
                 if(ddd5==2){
                    price=price+590;
                    String hotdog2="Hot dog - 590 kzt.";
                    basket=basket.concat(hotdog2);
                }
            }
             if(ddd==1){
               System.out.println("0. Exit menu.");
                               System.out.println("1. Chicken hamburger - 590 kzt.");
                               System.out.println("2. Beef hamburger - 790 kzt.");
                               System.out.println("3. Chicken cheeseburger - 790 kzt.");
                               System.out.println("4. Beef cheeseburger - 890 kzt.");
                               System.out.println("5. Double chicken hamburger - 990 kzt.");
                               System.out.println("6. Double chicken cheeseburger - 1090 kzt.");
                               System.out.println("7. Double beef hamburger - 1090 kzt.");
                               System.out.println("8. Double beef cheeseburger - 1190 kzt.");
                               System.out.println("9. Mixed hamburger - 1090 kzt.");
                               System.out.println("10. Mixed cheeseburger - 1190 kzt.");
                               System.out.println(" ");
                               System.out.println("Choose a burger: ");
                               int ddd6 = dark.nextInt();

                if(ddd6==1){
                    price=price+590;
                    String burger1="Chicken hamburger - 590 kzt.";
                    basket=basket.concat(burger1);
                }
                 if(ddd6==2){
                    price=price+790;
                    String burger2="Beef hamburger - 790 kzt.";
                    basket=basket.concat(burger2);
                    System.out.println("Total price: "+price);
                }
                 if(ddd6==3){
                  price=price+790;
                    String burger3="Chicken cheeseburger - 790 kzt.";
                    basket=basket.concat(burger3);
                }
                 if(ddd6==4){
                    price=price+890;
                    String burger4="Beef cheeseburger - 890 kzt.";
                    basket=basket.concat(burger4);
                }
                 if(ddd6==5){
                    price=price+990;
                    String burger5="Double chicken hamburger - 990 kzt.";
                    basket=basket.concat(burger5);
                }
                 if(ddd6==6){
                    price=price+1090;
                    String burger6="Double chicken cheeseburger - 1090 kzt.";
                    basket=basket.concat(burger6);
                }
                 if(ddd6==7){
                    price=price+1090;
                    String burger7="Double beef hamburger - 1090 kzt.";
                    basket=basket.concat(burger7);
                }
                 if(ddd6==8){
                    price=price+1190;
                    String burger8="Double beef cheeseburger - 1190 kzt.";
                    basket=basket.concat(burger8);
                }
                 if(ddd6==9){
                    price=price+1090;
                    String burger9="Mixed hamburger - 1090 kzt.";
                    basket=basket.concat(burger9);
                }
                 if(ddd6==10){
                    price=price+1090;
                    String burger10="Mixed cheeseburger - 1190 kzt.";
                    basket=basket.concat(burger10);
                }
            }
             if(ddd==7){
              System.out.println("Basket is empty");

              price = 0;
              basket = "";
              System.out.println("0. Exit menu.");
              System.out.println("1. Burgers.");
              System.out.println("2. Hot dogs.");
              System.out.println("3. French fries.");
              System.out.println("4. Drinks.");
              System.out.println("5. Sauces.");
              System.out.println("6. Additives.");
              System.out.println("7. Clear basket.");
              System.out.println("8. Check basket.");
              System.out.println(" ");
              System.out.print("Choose one: ");
              ddd = dark.nextInt();
            }
             if(ddd==8){
                System.out.println("Total price: " + price);
                System.out.println("\nBasket : " + basket);

            }System.out.println("0. Exit menu.");
            System.out.println("1. Burgers.");
            System.out.println("2. Hot dogs.");
            System.out.println("3. French fries.");
            System.out.println("4. Drinks.");
            System.out.println("5. Sauces.");
            System.out.println("6. Additives.");
            System.out.println("7. Clear basket.");
            System.out.println("8. Check basket.");
            System.out.println(" ");
            System.out.print("Choose one: ");
            ddd = dark.nextInt();
        }
    }
}
