package OOP.Encapsulation;

public class product {
   @Override
    public String toString() {
        return "product [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + "]";
    }
private int id;
    private String name;
    private int price;
   private String company;
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
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
public String getCompany() {
    return company;
}
public void setCompany(String company) {
    this.company = company;
}


}
