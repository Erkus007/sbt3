package model;

import java.util.List;

public class Customer {
	private List<Customer> customers;
	private Long id;
	private String firstName;
	private String lastName;
	private String adress;
	
	public Customer() {
		
	}
	
	public Customer(Long id, String firstName, String lastName, String adress) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		
	}
	
	public void addList(){
		customers.add(new Customer(id,firstName,lastName,adress));
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
}

