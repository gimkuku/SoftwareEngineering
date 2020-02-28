import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Display extends JFrame  implements ActionListener, TextListener {
	JPanel menu = new JPanel();
	JPanel p = new JPanel();
	JButton displayB = new JButton("Display");
	JButton newB = new JButton("New");
	JButton removeB = new JButton("Remove");
	AddressBook ab = new AddressBook();
	AddressEntry entry = new AddressEntry(null, null, null, null, null, null, null, 0);

	String s = null;
	
Display(){
	this.setSize(300,300);
	this.add(menu,BorderLayout.NORTH);
	displayB.setLayout(new FlowLayout());
		menu.add(displayB);
		displayB.addActionListener(this);
		menu.add(newB);
		newB.addActionListener(this);
		menu.add(removeB);
		removeB.addActionListener(this);
		this.add(p,BorderLayout.CENTER);
		p.setSize(200,300);
		this.setVisible(true);
	}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getActionCommand() =="displayB") {
		System.out.println("displayB");
	AddressBook.list();

	}
	else if (e.getActionCommand() == "newB") {
		System.out.println("newB");
	AddressBook.add();	
	}
	else if (e.getActionCommand() == "removeB") {
		System.out.println("removeB");
	AddressBook.removeName(s);
	}
}

@Override
public void textValueChanged(TextEvent e) {
	// TODO Auto-generated method stub
	
}

}
