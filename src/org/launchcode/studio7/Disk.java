package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Disk {
    private String name;
    private double capacity;
    private ArrayList<Data> contents =  new ArrayList<Data>();
    private String discType;
    private Boolean isBranded;

    public Disk(String name, double capacity, String discType, Boolean isBranded){
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.isBranded = isBranded;
    }

    public Boolean isSpaceRemaining (double size){
        return (this.capacity - getSizeOfContentsStored()) >= size;
    }

    private double getSizeOfContentsStored(){
        double sum = 0;
        for (Data content:this.contents) {
            sum += content.getSize();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Data> getContents() {
        return contents;
    }

    public void addToContent(Data content) {
        this.contents.add(content);
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public Boolean getBranded() {
        return isBranded;
    }

    public void setBranded(Boolean branded) {
        isBranded = branded;
    }
}
