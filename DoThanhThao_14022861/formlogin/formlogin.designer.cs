namespace frm
{
    partial class login
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(login));
            this.label1 = new System.Windows.Forms.Label();
            this.btndangnhap = new System.Windows.Forms.Button();
            this.ckbshow = new System.Windows.Forms.CheckBox();
            this.btntk = new System.Windows.Forms.TextBox();
            this.btnhuy = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.btnmk = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label1.Location = new System.Drawing.Point(211, 56);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(78, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Tài khoản";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // btndangnhap
            // 
            this.btndangnhap.Location = new System.Drawing.Point(304, 131);
            this.btndangnhap.Name = "btndangnhap";
            this.btndangnhap.Size = new System.Drawing.Size(75, 23);
            this.btndangnhap.TabIndex = 1;
            this.btndangnhap.Text = "Đăng nhập";
            this.btndangnhap.UseVisualStyleBackColor = true;
            this.btndangnhap.Click += new System.EventHandler(this.btndangnhap_Click);
            // 
            // ckbshow
            // 
            this.ckbshow.AutoSize = true;
            this.ckbshow.Location = new System.Drawing.Point(304, 108);
            this.ckbshow.Name = "ckbshow";
            this.ckbshow.Size = new System.Drawing.Size(109, 17);
            this.ckbshow.TabIndex = 2;
            this.ckbshow.Text = "Hiển thị mật khẩu";
            this.ckbshow.UseVisualStyleBackColor = true;
            this.ckbshow.CheckedChanged += new System.EventHandler(this.ckbshow_CheckedChanged);
            // 
            // btntk
            // 
            this.btntk.Location = new System.Drawing.Point(304, 56);
            this.btntk.Name = "btntk";
            this.btntk.Size = new System.Drawing.Size(157, 20);
            this.btntk.TabIndex = 3;
            // 
            // btnhuy
            // 
            this.btnhuy.Location = new System.Drawing.Point(386, 131);
            this.btnhuy.Name = "btnhuy";
            this.btnhuy.Size = new System.Drawing.Size(75, 23);
            this.btnhuy.TabIndex = 1;
            this.btnhuy.Text = "Hủy";
            this.btnhuy.UseVisualStyleBackColor = true;
            this.btnhuy.Click += new System.EventHandler(this.btnhuy_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label2.Location = new System.Drawing.Point(214, 82);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(75, 20);
            this.label2.TabIndex = 0;
            this.label2.Text = "Mật khẩu";
            this.label2.Click += new System.EventHandler(this.label1_Click);
            // 
            // btnmk
            // 
            this.btnmk.Location = new System.Drawing.Point(304, 82);
            this.btnmk.Name = "btnmk";
            this.btnmk.Size = new System.Drawing.Size(157, 20);
            this.btnmk.TabIndex = 3;
            this.btnmk.UseSystemPasswordChar = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.SystemColors.HighlightText;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label3.ForeColor = System.Drawing.SystemColors.MenuHighlight;
            this.label3.Location = new System.Drawing.Point(124, 21);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(405, 25);
            this.label3.TabIndex = 4;
            this.label3.Text = "Đăng nhập quản lý cung cấp in bưu thiếp";
            // 
            // login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.ClientSize = new System.Drawing.Size(585, 261);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.btnmk);
            this.Controls.Add(this.btntk);
            this.Controls.Add(this.ckbshow);
            this.Controls.Add(this.btnhuy);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btndangnhap);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "login";
            this.Text = "login";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btndangnhap;
        private System.Windows.Forms.CheckBox ckbshow;
        private System.Windows.Forms.TextBox btntk;
        private System.Windows.Forms.Button btnhuy;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox btnmk;
        private System.Windows.Forms.Label label3;
    }
}