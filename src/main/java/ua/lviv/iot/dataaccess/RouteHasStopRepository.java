package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.iot.model.entity.RouteHasStop;

public interface RouteHasStopRepository extends JpaRepository<RouteHasStop,Integer> {

}
