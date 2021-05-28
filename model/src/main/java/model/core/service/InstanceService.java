package model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

import api.core.service.IInstanceService;
import model.core.dao.InstanceDao;

@Service("InstanceService")
@Lazy
public class InstanceService implements IInstanceService{

 @Autowired private InstanceDao InstanceDao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
@Override
 public EntityResult instanceQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.InstanceDao, keyMap, attrList);
 }

 @Override
 public EntityResult instanceInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.InstanceDao, attrMap);
 }

 @Override
 public EntityResult instanceUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.InstanceDao, attrMap, keyMap);
 }

 @Override
 public EntityResult instanceDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.InstanceDao, keyMap);
 }

}