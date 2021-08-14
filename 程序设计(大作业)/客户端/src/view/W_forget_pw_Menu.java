/*
 * W_forget_pw_Menu.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import client.Client;

/**
 *
 * @author  __USER__
 */
public class W_forget_pw_Menu extends javax.swing.JFrame {

	/** Creates new form W_forget_pw_Menu */
	public W_forget_pw_Menu() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.jPasswordField1.setEchoChar('*');
		this.jPasswordField2.setEchoChar('*');
		ImageIcon bk = new ImageIcon(this.getClass().getResource("捕获.png"));
		jLabel5.setIcon(bk);
		jLabel5.setBounds(0, 0, 500, 500);
		this.getLayeredPane().add(jLabel5, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
		ImageIcon bk1 = new ImageIcon(this.getClass().getResource("1.jpg"));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u59d3\u540d\uff1a");

		jLabel2.setText("\u5de5\u53f7\uff1a");

		jLabel3.setText("\u65e7\u5bc6\u7801\uff1a");

		jLabel4.setText("\u65b0\u5bc6\u7801\uff1a");

		jButton1.setText("\u63d0\u4ea4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jCheckBox1.setText("\u663e\u793a\u5bc6\u7801");
		jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jCheckBox1MouseClicked(evt);
			}
		});
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

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
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jCheckBox1))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addGap(
																								33,
																								33,
																								33)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel1)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																192,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel2)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				layout
																																						.createSequentialGroup()
																																						.addGroup(
																																								layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																										.addComponent(
																																												jLabel3)
																																										.addComponent(
																																												jLabel4))
																																						.addGap(
																																								3,
																																								3,
																																								3)))
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addComponent(
																																								jTextField2,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								192,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jPasswordField1))
																																		.addGroup(
																																				layout
																																						.createSequentialGroup()
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jPasswordField2,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								192,
																																								Short.MAX_VALUE))))))
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addGap(
																								125,
																								125,
																								125)
																						.addComponent(
																								jButton1))))
										.addContainerGap(33, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										137, Short.MAX_VALUE).addComponent(
										jLabel5).addGap(132, 132, 132)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(16, 16, 16)
										.addComponent(jLabel5)
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel1))
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jCheckBox1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												43, Short.MAX_VALUE)
										.addComponent(jButton1)
										.addContainerGap()));

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

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = this.jTextField1.getText();
		String number = this.jTextField2.getText();
		String pw = this.jPasswordField1.getText();
		String xpw = this.jPasswordField2.getText();
		try {
			Client.w_alter_pw(name, number, xpw, pw);
			JOptionPane.showMessageDialog(this, "密码修改成功");
			this.dispose();
			new W_login_Menus().setVisible(true);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}