package com.example.demo.dao.impl

import com.example.demo.dao.UserDao
import com.example.demo.models.User
import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.query.Query
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Root

@Repository
class UserDaoImpl implements UserDao{

    @Autowired
    SessionFactory sessionFactory

    Session currentSession() {
        sessionFactory.getCurrentSession()
    }
    @Override
    void save(User user) {
        currentSession().save(user)
    }

    @Override
    User getById(int userId) {
        return currentSession().get(User, userId)
    }

    @Override
    List<User> getAll() {
        return null
    }

    @Override
     User getByName(String userName) {
        CriteriaBuilder builder = currentSession().getCriteriaBuilder()
        CriteriaQuery<User> criteria = builder.createQuery(User)
        Root<User> root = criteria.from(User)
        criteria.select(root)
        criteria.where(builder.equal(root.get("userName"), userName))
        Query<User> query = currentSession().createQuery(criteria)
        return (User)query.uniqueResult()
    }

    @Override
    void delete(int id) {
    }

    @Override
    void update(User user) {
    }
}
