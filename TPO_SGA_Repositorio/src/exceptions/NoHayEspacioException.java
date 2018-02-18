package exceptions;

public class NoHayEspacioException extends Exception {

	private static final long serialVersionUID = -559269674580037134L;

	public NoHayEspacioException(String mensaje){
		super(mensaje);
	}
}
