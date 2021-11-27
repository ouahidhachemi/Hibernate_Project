package mainApplication;

import entities.Address;
import entities.Customer;
import entities.Invoice;
import entities.Product;
import model.CustomerDAO;
import model.ProductDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();

        ProductDAO productDAO = new ProductDAO();

        Product product1 = new Product("POMME", 25.0f);
        productDAO.saveProduct(product1);

        Product product2 = new Product("Orange", 22.0f);
        productDAO.saveProduct(product2);

        Product product3 = new Product("Banane", 36.0f);
        productDAO.saveProduct(product3);

        Address address1 = new Address("Cité des enseignants", "Bt 3 N° 6", 31017, "Gdyel");
        Address address2 = new Address("Cité des enseignants", "Bt 3 N° 6", 31017, "Gdyel");
        Address address3 = new Address("Cité des enseignants", "Bt 3 N° 6", 31017, "Gdyel");
        Address address4 = new Address("Cité des enseignants", "Bt 3 N° 6", 31017, "Gdyel");

        Customer customer1 = new Customer("Kawther Hachemi");
        Customer customer2 = new Customer("Omar Youcef Hachemi");
        Customer customer3 = new Customer("Ikhlas Hachemi");
        Customer customer4 = new Customer("Younes Adem Hachemi");

        customer1.setAddress(address1);
        customer2.setAddress(address1);
        customer3.setAddress(address1);
        customer4.setAddress(address1);

        Map<Product, Integer> productList1 = new HashMap<>();
        Map<Product, Integer> productList2 = new HashMap<>();
        Map<Product, Integer> productList3 = new HashMap<>();

        productList1.put(product1, 6);
        productList1.put(product2,5);
        productList1.put(product3, 8);

        productList2.put(product1, 15);
        productList2.put(product2, 20);
        productList2.put(product3, 28);

        productList3.put(product1, 20);
        productList3.put(product2,30);
        productList3.put(product3, 23);

        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        Invoice invoice3 = new Invoice();

        invoice1.setProductQuantity(productList1);
        invoice2.setProductQuantity(productList2);
        invoice3.setProductQuantity(productList3);

        List<Invoice> invoices = new ArrayList<>();

        invoices.add(invoice1);
        invoices.add(invoice2);
        invoices.add(invoice3);

        customer1.setInvoices(invoices);

        customerDAO.saveCustomer(customer1);
        customerDAO.saveCustomer(customer2);
        customerDAO.saveCustomer(customer3);
        customerDAO.saveCustomer(customer4);

        customerDAO.showCustomer();

        //System.out.println("Client : " + customerDAO.showCustomer(1L).getId());
        //Customer client = customerDAO.findCustomer(1L);
        //System.out.println("# " + customerDAO.findCustomer(1L));

        //System.out.println(client.getId());
        //System.out.println("Client : " + customerDAO.showCustomer(1L).getAddress());
        //System.out.println("Client : " + customerDAO.showCustomer(1L).getInvoices());

    }
}
