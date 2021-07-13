package spring.demo.storagegrid.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usage1")
public class Usage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "calculation_time", nullable = false)
	private String calculationTime;
	
	@Column(name = "object_count", nullable = false)
	private int objectCount;
	
	@Column(name = "data_bytes")
	private int dataBytes;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,targetEntity=Usagebucket.class)
	@JoinColumn(name="usage_bucket_id",referencedColumnName="id")
	private List<Usagebucket> usagebucket;

	public Usage() {
		super();
	}
	
	
	
	
	
	public Usage(Long id, String calculationTime, int objectCount, int dataBytes, List<Usagebucket> usagebucket) {
		super();
		this.id = id;
		this.calculationTime = calculationTime;
		this.objectCount = objectCount;
		this.dataBytes = dataBytes;
		this.usagebucket = usagebucket;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	public String getCalculationTime() {
		return calculationTime;
	}

	public void setCalculationTime(String calculationTime) {
		this.calculationTime = calculationTime;
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




	@Column(name = "usage_bucket_id")
	public List<Usagebucket> getUsagebucket() {
		return usagebucket;
	}





	public void setUsagebucket(List<Usagebucket> usagebucket) {
		this.usagebucket = usagebucket;
	}

	
	
	
	

}
