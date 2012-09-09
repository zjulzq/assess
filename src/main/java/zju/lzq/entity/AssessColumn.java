package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class AssessColumn implements Serializable{
	
	private static final long serialVersionUID = 8802519477229619130L;
	private long id;
	private AssessItem assessItem;
	private AssessTable assessTable;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AssessItem getAssessItem() {
		return assessItem;
	}

	public void setAssessItem(AssessItem assessItem) {
		this.assessItem = assessItem;
	}

	public AssessTable getAssessTable() {
		return assessTable;
	}

	public void setAssessTable(AssessTable assessTable) {
		this.assessTable = assessTable;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
