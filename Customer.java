public class Customer extends Person {

    public int id;
    
    public Customer(int id, String name, String cnic) {
        super(name, cnic);
        this.id = id;
    }
    public Customer(String name, String cnic) {
        super(name, cnic);
    }
    public void print(){
        System.out.println("Name:\t" + name + "\nCNIC:\t" + cnic + "\nid:\t" + id + "\n");
    }
    
    
    
}