/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaid
 */
public class JavaCalculator extends javax.swing.JFrame {
    /**
     * Creates new form JavaCalculator
     */
    double temp, temperature;
    String i1 = "Celsius", i2 = "Fahrenheit";

    public JavaCalculator() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnPoint = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSix6 = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnFour4 = new javax.swing.JButton();
        btnEight8 = new javax.swing.JButton();
        item2 = new javax.swing.JComboBox<>();
        btnNine9 = new javax.swing.JButton();
        item1 = new javax.swing.JComboBox<>();
        btnSeven7 = new javax.swing.JButton();
        textField2 = new javax.swing.JTextField();
        btnZero0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnTwo2 = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnThree3 = new javax.swing.JButton();
        btnOne1 = new javax.swing.JButton();
        btnFive5 = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        textField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();


        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        jRadioButton1.setText("jRadioButton1");

        jComboBox1.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("jButton1");

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jButton6.setText("jButton1");

        jButton9.setText("jButton1");

        jButton5.setText("jButton1");

        jButton7.setText("jButton1");

        jButton8.setText("jButton1");

        jComboBox3.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton10.setText("jButton1");

        jButton11.setText("jButton1");

        jButton12.setText("jButton1");

        jButton13.setText("jButton1");

        jComboBox2.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSix6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSix6.setText("6");
        btnSix6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSix6ActionPerformed(evt);
            }
        });

        btnBackspace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBackspace.setText("<--");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnFour4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFour4.setText("4");
        btnFour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFour4ActionPerformed(evt);
            }
        });

        btnEight8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEight8.setText("8");
        btnEight8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEight8ActionPerformed(evt);
            }
        });

        item2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Kelvin", "Celsius" }));
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });

        btnNine9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNine9.setText("9");
        btnNine9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNine9ActionPerformed(evt);
            }
        });

        item1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });

        btnSeven7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeven7.setText("7");
        btnSeven7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeven7ActionPerformed(evt);
            }
        });

        textField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnZero0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnZero0.setText("0");
        btnZero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero0ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnTwo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTwo2.setText("2");
        btnTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwo2ActionPerformed(evt);
            }
        });

        btnAC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAC.setForeground(new java.awt.Color(255, 153, 51));
        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnThree3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThree3.setText("3");
        btnThree3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThree3ActionPerformed(evt);
            }
        });

        btnOne1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOne1.setText("1");
        btnOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOne1ActionPerformed(evt);
            }
        });

        btnFive5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFive5.setText("5");
        btnFive5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFive5ActionPerformed(evt);
            }
        });

        btnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btnConvert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        textField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField1.setText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Temperature Converter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnThree3, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(
                                                btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnFour4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(
                                                                        btnFive5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnSeven7,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnEight8,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(
                                                                        btnSix6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnNine9,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(btnBackspace,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(
                                                                        btnPlusMinus,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                        .createSequentialGroup()
                                                        .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnZero0, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(
                                                                btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        jPanel1Layout.createSequentialGroup().addContainerGap(68, Short.MAX_VALUE).addComponent(jLabel1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThree3, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFour4, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSix6, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFive5, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNine9, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEight8, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeven7, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnZero0, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(60, Short.MAX_VALUE)));

        jTabbedPane1.addTab("Temperature", jPanel1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout
                        .createSequentialGroup().addGap(19, 19, 19).addComponent(jTabbedPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_item2ActionPerformed
        i2 = (String) item2.getSelectedItem();
    }// GEN-LAST:event_item2ActionPerformed

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_item1ActionPerformed
        i1 = (String) item1.getSelectedItem();
    }// GEN-LAST:event_item1ActionPerformed

    private void btnTwo2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTwo2ActionPerformed
        String Enternumber = textField1.getText() + btnTwo2.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnTwo2ActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConvertActionPerformed
        temp = Double.parseDouble(textField1.getText());

        if (i1.equals("Celsius") && i2.equals("Fahrenheit"))
            temperature = (temp * 1.8) + 32;
        else if (i1.equals("Celsius") && i2.equals("Kelvin"))
            temperature = (temp + 273.15);
        else if (i1.equals("Celsius") && i2.equals("Celsius"))
            temperature = temp;

        else if (i1.equals("Kelvin") && i2.equals("Kelvin"))
            temperature = temp;
        else if (i1.equals("Kelvin") && i2.equals("Celsius"))
            temperature = temp - 273.15;
        else if (i1.equals("Kelvin") && i2.equals("Fahrenheit"))
            temperature = 1.8 * (temp - 273.15) + 32;

        else if (i1.equals("Fahrenheit") && i2.equals("Celsius"))
            temperature = (temp - 32) / 1.8;
        else if (i1.equals("Fahrenheit") && i2.equals("Kelvin"))
            temperature = (temp - 32) / 1.8 + 273.15;
        else if (i1.equals("Fahrenheit") && i2.equals("Fahrenheit"))
            temperature = temp;

        textField2.setText(temperature + "");
    }// GEN-LAST:event_btnConvertActionPerformed

    private void btnOne1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOne1ActionPerformed
        String Enternumber = textField1.getText() + btnOne1.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnOne1ActionPerformed

    private void btnFive5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFive5ActionPerformed
        String Enternumber = textField1.getText() + btnFive5.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnFive5ActionPerformed

    private void btnSix6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSix6ActionPerformed
        String Enternumber = textField1.getText() + btnSix6.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnSix6ActionPerformed

    private void btnFour4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFour4ActionPerformed
        String Enternumber = textField1.getText() + btnFour4.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnFour4ActionPerformed

    private void btnEight8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEight8ActionPerformed
        String Enternumber = textField1.getText() + btnEight8.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnEight8ActionPerformed

    private void btnNine9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNine9ActionPerformed
        String Enternumber = textField1.getText() + btnNine9.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnNine9ActionPerformed

    private void btnSeven7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSeven7ActionPerformed
        String Enternumber = textField1.getText() + btnSeven7.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnSeven7ActionPerformed

    private void btnZero0ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnZero0ActionPerformed
        String Enternumber = textField1.getText() + btnZero0.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnZero0ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDotActionPerformed
        String Enternumber = textField1.getText();
        if (Enternumber.indexOf('.') < 0)
            Enternumber = textField1.getText() + btnPoint.getText();
        else
            Enternumber = textField1.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnDotActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnACActionPerformed
        textField1.setText("0");
        textField2.setText("");
    }// GEN-LAST:event_btnACActionPerformed

    private void btnThree3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThree3ActionPerformed
        String Enternumber = textField1.getText() + btnThree3.getText();
        textField1.setText(Enternumber);
    }// GEN-LAST:event_btnThree3ActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPlusMinusActionPerformed
        double t = Double.parseDouble(textField1.getText());

        if (t > 0 || t < 0)
            textField1.setText(-t + "");
    }// GEN-LAST:event_btnPlusMinusActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackspaceActionPerformed
        String s;
        if (textField1.getText().length() > 0) {
            StringBuilder st = new StringBuilder(textField1.getText());
            st.deleteCharAt(textField1.getText().length() - 1);

            s = st.toString();
            textField1.setText(s);
        }
    }// GEN-LAST:event_btnBackspaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEight8;
    private javax.swing.JButton btnFive5;
    private javax.swing.JButton btnFour4;
    private javax.swing.JButton btnNine9;
    private javax.swing.JButton btnOne1;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSeven7;
    private javax.swing.JButton btnSix6;
    private javax.swing.JButton btnThree3;
    private javax.swing.JButton btnTwo2;
    private javax.swing.JButton btnZero0;
    private javax.swing.JComboBox<String> item1;
    private javax.swing.JComboBox<String> item2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
}