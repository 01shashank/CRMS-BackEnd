package com.hex.crms.dao;

import java.util.Date;
//CHECKSTYLE:OFF 
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.hex.crms.model.Bookings;

@Repository
@Transactional
public class BookingsDaoImpl implements BookingsDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public List<Bookings> getAll() {
      

        return null;

    }
    @Override
    public void addBooking(Bookings b){

    
    }
    
    @Override
    public Bookings getBooking(int id) {
       return null;
    }
    
    @Override
    public void cancelBooking(int id, String name)throws DataAccessException{

    }
}