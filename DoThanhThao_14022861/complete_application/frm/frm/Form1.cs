using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace frm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void txtmakh_TextChanged(object sender, EventArgs e)
        {
            errorProvider1.SetError(txtmakh, "");
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
            laybangkhachhang();
        }
        public void laybangkhachhang()
        {
            Ketnoi kn = new Ketnoi();
            DataTable dt = new DataTable();
            dt = kn.laybang("Select * from KHACH_HANG");
            GridViewSPBT.DataSource = dt;
        }

        private void cbnsx_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
      
      

        private void btThoat_Click(object sender, EventArgs e)
        {
            DialogResult dg = new DialogResult();
            dg = MessageBox.Show("Bạn có muốn thoát không ?", "Thông báo ", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (dg == DialogResult.Yes)
            { this.Close(); }
        }

        private void btSua_Click(object sender, EventArgs e)
        {
            if (txttenkh.Text == "")
            { errorProvider1.SetError(txttenkh, "Bạn chưa nhập Tên khách hàng "); }
            if (txthokh.Text == "")
            { errorProvider1.SetError(txthokh, "Bạn chưa nhập Họ khách hàng "); }
            if (txtmakh.Text == "")
            { errorProvider1.SetError(txtmakh, "Bạn chưa nhập Mã khách hàng "); }
            if (txtsdt.Text == "")
            { errorProvider1.SetError(txtsdt, "Bạn chưa nhập sđt khách hàng "); }
            if (txtmakh.Text != "" && txthokh.Text != "" && txttenkh.Text != "" && txtsdt.Text != "")
            {
                Ketnoi kn = new Ketnoi();
                int kq = kn.xulydulieu("update KHACH_HANG set hokh=N'"+txthokh.Text+"',tenkh=N'"+txttenkh.Text+"',ngaysinh='"+txtngaysinh.Text+"',phai=N'"+txtphai.Text+"',sdt='"+txtsdt.Text+"',ma_nsx=N'"+txtnsx.Text+"',diachi=N'"+txtdiachi.Text+"',yeucau=N'"+txtyeucau.Text+"' where makh=N'"+txtmakh.Text+"'");
                if (kq > 0)
                {
                    MessageBox.Show("Sửa thành công ");
                    laybangkhachhang();
                }
                else
                { MessageBox.Show(" không thành công , vui lòng thử lại !"); }
            }
            }
      

        private void btXoa_Click(object sender, EventArgs e)
        {
            if (txttenkh.Text == "")
            { errorProvider1.SetError(txttenkh, "Bạn chưa nhập Tên khách hàng "); }
            if (txthokh.Text == "")
            { errorProvider1.SetError(txthokh, "Bạn chưa nhập Họ khách hàng "); }
            if (txtmakh.Text == "")
            { errorProvider1.SetError(txtmakh, "Bạn chưa nhập Mã khách hàng "); }
            if (txtsdt.Text == "")
            { errorProvider1.SetError(txtsdt, "Bạn chưa nhập sđt khách hàng "); }
            if (txtmakh.Text != "" && txthokh.Text != "" && txttenkh.Text != "" && txtsdt.Text != "")
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

        private void btThem_Click(object sender, EventArgs e)
        {

    if (txttenkh.Text == "")
    { errorProvider1.SetError(txttenkh, "Bạn chưa nhập Tên khách hàng "); }
    if (txthokh.Text == "")
    { errorProvider1.SetError(txthokh, "Bạn chưa nhập Họ khách hàng "); }
    if (txtmakh.Text == "")
    { errorProvider1.SetError(txtmakh, "Bạn chưa nhập Mã khách hàng "); }
    if (txtsdt.Text == "")
    { errorProvider1.SetError(txtsdt, "Bạn chưa nhập sđt khách hàng "); }
    if (txtmakh.Text != "" && txthokh.Text != "" && txttenkh.Text != "" && txtsdt.Text != "")
    {
        Ketnoi kn = new Ketnoi();
        int kq = kn.xulydulieu("insert into KHACH_HANG(makh,hokh,tenkh,ngaysinh,phai,sdt,ma_nsx,diachi,yeucau) values(N'"+txtmakh.Text+"', N'"+txthokh.Text+"', N'"+txttenkh.Text+"', '"+txtngaysinh.Text+"', N'"+txtphai.Text+"', '"+txtsdt.Text+"', '"+txtnsx.Text+"', N'"+txtdiachi.Text+"', N'"+txtyeucau.Text+"')");
        if (kq > 0)
        {
            MessageBox.Show("Thêm thành công ");
            laybangkhachhang();
        }
        else
        { MessageBox.Show("Thêm không thành công , vui lòng thử lại !"); }
    }
}

        private void txttenkh_TextChanged(object sender, EventArgs e)
        {
            errorProvider1.SetError(txttenkh, "");
        }

        private void txthokh_TextChanged(object sender, EventArgs e)
        {
            errorProvider1.SetError(txthokh, "");
        }

        private void txtsdt_TextChanged(object sender, EventArgs e)
        {
            errorProvider1.SetError(txtsdt, "");
        }

        private void GridViewSPBT_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            try {
                DataGridViewRow row = new DataGridViewRow();
                row = GridViewSPBT.Rows[e.RowIndex];
                txtmakh.Text = row.Cells[0].Value.ToString();
                txthokh.Text = row.Cells[1].Value.ToString();
                txttenkh.Text = row.Cells[2].Value.ToString();
                txtngaysinh.Text = row.Cells[3].Value.ToString();
                txtphai.Text = row.Cells[4].Value.ToString();
                txtsdt.Text = row.Cells[5].Value.ToString();
                txtnsx.Text = row.Cells[6].Value.ToString();
                txtdiachi.Text = row.Cells[7].Value.ToString();
                txtyeucau.Text = row.Cells[8].Value.ToString();



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
                txthokh.Text = row.Cells[1].Value.ToString();
                txttenkh.Text = row.Cells[2].Value.ToString();
                txtngaysinh.Text = row.Cells[3].Value.ToString();
                txtphai.Text = row.Cells[4].Value.ToString();
                txtsdt.Text = row.Cells[5].Value.ToString();
                txtnsx.Text = row.Cells[6].Value.ToString();
                txtdiachi.Text = row.Cells[7].Value.ToString();
                txtyeucau.Text = row.Cells[8].Value.ToString();


            }
            catch
            { }
        }

      

       

        private void txtdiachi_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtyeucau_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtnsx_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtnsx_TextChanged_1(object sender, EventArgs e)
        {

        }

        private void txtngaysinh_TextChanged(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }
    }
}
