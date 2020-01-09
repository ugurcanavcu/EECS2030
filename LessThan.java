
public class LessThan extends Expression {

	public LessThan(int left, int right) {
		super(left, right);
		if (this.left < this.right) {

			value = true;
		} else {

			value = false;
		}
	}

}
