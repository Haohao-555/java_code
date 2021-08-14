/*
 * RegisterMenu.java
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
public class RegisterMenu extends javax.swing.JFrame {
	final String site = "广东省  广州市 从化区 温泉镇  温泉大道882号中山大学南方学院";

	/** Creates new form RegisterMenu */
	public RegisterMenu() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.jTextField3.setText(site);
		this.jTextField3.setEditable(false);
		this.jPasswordField1.setEchoChar('*');
		ImageIcon bk = new ImageIcon(this.getClass().getResource("捕获.png"));
		jLabel6.setIcon(bk);
		jLabel6.setBounds(0, 0, 500, 500);
		this.getLayeredPane().add(jLabel6, new Integer(Integer.MIN_VALUE));
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
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jCheckBox1 = new javax.swing.JCheckBox();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("\u4fe1\u606f\u8868");

		jLabel2.setText("\u59d3\u540d\uff1a");

		jLabel3.setText("\u7535\u8bdd\uff1a");

		jLabel4.setText("\u5730\u5740\uff1a");

		jLabel5.setText("\u5bc6\u7801\uff1a");

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
				actionPerformed(evt);
			}
		});

		jLabel6.setText("jLabel6");

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
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel2)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								135,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(
																								45,
																								45,
																								45)
																						.addComponent(
																								jLabel3)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField2))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel4)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								365,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jPasswordField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				123,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				43,
																				43,
																				43)
																		.addComponent(
																				jCheckBox1)))
										.addContainerGap(30, Short.MAX_VALUE))
						.addGroup(
								layout.createSequentialGroup().addGap(185, 185,
										185).addComponent(jButton1)
										.addContainerGap(213, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(209, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel6)
														.addComponent(jLabel1))
										.addGap(200, 200, 200)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(57, 57, 57)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(57, 57, 57)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jCheckBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																21,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												44, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(32, 32,
												32)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {
		if (this.jCheckBox1.isSelected()) {
			this.jPasswordField1.setEchoChar((char) 0);
		} else {
			this.jPasswordField1.setEchoChar('*');
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int num = (int) (Math.random() * 10000);//产生随机账号
		String number = Integer.toString(10000 + num);
		System.out.printf(number);
		String name = this.jTextField1.getText();
		String phone = this.jTextField2.getText();
		String pw = this.jPasswordField1.getText();

		try {
			Client.register(name, phone, site, pw, number);
			JOptionPane.showMessageDialog(this, "注册成功您账号为" + number);
			this.dispose();
			new UloginMenus().setVisible(true);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "服务器异常");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "数据传输阻塞");
		}

	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}