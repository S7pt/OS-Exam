package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Producer;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.impl.ProducerService;


@RestController
@RequestMapping("/producer")
public class ProducerController extends AbstractController<Producer,Integer>{
    
  @Autowired
  ProducerService houseService;

  @Override
  public ServiceInterface<Producer, Integer> getService() {
      return houseService;
  }
}
