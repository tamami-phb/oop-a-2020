package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FormUI extends JFrame {

    private MainUI parent;

    private JTextField txtNoSurat;
    private JTextField txtTglSurat;
    private JTextField txtPerihal;
    private JTextField txtTujuan;
    private JButton btnSimpan;
    private JButton btnBatal;
    /**
     * 0 : add
     * 1 : edit
     */
    private int mode;
    private int index;

    public FormUI(MainUI parent) {
        super();
        initUI();

        this.parent = parent;
    }

    public void initUI() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(4,2));

        txtNoSurat = new JTextField();
        panelForm.add(new JLabel("No Surat"));
        panelForm.add(txtNoSurat);

        txtTglSurat = new JTextField();
        panelForm.add(new JLabel("Tanggal Surat"));
        panelForm.add(txtTglSurat);

        txtPerihal = new JTextField();
        panelForm.add(new JLabel("Perihal"));
        panelForm.add(txtPerihal);

        txtTujuan = new JTextField();
        panelForm.add(new JLabel("Tujuan"));
        panelForm.add(txtTujuan);

        contentPane.add(panelForm, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));

        btnSimpan = new JButton("Simpan");
        panel.add(btnSimpan);

        btnBatal = new JButton("Batal");
        btnBatal.addActionListener(new BtnBatalClick());
        panel.add(btnBatal);

        contentPane.add(panel, BorderLayout.SOUTH);

        setSize(300, 200);
    }

    public void setMode(int mode) { this.mode = mode; }

    public void addForm(boolean visible) {
        setVisible(visible);
        this.mode = 0;
    }

    public void editForm(boolean visible, int idx) {
        setVisible(visible);
        this.mode = 1;
        index = idx;
        // ambil data by index
    }

    public void clearForm() {
        txtNoSurat.setText("");
        txtTglSurat.setText("");
        txtPerihal.setText("");
        txtTujuan.setText("");
    }

    class BtnSimpanClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if(mode == 0) {
                // tambah data
            } else {
                // ubah data
            }
            clearForm();
            setVisible(false);
        }
    }

    class BtnBatalClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            clearForm();
            setVisible(false);
        }
    }

}