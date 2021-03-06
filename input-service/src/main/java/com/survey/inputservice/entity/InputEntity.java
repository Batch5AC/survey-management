package com.survey.inputservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_table")
public class InputEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "input_id")
	private int inputid;

	@Column(name = "user_id")
	private int userid;

	@Column(name = "question1")
	private int question1;
	@Column(name = "question2")
	private int question2;
	@Column(name = "question3")
	private int question3;
	@Column(name = "question4")
	private int question4;
	@Column(name = "question5")
	private int question5;
	@Column(name = "question6")
	private int question6;

	public InputEntity() {
		super();

	}

	public InputEntity(int inputid, int userid, int question1, int question2, int question3, int question4,
			int question5, int question6) {
		super();
		this.inputid = inputid;
		this.userid = userid;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
	}

	@Override
	public String toString() {
		return "InputEntity [inputid=" + inputid + ", userid=" + userid + ", question1=" + question1 + ", question2="
				+ question2 + ", question3=" + question3 + ", question4=" + question4 + ", question5=" + question5
				+ ", question6=" + question6 + "]";
	}

	public int getInputid() {
		return inputid;
	}

	public void setInputid(int inputid) {
		this.inputid = inputid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getQuestion1() {
		return question1;
	}

	public void setQuestion1(int question1) {
		this.question1 = question1;
	}

	public int getQuestion2() {
		return question2;
	}

	public void setQuestion2(int question2) {
		this.question2 = question2;
	}

	public int getQuestion3() {
		return question3;
	}

	public void setQuestion3(int question3) {
		this.question3 = question3;
	}

	public int getQuestion4() {
		return question4;
	}

	public void setQuestion4(int question4) {
		this.question4 = question4;
	}

	public int getQuestion5() {
		return question5;
	}

	public void setQuestion5(int question5) {
		this.question5 = question5;
	}

	public int getQuestion6() {
		return question6;
	}

	public void setQuestion6(int question6) {
		this.question6 = question6;
	}
}