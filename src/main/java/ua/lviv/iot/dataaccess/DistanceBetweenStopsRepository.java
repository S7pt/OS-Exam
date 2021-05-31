package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.model.entity.DistanceBetweenStops;

@Repository
public interface DistanceBetweenStopsRepository extends JpaRepository<DistanceBetweenStops,Integer>{

}
