/*
 * TeacherMenu.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import javax.swing.JOptionPane;

import model.Teacher;

/**
 *
 * @author  __USER__
 */
public class TeacherMenu extends javax.swing.JFrame {

	/** Creates new form TeacherMenu */
	public TeacherMenu(Teacher teacher) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.jLabel2.setText(teacher.getTeacher());
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
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("\u4e2d\u5c71\u5927\u5b66\u5357\u65b9\u5b66\u9662");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10));
		jLabel2.setForeground(new java.awt.Color(204, 0, 0));
		jLabel2.setText("jLabel2");

		jButton1.setText("\u53d1\u5e03\u516c\u544a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u67e5\u770b\u516c\u544a");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u8bfe\u5802\u70b9\u540d");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u67e5\u770b\u8bf7\u5047");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("\u6210\u7ee9\u5f55\u5165");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("\u9000      \u51fa");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
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
								layout.createSequentialGroup().addGap(147, 147,
										147).addComponent(jLabel1)
										.addContainerGap(151, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										288, Short.MAX_VALUE).addComponent(
										jLabel2).addGap(95, 95, 95))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(97, 97, 97)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton6))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton4))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				48,
																				48,
																				48)
																		.addComponent(
																				jButton2)))
										.addContainerGap(87, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(28, 28, 28)
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(jLabel2)
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton1))
										.addGap(34, 34, 34)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton4))
										.addGap(31, 31, 31)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton5)
														.addComponent(jButton6))
										.addContainerGap(50, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String teacher = this.jLabel2.getText();
		String course = JOptionPane.showInputDialog("??????????????:");
		try {
			boolean a = Teacher.checkteachercourse(course, teacher);
			if (a == true) {
				new Insertgrade(course,teacher).setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "??????????????");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String teacher = this.jLabel2.getText();
		String course = JOptionPane.showInputDialog("??????????????:");

		try {
			boolean a = Teacher.checkteachercourse(course, teacher);
			if (a == true) {
				new Requestclassmenu(course, teacher).setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "??????????????");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String course = JOptionPane.showInputDialog("??????????????:");
		new Classstudent(course).setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new Ggtable().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new PublishMenu().setVisible(true);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JOptionPane.showMessageDialog(this, "????????");
		System.exit(0);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TeacherMenu(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	// End of variables declaration//GEN-END:variables

}