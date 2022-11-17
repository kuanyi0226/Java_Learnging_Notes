import javax.swing.JOptionPane; //先import

public class GUI {

	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("Enter ur name."); //創造一個輸入框
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
	}

}
