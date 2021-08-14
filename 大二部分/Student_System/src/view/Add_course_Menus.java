/*
 * Add_course_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import untity.Admin_Impl;
import entity.Admin;

/**
 *
 * @author  __USER__
 */
public class Add_course_Menus extends javax.swing.JFrame {
	Admin ad;
	String tea_name;
	ArrayList<String> tea_namelist = new ArrayList<String>();

	private void init() {
		this.jTextField1.setText("");
		this.jTextField2.setText("");
		this.jTextField5.setText("");
		this.jTextField6.setText("");
	}

	private void init1() {
		try {
			tea_namelist = Admin_Impl.get_tea_name();
			for (String name : tea_namelist) {
				this.jComboBox1.addItem(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** Creates new form Add_course_Menus */
	public Add_course_Menus(Admin a) {
		ad = a;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		init1();
		ImageIcon bk = new ImageIcon(this.getClass().getResource("../背景.jpg"));
		jLabel1.setIcon(bk);
		jLabel1.setBounds(0, 0, 800, 500);
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
jTextField1 = new javax.swing.JTextField();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jTextField2 = new javax.swing.JTextField();
jTextField5 = new javax.swing.JTextField();
jTextField6 = new javax.swing.JTextField();
jComboBox1 = new javax.swing.JComboBox();
jLabel7 = new javax.swing.JLabel();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

jLabel1.setText("jLabel1");

jLabel2.setFont(new java.awt.Font("宋体", 0, 24));
jLabel2.setText("\u5f55\u5165\u8bfe\u7a0b");

jLabel3.setFont(new java.awt.Font("宋体", 0, 15));
jLabel3.setText("\u8bfe\u7a0b\uff1a");

jLabel4.setFont(new java.awt.Font("宋体", 0, 15));
jLabel4.setText("\u5b66\u5206\uff1a");

jLabel5.setFont(new java.awt.Font("宋体", 0, 15));
jLabel5.setText("\u65f6\u95f4\uff1a");

jLabel6.setFont(new java.awt.Font("宋体", 0, 15));
jLabel6.setText("\u6570\u91cf\uff1a");

jButton1.setText("\u786e\u5b9a");
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

jTextField6.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jTextField6ActionPerformed(evt);
}
});


jComboBox1.addItemListener(new java.awt.event.ItemListener() {
public void itemStateChanged(java.awt.event.ItemEvent evt) {
jComboBox1ItemStateChanged(evt);
}
});

jLabel7.setFont(new java.awt.Font("宋体", 0, 15));
jLabel7.setText("\u8bf7\u9009\u62e9\u6388\u8bfe\u8001\u5e08\uff1a");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addGroup(layout.createSequentialGroup()
.addGap(33, 33, 33)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel5)
.addComponent(jLabel3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(34, 34, 34)
.addComponent(jLabel4))
.addGroup(layout.createSequentialGroup()
.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jLabel6)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addGap(141, 141, 141)
.addComponent(jLabel7)
.addGap(33, 33, 33)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addContainerGap(44, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGap(127, 127, 127)
.addComponent(jButton1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
.addComponent(jButton2)
.addGap(132, 132, 132))
.addGroup(layout.createSequentialGroup()
.addGap(241, 241, 241)
.addComponent(jLabel2)
.addContainerGap(248, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(10, 10, 10)
.addComponent(jLabel2)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel4)
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(41, 41, 41)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel6)
.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel7)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(83, 83, 83)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jButton2))
.addContainerGap(54, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents
	private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			tea_name = (String) this.jComboBox1.getSelectedItem();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String course = this.jTextField1.getText();
		int credit = Integer.parseInt(this.jTextField2.getText());
		String co_time = this.jTextField5.getText();
		int number = Integer.parseInt(this.jTextField6.getText());
		try {
			Admin_Impl.add_course(course, credit, co_time, number, tea_name);
			JOptionPane.showMessageDialog(this, "增加成功");
			init();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new Course_Menus(ad).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables

}