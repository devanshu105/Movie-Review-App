package com.dao;

public class Status {
	private boolean queryStatus;

	public boolean isQueryStatus() {
		return queryStatus;
	}

	public void setQueryStatus(boolean queryStatus) {
		this.queryStatus = queryStatus;
	}

	public Status(boolean queryStatus) {
		this.queryStatus = queryStatus;
	}

	@Override
	public String toString() {
		return "Status [queryStatus=" + queryStatus + "]";
	}
	
}
