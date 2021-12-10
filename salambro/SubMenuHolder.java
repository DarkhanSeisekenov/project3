package salambro;
import java.util.Scanner;

public class SubMenuHolder {
    static Scanner scanner = new Scanner(System.in);
    static final int LENGTH = 10;

    SubMenu[] subMenus = null;
    int size = 0;

    public SubMenuHolder(){
        subMenus = new SubMenu[LENGTH];
    }

    public void add(){
        if(subMenus.length == size){

        }
    }

    public static SubMenu[] lengthen(SubMenu[] subMenus){
        SubMenu[] newSubmenus = new SubMenu[subMenus.length+LENGTH];
        for(int i=0;i<subMenus.length;i++){
            newSubmenus[i] = subMenus[i];
        }
        return newSubmenus;
    }
}