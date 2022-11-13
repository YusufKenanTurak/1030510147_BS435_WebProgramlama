package org.webp;


import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CURRENCY")
@Entity
public class CURRENCY {


    @Column(name = "ID")
    @Id
    private int ID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Price")
    private Long Price;

    @Column(name = "ExchangeID")
    private int ExchangeID;

    @Column(name = "NetworkID")
    private int NetworkID;

    public CURRENCY() {
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getExchangeID() {
        return ExchangeID;
    }

    public void setExchangeID(int exchangeID) {
        ExchangeID = exchangeID;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long Price) {
        this.Price = Price;
    }

    public int getExchangesID() {
        return ExchangeID;
    }

    public void setExchangesID(int ExchangeID) {
        this.ExchangeID = ExchangeID;
    }

    public int getNetworkID() {
        return NetworkID;
    }

    public void setNetworkID(int NetworkID) {
        this.NetworkID = NetworkID;
    }

}
