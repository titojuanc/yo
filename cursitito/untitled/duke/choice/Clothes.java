package duke.choice;

public class Clothes {
    private String description;
    private String size;
    private double price;

    public Clothes(String description, double price, String size){
        this.description=description;
        this.price=price;
        this.size=size;
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

    public double getPrice(double tax) { return price*tax; }

    public void setPrice(double price) {
        if (price<10){
            this.price=10;
        }
        else {
            this.price = price;
        }

    }

    public void showDetails() {
        System.out.println(this.description+", "+this.size+", "+this.price);
    }
}
