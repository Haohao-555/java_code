/*
 * K_Menus.java
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

import model.Jworker;
import model.Message;

/**
 *
 * @author  __USER__
 */
public class K_Menus extends javax.swing.JFrame {
	Jworker worker;

	/** Creates new form K_Menus */
	public K_Menus(Jworker w) {
		initComponents();
		worker = w;
		this.setLocationRelativeTo(null);
		try {
			load();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon bk = new ImageIcon(this.getClass().getResource("捕获.png"));
		jLabel5.setIcon(bk);
		jLabel5.setBounds(0, 0, 1000, 800);
		this.getLayeredPane().add(jLabel5, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
	}

	public void load() throws SQLException, Exception {
		ArrayList<Message> jmessage = new ArrayList<Message>();
		jmessage = Client.gain_All_k();
		if (jmessage.size() != 0) {
			Object title[] = { "序号", "收件人", "收件人电话", "收件人地址", "商品类型" };
			Object detail[][] = new Object[jmessage.size()][6];
			for (int i = 0; i < jmessage.size(); i++) {
				detail[i][0] = Integer.toString(jmessage.get(i).getId());
				detail[i][1] = jmessage.get(i).getSname();
				detail[i][2] = jmessage.get(i).getSphone();
				detail[i][3] = jmessage.get(i).getSsite();
				detail[i][4] = jmessage.get(i).getKtype();

			}
			this.jTable1.setModel(new DefaultTableModel(detail, title));
		} else {
			JOptionPane.showMessageDialog(this, "没有快递要寄出");
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
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("\u5feb\u9012\u7ad9");

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

		jLabel2.setText("\u5bc4\u4ef6\u5355");

		jLabel3.setText("\u5e8f\u53f7\uff1a");

		jButton1.setText("\u8be6\u60c5");
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

		jButton3.setText("\u5165\u5e93");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u51fa\u5e93");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel4
				.setText("\u5355\u51fb\u8868\u683c\u67d0\u4e00\u884c\u53ef\u6536\u53d6\u5feb\u9012");

		jButton5.setText("\u8fd4\u56de");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel5.setText("jLabel5");

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
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																84,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												52, Short.MAX_VALUE)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												481,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										370, Short.MAX_VALUE).addComponent(
										jLabel2).addGap(240, 240, 240))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(229, Short.MAX_VALUE)
										.addComponent(jLabel3)
										.addGap(18, 18, 18)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												126,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												42, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton1)
														.addComponent(jLabel4))
										.addContainerGap())
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(267, 267, 267)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel5)
														.addComponent(jLabel1))
										.addContainerGap(336, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel1)
																		.addGap(
																				5,
																				5,
																				5)
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				262,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel4))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												54,
																												54,
																												54)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jButton1)))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				85,
																				85,
																				85)
																		.addComponent(
																				jButton2)
																		.addGap(
																				41,
																				41,
																				41)
																		.addComponent(
																				jButton3)
																		.addGap(
																				34,
																				34,
																				34)
																		.addComponent(
																				jButton4)
																		.addGap(
																				32,
																				32,
																				32)
																		.addComponent(
																				jButton5)))
										.addContainerGap(93, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			load();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new J_Menus(worker).setVisible(true);
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		if (evt.getClickCount() == 1) {//收取快递
			int id = Integer.valueOf(((String) this.jTable1.getValueAt(
					this.jTable1.getSelectedRow(), 0)));
			try {
				Client.gain_k(id);
				JOptionPane.showMessageDialog(this, "已取件");

				load();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new K_in_Menu(worker).setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int id = Integer.parseInt(this.jTextField1.getText());
		Message message = null;
		try {
			message = Client.gain_k_message(id);
			new Check_K_Menus(message, worker).setVisible(true);
			this.dispose();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new K_out_Menu(worker).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}