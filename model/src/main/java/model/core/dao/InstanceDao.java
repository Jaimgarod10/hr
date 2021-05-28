package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("InstanceDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/InstanceDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class InstanceDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_id = "id";
 public static final String ATTR_date_of_admission = "date_of_admission";
 public static final String ATTR_id_books = "id_books";
}