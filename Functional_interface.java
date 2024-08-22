package Collections;
@FunctionalInterface
interface Inter1{
	void show(String msg);
	void disp();
}
public class Functional_interface {
	public void show(String msg) {
		System.out.println(msg);
	}
	public static void main(String args[]) {
		Functional_interface fd=new Functional_interface();
		fd.show("Hello Everyone, this is fi");
	}
}
