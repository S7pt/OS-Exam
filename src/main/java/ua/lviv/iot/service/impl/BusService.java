package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.BusRepository;
import ua.lviv.iot.model.entity.Bus;
import ua.lviv.iot.service.AbstractService;

@Service
public class BusService extends AbstractService<Bus, Integer> {
  @Autowired
  BusRepository busRepository;

  public JpaRepository<Bus, Integer> getRepository() {
    return busRepository;
  }

}
