package org.example;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "NETWORK")
@Entity
public class NETWORK {

    @Column(name = "NetworkID")
    @Id
    @GeneratedValue
    private int NetworkID;

    @Column(name = "Name")
    @NotBlank
    @Size(max = 50)
    private String Name;

    public NETWORK() {
    }

    public Long getNetworkID() {
        return NetworkID;
    }

    public void setNetworkID(int NetworkID) {
        this.NetworkID = NetworkID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}