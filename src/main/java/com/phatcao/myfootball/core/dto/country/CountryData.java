package com.phatcao.myfootball.core.dto.country;

import java.io.Serializable;


public class CountryData implements Serializable
{
    String name;
    public CountryData (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
