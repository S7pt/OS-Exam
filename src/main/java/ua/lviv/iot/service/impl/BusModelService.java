package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.BusModelRepository;
import ua.lviv.iot.model.entity.BusModel;
import ua.lviv.iot.service.AbstractService;

@Service
public class BusModelService extends AbstractService<BusModel, Integer> {
  @Autowired
  BusModelRepository busModelRepository;

  public JpaRepository<BusModel, Integer> getRepository() {
    return busModelRepository;
  }

}
