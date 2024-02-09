package day13_practice_task.phone_brands;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(String phoneNumber){

        System.out.println("calling the number " + phoneNumber);
    }

    public void text(String phoneNumber){

        System.out.println("texting to the number " + phoneNumber);
    }

    public void faceTime(String phoneNumber){

        System.out.println("facetiming with the number " + phoneNumber);
    }
    public String getBrand(){

        return brand;
    }
    public void setBrand(String brand){
        if (brand == null || brand.isEmpty() || brand.isBlank() ){
            System.err.println("Brand can not be null: " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank() ){
            System.err.println("Model can not be null: " + model);
            System.exit(1);
        }
        this.model = model;
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
        if (price <= 0){
            System.err.println("Price must be greater than zero" + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank() ){
            System.err.println("Color can not be null: " + color);
            System.exit(1);
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
