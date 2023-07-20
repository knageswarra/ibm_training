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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "my_order_table")
@Entity
public class Order {

	@Id
	@Column(name = "order_id")
	private String id;
	@Column(name = "order_name")
	private String ordername;
	@OneToOne(cascade = CascadeType.ALL)
	private Shipment shipment;
	public Order(String orderName, Shipment shipment) {
		super();
		this.ordername = orderName;
		this.shipment = shipment;
	}


}
