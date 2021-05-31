package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Driver;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.DriverService;


@RestController
@RequestMapping("/driver")
public class DriverController extends AbstractController<Driver,Integer>{
    
  @Autowired
  DriverService driverService;

  @Override
  public ServiceInterface<Driver, Integer> getService() {
      return driverService;
  }
}
