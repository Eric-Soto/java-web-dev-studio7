package org.launchcode.studio7;

public class Data {
    private double size;
    private String type;

    public Data (double size, String type){
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
