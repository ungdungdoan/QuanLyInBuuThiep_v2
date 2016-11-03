  public void laybangkhachhang()
        {
            Ketnoi kn = new Ketnoi();
            DataTable dt = new DataTable();
            dt = kn.laybang("Select * from KHACH_HANG");
            GridViewSPBT.DataSource = dt;
        }
