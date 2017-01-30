package com.data;

import com.domain.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class TaskDAOImpl implements TaskDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public TaskDAOImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

}
