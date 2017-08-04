package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by wenxiangzhou214164 on 2017/8/4.
 */
public class BasicModel implements Serializable {

    private int id;
    private String name;
    private List<Map<String, String>> kins;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<String, String>> getKins() {
        return kins;
    }

    public void setKins(List<Map<String, String>> kins) {
        this.kins = kins;
    }
}
