package FormThiep;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
@SuppressWarnings("serial")
public class ManagerThuoc extends JFrame{
	    

	       PreparedStatement preStatement,updatePreStmt;
	      JLabel title, idLabel, nameLabel, genderLabel, addressLabel, contactLabel,diachiLabel,yeucauLabel;
	      JTextField idField, nameField, mabt, addressField, contactField,diachiFiled,yeucauFiled;
	      JButton registerButton, exitButton,updateButton,deleteButton,resetButton,
	              refresh;
	      JRadioButton male, female;
	      ButtonGroup bg;
	      JPanel panel;
	      JTable table;

	      DefaultTableModel model;

	      JScrollPane scrollpane;
	      public ManagerThuoc() {
	           // TODO Auto-generated constructor stub
	           super("QUAN LY THUOC");
	            setSize(1000, 800);
	            setLayout(null);
	            // Calling connect method, this will connect us to database
	            // Defining Labels 
	            title = new JLabel("Quan Ly Buu Thiep");
	            title.setBounds(60, 7, 200, 30);
	            idLabel = new JLabel("Ma Khach Hang");
	            idLabel.setBounds(30, 50, 60, 30);
	            nameLabel = new JLabel("Ten Khach Hang"); 
	            nameLabel.setBounds(30, 85, 60, 30);
	            genderLabel = new JLabel("Ma Buu Thiep"); 
	            genderLabel.setBounds(30, 120, 60, 30);
	            addressLabel = new JLabel("So Dien Thoai"); 
	            addressLabel.setBounds(30, 155, 60, 30); 
	            contactLabel = new JLabel("Gmail"); 
	            contactLabel.setBounds(30, 190, 60, 30);
	            diachiLabel = new JLabel("Dia Chi"); 
	            diachiLabel.setBounds(30, 220, 60, 30);
	            yeucauLabel = new JLabel("Yeu Cau"); 
	            yeucauLabel.setBounds(30, 250, 60, 30);

	            // Defining ID field
	            idField = new JTextField(); 
	            idField.setBounds(95, 50, 130, 30);
	            

	            // Defining Name field
	            nameField = new JTextField(); 
	            nameField.setBounds(95, 85, 130, 30);
	            
	            mabt = new JTextField(); 
	            mabt.setBounds(95, 120, 130, 30);
	            
	            addressField = new JTextField(); 
	            addressField.setBounds(95, 155, 130, 30);
	            
	            contactField = new JTextField(); 
	            contactField.setBounds(95, 190, 130, 30);
	            
	            diachiFiled = new JTextField(); 
	            diachiFiled.setBounds(95, 220, 130, 30);
	            
	            yeucauFiled = new JTextField(); 
	            yeucauFiled.setBounds(95, 250, 130, 30);

	            // Defining Gender Buttons
	            //male = new JRadioButton("Hop");
	            //male.setBounds(95, 120, 60, 30);

	           // female = new JRadioButton("Vy");
	            //female.setBounds(155, 120, 70, 30);            

	           // bg = new ButtonGroup(); 
	           // bg.add(male); 
	           // bg.add(female); 
	            //addressField = new JTextField(); 
	            //addressField.setBounds(95, 155, 130, 30);
	           // contactField = new JTextField(); 
	            //contactField.setBounds(95, 190, 130, 30);
	 
	            // fixing all Label,TextField,RadioButton
	            add(title);
	            add(idLabel);
	            add(nameLabel);
	            add(genderLabel);
	            add(addressLabel);
	            add(contactLabel);
	            add(diachiLabel);
	            add(yeucauLabel);
	            add(idField);
	            add(nameField);
	            add(mabt);
	           //add(genderField);
	           add(addressField);
	           add(contactField);
	           add(diachiFiled);
	           add(yeucauFiled);
	           
	            //add(male);
	           // add(female);
	            //add(addressField);
	          //  add(contactField);
	            

	            // Defining Exit Button
	            exitButton = new JButton("Thoat"); 
	            exitButton.setBounds(25, 280, 80, 25);            

	            // Defining Register Button
	            registerButton = new JButton("Them");
	            registerButton.setBounds(110, 280, 100, 25);

	            // Defining Update Button
	            updateButton = new JButton("Cap Nhat");
	            updateButton.setBounds(110, 310, 100, 25);
	            updateButton.setEnabled(false);

	            // Defining Delete Button
	            deleteButton = new JButton("Xoa");
	            deleteButton.setBounds(25, 310, 80, 25);
	            deleteButton.setEnabled(false);

	            // Defining Reset Button
	            resetButton = new JButton("Reset");
	            resetButton.setBounds(60, 340, 100, 25);
	            resetButton.setEnabled(false); 

	            // fixing all Buttons
	            add(exitButton);
	            add(registerButton);
	            add(updateButton);
	            add(deleteButton);
	            add(resetButton);    

	            // Defining Panel
	            panel = new JPanel();
	            panel.setLayout(new GridLayout());
	            panel.setBounds(250, 20, 480, 330);
	            panel.setBorder(BorderFactory.createDashedBorder(Color.blue));
	            add(panel);

	            // Defining Refresh Button
	            refresh = new JButton("Refresh Table");
	            refresh.setBounds(350, 350, 270, 15);
	            add(refresh);

	            //Defining Model for table
	            model = new DefaultTableModel();

	            //Adding object of DefaultTableModel into JTable
	            table = new JTable(model);

	            //Fixing Columns move
	            table.getTableHeader().setReorderingAllowed(false);

	            // Defining Column Names on model
	            model.addColumn("Ma Khach Hang");
	            model.addColumn("Ten Khach Hang");
	            model.addColumn("Ma Buu Thiep");
	            model.addColumn("So Dien Thoai");
	            model.addColumn("Gmail");
	            model.addColumn("Dia Chi");
	            model.addColumn("Yeu Cau");
	 
	            // Enable Scrolling on table
	           scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	                                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	            panel.add(scrollpane);

	            //Displaying Frame in Center of the Screen
	            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	            this.setLocation(dim.width/2-this.getSize().width/2,
	                             dim.height/2-this.getSize().height/2);
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            setResizable(false);
	            setVisible(true);
	      }

	      // Connection with Database
	
	}