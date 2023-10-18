package com.example.Load.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Load_Info")
public class Load_class {

            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "Id")
            private int id;
           @Column(name = "Loading Point")
            private String loadingPoint;
           @Column(name = "Unloading Point")
            private String unloadingPoint;
           @Column(name = "ProductType")
            private  String productType;
           @Column(name = "TruckType")
            private String truckType;
           @Column(name = "noOfTrucks")
            private int noOfTrucks;
           @Column(name = "weight")
            private int weight;
           @Column(name = "Comment")
           private String comment;
           @Column(name = "ShipperId")
           private long shipperId ;
           @Column(name = "Date")
           @JsonFormat(pattern = "dd-mm-yyyy")
           Date Date;

    public Load_class() {
    }

    public Load_class(int id, String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String comment, long shipperId, java.util.Date date) {
        this.id = id;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        Date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
