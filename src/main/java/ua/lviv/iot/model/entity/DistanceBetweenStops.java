package ua.lviv.iot.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="distance_between_stops")
@Table(name="distance_between_stops")
public class DistanceBetweenStops {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private Integer id;
  @Column(name="start_id")
  private Integer startStopId;
  @Column(name="finish_id")
  private Integer finishStopId;
  @Column(name="distance")
  private Integer distance;
  
  
  public DistanceBetweenStops() {
    super();
  }

  public DistanceBetweenStops(Integer startStopId, Integer finishStopId, Integer distance) {
    super();
    this.startStopId = startStopId;
    this.finishStopId = finishStopId;
    this.distance = distance;
  }

  public DistanceBetweenStops(Integer id, Integer startStopId, Integer finishStopId, Integer distance) {
    super();
    this.id = id;
    this.startStopId = startStopId;
    this.finishStopId = finishStopId;
    this.distance = distance;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  
  
  public Integer getStartStopId() {
    return startStopId;
  }

  public void setStartStopId(Integer startStopId) {
    this.startStopId = startStopId;
  }

  public Integer getFinishStopId() {
    return finishStopId;
  }

  public void setFinishStopId(Integer finishStopId) {
    this.finishStopId = finishStopId;
  }

  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, finishStopId, id, startStopId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DistanceBetweenStops other = (DistanceBetweenStops) obj;
    return Objects.equals(distance, other.distance) && Objects.equals(finishStopId, other.finishStopId)
        && Objects.equals(id, other.id) && Objects.equals(startStopId, other.startStopId);
  }

  @Override
  public String toString() {
    return "\nDistanceBetweenStops [id=" + id + ", startStop=" + startStopId + ", finishStop=" + finishStopId + ", distance="
        + distance + "]";
  }

}
