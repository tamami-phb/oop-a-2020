package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class MainUI extends JFrame {

    private JTable table;
    private DefaultTableModel model;
    private String[] columnNames = { "No Surat", "Tanggal", "Perihal", "Tujuan" };
    private JButton btnTambah;
    private JButton btnUbah;
    private JButton btnHapus;

    private FormUI formUI;
    
    public MainUI() {
        super();
        initUI();

        formUI = new FormUI(this);
    }

    public void initUI() {
        table = new JTable();
        JPanel panel = new JPanel(new GridLayout(1,5));
        panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        Vector<String> columnVector = new Vector<String>();
        for (String column : columnNames) {
            columnVector.add(column);
        }

        model = new DefaultTableModel(null, columnVector);
        table.setModel(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setRowSelectionAllowed(true);
        JScrollPane scrollPane = new JScrollPane(table);

        contentPane.add(scrollPane, BorderLayout.CENTER);

        btnTambah = new JButton("Tambah");
        btnTambah.addActionListener(new BtnTambahClick());
        panel.add(btnTambah);
        
        btnUbah = new JButton("Ubah");
        btnUbah.addActionListener(new BtnUbahClick());
        panel.add(btnUbah);

        btnHapus = new JButton("Hapus");
        panel.add(btnHapus);
        
        panel.add(new JPanel());
        panel.add(new JPanel());

        contentPane.add(panel, BorderLayout.SOUTH);
        
        setTitle("Aplikasi Surat Keluar");
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class BtnTambahClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            formUI.addForm(true);
        }
    }

    class BtnUbahClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            formUI.editForm(true, 0);
        }
    }

}