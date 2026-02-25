

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        Customer c1 = new Customer(1, "emma", "lopez", 36, "emma.doe@example.com");
        Customer c2 = new Customer(2, "juanito", "perez", 26, "juanito.perez@example.com");

        MySqlCRUD conn = new MySqlCRUD();

        
        conn.insertCustomer(c1);
        conn.insertCustomer(c2);
        
    }
}
