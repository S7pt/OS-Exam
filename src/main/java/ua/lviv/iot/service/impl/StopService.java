package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.StopRepository;
import ua.lviv.iot.model.entity.Stop;
import ua.lviv.iot.service.AbstractService;

@Service
public class StopService extends AbstractService<Stop, Integer> {
  @Autowired
  StopRepository stopRepository;

  public JpaRepository<Stop, Integer> getRepository() {
    return stopRepository;
  }

}
