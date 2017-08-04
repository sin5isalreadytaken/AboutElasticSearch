package com.example.demo.model;

/**
 * Created by wenxiangzhou214164 on 2017/8/4.
 */
public class ParentModel {
    private int id;
    private String name;
    private BasicModel basicModel;

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

    public BasicModel getBasicModel() {
        return basicModel;
    }

    public void setBasicModel(BasicModel basicModel) {
        this.basicModel = basicModel;
    }
}
