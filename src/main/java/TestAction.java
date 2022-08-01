
public class TestAction {
	String message;
	String email,pass;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String execute() {
		System.out.println("execute called -----------------");
		System.out.println("User    : "+email+"    pass : "+pass);
		if(email.equalsIgnoreCase("user")&& pass.equalsIgnoreCase("pass")) {
			message="Success Message";
			return "Success";
		}
		message="Error Message";
		return "Error";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
