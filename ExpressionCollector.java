import java.util.ArrayList;

/*
 * Your Tasks:
 * 1. Read the problem description and inheritance hierarchy diagram in the instructions.
 * 2. Add the necessary subclasses and implement the required methods.
 * 3. Study tests in TestExpressions.java to understand what's required to help your implementation. 
 */

public class ExpressionCollector {

	/*
	 * Your Task: Declare attribute(s) to store the list of Expression objects of
	 * this collector.
	 */

	Expression ex[];
	int noe;
	Object val;

	/**
	 * Initialize an expression collector which stores an empty collection of
	 * expressions.
	 */
	ExpressionCollector() {
		this.ex = new Expression[20];
		this.noe = 0;

	}

	/**
	 * Add a new expression.
	 * 
	 * @param e an expression
	 */
	void addExpression(Expression e) {
		ex[noe] = e;
		e.evaluate();
		noe++;
	}

	/**
	 * Add a new expression.
	 * 
	 * @param left  integer value of the left operand
	 * @param op    operator (i.e., "+", "-", "*", ">", "<", "==")
	 * @param right integer value of the right operand
	 */
	void addExpression(int left, String op, int right) {
		/* Your Task */
		// Hint: Depending on the operator given (e.g., +), create the corresponding
		// expression object
		// (e.g., Addition) and add it to the collector.

		if (op == "+") {
			Expression e = new Addition(left, right);
			e.evaluate();
			ex[noe] = e;
			noe++;
		} else if (op == "-") {
			Expression e = new Subtraction(left, right);
			e.evaluate();
			ex[noe] = e;
			noe++;
		} else if (op == "*") {
			Expression e = new Multiplication(left, right);
			e.evaluate();
			ex[noe] = e;
			noe++;
		} else if (op == ">") {
			Expression e = new GreaterThan(left, right);
			e.evaluate();
			ex[noe] = e;
			noe++;
		} else if (op == "<") {
			Expression e = new LessThan(left, right);
			e.evaluate();
			ex[noe] = e;
			noe++;
		} else if (op == "==") {
			Expression e = new Equal(left, right);
			e.evaluate();
			ex[noe] = e;
			noe++;
		}
	}

	/**
	 * If this collector is AddAll or TimesAll, then all stored expressions must be
	 * integer expressions (i.e., Addition, Subtraction, Multiplication). If this
	 * collection is ConjoinAll or DisjoinAll, then all stored expressions must be
	 * boolean expressions (i.e., GreaterThan, LessThan, Equal)
	 * 
	 * @return whether it is possible to evaluate the stored collection of
	 *         expressions.
	 */
	boolean isTypeCorrect() {
		boolean pos = true;
		for (int i = 0; i < noe - 1 && pos; i++) {
			ex[i].evaluate();
			ex[i + 1].evaluate();
			pos = (ex[i].getValue().getClass() == ex[i + 1].getValue().getClass());
		}
		return pos;
	}

	/**
	 * Given that this expression collector is type correct (see `isTypeCorrect()`),
	 * evaluate it. Store the evaluation result so that it can be returned by
	 * `getValue()`.
	 */
	void evaluate() {
		/* Your Task */
		// Hint: Leave this empty and override it in all subclasses such as AddAll and
		// ConjoinAll.
	}

	/**
	 * Get the result of the latest evaluation (i.e., after the latest call to
	 * `evaluate()`).
	 * 
	 * @return the last evaluation result.
	 */
	Object getValue() {
		/* Your Task */
		return val;
	}

	/**
	 * Obtain the list of stored expressions.
	 * 
	 * @return all stored expressions as an array
	 */
	Expression[] getExpressions() {
		/* Your Task */
		Expression[] newEx = new Expression[noe];
		for (int i = 0; i < noe; i++) {
			newEx[i] = ex[i];
		}
		return newEx;
	}

	/**
	 * Override the equals method. Two expression collectors are equals if: 1) They
	 * are both type correct 2) Their evaluation results are identical
	 * 
	 * @return whether or not the two expression collectors are equal.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (this == null || this.getClass() != obj.getClass()) {
			return false;
		}
		ExpressionCollector other = (ExpressionCollector) obj;
		this.evaluate();
		other.evaluate();
		return this.isTypeCorrect() && other.isTypeCorrect() && this.getValue() == other.getValue();

	}
}
