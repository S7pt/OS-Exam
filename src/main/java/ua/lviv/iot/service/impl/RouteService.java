package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.RouteRepository;
import ua.lviv.iot.model.entity.Route;
import ua.lviv.iot.service.AbstractService;

@Service
public class RouteService extends AbstractService<Route, Integer> {
  @Autowired
  RouteRepository routeRepository;

  public JpaRepository<Route, Integer> getRepository() {
    return routeRepository;
  }
}
