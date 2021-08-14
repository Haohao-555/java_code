/*
 * S_grade_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import untity.Student_Impl;

import entity.A;
import entity.Full_class_grade;
import entity.Student;

/**
 *
 * @author  __USER__
 */
public class S_grade_Menus extends javax.swing.JFrame {
	Student stu;
	ArrayList<Full_class_grade> full_class_grade = new ArrayList<Full_class_grade>();
	ArrayList<A> a=new ArrayList<A>();
	//初始化表格
	private void init1() {
		Object title[] = { "序号", "课程", "学分", "教师", "成绩", "绩点" };
		Object detail[][] = new Object[full_class_grade.size()][6];
		this.jTable1.setModel(new DefaultTableModel(detail, title));
	}
    //总绩点
	private void init2(){
		for(int i = 0; i < full_class_grade.size(); i++){
			if (full_class_grade.get(i).getFlag()==1&&full_class_grade.get(i).getGrade()>=60){
				a.add(new A(full_class_grade.get(i).getCredit(),full_class_grade.get(i).getGrade()));
			}
		}
		this.jTextField2.setText(Student_Impl.get_allgrade(a));
		this.jTextField2.setEditable(false);
	}
	public void init() {
		try {
			full_class_grade = Student_Impl.select_class(stu.getName());
			Object title[] = { "序号", "课程", "学分", "教师", "成绩", "绩点" };
			Object detail[][] = new Object[full_class_grade.size()][6];
			for (int i = 0; i < full_class_grade.size(); i++) {
				detail[i][0] = Integer.toString(i + 1);
				detail[i][1] = full_class_grade.get(i).getCourse();
				detail[i][2] = full_class_grade.get(i).getCredit();
				detail[i][3] = full_class_grade.get(i).getTeacher();
				//判断成绩是否已经公布
				if (full_class_grade.get(i).getFlag() == 0) {//未公布
					detail[i][4] = "成绩未公布";
					detail[i][5] = "绩点未公布";
				} else {//公布
					detail[i][4] = Float.toString(full_class_grade.get(i)
							.getGrade());
					detail[i][5] = Student_Impl.credit_grade(full_class_grade
							.get(i).getGrade());
				}

			}
			this.jTable1.setModel(new DefaultTableModel(detail, title));
			//获取的学分
			this.jTextField1.setText(Integer.toString(Student_Impl
					.select_gain_credit(stu.getName())));
			this.jTextField1.setEditable(false);
			//获取的总绩点
			init2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/** Creates new form S_grade_Menus */
	public S_grade_Menus(Student st) {
		stu = st;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		init1();
		init();
        this.jTable1.setEnabled(false);
		ImageIcon bk = new ImageIcon(this.getClass().getResource("../背景.jpg"));
		jLabel1.setIcon(bk);
		jLabel1.setBounds(0, 0, 700, 600);
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
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel2.setText("\u6211\u7684\u6210\u7ee9\u5355");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jLabel3.setFont(new java.awt.Font("宋体", 0, 15));
		jLabel3.setText("\u5df2\u9009\u5b66\u5206\uff1a");

		jLabel4.setFont(new java.awt.Font("宋体", 0, 15));
		jLabel4.setText("\u603b\u7ee9\u70b9\uff1a");

		jButton1.setText("\u8fd4\u56de");
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
								layout.createSequentialGroup().addComponent(
										jLabel1).addContainerGap(560,
										Short.MAX_VALUE))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 612,
								Short.MAX_VALUE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												62, Short.MAX_VALUE)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												55,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(91, 91, 91)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												61,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(133, 133, 133)).addGroup(
								layout.createSequentialGroup().addGap(257, 257,
										257).addComponent(jButton1)
										.addContainerGap(292, Short.MAX_VALUE))
						.addGroup(
								layout.createSequentialGroup().addGap(227, 227,
										227).addComponent(jLabel2)
										.addContainerGap(265, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												186,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton2))
										.addGap(56, 56, 56).addComponent(
												jButton1).addContainerGap(43,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		init();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new Student_Menus(stu).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}