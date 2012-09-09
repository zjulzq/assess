package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class AssessItem implements Serializable{
	
	private static final long serialVersionUID = -4078584711578589317L;
	private long id;
	private String content;
	private double score;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
