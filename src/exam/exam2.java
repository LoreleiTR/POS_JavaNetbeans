/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Lorelei
 */
public class exam2 extends javax.swing.JFrame {
private static final String DB_URL = "jdbc:mysql://localhost:3306/examination";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    // Establish the database connection
    
    public exam2() {
        initComponents();
        Connect();
    }

   
    public static Connection Connect(){
    Connection con = null;
    
    try {

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","");
    } catch (SQLException ex) {
        Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Error connecting to database: " + ex.getMessage());
    }
    return con;
    }

    
    
    
    
    
    
public void addtables(int id ,String Name,int Qty ,Double Price){
    
        DefaultTableModel dt = (DefaultTableModel) foodcartT.getModel();
        
       DecimalFormat df = new DecimalFormat("00.00") ;       
       double totPrice = Price * Double.valueOf(Qty) ;
       
       String TotalPrice = df.format(totPrice);
        
        
        
        // product allready add chk
        
        for (int row = 0; row < foodcartT.getRowCount(); row++) {
            
            if (Name == foodcartT.getValueAt(row, 1)) {
                dt.removeRow(foodcartT.convertRowIndexToModel(row));
                
            } 
        }
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price
        
        dt.addRow(v);
        
  }
    
public void cal(){
    //cal total table values
   
   int numOfRow = foodcartT.getRowCount() ;
   double tot = 0.0 ;
   
       for (int i = 0; i < numOfRow; i++) {
           
           double priceV = Double.parseDouble(foodcartT.getValueAt(i, 2).toString());
           double quantV = Double.parseDouble(foodcartT.getValueAt(i, 3).toString());
          
           tot += priceV*quantV ;
           
       }
       
       DecimalFormat df = new DecimalFormat("00.00") ;
       total.setText(df.format(tot));
    
   
   
   } 
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        q12 = new javax.swing.JLabel();
        q13 = new javax.swing.JLabel();
        q14 = new javax.swing.JLabel();
        q15 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        q16 = new javax.swing.JLabel();
        q17 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        codes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodcartT = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dis = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        pay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        promotxt = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        distxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 60, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 60, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 50, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton10.setText("ADD");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 60, -1));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton11.setText("ADD");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 60, -1));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton12.setText("ADD");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 50, -1));

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton13.setText("ADD");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 60, -1));

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton14.setText("ADD");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 50, -1));

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton15.setText("ADD");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 50, -1));

        q1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q1.setText("0");
        jPanel2.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 37, -1));

        q2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q2.setText("0");
        jPanel2.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 37, -1));

        q3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q3.setText("0");
        jPanel2.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 37, -1));

        q4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q4.setText("0");
        jPanel2.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 10, -1));

        q5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q5.setText("0");
        jPanel2.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 10, -1));

        q10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q10.setText("0");
        jPanel2.add(q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        q11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q11.setText("0");
        jPanel2.add(q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        q12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q12.setText("0");
        jPanel2.add(q12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        q13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q13.setText("0");
        jPanel2.add(q13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        q14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q14.setText("0");
        jPanel2.add(q14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        q15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q15.setText("0");
        jPanel2.add(q15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton22.setText("MINUS");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 60, -1));

        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton23.setText("MINUS");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 70, 20));

        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton24.setText("MINUS");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 60, -1));

        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton25.setText("MINUS");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 60, -1));

        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton26.setText("MINUS");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 60, -1));

        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton27.setText("MINUS");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, -1));

        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton28.setText("MINUS");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 60, -1));

        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton29.setText("MINUS");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 60, -1));

        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton30.setText("MINUS");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 250, 60, -1));

        jButton31.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton31.setText("MINUS");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 60, -1));

        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton32.setText("MINUS");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 60, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorelei\\Downloads\\1D.gif")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 840, 470));

        jTabbedPane1.addTab("BURGERS", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton16.setText("ADD");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jButton17.setText("ADD");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        q16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q16.setText("0");
        jPanel4.add(q16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        q17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        q17.setText("0");
        jPanel4.add(q17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        jButton38.setText("MINUS");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jButton39.setText("MINUS");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorelei\\Downloads\\1A.gif")); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 830, 450));

        jTabbedPane1.addTab("FRIES", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 75, -1));

        jButton7.setText("ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 75, -1));

        jButton8.setText("ADD");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 75, -1));

        jButton9.setText("ADD");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 75, -1));

        q6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q6.setText("0");
        jPanel5.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 37, -1));

        q7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q7.setText("0");
        jPanel5.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 37, -1));

        q8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q8.setText("0");
        jPanel5.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 37, -1));

        q9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q9.setText("0");
        jPanel5.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 37, -1));

        jButton33.setText("MINUS");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jButton35.setText("MINUS");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jButton36.setText("MINUS");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jButton37.setText("MINUS");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam/1B.gif"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 830, 450));

        jTabbedPane1.addTab("SANDWICHES", jPanel5);

        codes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodcartT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FOOD", "PRICES", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        foodcartT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(foodcartT);
        if (foodcartT.getColumnModel().getColumnCount() > 0) {
            foodcartT.getColumnModel().getColumn(0).setResizable(false);
            foodcartT.getColumnModel().getColumn(1).setResizable(false);
            foodcartT.getColumnModel().getColumn(2).setResizable(false);
            foodcartT.getColumnModel().getColumn(3).setResizable(false);
        }

        codes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 320));

        jButton18.setText("DELETE");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        codes.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("TOTAL");
        codes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CASH");
        codes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("BALANCE");
        codes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total.setText("0");
        codes.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        bal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bal.setText("0");
        codes.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ENTER SENIOR CITEZENSHIP ");
        codes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("PIN NUMBER TO GET 5% DISCOUNT");
        codes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        dis.setText("GET DISCOUNT");
        dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disActionPerformed(evt);
            }
        });
        codes.add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jButton20.setText("CHECKOUT");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        codes.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, 90));

        ((AbstractDocument) pay.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        codes.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ENTER PROMO CODES");
        codes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        ((AbstractDocument) promotxt.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        promotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promotxtActionPerformed(evt);
            }
        });
        codes.add(promotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 120, -1));

        jButton21.setText("ENTER");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        codes.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        jButton19.setText("C");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        codes.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 90, 30));

        ((AbstractDocument) distxt.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        codes.add(distxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 130, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam/1o.jpg"))); // NOI18N
        codes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 830, -1));

        jTabbedPane1.addTab("FOOD CART", codes);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton34.setText("PRINT");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 62));

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 350, 329));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam/1o.jpg"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 830, 420));

        jTabbedPane1.addTab("RECEIPT", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 450));

        setSize(new java.awt.Dimension(845, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        
         String codes = promotxt.getText();
        
        try {
            pst =  con.prepareStatement ("SELECT * FROM vau");
            rs = pst.executeQuery();
            
            while (rs.next()){ 
                String code= rs.getString ("Code");
                
                
                if (codes.equals(code)){
                    double originalAmount= Double.parseDouble(total.getText());
                    double discountAmount = originalAmount * 0.03;
                    double discountedPrice = originalAmount - discountAmount;
                    total.setText(String.format("%.2f", discountedPrice));
                    JOptionPane.showMessageDialog(this,"ACCEPTED PAREH");
                        
                   
                    }else{
                    JOptionPane.showMessageDialog(this,"ITS NOT ACCEPTED PAREH");
                   }
              
              
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
      
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 1; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        
        
        cal();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 2; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 3; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // btn code
       // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 4; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 5; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 6; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 7; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 8; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 9; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 10; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q10.getText());
        ++i;
        q10.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 11; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q11.getText());
        ++i;
        q11.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 12; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q12.getText());
        ++i;
        q12.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 13; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q13.getText());
        ++i;
        q13.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 14; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q14.getText());
        ++i;
        q14.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 15; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q15.getText());
        ++i;
        q15.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 16; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q16.getText());
        ++i;
        q16.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         // btn code
        // btn code
        try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 17; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity + 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q17.getText());
        ++i;
        q17.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        // delete some iteam
       
              
        DefaultTableModel dt = (DefaultTableModel) foodcartT.getModel(); 
        
        String r = dt.getValueAt(foodcartT.getSelectedRow(), 0).toString();
       
        //remove product
        int rw = foodcartT.getSelectedRow();
        dt.removeRow(rw);       
        
        
       //remove Qty Lable
        System.out.println(r);
        switch (r) {
                   
                   case "1":                       
                   q1.setText("0");
                   break;
                   
                   case "2":                       
                   q2.setText("0");
                   break;
                   
                   case "3":                       
                   q3.setText("0");
                   break;
                   
                   case "4":                       
                   q4.setText("0");
                   break;
                   
                   case "5":                       
                   q5.setText("0");
                   break;
                   
                   case "6":                       
                   q6.setText("0");
                   
                   case "7":                       
                   q7.setText("0");
                   break;
                   
                   case "8":                       
                   q8.setText("0");
                   break;
                   
                   case "9":                       
                   q9.setText("0");
                   break;
                   
                   default:
                       System.out.println("over"); 
                        }
        
        cal(); // after iteam delete calculate total
        
    
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        double tot = Double.valueOf(total.getText());
        double paid = Double.valueOf(pay.getText());
        double balance = paid - tot ;
                
        DecimalFormat df = new DecimalFormat("00.00") ;   
       
       
        bal.setText(String.valueOf(df.format(balance)));
        if (balance < 0) {
        JOptionPane.showMessageDialog(this, "Insufficient payment! Please enter a higher amount.");
        }      
        
            
    }//GEN-LAST:event_jButton20ActionPerformed

    private void disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disActionPerformed
        // TODO add your handling code here:
        String pwd = new String(distxt.getPassword());
        
        try {
            pst =  con.prepareStatement ("SELECT * FROM seniordis");
            rs = pst.executeQuery();
            
            while (rs.next()){ 
                String password= rs.getString ("Password");
                
                
                if (pwd.equals(password)){
                    double originalAmount= Double.parseDouble(total.getText());
                    double discountAmount = originalAmount * 0.05;
                    double discountedPrice = originalAmount - discountAmount;
                    total.setText(String.format("%.2f", discountedPrice));
                        
                    
                    
                    
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Code Not Accepted");
                    
                }
              
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_disActionPerformed

    

    

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:

                    pay.setText("");
                    distxt.setText("");
                    promotxt.setText("");
                    bal.setText("");


    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        // bill print
    try {
        StringBuilder billText = new StringBuilder();
        billText.append("                        LORE EATS \n");
        billText.append("                        PLANET EARTH, \n");
        billText.append("                       ASIA PHILIPPINES, \n");
        billText.append("                         +9355977238, \n");
        billText.append("---------------------------------------------------------------------\n");
        billText.append("  Item \t\tQty \tPrice\n");
        billText.append("---------------------------------------------------------------------\n");

        DefaultTableModel df = (DefaultTableModel) foodcartT.getModel();

        // get table Product details
        for (int i = 0; i < foodcartT.getRowCount(); i++) {
            String Name = df.getValueAt(i, 1).toString();
            String Qty = df.getValueAt(i, 2).toString();
            String Price = df.getValueAt(i, 3).toString();
            billText.append("  ").append(Name).append("\t\t").append(Qty).append("\t").append(Price).append("\n");
        }

        billText.append("---------------------------------------------------------------------\n");
        billText.append("Sub Total : ").append(total.getText()).append("\n");
        billText.append("Cash      : ").append(pay.getText()).append("\n");
        billText.append("Balance   : ").append(bal.getText()).append("\n");
        billText.append("---------------------------------------------------------------------\n");
        billText.append("                   Thanks For Your Business...!\n");
        billText.append("---------------------------------------------------------------------\n");
        billText.append("                     LORE EATS \n");

        b.setText(billText.toString());
        b.print(); // print
        } catch (Exception e) {
            System.out.println(e);
        }

        
      
    }//GEN-LAST:event_jButton34ActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payActionPerformed

    private void promotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promotxtActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 15; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q15.getText());
        if (i > 0) {
    --i;
}
        q15.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 10; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q10.getText());
        if (i > 0) {
    --i;
}
        q10.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 11; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q11.getText());
        if (i > 0) {
    --i;
}
        q11.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
    try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 12; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q12.getText());
        if (i > 0) {
    --i;
}
        q12.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 13; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q13.getText());
        if (i > 0) {
    --i;
}
        q13.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 1; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q1.getText());
        if (i > 0) {
    --i;
}
        q1.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 2; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q2.getText());
        if (i > 0) {
    --i;
}
        q2.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 3; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q3.getText());
        if (i > 0) {
    --i;
}
        q3.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 5; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q5.getText());
        if (i > 0) {
    --i;
}
        q5.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 4; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q4.getText());
        if (i > 0) {
    --i;
}
        q4.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 14; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q14.getText());
        if (i > 0) {
    --i;
}
        q14.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 6; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q6.getText());
        if (i > 0) {
    --i;
}
        q6.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 7; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q7.getText());
        if (i > 0) {
    --i;
}
        q7.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 8; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q8.getText());
        if (i > 0) {
    --i;
}
        q8.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 9; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q9.getText());
        if (i > 0) {
    --i;
}
        q9.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 16; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q16.getText());
        if (i > 0) {
    --i;
}
        q16.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
         try {
    // Assuming you have established a valid database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root",""); // Replace with your database connection logic
    
         int itemID = 17; // Specify the item ID you want to update
    DefaultTableModel brgDFT = (DefaultTableModel) foodcartT.getModel();
    int rowCount = brgDFT.getRowCount();
    boolean itemFound = false;
    int rowIndex = -1;

    // Check if the item already exists in the table
    for (int i = 0; i < rowCount; i++) {
        int tableItemID = Integer.parseInt(brgDFT.getValueAt(i, 0).toString()); // Assuming item ID is in the first column (index 0)
        if (tableItemID == itemID) {
            itemFound = true;
            rowIndex = i;
            break;
        }
    }

    if (itemFound) {
        int currentQuantity = Integer.parseInt(brgDFT.getValueAt(rowIndex, 3).toString()); // Assuming Quantity is in the fourth column (index 3)
        int updatedQuantity = currentQuantity - 1;
        brgDFT.setValueAt(updatedQuantity, rowIndex, 3); // Assuming Quantity is in the fourth column (index 3)
    } else {
        pst = con.prepareStatement("SELECT ID, Item, Prices FROM stocks WHERE ID = ?");
        pst.setInt(1, itemID);
        ResultSet brg1rs = pst.executeQuery();

        if (brg1rs.next()) {
            Vector<String> brgV2 = new Vector<>();
            brgV2.add(brg1rs.getString("ID"));
            brgV2.add(brg1rs.getString("Item"));
            brgV2.add(brg1rs.getString("Prices"));
            brgV2.add("1"); // Initial quantity
            brgDFT.addRow(brgV2);
        }
    }

    pst.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(exam2.class.getName()).log(Level.SEVERE, null, ex);
}

        int i = Integer.parseInt(q17.getText());
        if (i > 0) {
    --i;
}
        q17.setText(String.valueOf(i));
        
        
        cal();
    }//GEN-LAST:event_jButton39ActionPerformed
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam2().setVisible(true);
            }
        });
    }
    static class NumericDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            // Allow only numeric characters
            if (string.matches("\\d+")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            // Allow only numeric characters
            if (text.matches("\\d+")) {
                super.replace(fb, offset, length, text, attrs);
            }
            else{
                fb.getDocument().remove(offset, length);
                fb.insertString(offset, "",attrs);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JLabel bal;
    private javax.swing.JPanel codes;
    private javax.swing.JButton dis;
    private javax.swing.JPasswordField distxt;
    private javax.swing.JTable foodcartT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField pay;
    private javax.swing.JTextField promotxt;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q12;
    private javax.swing.JLabel q13;
    private javax.swing.JLabel q14;
    private javax.swing.JLabel q15;
    private javax.swing.JLabel q16;
    private javax.swing.JLabel q17;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
