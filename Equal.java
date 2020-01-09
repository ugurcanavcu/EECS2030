
public class Equal extends Expression {

	public Equal(int left, int right) {
		super(left, right);
		if (this.left == this.right) {

			value = true;
		} else {

			value = false;
		}
	}

}
