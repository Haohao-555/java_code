/*
 * Requesttable.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Admin;
import model.Gg;
import model.Request;
import model.Student;

/**
 *
 * @author  __USER__
 */
public class Requesttable extends javax.swing.JFrame {

	/** Creates new form Requesttable */
	public void load() {

		ArrayList<Request> request;
		try {
			request = Admin.AviewAllrequest();
			Object title[] = { "序号", "时间", "课程", "课程老师", "上课时间", "申请人" };
			Object detail[][] = new Object[request.size()][6];
			for (int i = 0; i < request.size(); i++) {
				detail[i][0] = request.get(i).getId();
				detail[i][1] = request.get(i).getCtime();
				detail[i][2] = request.get(i).getCourse();
				detail[i][3] = request.get(i).getTeacher();
				detail[i][4] = request.get(i).getCoursetime();
				detail[i][5] = request.get(i).getStudent();
			}
			this.jTable1.setModel(new DefaultTableModel(detail, title));
			jTable1.setEnabled(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Requesttable() {
		initComponents();
		this.setLocationRelativeTo(null);
		try {
			load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "错误");
		}
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
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("\u8bf7    \u5047    \u603b    \u8868");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setText("\u8bf7\u8f93\u5165ID\u7801\uff1a");

		jButton1.setText("\u67e5\u770b");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5237\u65b0");
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
										.addGap(137, 137, 137)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												198, Short.MAX_VALUE)
										.addComponent(jButton2).addGap(27, 27,
												27)).addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 533,
								Short.MAX_VALUE).addGroup(
								layout.createSequentialGroup().addGap(46, 46,
										46).addComponent(jLabel2).addGap(32,
										32, 32).addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										167,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(66, 66, 66).addComponent(
												jButton1).addGap(69, 69, 69)));
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
														.addComponent(jLabel1)
														.addComponent(jButton2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												170,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(39, 39, 39)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addContainerGap(75, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "错误");
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int id = Integer.parseInt(this.jTextField1.getText());
		try {
			Request request = Admin.checkrequest(id);
			new OneRequest(request).setVisible(true);
			this.dispose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "错误");

		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Requesttable().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}