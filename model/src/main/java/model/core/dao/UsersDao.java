package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("UsersDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/UsersDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class UsersDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_id = "id";
 public static final String ATTR_Name = "Name";
 public static final String ATTR_Surnames = "Surnames";
 public static final String ATTR_Email = "Email";
 public static final String ATTR_Phone = "Phone";

}