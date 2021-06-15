package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("BooksDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/BooksDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class BooksDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_id = "id";
 public static final String ATTR_photo = "photo";
 public static final String ATTR_Title = "Title";
 public static final String ATTR_Description = "Description";
 public static final String ATTR_Numberofsheets = "Number of sheets";
 public static final String ATTR_ISBN = "ISBN";
 public static final String ATTR_Editorial = "Editorial";
 public static final String ATTR_Edition = "Edition";
 public static final String ATTR_Dateofpublication = "Date of publication";
 public static final String ATTR_id_author = "id_author";
}