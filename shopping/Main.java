

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Van Sombat", "Gold");
        Sale sale1 = new Sale(customer1, "2024-02-20 10:00:00 AM");
        sale1.setServiceExpense(100);
        sale1.setProductExpense(200);
        sale1.displayInfo();
    }
}