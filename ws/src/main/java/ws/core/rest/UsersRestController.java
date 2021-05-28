package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.core.service.IBooksService;
import api.core.service.ICandidateService;
import api.core.service.IUsersService;

import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/users2")
@ComponentScan(basePackageClasses = { api.core.service.IUsersService.class })
public class UsersRestController extends ORestController<IUsersService> {

 @Autowired
 private IUsersService usersService;

 @Override
 public IUsersService getService() {
  return this.usersService;
 }
}