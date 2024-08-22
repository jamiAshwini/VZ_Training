import java.awt.*;
import javax.swing.*;
class DemoJavax{
	public static void main(String args[]){
	JFrame f=new JFrame("Notepad");
	f.setVisible(true);
	JTextArea t=new JTextArea();
	f.setSize(500,500);
	f.add(t);
	}
}