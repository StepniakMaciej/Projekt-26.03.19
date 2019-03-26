public class Developer implements User {
    @Override
    public void showInfo() {
        System.out.println(name + "- Developer");

        User developer = new Developer();
        developer.showInfo();
    }


}
