package com.shop4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	private long id;
	
	@NotBlank(message = "Le nom du produit est obligatoire")
	private String name;
	private double price;
	private String description;
	 public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToOne
	    @JoinColumn(name = "supplier_id")
	    private Supplier supplier;
	
	 @ManyToOne
	 private Category category;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
public Product (String name, String description, double price,Category category) {this.name = name;
                                                                                 this.price = price;
                                                                                 this.description = description;
}
public Product() {}
   

}