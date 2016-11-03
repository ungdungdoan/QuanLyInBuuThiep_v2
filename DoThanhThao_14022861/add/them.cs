 private void btThem_Click(object sender, EventArgs e)
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
        int kq = kn.xulydulieu("insert into KHACH_HANG(makh,tenkh,ngaysinh,phai,sdt,ma_nsx,diachi,yeucau,mabt) values(N'" + txtmakh.Text+"', N'"+txttenkh.Text+"', '"+txtngaysinh.Text+"', N'"+txtphai.Text+"', '"+txtsdt.Text+"', '"+txtnsx.Text+"', N'"+txtdiachi.Text+"', N'"+txtyeucau.Text+"', N'"+txtmabt.Text+"')");
        if (kq > 0)
        {
            MessageBox.Show("Thêm thành công ");
            laybangkhachhang();
        }
        else
        { MessageBox.Show("Thêm không thành công , vui lòng thử lại !"); }
    }
}
