package salambro;

public class Menu {
    String name;
    SubMenuHolder holder;


    public Menu(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }


    public void addSubMenu(){
        holder.add();
    }


    public void removeSubMenu(){
        if(holder.getSize() != 0){
            holder.remove();
        }else{
            System.out.println("\nYou don't have subcategories in this category.");
        }
    }


    public void changePrices(){
        if(holder.getSize() != 0){
            holder.changePrice();
        }else{
            System.out.println("\nYou don't have subcategories in this category.");
        }
    }
}