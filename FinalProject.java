import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FinalProject {
  public static void main(String[] args) {
        // TODO code application logic here
        //Declaring customers and employees list
        List<Customer> customers = new ArrayList<Customer>();
        List<Employee> employees = new ArrayList<Employee>();
        
        //This part is going to cover reading from two files
        //customers.txt and employees.txt
        String line1 = "";
        String line2 = "";
        String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br1 = new BufferedReader(new FileReader("customers.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("employees.txt"));
            
           
            while ((line1 = br1.readLine()) != null)   //returns a Boolean value  
            {  
                String[] data = line1.split(splitBy);    // use comma as separator 
                Customer c = new Customer(Integer.parseInt(data[0]), data[1], data[2]);
                customers.add(c);
            } 
            while ((line2 = br2.readLine()) != null)   //returns a Boolean value  
            {  
                String[] data = line2.split(splitBy);    // use comma as separator 
                Employee e = new Employee(data[0], data[1], data[2]);
                employees.add(e);
            } 
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();  
        }
        
        
        //Data has been read successfully.
        //It is time to print the data using print methods.
        System.out.println("Data from files has been read successfully.\n");
        System.out.println("Printing Customers....");
        
        for(int i = 0;i<customers.size();i++){
            customers.get(i).print();
        }
        System.out.println("\n\nPrinting Employees....");
        
        for(int i = 0;i<employees.size();i++){
            employees.get(i).print();
        }
        
        
    }
}