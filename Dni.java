import java.util.regex.*;

public class Dni {

	private static final Pattern pat = Pattern.compile("[0-9]{8}[A-Z]");
	private static final String dniLletres = "TRWAGMYFPDXBNJZSQVHLCKE";

	public boolean checkDni(String dni) {
		Matcher mat = pat.matcher(dni);
		if (dni.length() != 9) {
			return false;
		}
		return mat.matches() && dni.charAt(8) == dniLletres.charAt(Integer.parseInt(dni.substring(0, 8)) % 23);
	}

}
