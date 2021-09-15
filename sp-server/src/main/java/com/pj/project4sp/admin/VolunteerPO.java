package com.pj.project4sp.admin;

import java.math.BigInteger;

public class VolunteerPO {
    private BigInteger id;
    private String name;
    private String province;
    private Integer is985;
    private Integer is211;
    private Integer lowestScore;
    private String major;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getIs985() {
        return is985;
    }

    public void setIs985(Integer is985) {
        this.is985 = is985;
    }

    public Integer getIs211() {
        return is211;
    }

    public void setIs211(Integer is211) {
        this.is211 = is211;
    }

    public Integer getLowestScore() {
        return lowestScore;
    }

    public void setLowestScore(Integer lowestScore) {
        this.lowestScore = lowestScore;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
