package duke.choice;

public class ShopApp {

    public static void main(String[] args) {

        double tax=0.2;
        double total;

        Customer c1 =new Customer("Pinky");
        Clothes item1 = new Clothes();
        Clothes item2 = new Clothes();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        System.out.println(c1.getName());
        item1.showDetails();
        item2.showDetails();
        total = (item1.getPrice() + item2.getPrice()*2) * 1+tax;
        System.out.println("Your total is: "+total);
    }
}
