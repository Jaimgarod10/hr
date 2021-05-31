package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface ILoansService {

	 // LOANS
	 public EntityResult loansQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult loansInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult loansUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult loansDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
