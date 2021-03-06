/*
 * U_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import client.Client;

import model.Message;
import model.User;

/**
 *
 * @author  __USER__
 */
public class U_Menus extends javax.swing.JFrame {
	User user = null;
	String condition = "未取件";
	int m = 0;//判断是否触发鼠标事件，0为触发，1为不触发

	/** Creates new form U_Menus */
	public U_Menus(User u) {
		initComponents();
		user = u;
		this.setLocationRelativeTo(null);
		try {
			load(condition);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon bk = new ImageIcon(this.getClass().getResource("捕获.png"));
		jLabel3.setIcon(bk);
		jLabel3.setBounds(0, 0, 1000, 800);
		this.getLayeredPane().add(jLabel3, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
	}

	public void load(String condition) throws SQLException, Exception {
		ArrayList<Message> message = new ArrayList<Message>();

		message = Client.kcheck(user.getName(), condition);
		if (message.size() != 0) {
			Object title[] = { "序号", "寄件人", "寄件人电话", "商品类型", "情况" };
			Object detail[][] = new Object[message.size()][5];
			for (int i = 0; i < message.size(); i++) {
				detail[i][0] = Integer.toString(message.get(i).getId());
				detail[i][1] = message.get(i).getJname();
				detail[i][2] = message.get(i).getJphone();
				detail[i][3] = message.get(i).getKtype();
				detail[i][4] = message.get(i).getCondition();
			}
			this.jTable1.setModel(new DefaultTableModel(detail, title));
		} else {
			JOptionPane.showMessageDialog(this, "您的快递还未到达");
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
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jButton3.setText("\u6211\u7684\u5efa\u8bae");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u9000\u51fa");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("\u6211\u7684\u5bc4\u4ef6");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jButton6.setText("\u5df2\u53d6\u4ef6");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("\u672a\u53d6\u4ef6");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jLabel1.setText("\u6211\u7684\u5feb\u9012");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10));
		jLabel2.setForeground(new java.awt.Color(255, 0, 0));
		jLabel2
				.setText("\u70b9\u51fb\u8868\u683c\u53ef\u83b7\u53d6\u53d6\u4ef6\u7801\u548c\u622a\u81f3\u65f6\u95f4");

		jLabel3.setText("jLabel3");

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
																		.addContainerGap()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton6)
																										.addGap(
																												99,
																												99,
																												99)
																										.addComponent(
																												jButton7)
																										.addGap(
																												120,
																												120,
																												120))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel2)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addComponent(
																																								jButton3,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jButton5,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jButton4,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								112,
																																								Short.MAX_VALUE))
																																		.addGap(
																																				18,
																																				18,
																																				18)
																																		.addComponent(
																																				jScrollPane1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				273,
																				273,
																				273)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel1))))
										.addContainerGap(15, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup().addGap(76, 76,
										76).addComponent(jButton3).addGap(42,
										42, 42).addComponent(jButton5).addGap(
										36, 36, 36).addComponent(jButton4)
										.addContainerGap(341, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel1)
										.addGap(4, 4, 4)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton6)
														.addComponent(jButton7))
										.addGap(34, 34, 34)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		if (evt.getClickCount() == 1 && m == 0) {//单击鼠标获取快递取件码和截止时间
			int row = this.jTable1.getSelectedRow();
			int id = Integer
					.valueOf(((String) this.jTable1.getValueAt(row, 0)));
			try {
				Message message = Client.check_knumber(id);
				JOptionPane.showMessageDialog(this, "您的取件码为"
						+ message.getKnumber() + "截止时间为"
						+ message.getDeadline());
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "服务器异常");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "数据传输阻塞");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "服务端数据传输错误");
			}

		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		condition = "未取件";
		m = 0;
		try {
			load(condition);
			this.jTable1.setEnabled(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		condition = "已取件";
		m = 1;
		try {
			load(condition);
			this.jTable1.setEnabled(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new JK_Condition_Menus(user).setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new Advise_Menus(user).setVisible(true);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "谢谢使用");
		System.exit(0);

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}