package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.model.entity.Producer;

@Repository
public interface ProducerRepository extends JpaRepository<Producer,Integer>{

}
