package model;

import entities.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");

    public void saveCustomer(Customer customer) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        if (customer.getId() == null) {
            em.persist(customer);
        } else {
            em.merge(customer);
        }

        tx.commit();

    }

    public Customer findCustomer(Long id) {

        EntityManager em = emf.createEntityManager();
        return em.find(Customer.class, id);

    }

    public void showCustomer() {

        EntityManager em = emf.createEntityManager();

        Long id = 1L;

        Customer customer = em.find(Customer.class, id);

        while (customer != null) {
            System.out.printf("Id #%d\t%s%n", customer.getId(), customer.getName());
            customer = em.find(Customer.class, ++id);
        }

    }

    public void deleteCustomer(Long id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Customer.class, id));
        tx.commit();

    }
}
