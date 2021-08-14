/*
 * UloginMenus.java
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

import model.User;

import client.Client;

/**
 *
 * @author  __USER__
 */
public class UloginMenus extends javax.swing.JFrame {

	/** Creates new form UloginMenus */
	public UloginMenus() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.jPasswordField1.setEchoChar('*');
		ImageIcon bk = new ImageIcon(this.getClass().getResource("捕获.png"));
		jLabel4.setIcon(bk);
		jLabel4.setBounds(0, 0, 1000, 800);
		this.getLayeredPane().add(jLabel4, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
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
		jLabel3 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jCheckBox1 = new javax.swing.JCheckBox();
		jButton3 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("\u767b\u5f55\u754c\u9762");

		jLabel3.setText("\u5bc6\u7801\uff1a");

		jButton1.setText("\u767b\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5fd8\u8bb0\u5bc6\u7801");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jCheckBox1.setText("\u663e\u793a\u5bc6\u7801");
		jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jCheckBox1MouseClicked(evt);
			}
		});

		jButton3.setText("\u6ce8\u518c");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel2.setText("\u8d26\u53f7\uff1a");

		jLabel4.setText("jLabel4");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										224, Short.MAX_VALUE).addComponent(
										jCheckBox1).addGap(67, 67, 67))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addGap(
																				53,
																				53,
																				53)
																		.addComponent(
																				jButton1)
																		.addGap(
																				34,
																				34,
																				34)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				34,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton3))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addGap(
																				24,
																				24,
																				24)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel2)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												256,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jPasswordField1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												253,
																												Short.MAX_VALUE)))))
										.addGap(40, 40, 40))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(156, 156, 156)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addComponent(jLabel1))
										.addContainerGap(164, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(3, 3, 3)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)
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
										.addGap(6, 6, 6)
										.addComponent(jCheckBox1)
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																29,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton3)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(53, 53, 53)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new RegisterMenu().setVisible(true);
	}

	private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		if (this.jCheckBox1.isSelected()) {
			this.jPasswordField1.setEchoChar((char) 0);
		} else {
			this.jPasswordField1.setEchoChar('*');
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new ForgetpwMenu().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String number = this.jTextField1.getText();
		String pw = this.jPasswordField1.getText();

		try {
			User u = Client.Ulogin(number, pw);
			JOptionPane.showMessageDialog(this, "欢迎用户“" + u.getName()
					+ "”使用快递系统");
			this.dispose();
			new U_Menus(u).setVisible(true);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "服务器异常");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "服务器未连接");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "服务端数据传输错误");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "密码或账号错误");

		}
	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (this.jCheckBox1.isEnabled()) {
			this.jPasswordField1.setEchoChar((char) 0);
		} else {
			this.jPasswordField1.setEchoChar('.');
		}
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}