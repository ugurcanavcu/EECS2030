
public class Multiplication extends Expression {

	public Multiplication(int left, int right) {
		super(left, right);
		value = this.left * this.right;
	}

}
