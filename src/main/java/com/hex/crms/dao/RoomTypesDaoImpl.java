package com.hex.crms.dao;
//CHECKSTYLE:OFF 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.hex.crms.model.RoomTypes;;

@Repository
public class RoomTypesDaoImpl implements RoomTypesDao {

    @Autowired
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public List<RoomTypes> getAll() {
// write your code here.

        return null;

    }

}