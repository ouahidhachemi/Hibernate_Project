package model;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");

    public void saveProduct(Product product) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        if (product.getId() == null) {
            em.persist(product);
        } else {
            em.merge(product);
        }

        tx.commit();

    }

    public Product showProduct(Long id) {

        EntityManager em = emf.createEntityManager();
        return em.find(Product.class, id);

    }
}
