package com.example.mvp.pojo;

public class MoiveModel {
    String name,description,type;
    Double review;

    public MoiveModel(String name, String description, String type, Double review) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getReview() {
        return review;
    }

    public void setReview(Double review) {
        this.review = review;
    }
}
