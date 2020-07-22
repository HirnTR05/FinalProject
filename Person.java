public class Person {
    public String name;
    public String cnic;

    public void setName(String name) {
        this.name = name;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public String getCnic() {
        return cnic;
    }

    public Person(String name, String cnic) {
        this.name = name;
        this.cnic = cnic;
    }
}