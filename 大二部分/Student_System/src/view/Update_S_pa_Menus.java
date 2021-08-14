/*
 * Update_S_pa_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import untity.Student_Impl;
import entity.Student;

/**
 *
 * @author  __USER__
 */
public class Update_S_pa_Menus extends javax.swing.JFrame {
	Student stu;

	/** Creates new form Update_S_pa_Menus */
	public Update_S_pa_Menus(Student st) {
		stu = st;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.jLabel2.setText(" ");
		this.jPasswordField1.setEchoChar('*');
		this.jPasswordField2.setEchoChar('*');
		ImageIcon bk = new ImageIcon(this.getClass().getResource("../±³¾°.jpg"));
		jLabel5.setIcon(bk);
		jLabel5.setBounds(0, 0, 500, 300);
		this.getLayeredPane().add(jLabel5, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPasswordField2 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jCheckBox2 = new javax.swing.JCheckBox();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("ËÎÌå", 0, 15));
		jLabel1.setText("\u65e7\u5bc6\u7801\uff1a");

		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10));
		jLabel2.setForeground(new java.awt.Color(255, 0, 0));
		jLabel2.setText("jLabel2");

		jLabel3.setFont(new java.awt.Font("ËÎÌå", 0, 15));
		jLabel3.setText("\u65b0\u5bc6\u7801\uff1a");

		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jCheckBox2.setText("\u663e\u793a\u5bc6\u7801");
		jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jCheckBox2MouseClicked(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("ËÎÌå", 0, 24));
		jLabel4.setText("\u4fee\u6539\u5bc6\u7801");

		jLabel5.setText("jLabel5");

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
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				54,
																				54,
																				54)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel3)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jPasswordField2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																148,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																167,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jCheckBox2)))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel4)
																														.addComponent(
																																jPasswordField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																145,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel2))
														.addComponent(jLabel5)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				146,
																				146,
																				146)
																		.addComponent(
																				jButton1)))
										.addContainerGap(19, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addComponent(jLabel5)
										.addGap(19, 19, 19)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												40, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jPasswordField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(3, 3, 3)
										.addComponent(jCheckBox2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton1).addGap(26, 26,
												26)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {
		if (this.jCheckBox2.isSelected()) {
			this.jPasswordField2.setEchoChar((char) 0);
		} else {
			this.jPasswordField2.setEchoChar('*');
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String oldpa = this.jPasswordField1.getText();
		String newpa = this.jPasswordField2.getText();
		if (oldpa.equals(stu.getPa())) {
			this.jLabel2.setText(" ");
			try {
				Student_Impl.update_pa(stu.getName(), newpa);
				JOptionPane.showMessageDialog(this, "ÐÞ¸Ä³É¹¦");
				this.dispose();
				new Student_Menus(stu).setVisible(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			this.jLabel2.setText("ÃÜÂë´íÎó");
		}
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	// End of variables declaration//GEN-END:variables

}