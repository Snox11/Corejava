package objectwitharrAY;

public class Employees {
    private int id;
    private String name;
    private String company;
    private int salary;
    private String department;
    private String post;
    private String city;
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
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Employees [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary
                + ", department=" + department + ", post=" + post + ", city=" + city + "]";
    }
    
}
