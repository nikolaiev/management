package com.data;

import com.domain.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class CompanyDAOImpl  extends AbstractDAO  implements CompanyDAO{

    public Company findOne(long id) {
        return currentSession().get(Company.class, id);
    }

}
