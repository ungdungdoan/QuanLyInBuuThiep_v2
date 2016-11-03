using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
namespace frm
{
    public partial class login : Form
    {
        string chuoikn = @"Data Source=DELL\SQLEXPRESS;Initial Catalog=Quanlycungcapinbuuthiep;Integrated Security=True";
        public login()
        {
            InitializeComponent();
        }

        private void ckbshow_CheckedChanged(object sender, EventArgs e)
        {
            if (ckbshow.Checked)
            { btnmk.UseSystemPasswordChar = false; }
            else
            { btnmk.UseSystemPasswordChar = true; }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btndangnhap_Click(object sender, EventArgs e)
        {


            SqlConnection conn = new SqlConnection(chuoikn);
            conn.Open();
            string sql = "select * from Dang_nhap where Taikhoan='" + btntk.Text + "' and Matkhau='" + btnmk.Text + "'";
            SqlCommand cmd = new SqlCommand(sql, conn);
            SqlDataReader reader = cmd.ExecuteReader();


            if (reader.Read() == true)
            {  
              Form1  frm = new Form1();
                frm.Show();
                this.Hide();
            }
            else
            {
                MessageBox.Show("đăng nhập thất bại");
                btntk.Text = "";
                btnmk.Text = "";
                btntk.Focus();
            }

        }
        

        private void btnhuy_Click(object sender, EventArgs e)
        {
            this.Close();
            
        }
    }
}
