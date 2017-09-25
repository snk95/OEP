package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the OEP_USERS database table.
 * 
 */
@Entity
@Table(name="OEP_USERS")
@NamedQuery(name="OepUser.findAll", query="SELECT o FROM OepUser o")
public class OepUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private long userId;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_FNAME")
	private String userFname;

	@Column(name="USER_MOBILE_NO")
	private BigDecimal userMobileNo;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	@Column(name="USER_ROLE")
	private String userRole;

	@Column(name="USER_STATUS")
	private String userStatus;

	private String username;

	//bi-directional many-to-one association to OepResult
	@OneToMany(mappedBy="oepUser")
	private List<OepResult> oepResults;

	public OepUser() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFname() {
		return this.userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public BigDecimal getUserMobileNo() {
		return this.userMobileNo;
	}

	public void setUserMobileNo(BigDecimal userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<OepResult> getOepResults() {
		return this.oepResults;
	}

	public void setOepResults(List<OepResult> oepResults) {
		this.oepResults = oepResults;
	}

	public OepResult addOepResult(OepResult oepResult) {
		getOepResults().add(oepResult);
		oepResult.setOepUser(this);

		return oepResult;
	}

	public OepResult removeOepResult(OepResult oepResult) {
		getOepResults().remove(oepResult);
		oepResult.setOepUser(null);

		return oepResult;
	}

}