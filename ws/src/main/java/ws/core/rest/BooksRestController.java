package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.core.service.IBooksService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/books")
@ComponentScan(basePackageClasses = { api.core.service.IBooksService.class })
public class BooksRestController extends ORestController<IBooksService> {

 @Autowired
 private IBooksService booksService;

 @Override
 public IBooksService getService() {
  return this.booksService;
 }
}