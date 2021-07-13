package spring.demo.storagegrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "s3ObjectLock")
public class S3ObjectLock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 
	@Column(name = "enabled")
	private boolean enabled;

	public S3ObjectLock() {
		super();
	}

	public S3ObjectLock(boolean enabled) {
		super();
		this.enabled = enabled;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
