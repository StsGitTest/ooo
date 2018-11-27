package com.ysd.ooo.entity;

public class Result {

	private boolean success;
	private Object message;
	private Object remark;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Object getRemark() {
		return remark;
	}

	public void setRemark(Object remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", message=" + message + ", remark=" + remark + "]";
	}

	public Result(boolean success, Object message, Object remark) {
		super();
		this.success = success;
		this.message = message;
		this.remark = remark;
	}

	public Result() {
		super();
	}

}
