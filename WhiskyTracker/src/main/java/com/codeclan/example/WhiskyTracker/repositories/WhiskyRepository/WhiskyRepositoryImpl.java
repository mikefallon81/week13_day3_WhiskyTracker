package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Whisky> findWhiskyFromDistilleryOfSpecificAge(Long distilleryId, int age){
        List<Whisky> results = null;

        try {
            Session session = entityManager.unwrap(Session.class);
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("distillery", "distilleryAlias");
            cr.add(Restrictions.eq("distilleryAlias.id", distilleryId));
            cr.add(Restrictions.eq("age", age));
            results = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return results;
    }
    @Transactional
    public List<Whisky> findWhiskiesFromSpecificRegion(String region){
        List<Whisky> results = null;

        try{
            Session session = entityManager.unwrap(Session.class);
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("distillery", "distillery");
            cr.add(Restrictions.eq("distillery.region", region));
            results = cr.list();
        }

        catch (HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }

}
