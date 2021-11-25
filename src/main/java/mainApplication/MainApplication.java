package mainApplication;

import entities.Address;
import entities.Customer;
import model.CustomerDAO;

public class MainApplication {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();

        Address address = new Address();

        address.setStreet("Cité des enseignants");
        address.setHouseNumber("Bt 3 N° 6");
        address.setZipCode(31017);
        address.setCity("Gdyel");

        Customer customer = new Customer();
        customer.setName("Hachemi");
        customer.setAddress(address);

        customerDAO.saveCustomer(customer);

        System.out.println("Client : " + customerDAO.showCustomer(1L).getName());

    }
}
