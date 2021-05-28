package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("AuthorsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/AuthorsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class AuthorsDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_id = "id";
 public static final String ATTR_Name = "Name";
 public static final String ATTR_Surnames = "Surnames";
 public static final String ATTR_Age = "Age";

}