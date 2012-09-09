package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AssessTable implements Serializable{
	
	private static final long serialVersionUID = -6946988804431019244L;
	private long id;
	private String name;
	private List<AssessColumn> assessColumns;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AssessColumn> getAssessColumns() {
		return assessColumns;
	}

	public void setAssessColumns(List<AssessColumn> assessColumns) {
		this.assessColumns = assessColumns;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
