
public class TimesAll extends ExpressionCollector {

	public TimesAll() {
		super();

	}

	void evaluate() {

		int result = 1;
		for (int i = 0; i < noe; i++) {
			result *= (Integer) ex[i].getValue();
		}
		val = result;
	}

}
