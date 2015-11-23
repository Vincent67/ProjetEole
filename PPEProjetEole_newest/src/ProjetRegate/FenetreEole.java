package ProjetRegate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class FenetreEole extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomRegate;
	private JTextField tfDistRegate;
	private JTable tblClass1;
	private JTable tblClass2;
	private JTable tblClass3;
	private JTable tblClass4;
	private JTable tblClasse1;
	private JTable tblClasse2;
	private JTable tblClasse3;
	private JTable tblClasse4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreEole frame = new FenetreEole();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenetreEole() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1030, 553);
		contentPane.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Enregistrement Régates", null, layeredPane, null);
		layeredPane.setLayout(null);
		
		JLabel lblRegate = new JLabel("R\u00E9gates");
		lblRegate.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRegate.setBounds(392, 0, 126, 56);
		layeredPane.add(lblRegate);
		
		List listVoiliers = new List();
		listVoiliers.setBounds(10, 144, 449, 246);
		layeredPane.add(listVoiliers);
		
		List listParticipants = new List();
		listParticipants.setBounds(523, 144, 449, 246);
		layeredPane.add(listParticipants);
		
		JComboBox cmbJour = new JComboBox();
		cmbJour.setModel(new DefaultComboBoxModel(new String[] {"Jour"}));
		cmbJour.setToolTipText("");
		cmbJour.setBounds(235, 56, 135, 20);
		layeredPane.add(cmbJour);
		
		JComboBox cmbMois = new JComboBox();
		cmbMois.setModel(new DefaultComboBoxModel(new String[] {"Mois"}));
		cmbMois.setBounds(370, 56, 175, 20);
		layeredPane.add(cmbMois);
		
		JComboBox cmbAnnee = new JComboBox();
		cmbAnnee.setModel(new DefaultComboBoxModel(new String[] {"Ann\u00E9e"}));
		cmbAnnee.setBounds(543, 56, 135, 20);
		layeredPane.add(cmbAnnee);
		
		JLabel lblNomRegate = new JLabel("Nom de la r\u00E9gate");
		lblNomRegate.setBounds(619, 95, 105, 14);
		layeredPane.add(lblNomRegate);
		
		tfNomRegate = new JTextField();
		tfNomRegate.setBounds(762, 92, 86, 20);
		layeredPane.add(tfNomRegate);
		tfNomRegate.setColumns(10);
		
		JLabel lblDistanceRegate = new JLabel("Distance r\u00E9gate");
		lblDistanceRegate.setBounds(23, 95, 86, 14);
		layeredPane.add(lblDistanceRegate);
		
		tfDistRegate = new JTextField();
		tfDistRegate.setBounds(136, 92, 86, 20);
		layeredPane.add(tfDistRegate);
		tfDistRegate.setColumns(10);
		
		JLabel lblVoiliers = new JLabel("Voiliers");
		lblVoiliers.setBounds(211, 123, 46, 14);
		layeredPane.add(lblVoiliers);
		
		JLabel lblParticipants = new JLabel("Participants");
		lblParticipants.setBounds(635, 124, 76, 14);
		layeredPane.add(lblParticipants);
		
		JButton btnFlecheVersLaDroite = new JButton("\u2192");
		btnFlecheVersLaDroite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFlecheVersLaDroite.setBounds(465, 159, 53, 20);
		layeredPane.add(btnFlecheVersLaDroite);
		
		JButton btnFlecheVersLaGauche = new JButton("\u2190");
		btnFlecheVersLaGauche.setBounds(465, 350, 53, 23);
		layeredPane.add(btnFlecheVersLaGauche);
		
		JButton btnEnregisterRegate = new JButton("Enregistrer ");
		btnEnregisterRegate.setBounds(211, 436, 117, 23);
		layeredPane.add(btnEnregisterRegate);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBounds(418, 436, 116, 23);
		layeredPane.add(btnImprimer);
		
		JButton btnAnnuler = new JButton("Annuler ");
		btnAnnuler.setBounds(635, 436, 117, 23);
		layeredPane.add(btnAnnuler);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(161, 59, 46, 14);
		layeredPane.add(lblDate);
		
		JTabbedPane tabbedCla = new JTabbedPane(JTabbedPane.TOP);
		tabbedCla.setBounds(10, 11, 1030, 553);
		contentPane.add(tabbedCla);
		
		
		
		JLayeredPane layeredPaneCl = new JLayeredPane();
		layeredPaneCl.setToolTipText("R\u00E9gate");
		tabbedPane.addTab("Classement", null, layeredPaneCl, null);
		layeredPaneCl.setLayout(null);
		
		JLabel lblClassement = new JLabel("Classement");
		lblClassement.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblClassement.setBounds(410, 21, 168, 47);
		layeredPaneCl.add(lblClassement);
		
		JComboBox cmbRegates = new JComboBox();
		cmbRegates.setModel(new DefaultComboBoxModel(new String[] {"R\u00E9gates"}));
		cmbRegates.setToolTipText("");
		cmbRegates.setBounds(66, 36, 138, 27);
		layeredPaneCl.add(cmbRegates);
		
		tblClass1 = new JTable();
		tblClass1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Classe 1"},
			},
			new String[] {
				"classe1"
			}
		));
		tblClass1.setBounds(33, 98, 214, 16);
		layeredPaneCl.add(tblClass1);
		
		tblClass2 = new JTable();
		tblClass2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Classe 2"},
			},
			new String[] {
				"classe2"
			}
		));
		tblClass2.setBounds(298, 98, 214, 16);
		layeredPaneCl.add(tblClass2);
		
		tblClass3 = new JTable();
		tblClass3.setModel(new DefaultTableModel(
			new Object[][] {
				{"Classe 3"},
			},
			new String[] {
				"classe3"
			}
		));
		tblClass3.setBounds(559, 98, 214, 16);
		layeredPaneCl.add(tblClass3);
		
		tblClass4 = new JTable();
		tblClass4.setModel(new DefaultTableModel(
			new Object[][] {
				{"Classe 4"},
			},
			new String[] {
				"classe4"
			}
		));
		tblClass4.setBounds(796, 98, 214, 16);
		layeredPaneCl.add(tblClass4);
		
		tblClasse1 = new JTable();
		tblClasse1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"classe1Voil", "classe1Temps"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblClasse1.setBounds(33, 113, 214, 390);
		layeredPaneCl.add(tblClasse1);
		
		tblClasse2 = new JTable();
		tblClasse2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"classe2Voil", "classe2Temps"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblClasse2.setBounds(298, 113, 214, 390);
		layeredPaneCl.add(tblClasse2);
		
		tblClasse3 = new JTable();
		tblClasse3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"classe3Voil", "classe3Temps"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblClasse3.setBounds(559, 113, 214, 390);
		layeredPaneCl.add(tblClasse3);
		
		tblClasse4 = new JTable();
		tblClasse4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"classe4Voil", "classe4Temps"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblClasse4.setBounds(796, 113, 214, 390);
		layeredPaneCl.add(tblClasse4);
		
		JButton btnEnr = new JButton("Enregistrer");
		btnEnr.setBounds(688, 34, 110, 30);
		layeredPaneCl.add(btnEnr);
		
		JButton btnAnnu = new JButton("Annuler");
		btnAnnu.setBounds(823, 34, 116, 30);
		layeredPaneCl.add(btnAnnu);
	}
}
