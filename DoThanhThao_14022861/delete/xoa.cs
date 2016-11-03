 private void btXoa_Click(object sender, EventArgs e)
        {
            if (txttenkh.Text == "")
            { errorProvider1.SetError(txttenkh, "Bạn chưa nhập Tên khách hàng "); }
            if (txtmabt.Text == "")
            { errorProvider1.SetError(txtmabt, "Bạn chưa nhập Họ khách hàng "); }
            if (txtmakh.Text == "")
            { errorProvider1.SetError(txtmakh, "Bạn chưa nhập Mã khách hàng "); }
            if (txtsdt.Text == "")
            { errorProvider1.SetError(txtsdt, "Bạn chưa nhập sđt khách hàng "); }
            if (txtmakh.Text != "" && txtmabt.Text != "" && txttenkh.Text != "" && txtsdt.Text != "")
            {
                Ketnoi kn = new Ketnoi();
                int kq = kn.xulydulieu("delete from KHACH_HANG where makh='" + txtmakh.Text + "'");
                if (kq > 0)
                {
                    MessageBox.Show("xóa thành công ");
                    laybangkhachhang();
                }
                else
                { MessageBox.Show(" không thành công , vui lòng thử lại !"); }
            }
        }