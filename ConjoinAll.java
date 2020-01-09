
public class ConjoinAll extends ExpressionCollector {

	public ConjoinAll() {
		super();
	}

	void evaluate() {
		if (getExpressions().length == 0) {
			val = true;
		} else if (getExpressions().length == 1) {
			ex[0].evaluate();
			if ((Boolean) ex[0].getValue() == true) {
				val = true;
			} else {
				val = false;
			}
		} else {
			boolean same = true;
			for (int i = 0; i < noe && same; i++) {
				ex[i].evaluate();
				if ((Boolean) ex[i].getValue() == true) {
					val = true;
				} else {
					val = false;
					same = false;
				}
			}
		}

	}
}
