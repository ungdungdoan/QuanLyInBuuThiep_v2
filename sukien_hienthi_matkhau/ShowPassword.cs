 private void ckbshow_CheckedChanged(object sender, EventArgs e)
        {
            if (ckbshow.Checked)
            { btnmk.UseSystemPasswordChar = false; }
            else
            { btnmk.UseSystemPasswordChar = true; }
        }