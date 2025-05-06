package com.codegym.repository.impl;

import com.codegym.entity.Customer;
import com.codegym.repository.CustomerRepository;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private static SessionFactory sessionFactory;

    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> selectAll() {
        String hql = "SELECT c FROM Customer AS c";
        TypedQuery<Customer> query = entityManager.createQuery(hql, Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer select(Integer id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public Customer insert(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer update(Integer id, Customer customer) {
        Customer existingCustomer = entityManager.find(Customer.class, id);
        if (existingCustomer != null) {
            existingCustomer.setFullName(customer.getFullName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setAddress(customer.getAddress());
            entityManager.merge(existingCustomer);
        }
        return existingCustomer;
    }

    @Override
    public void delete(Integer id) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }
}
