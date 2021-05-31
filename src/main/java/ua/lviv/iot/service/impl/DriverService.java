package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import ua.lviv.iot.dataaccess.DriverRepository;
import ua.lviv.iot.model.entity.Driver;
import ua.lviv.iot.service.AbstractService;

@Service
public class DriverService extends AbstractService<Driver, Integer> {
  @Autowired
  DriverRepository driverRepository;

  public JpaRepository<Driver, Integer> getRepository() {
    return driverRepository;
  }
}
