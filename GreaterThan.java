
public class GreaterThan extends Expression {

	public GreaterThan(int left, int right) {
		super(left, right);
		if (this.left > this.right) {

			value = true;
		} else {

			value = false;
		}
	}

}
