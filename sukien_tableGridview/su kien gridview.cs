 private void GridViewSPBT_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

            try {
                DataGridViewRow row = new DataGridViewRow();
                row = GridViewSPBT.Rows[e.RowIndex];
                txtmakh.Text = row.Cells[0].Value.ToString();
               
                txttenkh.Text = row.Cells[1].Value.ToString();
                txtngaysinh.Text = row.Cells[2].Value.ToString();
                txtphai.Text = row.Cells[3].Value.ToString();
                txtsdt.Text = row.Cells[4].Value.ToString();
                txtnsx.Text = row.Cells[5].Value.ToString();
                txtdiachi.Text = row.Cells[6].Value.ToString();
                txtyeucau.Text = row.Cells[7].Value.ToString();
                txtmabt.Text = row.Cells[8].Value.ToString();
              
                


            }
            catch
            { }
        }

        private void GridViewSPBT_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                DataGridViewRow row = new DataGridViewRow();
                row = GridViewSPBT.Rows[e.RowIndex];
                txtmakh.Text = row.Cells[0].Value.ToString();

                txttenkh.Text = row.Cells[1].Value.ToString();
                txtngaysinh.Text = row.Cells[2].Value.ToString();
                txtphai.Text = row.Cells[3].Value.ToString();
                txtsdt.Text = row.Cells[4].Value.ToString();
                txtnsx.Text = row.Cells[5].Value.ToString();
                txtdiachi.Text = row.Cells[6].Value.ToString();
                txtyeucau.Text = row.Cells[7].Value.ToString();
                txtmabt.Text = row.Cells[8].Value.ToString();
                

            }
            catch
            { }
        }
