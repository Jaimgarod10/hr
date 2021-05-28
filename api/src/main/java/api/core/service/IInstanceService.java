package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IInstanceService {

	 // INSTANCES
	 public EntityResult instanceQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult instanceInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult instanceUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult instanceDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
