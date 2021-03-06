package com.jservmarket.model;


public class CategoriesModel {
    private int id_;
    private String label_;

    public CategoriesModel() {
        this.id_ = -1;
        this.label_ = "";
    }

    public CategoriesModel(int id_, String label_) {
        this.id_ = id_;
        this.label_ = label_;
    }

    public int getId() {
        return id_;
    }

    public void setId(int id) {
        this.id_ = id;
    }

    public String getLabel() {
        return label_;
    }

    public void setLabel(String label) {
        this.label_ = label;
    }

    @Override
    public String toString() {
        String str = "[" + this.getId() + "] " + this.getLabel() + "\n";
        str += ".....................................";

        return str;
    }
}
