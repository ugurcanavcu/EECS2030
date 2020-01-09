
public class DisjoinAll extends ExpressionCollector {

	public DisjoinAll() {
		super();
	}

	void evaluate() {
		if (getExpressions().length == 0) {
			val = false;
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
					same = false;
				} else {
					val = false;
				}
			}
		}

	}
}
