package discount_Example_Electric;



class Discount {
    private String name;
    private String id;
    private String category;
    private String description;
    private double price;
    private double discount;

    public Discount(String name, String id, String category, String description, double price) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.description = description;
        this.price = price;
        this.discount = 0.0;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + name + '\'' +
                ", Id='" + id + '\'' +
                ", Category='" + category + '\'' +
                ", Description='" + description + '\'' +
                ", Price=" + price +
                ", Discount=" + discount +
                '}';
    }
}