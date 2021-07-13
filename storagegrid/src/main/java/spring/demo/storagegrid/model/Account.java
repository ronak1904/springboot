package spring.demo.storagegrid.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aid;
	
	@Column(name = "name")
	private String name;
	
	@ElementCollection
	@Column(name = "capabilities")
	private List<String> capabilities=new ArrayList<String>();
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,targetEntity=Policy.class)
	@JoinColumn(name="policy",referencedColumnName="id")
	private Policy policy;
	
	@Column(name = "id")
	private String  id;

	public Account() {
		super();
	}

	public Account(String name, List<String> capabilities, Policy policy, String id) {
		super();
		this.name = name;
		this.capabilities = capabilities;
		this.policy = policy;
		this.id = id;
	}

	public Long getAid() {
		return aid;
	}

	public void setA_id(Long aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(List<String> capabilities) {
		this.capabilities = capabilities;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
