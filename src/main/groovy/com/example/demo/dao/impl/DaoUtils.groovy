package com.example.demo.dao.impl


import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired

class DaoUtils {
    @Autowired
    SessionFactory sessionFactory;
    def currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
