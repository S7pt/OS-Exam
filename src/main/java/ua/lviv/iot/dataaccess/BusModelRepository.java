package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.model.entity.BusModel;

@Repository
public interface BusModelRepository extends JpaRepository<BusModel, Integer> {

}
