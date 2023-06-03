package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OneToOne {

	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	
	@javax.persistence.OneToOne
	private Pancard pancard;
	
}
 