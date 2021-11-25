package mainApplication;

import entities.Address;
import entities.Customer;
import entities.Invoice;
import model.CustomerDAO;

import java.util.ArrayList;
import java.util.List;

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

        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        Invoice invoice3 = new Invoice();

        List<Invoice> invoices = new ArrayList<>();

        invoices.add(invoice1);
        invoices.add(invoice2);
        invoices.add(invoice3);

        customer.setInvoices(invoices);

        customerDAO.saveCustomer(customer);

        System.out.println("Client : " + customerDAO.showCustomer(1L).getName());

    }
}
