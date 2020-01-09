
public class AddAll extends ExpressionCollector {

	public AddAll() {

		super();

	}

	void evaluate() {

		int result = 0;
		for (int i = 0; i < noe; i++) {

			result += (Integer) ex[i].getValue();
		}
		val = result;
	}

}
