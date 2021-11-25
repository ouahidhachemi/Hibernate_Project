package mainApplication;

import entities.Customer;
import model.CustomerDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApplication {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Hachemi");

        customerDAO.saveCustomer(customer);

        System.out.println("Client : " + customerDAO.showCustomer(1L).getName());

        customerDAO.deleteCustomer(1L);

    }
}
