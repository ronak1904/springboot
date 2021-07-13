package spring.demo.storagegrid.model;

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
@Table(name = "bucket")
public class Bucket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "creationTime")
	private String creationTime;
	
	@Column(name = "region")
	private String region;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,targetEntity=Compliance.class)
	@JoinColumn(name="compliance_id",referencedColumnName="id")
	private Compliance compliance;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,targetEntity=S3ObjectLock.class)
	@JoinColumn(name="s3ObjectLock_id",referencedColumnName="id")
	private S3ObjectLock s3ObjectLock;

	public Bucket() {
		super();
	}

	public Bucket(String name, String creationTime, String region, Compliance compliance, S3ObjectLock s3ObjectLock) {
		super();
		this.name = name;
		this.creationTime = creationTime;
		this.region = region;
		this.compliance = compliance;
		this.s3ObjectLock = s3ObjectLock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Compliance getCompliance() {
		return compliance;
	}

	public void setCompliance(Compliance compliance) {
		this.compliance = compliance;
	}

	public S3ObjectLock getS3ObjectLock() {
		return s3ObjectLock;
	}

	public void setS3ObjectLock(S3ObjectLock s3ObjectLock) {
		this.s3ObjectLock = s3ObjectLock;
	}
	
	
	
}
