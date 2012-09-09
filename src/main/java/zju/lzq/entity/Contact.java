package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable{

	private static final long serialVersionUID = 3140123883017184499L;
	private long id;
	private String tel;
	private String email;
	private Address address;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
