class Item {
    private String itemName;
    private double price;

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
class DisplayPriceAndItem {
    public static void main(String[] args) {
        Item item1 = new Item("meals", 60);
        Item item2 = new Item("biryani", 110);
        Item item3 = new Item("boiled egg", 10);
        Item item4 = new Item("curd rice", 40);

        displayItemDetails(item1);
        displayItemDetails(item2);
        displayItemDetails(item3);
        displayItemDetails(item4);
    }

    public static void displayItemDetails(Item item) {
        System.out.println("Item: " + item.getItemName());
        System.out.println("Price: $" + item.getPrice());
        System.out.println();
    }
}
