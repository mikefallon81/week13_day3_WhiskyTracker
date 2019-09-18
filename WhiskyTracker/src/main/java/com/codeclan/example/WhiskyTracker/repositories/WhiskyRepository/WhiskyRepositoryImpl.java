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

//public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Whisky> findWhiskyFromDistilleryOfSpecificAge(String distilleryName, int age){
//        List<Whisky> results = null;
//
//        try {
//            Session session = entityManager.unwrap(Session.class);
//            Criteria cr = session.createCriteria(Whisky.class);
//            cr.createAlias("distillery", "distilleryAlias");
//            cr.add(Restrictions.eq("distilleryAlias.name", distilleryName));
//            cr.createAlias("age", "ageAlias");
//            cr.add(Restrictions.eq("whiskyAlias.age", age));
//            results = cr.list();
//        }
//        catch (HibernateException ex) {
//            ex.printStackTrace();
//        }
//
//        return results;
//    }

//}
