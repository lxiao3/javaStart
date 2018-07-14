package com.lxiao.twitter.entity;

import java.util.Date;

public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private final Double latitude;
    private final Double longitude;
    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }
    public Spittle(String message, Date time, Double longitude, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}