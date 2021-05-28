package model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

import api.core.service.IAuthorsService;
import model.core.dao.AuthorsDao;

@Service("AuthorsService")
@Lazy
public class AuthorsService implements IAuthorsService{

 @Autowired private AuthorsDao AuthorsDao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
 @Override
 public EntityResult authorQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.AuthorsDao, keyMap, attrList);
 }

 @Override
 public EntityResult authorInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.AuthorsDao, attrMap);
 }

 @Override
 public EntityResult authorUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.AuthorsDao, attrMap, keyMap);
 }

 @Override
 public EntityResult authorDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.AuthorsDao, keyMap);
 }

}