package org.webp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Table(name = "EXCHANGE")
@Entity
public class EXCHANGE {



    @Column(name = "ExchangeID")
    @Id
    private int ExchangeID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Country")
    private String Country;

    @Column(name = "NetworkID")
    private int NetworkID;


    public EXCHANGE(){}


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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getNetworkID() { return NetworkID; }

    public void setNetworkID(int NetworkID) {
        this.NetworkID = NetworkID;
    }


}

