package ua.lviv.iot.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "route_has_stop")
@Table(name = "route_has_stop")
public class RouteHasStop {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "route_id")
  private Integer routeId;
  @Column(name = "stop_id")
  private Integer stopId;

  public RouteHasStop() {
    super();
  }

  public RouteHasStop(Integer routeId, Integer stopId) {
    super();
    this.routeId = routeId;
    this.stopId = stopId;
  }

  public RouteHasStop(Integer id, Integer routeId, Integer stopId) {
    super();
    this.id = id;
    this.routeId = routeId;
    this.stopId = stopId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routeId, stopId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    RouteHasStop other = (RouteHasStop) obj;
    return Objects.equals(id, other.id) && Objects.equals(routeId, other.routeId) && Objects.equals(stopId, other.stopId);
  }

  @Override
  public String toString() {
    return "RouteHasStop [id=" + id + ", route=" + routeId + ", stop=" + stopId + "]";
  }

}
