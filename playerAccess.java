package com.assignment2;

public class playerAccess {
    private String no, name, fideId, FED, rtg, city;

    public playerAccess(String no, String name, String fideId, String FED, String rtg, String city){
        this.no = no;
        this.name = name;
        this.fideId = fideId;
        this.FED = FED;
        this.rtg = rtg;
        this.city = city;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFideId() {
        return fideId;
    }

    public void setFideId(String fideId) {
        this.fideId = fideId;
    }

    public String getFED() {
        return FED;
    }

    public void setFED(String FED) {
        this.FED = FED;
    }

    public String getRtg() {
        return rtg;
    }

    public void setRtg(String rtg) {
        this.rtg = rtg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
