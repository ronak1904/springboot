package spring.demo.storagegrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "useAccountIdentitySource")
	private boolean useAccountIdentitySource;
	
	@Column(name = "allowPlatformServices")
	private boolean allowPlatformServices;
	
	@Column(name = "quotaObjectBytes")
	private int quotaObjectBytes;
	public Policy() {
		super();
	}
	public Policy(boolean useAccountIdentitySource, boolean allowPlatformServices, int quotaObjectBytes) {
		super();
		this.useAccountIdentitySource = useAccountIdentitySource;
		this.allowPlatformServices = allowPlatformServices;
		this.quotaObjectBytes = quotaObjectBytes;
	}
	public boolean isUseAccountIdentitySource() {
		return useAccountIdentitySource;
	}
	public void setUseAccountIdentitySource(boolean useAccountIdentitySource) {
		this.useAccountIdentitySource = useAccountIdentitySource;
	}
	public boolean isAllowPlatformServices() {
		return allowPlatformServices;
	}
	public void setAllowPlatformServices(boolean allowPlatformServices) {
		this.allowPlatformServices = allowPlatformServices;
	}
	public int getQuotaObjectBytes() {
		return quotaObjectBytes;
	}
	public void setQuotaObjectBytes(int quotaObjectBytes) {
		this.quotaObjectBytes = quotaObjectBytes;
	}
	
	
	
}
