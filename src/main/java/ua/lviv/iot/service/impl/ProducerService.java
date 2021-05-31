package ua.lviv.iot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.ProducerRepository;
import ua.lviv.iot.model.entity.Producer;
import ua.lviv.iot.service.AbstractService;

@Service
public class ProducerService extends AbstractService<Producer, Integer> {
  @Autowired
  ProducerRepository producerRepository;

  public JpaRepository<Producer, Integer> getRepository() {
    return producerRepository;
  }
}
