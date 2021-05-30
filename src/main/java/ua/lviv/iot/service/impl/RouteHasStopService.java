package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.RouteHasStopRepository;
import ua.lviv.iot.model.entity.RouteHasStop;
import ua.lviv.iot.service.AbstractService;

@Service
public class RouteHasStopService extends AbstractService<RouteHasStop, Integer> {
  @Autowired
  RouteHasStopRepository routeHasStopRepository;

  public JpaRepository<RouteHasStop, Integer> getRepository() {
    return routeHasStopRepository;
  }
}
