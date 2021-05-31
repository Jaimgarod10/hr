package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("LoansDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/LoansDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class LoansDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_id = "id";
 public static final String ATTR_User_ID = "User_ID";
 public static final String ATTR_departure_date = "departure_date";
 public static final String ATTR_maximum_date_to_return = "maximum_date_to_return";
 public static final String ATTR_return_date = "return_date";
 public static final String ATTR_instance_id = "instance_id";

}