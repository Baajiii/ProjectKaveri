package com.kaveri.response;

public class CustomerResponse {

	
	private boolean status;
	private String message;
	private String Name;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "CustomerResponse [status=" + status + ", message=" + message + ", Name=" + Name + "]";
	}
	 
	 
}
