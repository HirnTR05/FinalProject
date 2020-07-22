import java.util.logging.Logger;

public class Employee extends Person {

    public String title;
    
    public Employee(String title, String name, String cnic) {
        super(name, cnic);
        this.title = title;
    }
    public Employee(String name, String cnic) {
        super(name, cnic);
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getCnic() {
        return cnic;
    }
    
    public void print(){
        System.out.println("Name:\t" + name + "\nCNIC:\t" + cnic + "\nstatus:\t" + title + "\n");
    }
     
}