package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Stop;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.StopService;


@RestController
@RequestMapping("/stop")
public class StopController extends AbstractController<Stop,Integer> {
    
  @Autowired
  StopService stopService;
  
  public ServiceInterface<Stop,Integer> getService(){
    return stopService;
  }
}
