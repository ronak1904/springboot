package spring.demo.storagegrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compliance")
public class Compliance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "autoDelete")
	private boolean autoDelete;
	
	@Column(name = "legalHold")
	private boolean legalHold;
	
	@Column(name = "retentionPeriodMinutes")
	private int retentionPeriodMinutes;

	public Compliance() {
		super();
	}

	public Compliance(boolean autoDelete, boolean legalHold, int retentionPeriodMinutes) {
		super();
		this.autoDelete = autoDelete;
		this.legalHold = legalHold;
		this.retentionPeriodMinutes = retentionPeriodMinutes;
	}

	public boolean isAutoDelete() {
		return autoDelete;
	}

	public void setAutoDelete(boolean autoDelete) {
		this.autoDelete = autoDelete;
	}

	public boolean isLegalHold() {
		return legalHold;
	}

	public void setLegalHold(boolean legalHold) {
		this.legalHold = legalHold;
	}

	public int getRetentionPeriodMinutes() {
		return retentionPeriodMinutes;
	}

	public void setRetentionPeriodMinutes(int retentionPeriodMinutes) {
		this.retentionPeriodMinutes = retentionPeriodMinutes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
