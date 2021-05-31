package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.RouteHasStop;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.RouteHasStopService;


@RestController
@RequestMapping("/routeHasStop")
public class RouteHasStopController extends AbstractController<RouteHasStop,Integer>{
  
  @Autowired
  RouteHasStopService routeHasStopService;
  
  @Override
  public ServiceInterface<RouteHasStop, Integer> getService() {
    return routeHasStopService;
  }
}
