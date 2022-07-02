/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huong
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    List<Employee> listNV = new ArrayList();
    DefaultTableModel model = new DefaultTableModel();
    //tạo dtg mặc ddịnh
    //lấy model từ table cho model qli dữ liệu của bảng
    int vitri;

    public QuanLyNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblNhanVien.getModel();
        //getmodel lấy gtri của tbSV vào model r ép kiểu về table

//        listNV.add(new  Employee("M01", "Hương", 19, "huong2205@gmail.com", 9000000));
//        listNV.add(new  Employee("M02", "Huy", 19, "huy0904@gmail.com", 15000000));
//        fillToTable();
        thoigian();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQLNV = new javax.swing.JLabel();
        lbMaNV = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lbTuoi = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbLuong = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lbViTri = new javax.swing.JLabel();
        pnlTable = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        lbTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lbQLNV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbQLNV.setForeground(new java.awt.Color(0, 51, 255));
        lbQLNV.setText("QUẢN LÝ NHÂN VIÊN");

        lbMaNV.setText("MÃ NHÂN VIÊN");

        lbHoTen.setText("HỌ VÀ TÊN");

        lbTuoi.setText("TUỔI");

        lbEmail.setText("EMAIL");

        lbLuong.setText("LƯƠNG");

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        lbViTri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbViTri.setForeground(new java.awt.Color(204, 0, 0));
        lbViTri.setText("Record: ...");

        tblNhanVien.setAutoCreateRowSorter(true);
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        pnlTable.setViewportView(tblNhanVien);

        lbTime.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbTime.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lbQLNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTable)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaNV)
                                    .addComponent(lbHoTen)
                                    .addComponent(lbTuoi)
                                    .addComponent(lbEmail)
                                    .addComponent(lbLuong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnFirst)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPrevious)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNext)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLast))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                .addComponent(txtTuoi)
                                                .addComponent(txtEmail)
                                                .addComponent(txtLuong)))
                                        .addGap(18, 18, 18)
                                        .addComponent(lbViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQLNV)
                    .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoTen)
                    .addComponent(btnNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTuoi)
                        .addComponent(btnSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLuong)
                    .addComponent(btnFind))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst)
                            .addComponent(btnLast)
                            .addComponent(btnNext)
                            .addComponent(btnPrevious)
                            .addComponent(lbViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed

    }//GEN-LAST:event_txtHoTenActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (vitri < 0) {
                addEmployee();
                saveFile();
                fillToTable();
                lbViTri.setText("Record: " + (vitri + 1) + " of " + listNV.size());
            } else {
                updateEmployee();
                saveFile();
                fillToTable();
                clearForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ấn new trc");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        removeEmployee();
        fillToTable();
        lbViTri.setText("Record: " + (vitri + 1) + " of " + listNV.size());
        saveFile();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        findEmployee();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        try {
            this.openFile();
            if (listNV.size() > 0) {
                fillToTable();
                vitri = 0;
                display(vitri);
                tblNhanVien.setRowSelectionInterval(vitri, vitri);
            } else {
                this.clearForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?",
                "Thoát", JOptionPane.YES_NO_OPTION,
                JOptionPane.YES_NO_OPTION);
        try {
            if (luaChon == JOptionPane.YES_OPTION) {
                saveFile();
                System.exit(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        vitri = 0;
        display(vitri);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if (vitri > 0) {
            vitri--;
            display(vitri);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (vitri < listNV.size() - 1) {
            vitri++;
            display(vitri);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        vitri = listNV.size() - 1;
        display(vitri);
    }//GEN-LAST:event_btnLastActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int row = tblNhanVien.getSelectedRow();

        if (row >= 0) {
            vitri = row;
            display(vitri);
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    public boolean checkTrung(String acc) {
        boolean check = false;
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equals(acc)) {
                check = true;
            }
        }
        return check;
    }

    public void clearForm() {
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        vitri = -1;
    }

    public void fillToTable() {
        model.setRowCount(0);
        //xóa model
        for (Employee x : listNV) {
            //duyệt list
            model.addRow(new Object[]{x.getMaNV(), x.getHoTen(), x.getTuoi(), x.getEmail(), x.getLuong()});
            //tạo đtg, lấy các dữ liệu lần lượt vị trí của cột trên tABLE
            //add model theo từng cột rồi add theo dòng
        }
        display(vitri);
    }

    public void openFile() {
        listNV = (List<Employee>) QuanLiFile.readObject("D:\\Assignment.txt");
    }

    public void saveFile() {
        QuanLiFile.writeObject("D:\\Assignment.txt", listNV);
    }

    public void addEmployee() {
        Employee nv = new Employee();
        //tạo đtg Employee k có tham số truyền vào
        try {
            if (txtMaNV.getText().length() == 0) {
                //lấy dữ liệu trên text r gán vào nv
                JOptionPane.showMessageDialog(rootPane, "Mã không được để trống");
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi" + e);
        }

        try {
            if (checkTrung(txtMaNV.getText()) == true) {
                JOptionPane.showMessageDialog(this, "Trùng dữ liệu!");
                return;
            } else {
                nv.setMaNV(txtMaNV.getText());
                //lấy dữ liệu trên text r gán vào nv
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi" + e);
        }

        try {
            if (txtHoTen.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống");
                return;
            } else if (txtHoTen.getText().length() > 40) {
                JOptionPane.showMessageDialog(this, "Tên chỉ tối đa 40 kí tự");
                return;
            } else {
                nv.setHoTen(txtHoTen.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi" + e);
        }

        if (txtTuoi.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Tuổi không được để trống");
        }
        try {
            int soTuoi = Integer.parseInt(txtTuoi.getText());
            if (soTuoi < 16 || soTuoi > 55) {
                JOptionPane.showMessageDialog(this, "Tuổi phải từ 16-55");
                return;
            } else {
                nv.setTuoi(soTuoi);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải là 1 số");
            return;
        }

        try {
            String mail = "^\\w+@\\w+\\.(\\w)+$";
            if (txtEmail.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Email không được để trống");
                return;
            } else if (!txtEmail.getText().matches(mail)) {
                JOptionPane.showMessageDialog(this, "Email phải có dạng abcd@gmail.com");
                return;
            } else {
                nv.setEmail(txtEmail.getText());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không đúng định dạng email");
        }

        if (txtLuong.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Lương không được để trống");
            return;
        }
        try {
            double lg = Double.parseDouble(txtLuong.getText());

            if (lg < 5000000) {
                JOptionPane.showMessageDialog(this, "Lương lớn hơn 5 triệu");
                return;
            } else {
                nv.setLuong(Double.parseDouble(txtLuong.getText()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không đúng định dạng số");
            return;
        }

        listNV.add(nv);
        clearForm();
    }

    public void updateEmployee() {
        vitri = tblNhanVien.getSelectedRow();
        //lấy viti của bảng theo dòng đamg chọn gán vào vị trí
        Employee nhanvien = listNV.get(vitri);
        //tạo tg láy dữ liệu đã thay đổi add vào đunag  vị trí

        nhanvien.setHoTen(txtHoTen.getText());
        nhanvien.setTuoi(Integer.parseInt(txtTuoi.getText()));
        nhanvien.setEmail(txtEmail.getText());
        nhanvien.setLuong(Double.parseDouble(txtLuong.getText()));
    }

    public void removeEmployee() {
        String ma = JOptionPane.showInputDialog("Mời bạn nhập mã muốn xóa: ");
        if (checkTrung(ma) == true) {
            for (Employee x : listNV) {
                if (x.getMaNV().equals(ma)) {
                    listNV.remove(x);
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    break;
                }
            }
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên có mã " + ma);
        }
    }

    public void findEmployee() {
        String ma = JOptionPane.showInputDialog("Mời bạn nhập mã cần tìm: ");
        if (checkTrung(ma) == true) {
            JOptionPane.showMessageDialog(this, "Có nhân viên  " + ma);
            for (Employee x : listNV) {
                if (x.getMaNV().equalsIgnoreCase(ma)) {
                    vitri = listNV.indexOf(x);
                    display(vitri);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên có mã " + ma);
        }
    }

    public void findEmployee2() {
        String ma = JOptionPane.showInputDialog("Mời bạn nhập mã cần tìm: ");
        for (Employee x : listNV) {
            if (x.getMaNV().equalsIgnoreCase(ma)) {
                vitri = listNV.indexOf(x);
                JOptionPane.showMessageDialog(this, "Có nhân viên  " + ma);
                display(vitri);
                break;
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên có mã " + ma);
            }
        }
    }

    public void display(int vitri) {
        if (vitri >= 0) {
            txtMaNV.setText(listNV.get(vitri).getMaNV());
            txtHoTen.setText(listNV.get(vitri).getHoTen());
            txtTuoi.setText(listNV.get(vitri).getTuoi() + "");
            txtEmail.setText(listNV.get(vitri).getEmail());
            txtLuong.setText(listNV.get(vitri).getLuong() + "");
            lbViTri.setText("Record: " + (vitri + 1) + " of " + listNV.size());

            tblNhanVien.setRowSelectionInterval(vitri, vitri);
        } else {
            lbViTri.setText("Record: ...");
        }
    }

    public void thoigian() {
        new Thread() {
            public void run() {
                while (true) {
                    Date time = new Date();
                    SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss ");
                    lbTime.setText(SDF.format(time));
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Generics<String> list = new Generics<String>();
        list.setT("HELLO HƯƠNG XỊN GÁI!!!");
        System.out.println(list.getT());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbLuong;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbQLNV;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbTuoi;
    private javax.swing.JLabel lbViTri;
    private javax.swing.JScrollPane pnlTable;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables

    private static class Generics<T> {

        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }
}
