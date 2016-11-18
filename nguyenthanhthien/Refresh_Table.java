 public void refreshTable(){
    	 
            // removing all the rows of the table
            DefaultTableModel dm = (DefaultTableModel)table.getModel();
            dm.getDataVector().removeAllElements();
            System.out.println("Refresh Table");

            //calling method addRows
            addRows();
      
      }