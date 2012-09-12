package zju.lzq.web;

import org.seasar.teeda.extension.annotation.validator.Email;
import org.seasar.teeda.extension.annotation.validator.Equal;
import org.seasar.teeda.extension.annotation.validator.Length;

public class RegisterPage {

	@Email
	private String email;

	@Length(minimum = 6)
	private String password;
	
	@Equal(targetId = "password")
	private String confirmPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void doRegister() {

	}

	public Class<?> initialize() {
		return null;
	}

	public Class<?> prerender() {
		return null;
	}

}
