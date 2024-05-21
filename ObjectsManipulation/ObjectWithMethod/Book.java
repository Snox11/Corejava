package ObjectsManipulation.ObjectWithMethod;

public class Book {
private String Author;
private String name;
private int price;
private int publishied_date;
public String getAuthor() {
    return Author;
}
public void setAuthor(String author) {
    Author = author;
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
public int getPublishied_date() {
    return publishied_date;
}
public void setPublishied_date(int publishied_date) {
    this.publishied_date = publishied_date;
}

}
