import com.techlabs.lsp.violation.Rectangle;
import com.techlabs.lsp.violation.Square;

public class TestShape {

	public static void main(String[] args) {
		shouldNotChangeHeightIfWidthIsModified(new Rectangle(100,10));
		shouldNotChangeHeightIfWidthIsModified(new Square(100));
	}

	public static void shouldNotChangeHeightIfWidthIsModified(Rectangle r) {
		int before = r.getHeight();
		r.setWidth(150);
		int after = r.getHeight();
		System.out.println(before == after);
		System.out.println(before);
		System.out.println(after);
	}
}
