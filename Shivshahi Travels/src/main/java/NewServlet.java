

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

public class NewServlet {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewServlet window = new NewServlet();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewServlet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 39, 976, 63);
		frame.getContentPane().add(panel);
		
		JLabel lblTravellingTicketingSystem = new JLabel("Travelling Ticketing System");
		lblTravellingTicketingSystem.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblTravellingTicketingSystem);
		
		JLabel lblNewLabel = new JLabel("Ticket Type:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(20, 113, 244, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rEconomy = new JRadioButton("Economy");
		buttonGroup.add(rEconomy);
		rEconomy.setFont(new Font("Tahoma", Font.BOLD, 15));
		rEconomy.setBounds(10, 223, 109, 23);
		frame.getContentPane().add(rEconomy);
		
		JRadioButton rStandard = new JRadioButton("Standard");
		buttonGroup.add(rStandard);
		rStandard.setFont(new Font("Tahoma", Font.BOLD, 15));
		rStandard.setBounds(10, 185, 109, 23);
		frame.getContentPane().add(rStandard);
		
		JRadioButton rSingleTicket = new JRadioButton("Single Ticket");
		buttonGroup_1.add(rSingleTicket);
		rSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rSingleTicket.setBounds(180, 170, 151, 23);
		frame.getContentPane().add(rSingleTicket);
		
		JRadioButton rReturnTicket = new JRadioButton("Return Ticket");
		buttonGroup_1.add(rReturnTicket);
		rReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rReturnTicket.setBounds(180, 196, 151, 23);
		frame.getContentPane().add(rReturnTicket);
		
		JRadioButton rAdult = new JRadioButton("Adult");
		buttonGroup_2.add(rAdult);
		rAdult.setFont(new Font("Tahoma", Font.BOLD, 15));
		rAdult.setBounds(379, 170, 109, 23);
		frame.getContentPane().add(rAdult);
		
		JRadioButton rChild = new JRadioButton("Child");
		buttonGroup_2.add(rChild);
		rChild.setFont(new Font("Tahoma", Font.BOLD, 15));
		rChild.setBounds(379, 198, 109, 23);
		frame.getContentPane().add(rChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Gate way of India", "Haji Ali Dargah", "Kanheri Caves", "Marine Drive"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox.setBounds(190, 228, 254, 29);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 268, 450, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 163, 450, 2);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tax");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 300, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(29, 348, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(29, 392, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setBounds(129, 299, 99, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 15));
		t2.setColumns(10);
		t2.setBounds(129, 347, 99, 20);
		frame.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.BOLD, 15));
		t3.setColumns(10);
		t3.setBounds(129, 391, 99, 20);
		frame.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax = 19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 43.23;
				double MilesK30 = 55.98;
				double MilesK25 = 50.23;
				double totalCost, eco = 19.50, fclass = 5.60;
				//Standard class...
				
				//for gate way of india 
				
				if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK8 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * (MilesK8 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK8 + totalCost) * 2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK8 + totalCost - 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * (MilesK8 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK8 + totalCost) * 2)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
				
				//for Haji Ali Dargah
				
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * MilesK20)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK20);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK20 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * (MilesK8 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK8 + totalCost) * 2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * MilesK20)/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK20);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK20 + totalCost - 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * (MilesK8 * 2))/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK8 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
					//for Kanheri Caves
				
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * MilesK30)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK30);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK30 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * (MilesK8 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK8 + totalCost) * 2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * MilesK30)/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK30);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK30 + totalCost - 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * (MilesK8 * 2))/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK8 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK8 + totalCost) * 2)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
					//for Marine Drive
				
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * MilesK25)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK25);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK25 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * (MilesK25 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK25 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK8 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rStandard.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * MilesK25)/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK25);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK25 + totalCost - 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rStandard.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * (MilesK25 * 2))/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK25 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK25 + totalCost) * 2) - 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("STD");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
				
				//for economy class...
				
				//for gate way of india 
				
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * (MilesK12 + eco))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 + eco);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK12 + eco + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * (MilesK12 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost) * 2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * (MilesK12 + eco))/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 + eco);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + eco + totalCost) - 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Gate way of India"))
				{
					totalCost = (tax * (MilesK12 * 2))/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK12 + totalCost) * 2)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
				
				//for Haji Ali Dargah
				
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * MilesK12)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK12 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * (MilesK12 * 2))/100;
					String sTax = String.format("%.2f", totalCost * 2);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost)* 2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * MilesK12)/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost)- 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Haji Ali Dargah"))
				{
					totalCost = (tax * (MilesK12 * 2))/100;
					String sTax = String.format("%.2f", totalCost * 2);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 - 18);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK12 + totalCost)* 2)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
					//for Kanheri Caves
				
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * MilesK12)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK12 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * (MilesK12 *2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost)* 2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * MilesK12 )/100;
					String sTax = String.format("%.2f", totalCost - 18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Kanheri Caves"))
				{
					totalCost = (tax * (MilesK12 * 2))/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12 * 2);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK8 + totalCost)* 2)- 18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
					//for Marine Drive
				
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * MilesK12)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", MilesK12 + totalCost);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rAdult.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * (MilesK12)* 2)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost)*2);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("ONE");
					t7.setText("NIL");
				}
				else if ((rEconomy.isSelected())&&(rSingleTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * MilesK12)/100;
					String sTax = String.format("%.2f", totalCost-18);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12);
					t2.setText(subTotal);
					String Total = String.format("%.2f", (MilesK12 + totalCost)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("ONE WAY");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				else if ((rEconomy.isSelected())&&(rReturnTicket.isSelected())&&(rChild.isSelected())&& comboBox.getSelectedItem().equals("Marine Drive"))
				{
					totalCost = (tax * (MilesK12)*2)/100;
					String sTax = String.format("%.2f", totalCost);
					t1.setText(sTax);
					String subTotal = String.format("%.2f", MilesK12- 18);
					t2.setText(subTotal);
					String Total = String.format("%.2f", ((MilesK12 + totalCost)*2)-18);
					t3.setText(Total);
					t13.setText(Total);
					t4.setText("ECO");
					t5.setText("Return");
					t6.setText("NIL");
					t7.setText("ONE");
				}
				
				
				
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//========Time======
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				t11.setText(tTime.format(timer.getTime()));
				
				//========Date======
				SimpleDateFormat tdate = new SimpleDateFormat("dd:MM:yyyy");
				t10.setText(tdate.format(timer.getTime()));
				
				t8.setText("Bandra bus depo");
				t9.setText((String) comboBox.getSelectedItem()+ " *");
				
				//========Random number generator======
				int num1;
				String q1 = "";
				num1 = 1325 + (int) (Math.random()*4238);
				q1 += num1 + 1325;
				t12.setText(q1);
				
				//===============================
				t14.setText("ANY");
				
			}
		});
		btnNewButton.setToolTipText("Total cost of system");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(10, 524, 109, 29);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(10, 470, 450, 5);
		frame.getContentPane().add(separator_1_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
			t7.setText(null);
			t8.setText(null);
			t9.setText(null);
			t10.setText(null);
			t11.setText(null);
			t12.setText(null);
			t13.setText(null);
			t14.setText(null);
			rStandard.setSelected(false);
			rEconomy.setSelected(false);
			rSingleTicket.setSelected(false);
			rReturnTicket.setSelected(false);
			rAdult.setSelected(false);
			rChild.setSelected(false);
			comboBox.setSelectedItem("Destination");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(167, 524, 109, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Ticketing Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(312, 524, 109, 29);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_2_1.setBounds(494, 143, 2, 410);
		frame.getContentPane().add(separator_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Class");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(531, 143, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Ticket");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(659, 143, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Adult");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_3.setBounds(763, 143, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Child");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_4.setBounds(883, 143, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		t4 = new JTextField();
		t4.setFont(new Font("Tahoma", Font.BOLD, 15));
		t4.setColumns(10);
		t4.setBounds(515, 199, 99, 20);
		frame.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma", Font.BOLD, 15));
		t5.setColumns(10);
		t5.setBounds(642, 199, 99, 20);
		frame.getContentPane().add(t5);
		
		t6 = new JTextField();
		t6.setFont(new Font("Tahoma", Font.BOLD, 15));
		t6.setColumns(10);
		t6.setBounds(757, 199, 99, 20);
		frame.getContentPane().add(t6);
		
		t7 = new JTextField();
		t7.setFont(new Font("Tahoma", Font.BOLD, 15));
		t7.setColumns(10);
		t7.setBounds(883, 199, 99, 20);
		frame.getContentPane().add(t7);
		
		JSeparator separator_1_2_1_1 = new JSeparator();
		separator_1_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_2_1_1.setBounds(787, 238, 2, 319);
		frame.getContentPane().add(separator_1_2_1_1);
		
		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(506, 225, 512, 2);
		frame.getContentPane().add(separator_1_2_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("From");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(531, 286, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("To");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_2.setBounds(531, 350, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Date");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_3.setBounds(531, 416, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Time");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_4.setBounds(531, 484, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Ticket No:");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_5.setBounds(839, 288, 114, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("Price");
		lblNewLabel_1_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_6.setBounds(839, 375, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("Route");
		lblNewLabel_1_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_7.setBounds(839, 446, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_7);
		
		t8 = new JTextField();
		t8.setFont(new Font("Tahoma", Font.BOLD, 15));
		t8.setColumns(10);
		t8.setBounds(611, 285, 130, 20);
		frame.getContentPane().add(t8);
		
		t9 = new JTextField();
		t9.setFont(new Font("Tahoma", Font.BOLD, 15));
		t9.setColumns(10);
		t9.setBounds(597, 347, 165, 20);
		frame.getContentPane().add(t9);
		
		t10 = new JTextField();
		t10.setFont(new Font("Tahoma", Font.BOLD, 15));
		t10.setColumns(10);
		t10.setBounds(611, 415, 130, 20);
		frame.getContentPane().add(t10);
		
		t11 = new JTextField();
		t11.setFont(new Font("Tahoma", Font.BOLD, 15));
		t11.setColumns(10);
		t11.setBounds(611, 483, 130, 20);
		frame.getContentPane().add(t11);
		
		t12 = new JTextField();
		t12.setFont(new Font("Tahoma", Font.BOLD, 15));
		t12.setColumns(10);
		t12.setBounds(839, 328, 130, 20);
		frame.getContentPane().add(t12);
		
		t13 = new JTextField();
		t13.setFont(new Font("Tahoma", Font.BOLD, 15));
		t13.setColumns(10);
		t13.setBounds(839, 415, 130, 20);
		frame.getContentPane().add(t13);
		
		t14 = new JTextField();
		t14.setFont(new Font("Tahoma", Font.BOLD, 15));
		t14.setColumns(10);
		t14.setBounds(839, 483, 130, 20);
		frame.getContentPane().add(t14);
	}



/**
 * Servlet implementation class NewServlet
 */
//@WebServlet("/NewServlet")

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        
        String cls = request.getParameter("t4");  
        String Ticket = request.getParameter("t5");  
        String Adult = request.getParameter("t6");
        String Child = request.getParameter("t7");  
        String Total_amount = request.getParameter("t3");  
        String Ticket_Date = request.getParameter("t10");
        
        try {
      	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BatchB","root","omkar@123");
			System.out.println("Connection created");
			PreparedStatement ps = con.prepareStatement("insert into myticket values(?,?,?,?,?,?);");
			ps.setString(1, cls);
			ps.setString(2, Ticket);
			ps.setString(3, Adult);
			ps.setString(4, Child);
			ps.setString(5, Total_amount);
			ps.setString(6, Ticket_Date);
	
			
			int i = ps.executeUpdate();  
          if(i>0) {
          	response.sendRedirect("success.jsp");
          }
			}
        catch (Exception e1) {
				e1.printStackTrace();
			}
        out.close();  
	}

}
