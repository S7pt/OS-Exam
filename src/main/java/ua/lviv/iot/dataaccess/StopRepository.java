package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.model.entity.Stop;

@Repository
public interface StopRepository extends JpaRepository<Stop,Integer> {

}
