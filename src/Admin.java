public class Admin implements User {
    @Override
    public void showInfo() {
        System.out.println(name + "- Admin");

        User admin = new Admin();
        admin.showInfo();
    }
}
