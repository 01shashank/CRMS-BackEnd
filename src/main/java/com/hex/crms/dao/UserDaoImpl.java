package com.hex.crms.dao;

import java.io.Serializable;
//CHECKSTYLE:OFF 
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hex.crms.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    private HibernateTemplate template;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User u) {
      // write your code here.
    }

    /**
     * @return the template
     */
    public HibernateTemplate getTemplate() {
        return template;
    }

    /**
     * @param template the template to set
     */
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
   @Override
    public User getUserByID(int userID){
// write your code here.
        
            return null;
        
    }
   
    

    @Override
    public User getUser(String username){
// write your code here.
        
            return null;
        
    }
}