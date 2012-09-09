package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class Contract implements Serializable{
	
	private static final long serialVersionUID = 1688972761236710127L;
	private long id;
	private Date sdate;
	private Date edate;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
