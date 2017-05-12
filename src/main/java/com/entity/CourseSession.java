package com.entity;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;
import java.util.Date;

@Entity
public final class CourseSession implements Serializable {
    private Integer id;
    private Date startDate;
    private Date endDate;
    private Course course;
    private Location location;

    @Id
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public Date getStartDate() { return this.startDate; }
    public void setStartDate(Date startDate) {this.startDate = startDate; }

    public Date getEndDate() { return this.endDate; }
    public void setEndDate(Date endDate) {this.endDate = endDate; }

    @OneToOne
    @PrimaryKeyJoinColumn
    public Course  getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    @OneToOne
    @PrimaryKeyJoinColumn
    public Location getLocation() { return location; }
    public void setLocation(Location location) {
        this.location = location;
    }
}
