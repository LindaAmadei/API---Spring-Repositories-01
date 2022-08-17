package co.develhope.Spring.Repositories.Model;


import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table (name = "cars")

public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "modelName", nullable = false)
    private  String modelName;

    @Column(name = "serialNumber", nullable = false)
    private  String serialNumber;

    @Column(name = "currentPrice", nullable = true)
    private  String currentPrice ;

    public Car() {
    }

    public Car(int id, String modelName, String serialNumber, String currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }
}



