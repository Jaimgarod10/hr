package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IUsersService {

	
	 public EntityResult usersQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult usersInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult usersUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult usersDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
