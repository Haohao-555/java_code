/*
 * Add_tea_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import untity.Admin_Impl;
import entity.Admin;

/**
 *
 * @author  __USER__
 */
public class Add_tea_Menus extends javax.swing.JFrame {
	Admin ad;

	private void init() {
		this.jTextField1.setText("");
		this.jTextField2.setText("");

	}

	/** Creates new form Add_tea_Menus */
	public Add_tea_Menus(Admin a) {
		ad = a;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		ImageIcon bk = new ImageIcon(this.getClass().getResource("../????.jpg"));
		jLabel1.setIcon(bk);
		jLabel1.setBounds(0, 0, 500, 300);
		this.getLayeredPane().add(jLabel1, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
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
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("????", 0, 24));
		jLabel2.setText("\u6559\u5e08\u7ba1\u7406");

		jLabel3.setFont(new java.awt.Font("????", 0, 15));
		jLabel3.setText("\u540d\u5b57\uff1a");

		jLabel4.setFont(new java.awt.Font("????", 0, 15));
		jLabel4.setText("\u6240\u5c5e\u5b66\u9662\uff1a");

		jButton1.setText("\u589e\u52a0\u6559\u5e08");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u8fd4\u56de");
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
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				50,
																				50,
																				50)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jTextField2))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addGap(
																												43,
																												43,
																												43)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												208,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addComponent(jLabel1)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				170,
																				170,
																				170)
																		.addComponent(
																				jLabel2)))
										.addContainerGap(57, Short.MAX_VALUE))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(85, 85, 85)
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												85, Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												85,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(55, 55, 55)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addGap(21, 21, 21)
										.addComponent(jLabel2)
										.addGap(27, 27, 27)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(32, 32, 32)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addContainerGap(36, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String name = this.jTextField1.getText();
		String college = this.jTextField2.getText();
		try {
			Admin_Impl.add_tea(name, college);
			JOptionPane.showMessageDialog(this, "??????ʦ?ɹ?");
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new Admin_Menus(ad).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}