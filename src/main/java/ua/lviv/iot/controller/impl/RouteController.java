package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Route;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.RouteService;


@RestController
@RequestMapping("/route")
public class RouteController extends AbstractController<Route, Integer> {
  @Autowired
  RouteService routeService;

  @Override
  public ServiceInterface<Route, Integer> getService() {
    return routeService;
  }
}
