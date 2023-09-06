public class Main {
    public static void main(String[] args)
    {
        Customer customer = new Customer("keerthana",2344,"madhukeerthana666@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.creditLimit);
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.creditLimit);
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("keer", "keer@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.creditLimit);
        System.out.println(thirdCustomer.getEmail());
    }
}
