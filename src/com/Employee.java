package com;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name="EMPLOYEE_DETAILS")
public class Employee implements java.io.Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	
	@Column(name="First_Name")
	private String firstName; 
	
	@Column(name="Last_Name") 
	private String lastName;  
	
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
				joinColumns=@JoinColumn(name="USER_ID")
			)
	
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns ={ @Column(name="address_id")}, generator = "hilo-gen", type = @Type(type="long") )
	private Collection<Address> address=new ArrayList<Address>();

	public Collection<Address> getAddress() {
		return address;
	}
	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getFirstName() {  
	    return firstName;  
	}  
	public void setFirstName(String firstName) {  
	    this.firstName = firstName;  
	}  
	public String getLastName() {  
	    return lastName;  
	}  
	public void setLastName(String lastName) {  
	    this.lastName = lastName;  
	}  
}  