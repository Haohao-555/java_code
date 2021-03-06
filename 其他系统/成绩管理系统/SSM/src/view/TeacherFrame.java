/*
 * TeacherFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import model.Teacher;

/**
 *
 * @author  __USER__
 */
public class TeacherFrame extends javax.swing.JFrame {

	private Teacher t;

	/** Creates new form TeacherFrame */
	public TeacherFrame(Teacher t) {
		this.t = t;
		initComponents();
		this.setLocationRelativeTo(null);

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("\u4fee\u6539\u4e2a\u4eba\u8d44\u6599");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u67e5\u770b\u5168\u90e8\u6210\u7ee9");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(32, 32, 32).addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton2).addComponent(jButton1))
						.addContainerGap(32, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(27, 27, 27).addComponent(
						jButton1).addGap(18, 18, 18).addComponent(jButton2)
						.addContainerGap(27, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new TeacherCourseFrame(t).setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new TeacherInfoFrame(t).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	// End of variables declaration//GEN-END:variables

}