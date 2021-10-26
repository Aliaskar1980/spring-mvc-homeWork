package com.peaksoft.dao;

import com.peaksoft.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{
   @Autowired
    private  SessionFactory sessionFactory;
    @Override
    public void addUser(User user) {
        Session session =sessionFactory.openSession();
        session.persist(user);

    }

    @Override
    public List<User> listUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> user =session.createQuery("from User").list();

        return user;
    }
}
