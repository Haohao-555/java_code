/*
 * Update_T_pa_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import untity.Teacher_Impl;
import entity.Teacher;

/**
 *
 * @author  __USER__
 */
public class Update_T_pa_Menus extends javax.swing.JFrame {
	Teacher teacher;

	/** Creates new form Update_T_pa_Menus */
	public Update_T_pa_Menus(Teacher tea) {
		teacher = tea;
		initComponents();
		this.jPasswordField1.setEchoChar('*');
		this.jPasswordField2.setEchoChar('*');
		this.jLabel4.setText("");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		ImageIcon bk = new ImageIcon(this.getClass().getResource("../背景.jpg"));
		jLabel1.setIcon(bk);
		jLabel1.setBounds(0, 0, 500, 300);
		this.getLayeredPane().add(jLabel1, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jLabel4 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("宋体", 0, 15));
		jLabel2.setText("\u65e7\u5bc6\u7801\uff1a");

		jLabel3.setFont(new java.awt.Font("宋体", 0, 15));
		jLabel3.setText("\u65b0\u5bc6\u7801\uff1a");

		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPasswordField2MouseClicked(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10));
		jLabel4.setForeground(new java.awt.Color(255, 51, 51));
		jLabel4.setText("jLabel4");

		jCheckBox1.setFont(new java.awt.Font("宋体", 0, 15));
		jCheckBox1.setText("\u663e\u793a\u5bc6\u7801");
		jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jCheckBox1MouseClicked(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel5.setText("\u4fee\u6539\u5bc6\u7801");

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
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPasswordField2))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPasswordField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				215,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addContainerGap(62, Short.MAX_VALUE))
						.addGroup(
								layout.createSequentialGroup().addComponent(
										jLabel1).addContainerGap(329,
										Short.MAX_VALUE)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										252, Short.MAX_VALUE).addComponent(
										jCheckBox1).addGap(40, 40, 40))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										162, Short.MAX_VALUE).addComponent(
										jButton1).addGap(156, 156, 156))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										150, Short.MAX_VALUE).addComponent(
										jLabel5).addGap(135, 135, 135)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addGap(19, 19, 19)
										.addComponent(jLabel5)
										.addGap(28, 28, 28)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(1, 1, 1)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jCheckBox1).addGap(18,
												18, 18).addComponent(jButton1)
										.addContainerGap(40, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {
		if (this.jCheckBox1.isSelected()) {
			this.jPasswordField2.setEchoChar((char) 0);
		} else {
			this.jPasswordField2.setEchoChar('*');
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String oldpa = this.jPasswordField1.getText();
		String newpa = this.jPasswordField2.getText();
		if (oldpa.equals(teacher.getPa())) {
			try {
				Teacher_Impl.update_pa(teacher.getName(), newpa);
				JOptionPane.showMessageDialog(this, "修改成功");
				this.dispose();
				new Teacher_Menus(teacher).setVisible(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			this.jLabel4.setText("密码错误");
		}

	}

	private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	// End of variables declaration//GEN-END:variables

}