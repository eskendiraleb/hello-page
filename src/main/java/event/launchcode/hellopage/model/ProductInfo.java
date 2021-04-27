package event.launchcode.hellopage.model;

public class ProductInfo {
    private String name;
    private int size;
    private String color;
    private int price;

    public ProductInfo(String name, int size, String color, int price) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

       }

