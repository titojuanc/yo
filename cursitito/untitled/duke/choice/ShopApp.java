package duke.choice;

import java.util.ArrayList;

public class ShopApp {
    private ArrayList<Clothes> clothes;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShopApp(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ShopApp() {
        this.clothes= new ArrayList<>();
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void addToCart(Clothes clothe){
        this.clothes.add(clothe);
    }

    public void total(double tax){
        double total=0;
        System.out.println(this.customer.getName());
        for (Clothes product: this.clothes){
            if (total > 15){
                break;
            }
            if (product.getSize() == this.customer.getSize()){
                product.showDetails();
                total = total + product.getPrice(tax);
            }
        }
        System.out.println("Total: "+total);
    }

    public static void main(String[] args) {
        ShopApp cart = new ShopApp();
        double tax=1.2;
        double total;
        int measurement = 3;


        Customer c1 =new Customer("Pinky");
        cart.setCustomer(c1);
        Clothes item1 = new Clothes("Blue Jacket", 20.9, "M");
        Clothes item2 = new Clothes("Orange T-shirt", 10.5, "S");
        Clothes item3 = new Clothes("Green Scarf", 5, "S");

        cart.addToCart(item1);

        cart.addToCart(item2);

        cart.addToCart(item3);

        System.out.println(c1.getName());
        cart.total(tax);
    }
}
