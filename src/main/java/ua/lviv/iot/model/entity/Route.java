package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "route")
@Table(name = "route")
public class Route {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "starting_address", length = 45)
  private String startingAddress;

  @Column(name = "destination", length = 45)
  private String destination;

  @Column(name = "route_number", length = 10)
  private String routeNumber;

  public Route(int id, String startingAddress, String destination, String routeNumber) {
    this.id = id;
    this.startingAddress = startingAddress;
    this.destination = destination;
    this.routeNumber = routeNumber;
  }

  public Route(String startingAddress, String destination, String routeNumber) {
    this.startingAddress = startingAddress;
    this.destination = destination;
    this.routeNumber = routeNumber;
  }

  public Route() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStartingAddress() {
    return startingAddress;
  }

  public void setStartingAddress(String startingAddress) {
    this.startingAddress = startingAddress;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }
  

  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((destination == null) ? 0 : destination.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((routeNumber == null) ? 0 : routeNumber.hashCode());
    result = prime * result + ((startingAddress == null) ? 0 : startingAddress.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Route other = (Route) obj;
    if (destination == null) {
      if (other.destination != null)
        return false;
    } else if (!destination.equals(other.destination))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (routeNumber == null) {
      if (other.routeNumber != null)
        return false;
    } else if (!routeNumber.equals(other.routeNumber))
      return false;
    if (startingAddress == null) {
      if (other.startingAddress != null)
        return false;
    } else if (!startingAddress.equals(other.startingAddress))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Route [id=" + id + ", startingAddress=" + startingAddress + ", destination=" + destination
        + ", routeNumber=" + routeNumber + "]";
  }

}