

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.table.*;
public class SearchDisplay extends JDialog // ??µÚ
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox jcbCategories; // category™’∫í ?¶©• ¨Y
	private JPanel panel;
	private JTextField jtfWord; //??? ??∫Â ?°⁄ ™v±E
	private JButton jbSearch; // ?? ?ºq
	private DefaultTableModel tableModel; //??ß… ??
	private AddressBook mainFrame; //??∫Â ?? ?°M¨Y
	static HashMap<String,AddressEntry>map = new HashMap<String,AddressEntry>();
	private JLabel lab = new JLabel("Search lastname");
	private class SearchControl implements ActionListener //Button Controler
	{
		public void actionPerformed(ActionEvent ae){
			String str = jtfWord.getText();
			String[] arr = new String[8];
			/*firstName, lastName, street, city, state, phone, email zip*/
			for(String mapkey : map.keySet()){
				//if( mainFrame.find(str))
				arr[0] = map.get(mapkey).getFirstName();
				arr[1] = map.get(mapkey).getLastName();
				arr[2] = map.get(mapkey).getStreet();
				arr[3] = map.get(mapkey).getCity();
				arr[4] = map.get(mapkey).getState();
				arr[5] = map.get(mapkey).getPhone();
				arr[6] = map.get(mapkey).getEmail();
				arr[7] = map.get(mapkey).getZip();
				tableModel.addRow(arr); //??ù— ??∫Â ??ß…ØÖ ∑Q°⁄
			}
			setVisible(false);//µÚ ú†óÂ
		} 
	}
	public SearchDisplay(AddressBook mainFrmPane){
		setTitle("Search"); //title
		setBounds(100,100,400,80);
		this.mainFrame = mainFrame;

		panel = new JPanel(new GridLayout(1,3));
		panel.setSize(new Dimension(350,80));
		panel.add(lab);
		jtfWord = new JTextField();
		jbSearch = new JButton("Search");
		panel.add(jtfWord);
		panel.add(jbSearch);
		this.getContentPane().add(panel,"Center");
		SearchControl listener = new SearchControl();
		jbSearch.addActionListener(listener);
		this.setVisible(true);

	}
} 