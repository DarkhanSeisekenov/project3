package salambro;

public class SubMenu {
    String name;
    int price;

    public SubMenu(String name){
        this.name = name;
        price = 0;
    }

    public void changePrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
