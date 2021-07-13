package spring.demo.storagegrid.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myuser")
public class User {

	private Long uid;
	
	@Column(name = "fullName")
	private String fullName;
	
	@ElementCollection
	@Column(name = "memberOf")
	private List<String> memberOf=new ArrayList<String>();
	
	@Column(name = "disable")
	private boolean disable;
	
	@Column(name = "uniqueName")
	private String uniqueName;
	
	@Column(name = "accountId")
	private String accountId;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "federated")
	private boolean federated;
	
	@Column(name = "userURN")
	private String userURN;

	public User() {
		super();
	}

	public User(String fullName, List<String> memberOf, boolean disable, String uniqueName, String accountId, String id,
			boolean federated, String userURN) {
		super();
		this.fullName = fullName;
		this.memberOf = memberOf;
		this.disable = disable;
		this.uniqueName = uniqueName;
		this.accountId = accountId;
		this.id = id;
		this.federated = federated;
		this.userURN = userURN;
	}
	

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<String> getMemberOf() {
		return memberOf;
	}

	public void setMemberof(List<String> memberOf) {
		this.memberOf = memberOf;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public String getUniqueName() {
		return uniqueName;
	}

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isFederated() {
		return federated;
	}

	public void setFederated(boolean federated) {
		this.federated = federated;
	}

	public String getUserURN() {
		return userURN;
	}

	public void setUserURN(String userURN) {
		this.userURN = userURN;
	}
	
	
	
	
	
}
