package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Table(name = "EXCHANGE")
@Entity
public class EXCHANGE {

    @Column(name = "ExchangeID")
    @Id
    @GeneratedValue
    private int ExchangeID;

    @Column(name = "Name")
    @NotBlank
    @Size(max=50)
    private String Name;

    @Column(name = "Country")
    @NotBlank
    @Size(max=50)
    private String Country;

    @Column(name = "NetworkID")
    private int NetworkID;


    public EXCHANGE(){}

    public int getExchangeID() {
        return ExchangeID;
    }

    public void setExchangeID(int CompanyID) {
        this.ExchangeID = ExchangeID;
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

