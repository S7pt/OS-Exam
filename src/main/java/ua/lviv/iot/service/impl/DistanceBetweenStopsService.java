package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.DistanceBetweenStopsRepository;
import ua.lviv.iot.model.entity.DistanceBetweenStops;
import ua.lviv.iot.service.AbstractService;

@Service
public class DistanceBetweenStopsService extends AbstractService<DistanceBetweenStops, Integer> {
  @Autowired
  DistanceBetweenStopsRepository distanceBetweenStopsRepository;

  public JpaRepository<DistanceBetweenStops, Integer> getRepository() {
    return distanceBetweenStopsRepository;
  }
}
