package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.core.service.IAuthorsService;

import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/author")
@ComponentScan(basePackageClasses = { api.core.service.IAuthorsService.class })
public class AuthorsRestController extends ORestController<IAuthorsService> {

 @Autowired
 private IAuthorsService authorsService;

 @Override
 public IAuthorsService getService() {
  return this.authorsService;
 }
}