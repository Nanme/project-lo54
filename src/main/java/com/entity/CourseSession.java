package com.entity;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public final class CourseSession implements Serializable {
    private Integer id;
    private Date startDate;
    private Date endDate;
    private Course course;
    private Location location;

    //TODO Builder

    @Id
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartDate() { return this.startDate; }
    public void setStartDate(Date startDate) {this.startDate = startDate; }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getEndDate() { return this.endDate; }
    public void setEndDate(Date endDate) {this.endDate = endDate; }

    @ManyToOne
    @PrimaryKeyJoinColumn
    public Course  getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    @ManyToOne
    @PrimaryKeyJoinColumn
    public Location getLocation() { return location; }
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CourseSession{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", course=" + course +
                ", location=" + location +
                '}';
    }
}
