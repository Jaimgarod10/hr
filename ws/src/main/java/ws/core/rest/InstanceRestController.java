package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.core.service.IInstanceService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/instances")
@ComponentScan(basePackageClasses = { api.core.service.IInstanceService.class })
public class InstanceRestController extends ORestController<IInstanceService> {

 @Autowired
 private IInstanceService instanceService;

 @Override
 public IInstanceService getService() {
  return this.instanceService;
 }
}
