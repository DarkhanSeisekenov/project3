package salambro;

public class Main {
    public static void main(String[] args) {
        MenuHolder holder = new MenuHolder();
        Admin admin = new Admin(holder);
        Client client = new Client(holder);
        int state = admin.start();

        if (state == 1) {
            client.start();
        }else if(state ==1 && holder.getSize() == 0){
            System.out.println("You don't have menu yet.");
        }
    }
}
