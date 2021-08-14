/*
 * Scheckrequest.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Admin;
import model.Request;
import model.Student;

/**
 *
 * @author  __USER__
 */
public class Scheckrequest extends javax.swing.JFrame {

	/** Creates new form Scheckrequest */
	public void load(String student) {
		try {
			ArrayList<Request> request = Student.checkrequest(student);
			Object title[] = { "序号", "时间", "课程", "课程老师", "上课时间", "申请人", "情况" };
			Object detail[][] = new Object[request.size()][7];
			for (int i = 0; i < request.size(); i++) {
				detail[i][0] = request.get(i).getId();
				detail[i][1] = request.get(i).getCtime();
				detail[i][2] = request.get(i).getCourse();
				detail[i][3] = request.get(i).getTeacher();
				detail[i][4] = request.get(i).getCoursetime();
				detail[i][5] = request.get(i).getStudent();
				detail[i][6] = request.get(i).getCondition();
			}
			this.jTable1.setModel(new DefaultTableModel(detail, title));
			 jTable1.setEnabled(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "错误");
		}
	}

	public Scheckrequest(String student) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.jLabel2.setText(student);
		this.jLabel3.setText("的请假表");
		load(student);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setText("jLabel2");

		jButton1.setText("\u5237\u65b0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setText("jLabel3");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 471,
								Short.MAX_VALUE)
						.addGroup(
								layout.createSequentialGroup().addGap(175, 175,
										175).addComponent(jLabel1)
										.addContainerGap(296, Short.MAX_VALUE))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(137, 137, 137)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												100, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(58, 58,
												58)));
		layout
				.setVerticalGroup(layout
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
																				7,
																				7,
																				7)
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel3)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton1)))
										.addGap(13, 13, 13)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												206,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(68, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		load(this.jLabel2.getText());
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Scheckrequest(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}