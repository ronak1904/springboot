package spring.demo.storagegrid.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "usagebucket1")
public class Usagebucket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "object_count")
	private int objectCount;
	
	@Column(name = "data_bytes")
	private int dataBytes;
	
	

	public Usagebucket() {
		super();
	}


	public Usagebucket(String name, int objectCount, int dataBytes) {
		super();
		this.name = name;
		this.objectCount = objectCount;
		this.dataBytes = dataBytes;

	}
	
	
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
	
	
	public int getObjectCount() {
		return objectCount;
	}

	public void setObjectCount(int objectCount) {
		this.objectCount = objectCount;
	}
	
	
	public int getDataBytes() {
		return dataBytes;
	}

	public void setDataBytes(int dataBytes) {
		this.dataBytes = dataBytes;
	}


	
	

}
