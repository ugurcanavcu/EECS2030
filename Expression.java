
/*
 * Your Tasks:
 * 1. Read the problem description and inheritance hierarchy diagram in the instructions.
 * 2. Add the necessary subclasses and implement the required methods.
 * 3. Study tests in TestExpressions.java to understand what's required to help your implementation. 
 */

public class Expression {

	int left;
	int right;
	int add;
	int sub;
	int mulp;

	/**
	 * Value of evaluation result. Dynamically, value may be an Integer or a
	 * Boolean.
	 */
	Object value;

	/**
	 * Initialize an expression.
	 * 
	 * @param left  left integer value
	 * @param right right integer value
	 */
	Expression(int left, int right) {
		this.left = left;
		this.right = right;
		value = this.left + this.right;
		value = this.left - this.right;
		value = this.left * this.right;
		if (this.left == this.right) {

			value = true;
		} else {

			value = false;
		}
		if (this.left > this.right) {

			value = true;
		} else {

			value = false;
		}
		if (this.left < this.right) {
			value = true;
		} else {

			value = false;
		}

	}

	/**
	 * After evaluation, obtain the evaluation result.
	 * 
	 * @return evaluation result of this expression
	 */
	Object getValue() {
		return value;
	}

	void evaluate() {
		/* Your Task */
		// Hint: Leave this empty and override it in all subclasses such as Addition,
		// GreaterThan.
	}
}
