
public class Subtraction extends Expression {

	public Subtraction(int left, int right) {
		super(left, right);
		value = this.left - this.right;
	}

}
