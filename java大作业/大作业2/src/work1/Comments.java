/*
 * Comments.java
 *
 * Created on __DATE__, __TIME__
 */

package work1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import work.Comment;
import work1.Checkcomment;
/**
 *
 * @author  __USER__
 */
public class Comments extends javax.swing.JFrame {
Comment comment1=new Comment("","","");

/** Creates new form Comments */

public Comments(String name) {
		this.setLocationRelativeTo(null);
		initComponents();
		this.jTextField1.setText(name);
		jTextField1.setEditable(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jRadioButton1 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("\u6b63\u5728\u64ad\u653e\u6b4c\u66f2:");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jRadioButton1.setText("\u70b9\u8d5e");

		jButton1.setText("\u8bc4\u8bba");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u786e\u5b9a");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												118,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(59, 59, 59).addComponent(
												jRadioButton1).addContainerGap(
												87, Short.MAX_VALUE))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(57, 57, 57)
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												126, Short.MAX_VALUE)
										.addComponent(jButton2).addGap(123,
												123, 123)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jRadioButton1)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel1)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(43, 43, 43)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addGap(34, 34, 34)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JOptionPane.showMessageDialog(null, "????????");

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String songname = JOptionPane.showInputDialog("??????????????");
		String name = JOptionPane.showInputDialog("????????????");
		String detail = JOptionPane.showInputDialog("??????????????");
		FileWriter fw;
		FileWriter fs;
		  try {
			fw = new FileWriter("file1.txt");
			fs = new FileWriter("file2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedWriter bs = new BufferedWriter(fs);
        bw.write(detail);
        bw.newLine();
        bw.flush();//????????
        bw.close();//????
        // ??????????????????file1.txt????????
        bs.write(songname);
        bs.newLine();
        bs.flush();//????????
        bs.close();//????
        // ??????????????????file1.txt????????
        JOptionPane.showMessageDialog(null, "????????");

	}catch (IOException e) {
		JOptionPane.showMessageDialog(this, e.getMessage());
       
    }
}
	
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Comments(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}