public class Item {
    private int id;
    private String name;
    private Double price;

    public Item(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void apresentar() {
        System.out.println("Id: " + id + " - Nome do item: " + name + "; Preço: R$" + price);
    }
}
