package duke.choice;

public class Clothes {
    private String description;
    private String size;
    private double price;

    public Clothes(String description, double price){
        this.description=description;
        this.price=price;
        this.size="M";
    }
    public Clothes(){
        this.description="Default";
        this.price=912.18;
        this.size="M";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showDetails() {
        System.out.println(this.description+", "+this.size+", "+this.price);
    }
}
