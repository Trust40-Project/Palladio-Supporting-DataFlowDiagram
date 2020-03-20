package diagram.editor.sirius.util.naming;

public class NumberedSuffixes implements NamingScheme {

	private int index = 0;

	public NumberedSuffixes(int base) {
		this.index = base;
	}

	public NumberedSuffixes() {

	}

	@Override
	public String makeSuffix(String name) {

		return name + "." + this.index++;
	}

}