import figures.rectangle.Rectangle;

public class Test {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3, 3);
		Rectangle r3 = new Rectangle(-1, -1, 1, 1);

		r1.move(4, 4);
		int[] coords = r1.rect_print();
		System.out.println("\t\tr1");
		System.out.println("x1: " + coords[0] + " ; y1: " + coords[1] + " ; x2: " + coords[2] + " ; y2: " + coords[3]);
		r2.move(-4, -4);
		coords = r2.rect_print();
		System.out.println("\t\tr2");
		System.out.println("x1: " + coords[0] + " ; y1: " + coords[1] + " ; x2: " + coords[2] + " ; y2: " + coords[3]);
		r3.move(-2, 2);
		coords = r3.rect_print();
		System.out.println("\t\tr3");
		System.out.println("x1: " + coords[0] + " ; y1: " + coords[1] + " ; x2: " + coords[2] + " ; y2: " + coords[3]);

		Rectangle r4 = r3.union(r2);
		coords = r4.rect_print();
		System.out.println("\t\tr4");
		System.out.println("x1: " + coords[0] + " ; y1: " + coords[1] + " ; x2: " + coords[2] + " ; y2: " + coords[3]);
	}
}