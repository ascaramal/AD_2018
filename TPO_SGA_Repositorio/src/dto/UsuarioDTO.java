package dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = -1074783875381454179L;

	private String userName;
	private String userPassword;
	
	public UsuarioDTO() {}

	public UsuarioDTO(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [userName=" + userName + ", userPassword=" + userPassword + "]";
	}

	
}
