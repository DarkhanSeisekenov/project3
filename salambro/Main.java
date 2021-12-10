package salambro;

public class Main {
    public static void main(String[] args) {
        MenuHolder holder = new MenuHolder();
        Admin admin = new Admin(holder);
        int state = admin.start();
        if(state == 1){
            Client client = new Client(holder);
        }
    }
}
