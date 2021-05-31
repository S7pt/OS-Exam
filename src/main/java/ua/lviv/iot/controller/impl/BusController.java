package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Bus;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.BusService;


@RestController
@RequestMapping("/bus")
public class BusController extends AbstractController<Bus,Integer>{
  
  @Autowired
  BusService busService;
  
  @Override
  public ServiceInterface<Bus,Integer> getService() {
      return busService;
  }
}
