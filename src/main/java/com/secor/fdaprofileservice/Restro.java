package com.secor.fdaprofileservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restros")
public class Restro {
    @Id
    @Column(name = "restroid", nullable = false, length = 50)
    private String restroid;

    @Column(name = "restroname", length = 50)
    private String restroname;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country", length = 50)
    private String country;

    public String getRestroid() {
        return restroid;
    }

    public void setRestroid(String restroid) {
        this.restroid = restroid;
    }

    public String getRestroname() {
        return restroname;
    }

    public void setRestroname(String restroname) {
        this.restroname = restroname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}