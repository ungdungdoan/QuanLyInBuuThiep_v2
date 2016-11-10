package FormThiep;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.ParseConversionEvent;

import org.apache.axis2.AxisFault;

import managersql.ManagerSQLExceptionException;
import managersql.ManagerStub;
import managersql.ManagerStub.AddThiep;
import managersql.ManagerStub.DeleteThiep;
import managersql.ManagerStub.UpdateThiep;

import java.awt.event.*;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.List;
@SuppressWarnings("serial")
public class Form_main extends ManagerThuoc{
      String gender = "";
      ResultSet rst,rstLast;
      Object[][] data;
      int serialNo; 
      String SHOW = "Show";
      ManagerThuoc formGUIObject;

      // Defining Constructor
      Form_main(){
    	  idField.enable(true);
            nameField.addKeyListener(new KeyAdapter() {
                  public void keyTyped(KeyEvent e) {
                  if(nameField.getText().length()>50)
                        e.consume();
                  }
            });
            /*male.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                        gender = "Male";
                  }
            });
            female.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                        gender = "Female";
                  }
            });*/
            addressField.addKeyListener(new KeyAdapter() {
                  public void keyTyped(KeyEvent e) {
                  if(addressField.getText().length()>90)
                        e.consume();
                  }
            });
            contactField.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                if(contactField.getText().length()>90)
                      e.consume();
                }
          });
            diachiFiled.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                if(diachiFiled.getText().length()>90)
                      e.consume();
                }
          });
            yeucauFiled.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                if(yeucauFiled.getText().length()>90)
                      e.consume();
                }
          });
            
            exitButton.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {
                        try{
                           
                              System.exit(0);
                        }catch(Exception ex){
                               System.out.println(ex.getMessage());
                        }
                  }
            });
           registerButton.addActionListener(new AbstractAction(SHOW){
                   public void actionPerformed(ActionEvent ae){
                         try{
                            if (ae.getSource() == registerButton) {

                                if (idField.getText().equals(""))
                                   JOptionPane.showMessageDialog(idField, 
                                               "Dien Ma khach hang");
                                
                                else if (nameField.getText().equals(""))
                                   JOptionPane.showMessageDialog(nameField, 
                                               "Dien Ten khach hang");
                                else if(mabt.getText().equals(""))
                                   JOptionPane.showMessageDialog(mabt, 
                                               "Dien ma buu thiep");
                                
                                
                                else if(contactField.getText().equals(""))
                                   JOptionPane.showMessageDialog(idField, "Dien So Luong Thuoc");
                  
                                else {
                                	ManagerStub mn = new ManagerStub();
                                	AddThiep adt = new AddThiep();
                                	adt.setMakh(Integer.parseInt(idField.getText()));
                                	adt.setTenkh(nameField.getText());
                                	adt.setMabt(Integer.parseInt(mabt.getText()));
                                	adt.setSodienthoai(addressField.getText());
                                	adt.setGmail(contactField.getText());
                                	adt.setDiachi(diachiFiled.getText());
                                	adt.setYeucau(yeucauFiled.getText());
                                	
                                	
                                	mn.addThiep(adt);
                                	refreshTable();
                                    int i=1;                            
                                	if(i==1){
                                  JOptionPane.showMessageDialog(panel, 
                                               "Them Thanh Cong");
                                 }
 
                                 // showing last row 
                                //rstLast = stmt.executeQuery("select *from regForm");
                               
 
                                 // fields are blank
                                 blankFields();
                               }
                              }
                       }catch(Exception ex){
                              System.out.println(ex.getMessage()); 
                       }
                   }
            });

            updateButton.addActionListener(new AbstractAction(SHOW){
              public void actionPerformed(ActionEvent e){
            	  idField.enable(false);
            	 
                            int r = table.getSelectedRow();
                      
                            if(r>=0){
										try {
											ManagerStub	mn = new ManagerStub();
                                    	UpdateThiep udt = new UpdateThiep();
                                    	udt.setMakh(Integer.parseInt(idField.getText()));
                                    	udt.setTenkh(nameField.getText());
                                    	udt.setMabt(Integer.parseInt(mabt.getText()));
                                    	udt.setSodienthoai(addressField.getText());
                                    	udt.setGmail(contactField.getText());
                                    	udt.setDiachi(diachiFiled.getText());
                                    	udt.setYeucau(yeucauFiled.getText());

											mn.updateThiep(udt);
											refreshTable();
										} catch (AxisFault | ManagerSQLExceptionException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										} catch (RemoteException e1) {
											// TODO Auto-generated catch block
											System.out.println(e1);
											e1.printStackTrace();
										}
                                   int i=1;
                               }
                                 
                               
                             
                }}
              
          );
           
 
            //Registering Anonymous Listener Class
            deleteButton.addActionListener(new AbstractAction(SHOW){ 
              public void actionPerformed(ActionEvent e){
            	  idField.enable(false);
                  try{ 
                  //Getting Selected Row No
                  int r = table.getSelectedRow(); 
                  if(r>=0){ 
                        if (JOptionPane.showConfirmDialog(panel,
                            "Ban Co Muon Xoa Khong","WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                              String id = (String) table.getModel().getValueAt(r,0);
                              
                              // Executing MySQL Update Command
                              //int i = stmt.executeUpdate("delete from regForm where id="+id);
                              if(true){
                                  int idX = (Integer.parseInt(id));
                            	  	ManagerStub stub = new ManagerStub();
                            	  	System.out.println(id);
                            	  	DeleteThiep qq = new DeleteThiep();
                            	  	qq.setMakh(idX);
                            	  	stub.deleteThiep(qq);
                            	 
                                    // fields are blank
                                    blankFields();
                                    refreshTable();   
                                    registerButton.setEnabled(true);
                                    deleteButton.setEnabled(false);
                                    updateButton.setEnabled(false);
                                    refreshTable();  
                              }
                        }
                  }
                  }catch(Exception ex){
                         System.out.println(ex.getMessage());
                  }
              }
          });
 
           //Registering Anonymous Listener Class
            resetButton.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {
                        // calling method resetFields()
                        resetFields();
                        registerButton.setEnabled(true);
                        updateButton.setEnabled(false);
                        deleteButton.setEnabled(false);
                        resetButton.setEnabled(false);
                        refreshTable();
                  }
            });

            // Registering Anonymous Listener Class
            refresh.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                        //calling  refresh() method
                        refreshTable();
                  }
            });

            //Registering Anonymous Listener Class
            table.addMouseListener(new MouseListener(){
                  public void mouseClicked(MouseEvent arg0){ 
                        //Getting Selected Row No
                	  idField.enable(false);
                  int r = table.getSelectedRow();
                  if(r>=0){ 
                        deleteButton.setEnabled(true);
                        updateButton.setEnabled(true);
                        resetButton.setEnabled(true);
                        registerButton.setEnabled(false); 

                        //Fetching records from Table on Fields
                        idField.setText(""+table.getModel().getValueAt(r,0));
                        nameField.setText(""+table.getModel().getValueAt(r,1));
                        mabt.setText(""+table.getModel().getValueAt(r,2));                
                        addressField.setText(""+table.getModel().getValueAt(r,3));
                        contactField.setText(""+table.getModel().getValueAt(r,4));
                        diachiFiled.setText(""+table.getModel().getValueAt(r,5));
                        yeucauFiled.setText(""+table.getModel().getValueAt(r,6));
                  }
                  }

//                @Override
                  public void mouseReleased(MouseEvent arg0) {}
//                @Override
                  public void mousePressed(MouseEvent arg0) {}
//                @Override 
                  public void mouseExited(MouseEvent arg0) {}
//                @Override 
                  public void mouseEntered(MouseEvent arg0) {}
            });

            // Displaying rows into the Frame table
            addRows();
      }

      // addRows method
      private void addRows(){
            try{
            	ThiepManager tm = new ThiepManager();
            	List<Thiepsanpham> listThiep = tm.getAllThuoc();

            Object[] row = null;
       
            for (int i = 0; i < listThiep.size(); i++) {
                  String string = listThiep.get(i).getMakh()+","+listThiep.get(i).getTenkh()+","+listThiep.get(i).getMabt()+","+listThiep.get(i).getSodienthoai()+","+listThiep.get(i).getGmail()+","+listThiep.get(i).getDiachi()+","+listThiep.get(i).getYeucau()+",";
                  row = string.split(",");
                  // Adding records in table model 
                  model.addRow(row);
            }
            panel.revalidate();
            }catch(Exception ex){ System.out.println(ex.getMessage()); }
      }

      private void resetFields(){ 
    	  	idField.enable(true);
            //calling method blankfields() 
            blankFields();
      }
 
      // refresh method
      public void refreshTable(){
    	 
            // removing all the rows of the table
            DefaultTableModel dm = (DefaultTableModel)table.getModel();
            dm.getDataVector().removeAllElements();
            System.out.println("Refresh Table");

            //calling method addRows
            addRows();
      
      }
      private void blankFields(){
            // fields will be blank
            idField.setText("");
            nameField.setText("");
            mabt.setText("");
            addressField.setText("");
            contactField.setText("");
            diachiFiled.setText("");
            yeucauFiled.setText("");
            refreshTable();
      }

      // main() method
      public static void main(String[] args) {
            new Form_main();
            
      }     
}
 