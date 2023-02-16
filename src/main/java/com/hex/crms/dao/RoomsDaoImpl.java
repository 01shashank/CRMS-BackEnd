package com.hex.crms.dao;

//CHECKSTYLE:OFF 
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.hex.crms.model.Rooms;

@Repository
public class RoomsDaoImpl implements RoomsDao {

    @Autowired
    private HibernateTemplate template;
    @Autowired
    private SessionFactory sessionFactory;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public List<Rooms> getAll() {
// write your code here.

        return null;

    }
    @Override
    public void addRoom(Rooms r){
    // write your code here.
    }

    
    public Rooms getRoomById(int id) {
    // write your code here.
    return null;
    }
}