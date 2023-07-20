package stackqueue;

public class InSufficientException extends RuntimeException{
	private String errmsg;

	public InSufficientException(String errmsg) {
		super();
		this.errmsg = errmsg;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	

}
