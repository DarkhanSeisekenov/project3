package salambro;

public class Menu {
    String name;
    SubMenuHolder holder;

    public Menu(String name){
        this.name = name;
    }

    public void addSubMenu(){
        SubMenuHolder.add();
    }
}