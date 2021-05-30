package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.DistanceBetweenStops;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.DistanceBetweenStopsService;


@RestController
@RequestMapping("/distanceBetweenStops")
public class DistanceBetweenStopsController extends AbstractController<DistanceBetweenStops,Integer>{
  @Autowired
  DistanceBetweenStopsService distanceBetweenStopsService;

  @Override
  public ServiceInterface<DistanceBetweenStops, Integer> getService() {
      return distanceBetweenStopsService;
  }
}