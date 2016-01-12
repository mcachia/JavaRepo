package HomeWork.Store;

/**
 * Created by mcachia on 06/01/2016.
 */


public abstract class Item {
    String name;
    String description;
    float price;
    int stockAmount;

    public abstract void sell();

    public void sell(int numberOfBooks) {
        this.stockAmount = this.stockAmount-numberOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }


}
