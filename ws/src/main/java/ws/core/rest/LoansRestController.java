package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.core.service.ILoansService;

import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/loans")
@ComponentScan(basePackageClasses = { api.core.service.IAuthorsService.class })
public class LoansRestController extends ORestController<ILoansService> {

 @Autowired
 private ILoansService loansService;

 @Override
 public ILoansService getService() {
  return this.loansService;
 }
}