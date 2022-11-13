package org.webp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Table(name = "NETWORK")
@Entity
public class NETWORK {



    @Column(name = "NetworkID")
    @Id
    private long NetworkID;

    @Column(name = "Name")
    private String Name;

    public NETWORK() {
    }

    public long getNetworkID() {
        return NetworkID;
    }

    public void setNetworkID(long networkID) {
        NetworkID = networkID;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}