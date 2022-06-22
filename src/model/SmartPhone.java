public class SmartPhone {
    private static int ID_SMARTPHONE = 1;
    private int id;
    private String name;
    private double price;
    private String color;
    private int amount;
    private String description;
    private Brand brand;

    public SmartPhone() {
    }

    public SmartPhone(String name, double price, String color, int amount, String description, Brand brand) {
        this.id = ID_SMARTPHONE++;
        this.name = name;
        this.price = price;
        this.color = color;
        this.amount = amount;
        this.description = description;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", brand=" + brand +
                '}';
    }

    public void display() {

    }
}
