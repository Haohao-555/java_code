/*
 * FeeMenus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Course;
import model.Courses;
import model.Student;

/**
 *
 * @author  __USER__
 */
public class FeeMenus extends javax.swing.JFrame {

	/** Creates new form FeeMenus */
	public void load(String student) {
		try {

			ArrayList<Courses> course = Student.checkmyfee(student);
			int a = this.Allfee(course);
			Object title[] = { "情况(1.成功 2.失败)", "课程", "课程老师", "学分", "费用",
					"交费情况" };
			Object detail[][] = new Object[course.size()][6];
			for (int i = 0; i < course.size(); i++) {
				detail[i][0] = course.get(i).getId();
				detail[i][1] = course.get(i).getCourse();
				detail[i][2] = course.get(i).getTeacher();
				detail[i][3] = course.get(i).getCredit();
				detail[i][4] = course.get(i).getFee();
				detail[i][5] = course.get(i).getConditions();

			}
			this.jTextField1.setText(String.valueOf(a));
			jTextField1.setEditable(false);
			this.jTable1.setModel(new DefaultTableModel(detail, title));
			jTable1.setEnabled(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "错误");
		}
	}

	private static int Allfee(ArrayList<Courses> course) {
		int a = 0;
		for (int i = 0; i < course.size(); i++) {
			a += course.get(i).getFee();
		}
		return a;
	}

	public FeeMenus(String student) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.jLabel3.setText(student);
		load(student);
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
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jLabel1.setText("\u7684\u4ea4\u8d39\u8868");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jButton1.setText("\u5237\u65b0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setText("\u603b\u8d39\u7528\u4e3a\uff1a");

		jButton2.setText("\u5168\u90e8\u4ea4\u8d39");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jLabel3.setText("jLabel3");

		jLabel4.setText("\u5143");

		jLabel5.setText("\u8bf7\u8f93\u5165ID:");

		jButton3.setText("\u4ea4\u8d39");

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
										183, Short.MAX_VALUE).addComponent(
										jLabel3).addGap(1, 1, 1).addComponent(
										jLabel1).addGap(150, 150, 150)
										.addComponent(jButton1).addGap(25, 25,
												25))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 526,
								Short.MAX_VALUE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(88, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				65,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jTextField2)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addGap(160, 160, 160)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3))
										.addGap(13, 13, 13)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												167,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(40, 40, 40)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(jLabel4)
														.addComponent(jButton2))
										.addGap(30, 30, 30)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton3))
										.addContainerGap(38, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		load(this.jLabel3.getText());
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FeeMenus(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}