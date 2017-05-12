package com.entity;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;
import java.io.Serializable;

@Entity
public final class Course implements Serializable {
    private String code;
    private String title;

    @Id
    public String getCode() { return this.code; }
    public void setCode(String code) { this.code = code; }

    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }
}
