/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2;

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
public class ThongTinCaNhan extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinCaNhan
     */
    List<ThongTin> listTT = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    int vitri;
    
    public ThongTinCaNhan() {
        initComponents();
        model = (DefaultTableModel) tblThongTin.getModel();
//        vitri= tblThongTin.getSelectedRow();
        listTT.add(new  ThongTin("a", "Nam", "11-11-1111", "a@a.a", "Ứng dụng phần mềm", 9.0, "Tốt"));
        listTT.add(new  ThongTin("b", "Nữ", "11-11-1111", "a@a.a", "Ứng dụng phần mềm", 9.0, "Tốt"));
        listTT.add(new  ThongTin("c", "Nam", "11-11-1111", "a@a.a", "Ứng dụng phần mềm", 9.0, "Tốt"));
        add();
        chayChu();
        dongHo();
        demGio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbChu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cbbNganh = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        chkTot = new javax.swing.JCheckBox();
        chkKha = new javax.swing.JCheckBox();
        chkTB = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongTin = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lbHang = new javax.swing.JLabel();
        chkYeu = new javax.swing.JCheckBox();
        lbTime = new javax.swing.JLabel();
        lbDemGio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin cá nhân");

        lbChu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbChu.setForeground(new java.awt.Color(153, 0, 0));
        lbChu.setText("Xin chào bạn");

        jLabel2.setText("Tên");

        jLabel3.setText("Ngày sinh");

        jLabel4.setText("Email");

        jLabel5.setText("Điểm thi");

        jLabel6.setText("Giới tính");

        buttonGroup1.add(rdbNam);
        rdbNam.setText("Nam");

        buttonGroup1.add(rdbNu);
        rdbNu.setText("Nữ");

        jLabel7.setText("Ngành");

        cbbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phần mềm", "Thiết kế Web", "Lập trình máy tính", "Thiết kế đồ họa" }));

        jLabel8.setText("Hạnh kiểm");

        buttonGroup2.add(chkTot);
        chkTot.setText("Tốt");

        buttonGroup2.add(chkKha);
        chkKha.setText("Khá");

        buttonGroup2.add(chkTB);
        chkTB.setText("TB");

        tblThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên", "Giới tính", "Ngày sinh", "Email", "Ngành", "Điểm thi", "Hạnh kiểm", "Xếp loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThongTin);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        lbHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHang.setText("...");

        buttonGroup2.add(chkYeu);
        chkYeu.setText("Yếu");

        lbTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTime.setForeground(new java.awt.Color(0, 0, 204));

        lbDemGio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbDemGio.setForeground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tổng thời gian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiem)
                                    .addComponent(cbbNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh)
                                    .addComponent(txtEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lbChu)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(rdbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(rdbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDemGio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnFirst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbHang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLast))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkTot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkKha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkTB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkYeu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdbNam)
                    .addComponent(rdbNu)
                    .addComponent(btnAdd)
                    .addComponent(btnOpen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDemGio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chkTot)
                    .addComponent(chkKha)
                    .addComponent(chkTB)
                    .addComponent(chkYeu))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnLast)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(lbHang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        lamMoi();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        checkTrong();
        add();
//        lbHang.setText(vitri+"/"+listTT.size());
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
        add();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
//        add();
//        lbHang.setText(vitri+"/"+listTT.size());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        find();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        open();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        save();
        JOptionPane.showMessageDialog(this, "Lưu thành công");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát k?", "Thoát", JOptionPane.YES_NO_OPTION);
        try {
            if(chon==JOptionPane.YES_OPTION){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mời chọn!");
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        vitri=0;
        display(vitri);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        vitri-=1;
        display(vitri);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        vitri+=1;
        display(vitri);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        vitri=listTT.size()-1;
        display(vitri);
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinMouseClicked
        // TODO add your handling code here:
        int row = tblThongTin.getSelectedRow();
        
        if(row>=0){
            vitri=row;
            display(vitri);
        }
    }//GEN-LAST:event_tblThongTinMouseClicked

    
    
    public void lamMoi(){
        txtTen.setText("");
        rdbNam.setSelected(true);
        txtNgaySinh.setText("");
        txtEmail.setText("");
        cbbNganh.setSelectedItem("Ứng dụng phần mềm");
        txtDiem.setText("");
        chkTot.setSelected(true);
        vitri=-1;
    }
    
    public void checkTrong(){
        ThongTin tt = new ThongTin();        
        if (txtTen.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống");
                return;
        }else{
            tt.setTen(txtTen.getText());
        }
        
        if(rdbNam.isSelected()==true){
            tt.setGt("Nam");
        }else{
            tt.setGt("Nữ");
        }
        
//        SimpleDateFormat formater = new SimpleDateFormat();
//        formater.applyPattern("dd-MM-yyyy");
        try{
//            Date ngay = formater.parse(txtNgaySinh.getText());
            Date ngay = new SimpleDateFormat("dd-MM-yyyy").parse(txtNgaySinh.getText());
            tt.setNgaySinh(txtNgaySinh.getText());
//            if (txtNgaySinh.getText().length() == 0) {
//                JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống");
//                return;
//            }else {
//                tt.setNgaySinh(txtNgaySinh.getText());
//            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ngày sinh phải có dạng dd-MM-yyyy");
            return;
        }
        
        

        try {
            String mail = "^\\w+@\\w+\\.(\\w)+$";
            if (txtEmail.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Email không được để trống");
                return;
            }
            else if(!txtEmail.getText().matches(mail)){
                JOptionPane.showMessageDialog(this, "Email phải có dạng abcd@gmail.com");
                return;
            }
            else {
                tt.setEmail(txtEmail.getText());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không đúng định dạng email");
            return;
        }
        
        tt.setNganh((String) cbbNganh.getSelectedItem());
        
        if (txtDiem.getText().length()==0) {              
            JOptionPane.showMessageDialog(this, "Điểm không được để trống");
            return;
        }        
        try{
            double so = Double.parseDouble(txtDiem.getText());
            
            if(so <0 || so>10){
                JOptionPane.showMessageDialog(this, "Điểm từ 0-10");
                return;
            }
            else{
                tt.setDiem(Double.parseDouble(txtDiem.getText()));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Không đúng định dạng số");
            return;
        }
        
        
        if(chkTot.isSelected()==true){
            tt.setHanhKiem("Tốt");
        }
        else if (chkKha.isSelected()==true){
            tt.setHanhKiem("Khá");
        }
        else if (chkTB.isSelected()==true){
            tt.setHanhKiem("TB");
        }
        else {
            tt.setHanhKiem("Yếu");
        }
        
        listTT.add(tt);
    }
    
    public void add(){
        model.setRowCount(0);
        for(ThongTin x: listTT){
            model.addRow(new Object[]{x.getTen(),x.getGt(),x.getNgaySinh(),
                x.getEmail(),x.getNganh(),x.getDiem(),x.getHanhKiem(),x.getXepLoai()}
            );
        }
        display(vitri);
    }
    
    public void display(int vitri){
        if(vitri>=0){
            ThongTin tt = listTT.get(vitri);
            txtTen.setText(tt.getTen());
            if(tt.getGt().equalsIgnoreCase("Nam")){
                rdbNam.setSelected(true);
            }else{
                rdbNu.setSelected(true);
            }
            txtNgaySinh.setText(tt.getNgaySinh());
            txtEmail.setText(tt.getEmail());
            cbbNganh.setSelectedItem(tt.getNganh());
            txtDiem.setText(tt.getDiem()+"");
            if(tt.getHanhKiem().equalsIgnoreCase("Tốt")){
                chkTot.setSelected(true);
            }
            else if(tt.getHanhKiem().equalsIgnoreCase("Khá")){
                chkKha.setSelected(true);
            }
            else if(tt.getHanhKiem().equalsIgnoreCase("TB")){
                chkTB.setSelected(true);
            }
            else {
                chkYeu.setSelected(true);
            }
            lbHang.setText((vitri+1)+"/"+listTT.size());
            
            tblThongTin.setRowSelectionInterval(vitri, vitri);                        
        }else{
            lbHang.setText("...");
        }
    }
    
    public void delete(){
//        model = (DefaultTableModel) tblThongTin.getModel();
        try {
            int index = tblThongTin.getSelectedRow();
            listTT.remove(index);
            model.removeRow(index);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn vị trí cần xóa trên bảng");
        }
    }
    
    public void update(){
        ThongTin tt = listTT.get(vitri);
        tt.setTen(txtTen.getText());
        if(rdbNam.isSelected()==true){
            tt.gt = "Nam";
        }else{
            tt.gt = "Nữ";
        }
        tt.setNgaySinh(txtNgaySinh.getText());
        tt.setEmail(txtEmail.getText());
        tt.setNganh((String) cbbNganh.getSelectedItem());
        tt.setDiem(Double.parseDouble(txtDiem.getText()));
        if(chkTot.isSelected()==true){
            tt.hanhKiem = "Tốt";
        }
        else if (chkKha.isSelected()==true){
            tt.hanhKiem = "Khá";
        }
        else if (chkTB.isSelected()==true){
            tt.hanhKiem = "TB";
        }
        else {
            tt.hanhKiem = "Yếu";
        }
    }
    
    public void find(){
        String ten = JOptionPane.showInputDialog(this, "Mời nhập tên cần tìm");
        try {
            for(ThongTin x: listTT){
                if(x.getTen().equalsIgnoreCase(ten)){
                    JOptionPane.showMessageDialog(this, "Có ng này trong danh sách");
                    vitri=listTT.indexOf(x);
                    display(vitri);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "K có ng này trong danh sách");
        }
    }
    
    public void open(){
        listTT= (List<ThongTin>) FileThongTin.readOb("D:\\Thongtincanhan.txt");
    }
    
    public void save(){
        FileThongTin.writeOb("D:\\Thongtincanhan.txt", listTT);
    }
       
    public void chayChu(){
        new Thread(){
            public void run(){
                while (true) {
                   String chu = lbChu.getText();
                   String[] mang = chu.split(" ");
                   chu = mang[1]+" "+mang[2]+" "+mang[0];
                   lbChu.setText(chu);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    
    public void demGio(){
        new Thread(){
            public void run(){
                int hours =0;
                int minuters =0;
                int seconds =0;
                for (int i = 0; true; i++) {
                    lbDemGio.setText(hours+":"+minuters+":"+seconds);
                    if(seconds == 60){
                        minuters++;
                        seconds = 0;
                    }
                    if(minuters == 60){
                        hours++;
                        minuters = 0;
                    }
                    seconds++;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        break;
                    }                    
                }
            }
        }.start();
    }
    
    public void dongHo(){
        new Thread(){
            public void run(){
                while(true){
                    Date time = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    lbTime.setText(sdf.format(time));
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    
//    
//    private void luuFile() {
//        try {
//            FileOutputStream fos = new FileOutputStream("Test6");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(listBS);
//
//            oos.close();
//            fos.close();
//
//            JOptionPane.showMessageDialog(this, "Lưu file thành công");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Lỗi: " + e);
//        }
//    }
//private void moFile() {
//        try {
//            FileInputStream fis = new FileInputStream("Test6");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//            listBS = (ArrayList<BacSy>) ois.readObject();
//
//            ois.close();
//            fis.close();
//
//            JOptionPane.showMessageDialog(this, "Đọc file thành công");
//            fillTable();
//            index = 0;
//            showDetails(index);
//        } catch (Exception e) {
//            JOptionPane.showMessageDial
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinCaNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
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
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbNganh;
    private javax.swing.JCheckBox chkKha;
    private javax.swing.JCheckBox chkTB;
    private javax.swing.JCheckBox chkTot;
    private javax.swing.JCheckBox chkYeu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChu;
    private javax.swing.JLabel lbDemGio;
    private javax.swing.JLabel lbHang;
    private javax.swing.JLabel lbTime;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tblThongTin;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
