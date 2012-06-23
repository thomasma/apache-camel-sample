package com.aver.domain;

import java.io.Serializable;

public class Rebate implements Serializable {
	private String rebateDesc;

	public Rebate() {
	}

	public Rebate(String rebateDesc) {
		this.rebateDesc = rebateDesc;
	}

	public String getRebateDesc() {
		return rebateDesc;
	}

	public void setRebateDesc(String rebateDesc) {
		this.rebateDesc = rebateDesc;
	}

	public String toString() {
		return rebateDesc;
	}
}
