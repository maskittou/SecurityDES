/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package securitydes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author dell
 */
public class ProgramFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProgramFrame
     */
    DES des;

    public ProgramFrame() {
        initComponents();
        try {
            des = new DES();
        } catch (Exception e) {
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtBoxenc = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbl_enc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        TxtBoxKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtboxplain1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbl_dec = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Security Project");

        TxtBoxenc.setColumns(20);
        TxtBoxenc.setRows(5);
        jScrollPane1.setViewportView(TxtBoxenc);

        jLabel2.setText("Plain Text");

        jButton1.setText("Encrypt>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Decrypt>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl_enc.setBackground(new java.awt.Color(102, 255, 255));
        lbl_enc.setColumns(20);
        lbl_enc.setRows(5);
        jScrollPane2.setViewportView(lbl_enc);

        jLabel4.setText("Enc.Text");

        jLabel6.setText("Key");

        txtboxplain1.setColumns(20);
        txtboxplain1.setRows(5);
        jScrollPane3.setViewportView(txtboxplain1);

        lbl_dec.setBackground(new java.awt.Color(102, 255, 255));
        lbl_dec.setColumns(20);
        lbl_dec.setRows(5);
        jScrollPane4.setViewportView(lbl_dec);

        jButton3.setText("Encrypt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Text File ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Binary File");

        jButton4.setText("Decrypt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 255));
        jLabel3.setText("DES");

        jButton5.setText("FTP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton2))
                            .addComponent(jRadioButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBoxKey, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(463, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBoxKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGap(38, 38, 38))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public  void HandleFile( int mod,String filetype) throws FileNotFoundException, IOException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException {
        byte[] encbytes = null;
        byte[] bytesFile = null;
        String outputtext="";
       if(mod==1)
        JOptionPane.showMessageDialog(null, "Please select the file to Encrypt");
       else
           JOptionPane.showMessageDialog(null, "Please select the file to Decrypt");
       
        JFileChooser chooser = new JFileChooser("D:\\");
        
        if(filetype.equals("T"))
        { FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
chooser.setFileFilter(filter);
        }   
            
        int fb = chooser.showOpenDialog(null);

        String fileName = chooser.getSelectedFile().getPath();
        // if(filetype.equals("1")) //Binary file& Text File

        File myfile = new File(fileName);
        FileInputStream fis = new FileInputStream(myfile);
        bytesFile = new byte[(int) myfile.length()];
        fis.read(bytesFile);
     byte[] outputBytes=null;   
     
         
     if(mod==1&&filetype.equals("B"))
             {
             outputBytes = des.encrypt(bytesFile);
             }
             else
                 
                   if(mod==1&&filetype.equals("T"))
             {
              outputBytes = des.encrypt(bytesFile);
             }
     else
          if(mod==2&&filetype.equals("B"))
             {
             outputBytes = des.decryptBinary(bytesFile);
             }
             else
                 
                   if(mod==2&&filetype.equals("T"))
             {
            outputBytes = des.decryptBinary(bytesFile);
            
             }
                 
             
  if(mod==1)
  { JOptionPane.showMessageDialog(null, "Encryptian Done Successfully ");
        JOptionPane.showMessageDialog(null, "Please select the location/Filename to save encrypted file :");
  }
  else
      
  {
      JOptionPane.showMessageDialog(null, "Decryptian Done Successfully ");
        JOptionPane.showMessageDialog(null, "Please select the location/Filename to save Decrypted file :");
  }
                //Saving encrypted file
        chooser.showSaveDialog(null);

        if(filetype.equals("B"))
        { FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile().getPath());
        System.out.println(outputBytes);
        fos.write(outputBytes);
        fos.flush();
        
                }
        else  if(filetype.equals("T"))
        {
       FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile().getPath()+".txt");
        System.out.println(outputBytes);
        fos.write(outputBytes);
        fos.flush();
        
        }
            
 
 }
 
  public  File HandleFileTP( int mod,String filetype) throws FileNotFoundException, IOException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchPaddingException, InvalidKeySpecException, InvalidAlgorithmParameterException {
        byte[] encbytes = null;
        byte[] bytesFile = null;
        String outputtext="";
       if(mod==1)
        JOptionPane.showMessageDialog(null, "Please select the file to Encrypt");
       else
           JOptionPane.showMessageDialog(null, "Please select the file to Decrypt");
       
        JFileChooser chooser = new JFileChooser("D:\\");
        
        if(filetype.equals("T"))
        { FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
chooser.setFileFilter(filter);
        }   
            
        int fb = chooser.showOpenDialog(null);

        String fileName = chooser.getSelectedFile().getPath();
        // if(filetype.equals("1")) //Binary file& Text File

        File myfile = new File(fileName);
        FileInputStream fis = new FileInputStream(myfile);
        bytesFile = new byte[(int) myfile.length()];
        fis.read(bytesFile);
     byte[] outputBytes=null;   
     
         
     if(mod==1&&filetype.equals("B"))
             {
             outputBytes = des.encrypt(bytesFile);
             }
             else
                 
                   if(mod==1&&filetype.equals("T"))
             {
              outputBytes = des.encrypt(bytesFile);
             }
     else
          if(mod==2&&filetype.equals("B"))
             {
             outputBytes = des.decryptBinary(bytesFile);
             }
             else
                 
                   if(mod==2&&filetype.equals("T"))
             {
            outputBytes = des.decryptBinary(bytesFile);
            
             }
                 
             
  if(mod==1)
  { JOptionPane.showMessageDialog(null, "Encryptian Done Successfully ");
        JOptionPane.showMessageDialog(null, "Please select the location/Filename to save encrypted file :");
  }
  else
      
  {
      JOptionPane.showMessageDialog(null, "Decryptian Done Successfully ");
        JOptionPane.showMessageDialog(null, "Please select the location/Filename to save Decrypted file :");
  }
                //Saving encrypted file
        chooser.showSaveDialog(null);

        if(filetype.equals("B"))
        { FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile().getPath());
        System.out.println(outputBytes);
        fos.write(outputBytes);
        fos.flush();
        
                }
        else  if(filetype.equals("T"))
        {
       FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile().getPath());
        System.out.println(outputBytes);
        fos.write(outputBytes);
        fos.flush();
        
        }
        
        return  chooser.getSelectedFile();
 
 }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         if (TxtBoxKey.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "The Key should be equal or less  than 7 character ");
            return;
        }
             if (TxtBoxKey.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter the DES KEy ");
            return;
        }
             
        // TODO add your handling code here:
        try {
            String txt = txtboxplain1.getText();


            updateKey();

            byte[] encarr = des.encrypt(txt);
            String enc = new BASE64Encoder().encode(encarr);
            //JOptionPane.showMessageDialog(null, rsa);
            System.out.println("encrypted " + enc);
            JOptionPane.showMessageDialog(null, "Encryption Done ..\n");
           
            lbl_enc.setText(enc);
  
          //  String dec = des.decrypt(encarr);
            // byte[]dec= rsa.decrypt(new BigInteger((new String(arr)).getBytes())).toByteArray();
          
            //System.out.println("decrypted " + new String(dec));
            //JOptionPane.showMessageDialog(null, "After decryption of " + enc + "\n The result is \n" + dec);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Incorrect Key for the given text , please try another Key");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         if (TxtBoxKey.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "The Key should be equal or less  than 7 character ");
            return;
        }
             if (TxtBoxKey.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter the DES KEy ");
            return;
        }
             
         String txt = TxtBoxenc.getText();
                            updateKey();

        try {
            byte[] input = txt.getBytes("ASCII");
            
              System.out.println("encrypted " + txt);

                input=new BASE64Decoder().decodeBuffer(txt);
                String dec = des.decrypt(input);
                // byte[]dec= rsa.decrypt(new BigInteger((new String(arr)).getBytes())).toByteArray();
                System.out.println("decrypted " + new String(dec));
                  lbl_dec.setText(dec);
                JOptionPane.showMessageDialog(null, "After decryption of " + txt + "\n The result is \n" + dec);
                //  byte[]dec= rc4.decrypt(new BigInteger(s.getBytes())).toByteArray();
                //byte[] arr=rsa.decrypt(new BigInteger(input)).toByteArray();
                //  System.out.println("decrypted "+new String(dec));
                //  return new String(dec)
            
            
            
            
            
            
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Incorrect Key for the given text , please try another Key");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         if (TxtBoxKey.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "The Key should be equal or less  than 7 character ");
            return;
        }
             if (TxtBoxKey.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter the DES KEy ");
            return;
        }
        // TODO add your handling code here:
         updateKey();
        try
        {
        if(jRadioButton1.isSelected()) //Text File
        {
            HandleFile(1, "T");
        
        }
        else   if(jRadioButton2.isSelected()) //binary File
        {
             HandleFile(1, "B");
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        
        }
        
            
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         if (TxtBoxKey.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "The Key should be equal or less  than 7 character ");
            return;
        }
             if (TxtBoxKey.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter the DES KEy ");
            return;
        }
             
        updateKey();

     try
        {
        if(jRadioButton1.isSelected()) //Text File
        {
            HandleFile(2, "T");
        
        }
        else   if(jRadioButton2.isSelected()) //binary File
        {
             HandleFile(2, "B");
        }
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         if (TxtBoxKey.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "The Key should be equal or less  than 7 character ");
            return;
        }
             if (TxtBoxKey.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter the DES KEy ");
            return;
        }
            updateKey();
        
          FTPClient ftp = new FTPClient();
        int reply;

        try {

            ftp.connect("127.0.0.1",21  );
            
            ftp.login("FTPUser","root");
            reply = ftp.getReplyCode();
            System.out.println(reply);
           if(FTPReply.isPositiveCompletion(reply)){
                System.out.println("Connected Success");
            }else {
                System.out.println("Connection Failed");
                ftp.disconnect();
            }

            FileInputStream fis = null;
      
       File encFile=HandleFileTP(1, "T");
              String filename =encFile.getName();
            fis = new FileInputStream(encFile.getPath());
            System.out.println("Is file stored: "+ ftp.storeFile(filename,fis));
            
            JOptionPane.showMessageDialog(null, "File uploaded  to the server !");
            fis.close();
            ftp.disconnect();
        } catch(Exception e)
        {e.printStackTrace();}
    }//GEN-LAST:event_jButton5ActionPerformed

    public void updateKey() {
        if (TxtBoxKey.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "The Key should be equal or less  than 7 character ");
            return;
        }
             if (TxtBoxKey.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter the DES KEy ");
            return;
        }
             
        String keyString = TxtBoxKey.getText();
        for (int i = 1; keyString.length() < 8; i++) {
            keyString += 'A';
        }

        des.SetKey(keyString);

    }

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
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtBoxKey;
    private javax.swing.JTextArea TxtBoxenc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea lbl_dec;
    private javax.swing.JTextArea lbl_enc;
    private javax.swing.JTextArea txtboxplain1;
    // End of variables declaration//GEN-END:variables
}