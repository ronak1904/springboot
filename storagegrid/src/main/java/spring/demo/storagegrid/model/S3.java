package spring.demo.storagegrid.model;

public class S3 {
	
	private String id;
	
	private String accountId;
	
	private String displayName;
	
	private String userURN;
	
	private String userUUID;
	
	private String expires;
	
	private String accessKey;
	
	private String secretAccessKey;

	public S3() {
		super();
	}

	public S3(String id, String accountId, String displayName, String userURN, String userUUID, String expires,
			String accessKey, String secretAccessKey) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.displayName = displayName;
		this.userURN = userURN;
		this.userUUID = userUUID;
		this.expires = expires;
		this.accessKey = accessKey;
		this.secretAccessKey = secretAccessKey;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUserURN() {
		return userURN;
	}

	public void setUserURN(String userURN) {
		this.userURN = userURN;
	}

	public String getUserUUID() {
		return userUUID;
	}

	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}

	public String getExpires() {
		return expires;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretAccessKey() {
		return secretAccessKey;
	}

	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}
	

	

}
