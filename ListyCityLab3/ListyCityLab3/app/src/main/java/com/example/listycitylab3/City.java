package com.example.listycitylab3;

public class City {
    private String name;
    private String province;

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }
    // getters
    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
