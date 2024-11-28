package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameStamp;
    private double weightStamp;
    private double heightStamp;
    private boolean pac;


    @Override
    public boolean equals(Object o){
        if (this ==o)
            return true;
        if (o == null || getClass() !=o.getClass())
            return false;

        Stamp stamp= (Stamp) o;
        return Double.compare(heightStamp, stamp.heightStamp) == 0 && Double.compare(weightStamp, stamp.weightStamp) == 0 && pac == stamp.pac && Objects.equals(nameStamp, stamp.nameStamp);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nameStamp, heightStamp, weightStamp, pac);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameStamp='" + nameStamp + '\'' +
                ", weightStamp=" + weightStamp +
                ", heightStamp=" + heightStamp +
                ", pac=" + pac +
                ", heightStamp=" + heightStamp +
                ", weightStamp=" + weightStamp +
                ", pac=" + pac +
                '}';
    }

    public Stamp (String nameStamp, double heightStamp, double weightStamp, boolean pac){
        this.heightStamp = heightStamp;
        this.nameStamp=nameStamp;
        this.weightStamp = weightStamp;
        this.pac = pac;
    }
    public String getNameStamp(){
        return nameStamp;
    }
    public  double getHeightStamp(){
        return heightStamp;
    }
    public double getWeightStamp(){
        return weightStamp;
    }
    public boolean isPac(){
        return pac;
    }


}
