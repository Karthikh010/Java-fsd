package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "eproduct")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "price")
    private BigDecimal price;
    
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    
    @Column(name = "parts_hdd")
    private String partsHdd;
    
    @Column(name = "parts_cpu")
    private String partsCpu;
    
    @Column(name = "parts_ram")
    private String partsRam;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getPartsHdd() {
		return partsHdd;
	}

	public void setPartsHdd(String partsHdd) {
		this.partsHdd = partsHdd;
	}

	public String getPartsCpu() {
		return partsCpu;
	}

	public void setPartsCpu(String partsCpu) {
		this.partsCpu = partsCpu;
	}

	public String getPartsRam() {
		return partsRam;
	}

	public void setPartsRam(String partsRam) {
		this.partsRam = partsRam;
	}
    
    
}
