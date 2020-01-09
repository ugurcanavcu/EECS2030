
public class Addition extends Expression {

	public Addition(int left, int right) {
		super(left, right);
		value = this.left + this.right;

	}

}
