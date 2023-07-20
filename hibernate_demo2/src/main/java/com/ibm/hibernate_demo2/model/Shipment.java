package com.ibm.hibernate_demo2.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="shipment_table")
@Entity
@Data
public class Shipment {
	@Id
    @Column(name="shipment_id")
    private int shipmentid;
    @Column(name="city_name")
    private String cityname;
    @Column(name="zip_code")
    private int zipcode;
    //bydirectional one to one mapping
    @OneToOne(mappedBy="shipment",cascade = CascadeType.ALL)
    private Order o;
	
}
