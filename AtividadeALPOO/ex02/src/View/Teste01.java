package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Panel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;


public class Teste01 {

	private JFrame frmPizzariaUnip;
	private JTextField lblValor;
	private JTextField lblCobertura;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste01 window = new Teste01();
					window.frmPizzariaUnip.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Teste01() {
		initialize();
	}
	
	private void initialize() {
		
		frmPizzariaUnip = new JFrame();
		frmPizzariaUnip.setResizable(false);
		frmPizzariaUnip.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PICHAU\\Desktop\\ALPOO_Atividade\\image\\Pizzaria\\pngwing.com.png"));
		frmPizzariaUnip.setTitle("Pizzaria UNIP");
		frmPizzariaUnip.setBounds(100, 100, 919, 576);
		frmPizzariaUnip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzariaUnip.getContentPane().setLayout(new CardLayout(0, 0));
		frmPizzariaUnip.setLocationRelativeTo(null);
		
		
		JPanel tela1 = new JPanel();
		tela1.setBackground(new Color(153, 204, 204));
		tela1.setLayout(null);
		frmPizzariaUnip.getContentPane().add(tela1, "name_164089840242200");
		
		JLabel text01 = new JLabel("Bem vindos \u00E0 Pizzaria UNIP");
		text01.setFont(new Font("Fira Code Medium", Font.PLAIN, 20));
		text01.setHorizontalAlignment(SwingConstants.CENTER);
		text01.setBounds(271, 418, 391, 48);
		tela1.add(text01);
		//
		JPanel tela2 = new JPanel();
		tela2.setBackground(new Color(153, 204, 204));
		tela2.setLayout(null);
		frmPizzariaUnip.getContentPane().add(tela2, "name_164089851929200");
		
		
		// Tabela 01
		JTable table01 = new JTable();
		table01.setBorder(BorderFactory.createLineBorder(Color.black));
		DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table01.getDefaultRenderer(JLabel.class);
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		Object[] coluna = {"Sabores","Individual","Regular","Familia"};
		DefaultTableModel model = new DefaultTableModel();
		
		JTableHeader headerTable = table01.getTableHeader();
		headerTable.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
		headerTable.setBorder(BorderFactory.createLineBorder(Color.black));
		headerTable.setBackground(Color.LIGHT_GRAY); // Cor de fundo da coluna
		model.setColumnIdentifiers(coluna);
		table01.setModel(model);
		
		table01.setBackground(Color.white);
		table01.setForeground(Color.gray);
		table01.setSelectionBackground(Color.LIGHT_GRAY); // Muda a cor ao clicar em alguma celula da tabela
		table01.setGridColor(Color.black);
		table01.setSelectionForeground(Color.red);
		table01.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		table01.setRowHeight(28);
		table01.setAutoCreateColumnsFromModel(true);
		
		JScrollPane scroll = new JScrollPane(table01);
		scroll.setForeground(Color.red);
		scroll.setBackground(Color.white);
		scroll.setBounds(10,10,500,170);
		tela2.add(scroll);
		
		Object[] row = new Object[4];
		model.addRow(new Object[] 
				{"Pepperoni","R$15,00","R$27,00","R$33,00"});
		model.addRow(new Object[] 
				{"Mussarela","R$12,00","R$21,60","R$26,40"});
		model.addRow(new Object[] 
				{"Supreme","R$17,00","R$30,60","R$37,40"});
		model.addRow(new Object[] 
				{"Marguerita","R$19,00","R$25,60","R$41,50"});
		model.addRow(new Object[] 
				{"Calabresa","R$11,00","R$16,60","R$25,70"});
		

		// Tabela 02
		JTable table02 = new JTable();
		table02.setBorder(BorderFactory.createLineBorder(Color.black));
		renderer = (DefaultTableCellRenderer)table02.getDefaultRenderer(JLabel.class);
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		Object[] extra = {"Cobertura extra","Valor"};
		DefaultTableModel model02 = new DefaultTableModel();
		
		JTableHeader tableH02 = table02.getTableHeader();
		tableH02.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
		tableH02.setBorder(BorderFactory.createLineBorder(Color.black));
		tableH02.setBackground(Color.LIGHT_GRAY);
		model02.setColumnIdentifiers(extra);
		table02.setModel(model02);
		table02.setBackground(Color.white);
		table02.setForeground(Color.gray);
		table02.setSelectionBackground(Color.LIGHT_GRAY);
		table02.setGridColor(Color.BLACK);
		table02.setSelectionForeground(Color.red);
		table02.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		table02.setRowHeight(28);
		table02.setAutoCreateRowSorter(true);
		
		JScrollPane scroll02 = new JScrollPane(table02);
		scroll02.setForeground(Color.black);
		scroll02.setBackground(Color.red);
		scroll02.setBounds(70,205,300,198);
		tela2.add(scroll02);
		
		Object row02 = new Object[2];
		model02.addRow(new Object[] {"Bacon","R$2,00"});
		model02.addRow(new Object[] {"Cebola","R$1,50"});
		model02.addRow(new Object[] {"Champignon","R$2,50"});
		model02.addRow(new Object[] {"Tomate","R$1,00"});
		model02.addRow(new Object[] {"Catupiry","R$3,00"});
		model02.addRow(new Object[] {"Presunto","R$2,50"});
		
		table01.setEnabled(false);
		table02.setEnabled(false);
		// Fim da table 02
		
		JPanel tela3 = new JPanel();
		tela3.setBackground(new Color(153, 204, 204));
		frmPizzariaUnip.getContentPane().add(tela3, "name_164100088551700");
		tela3.setLayout(null);
		
		JLabel labelSabores = new JLabel("Selecione os sabores");
		labelSabores.setHorizontalAlignment(SwingConstants.CENTER);
		labelSabores.setFont(new Font("Arial", Font.BOLD, 24));
		labelSabores.setBounds(151, 11, 546, 58);
		tela3.add(labelSabores);
		
		Panel telaSabores01 = new Panel();
		telaSabores01.setBackground(new Color(255, 255, 255));
		telaSabores01.setBounds(70, 75, 459, 198);
		tela3.add(telaSabores01);
		telaSabores01.setLayout(null);
		
		//
		JLabel lblPepperoni = new JLabel("Pepperoni");
		lblPepperoni.setHorizontalAlignment(SwingConstants.CENTER);
		lblPepperoni.setFont(new Font("Arial", Font.BOLD, 17));
		lblPepperoni.setBounds(10, 49, 93, 17);
		telaSabores01.add(lblPepperoni);
		
		JLabel lblMussarela = new JLabel("Mussarela");
		lblMussarela.setHorizontalAlignment(SwingConstants.CENTER);
		lblMussarela.setFont(new Font("Arial", Font.BOLD, 17));
		lblMussarela.setBounds(10, 77, 93, 17);
		telaSabores01.add(lblMussarela);
		
		JLabel lblSupreme = new JLabel("Supreme");
		lblSupreme.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupreme.setFont(new Font("Arial", Font.BOLD, 17));
		lblSupreme.setBounds(10, 105, 93, 17);
		telaSabores01.add(lblSupreme);
		
		JLabel lblMarguerita = new JLabel("Marguerita");
		lblMarguerita.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarguerita.setFont(new Font("Arial", Font.BOLD, 17));
		lblMarguerita.setBounds(10, 133, 93, 17);
		telaSabores01.add(lblMarguerita);
		
		JLabel lblCalabresa = new JLabel("Calabresa");
		lblCalabresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalabresa.setFont(new Font("Arial", Font.BOLD, 17));
		lblCalabresa.setBounds(10, 161, 93, 17);
		telaSabores01.add(lblCalabresa);
		
		JLabel lblIndividual = new JLabel("Individual");
		lblIndividual.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndividual.setFont(new Font("Arial", Font.BOLD, 17));
		lblIndividual.setBounds(134, 11, 93, 17);
		telaSabores01.add(lblIndividual);
		
		JLabel lblRegular = new JLabel("Regular");
		lblRegular.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegular.setFont(new Font("Arial", Font.BOLD, 17));
		lblRegular.setBounds(237, 11, 93, 17);
		telaSabores01.add(lblRegular);
		
		JLabel lblFamilia = new JLabel("Fam\u00EDlia");
		lblFamilia.setHorizontalAlignment(SwingConstants.CENTER);
		lblFamilia.setFont(new Font("Arial", Font.BOLD, 17));
		lblFamilia.setBounds(353, 11, 93, 17);
		telaSabores01.add(lblFamilia);
		//
		JRadioButton Regular01 = new JRadioButton("R$27,00");
		Regular01.setHorizontalAlignment(SwingConstants.CENTER);
		Regular01.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Regular01.setBounds(250, 47, 70, 21);
		telaSabores01.add(Regular01);
		
		JRadioButton Familia01 = new JRadioButton("R$33,00");
		Familia01.setHorizontalAlignment(SwingConstants.CENTER);
		Familia01.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Familia01.setBounds(365, 48, 70, 21);
		telaSabores01.add(Familia01);
		
		JRadioButton Individual01 = new JRadioButton("R$15,00");
		Individual01.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Individual01.setHorizontalAlignment(SwingConstants.CENTER);
		Individual01.setBounds(140, 48, 70, 21);
		telaSabores01.add(Individual01);
		//
		// RadioButton
		JRadioButton Individual02 = new JRadioButton("R$12,00");
		Individual02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Individual02.setHorizontalAlignment(SwingConstants.CENTER);
		Individual02.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Individual02.setBounds(140, 76, 70, 21);
		telaSabores01.add(Individual02);
		
		JRadioButton Individual03 = new JRadioButton("R$17,00");
		Individual03.setHorizontalAlignment(SwingConstants.CENTER);
		Individual03.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Individual03.setBounds(140, 104, 70, 21);
		telaSabores01.add(Individual03);
		
		JRadioButton Regular02 = new JRadioButton("R$21,60");
		Regular02.setHorizontalAlignment(SwingConstants.CENTER);
		Regular02.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Regular02.setBounds(250, 76, 70, 21);
		telaSabores01.add(Regular02);
		
		JRadioButton Regular03 = new JRadioButton("R$30,60");
		Regular03.setHorizontalAlignment(SwingConstants.CENTER);
		Regular03.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Regular03.setBounds(250, 104, 70, 21);
		telaSabores01.add(Regular03);
		
		JRadioButton Familia02 = new JRadioButton("R$26,40");
		Familia02.setHorizontalAlignment(SwingConstants.CENTER);
		Familia02.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Familia02.setBounds(365, 76, 70, 21);
		telaSabores01.add(Familia02);
		
		JRadioButton Familia03 = new JRadioButton("R$37,40");
		Familia03.setHorizontalAlignment(SwingConstants.CENTER);
		Familia03.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Familia03.setBounds(365, 104, 70, 21);
		telaSabores01.add(Familia03);
		
		JRadioButton Individual04 = new JRadioButton("R$21,00");
		Individual04.setHorizontalAlignment(SwingConstants.CENTER);
		Individual04.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Individual04.setBounds(140, 132, 70, 21);
		telaSabores01.add(Individual04);
		
		JRadioButton Individual05 = new JRadioButton("R$16,00");
		Individual05.setHorizontalAlignment(SwingConstants.CENTER);
		Individual05.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Individual05.setBounds(140, 160, 70, 21);
		telaSabores01.add(Individual05);
		
		JRadioButton Regular04 = new JRadioButton("R$28,60");
		Regular04.setHorizontalAlignment(SwingConstants.CENTER);
		Regular04.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Regular04.setBounds(250, 132, 70, 21);
		telaSabores01.add(Regular04);
		
		JRadioButton Regular05 = new JRadioButton("R$24,00");
		Regular05.setHorizontalAlignment(SwingConstants.CENTER);
		Regular05.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Regular05.setBounds(250, 160, 70, 21);
		telaSabores01.add(Regular05);
		
		JRadioButton Familia04 = new JRadioButton("R$42,00");
		Familia04.setHorizontalAlignment(SwingConstants.CENTER);
		Familia04.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Familia04.setBounds(365, 132, 70, 21);
		telaSabores01.add(Familia04);
		
		JRadioButton Familia05 = new JRadioButton("R$28,00");
		Familia05.setHorizontalAlignment(SwingConstants.CENTER);
		Familia05.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Familia05.setBounds(365, 160, 70, 21);
		telaSabores01.add(Familia05);
		//
		
		JButton btnConfirmarPedido = new JButton("Confirmar Pedido");
		btnConfirmarPedido.setRequestFocusEnabled(false);
		btnConfirmarPedido.setFont(new Font("Arial", Font.BOLD, 14));
		btnConfirmarPedido.setBounds(293, 381, 186, 29);
		
		tela3.add(btnConfirmarPedido);
		
		JButton btnConsultar = new JButton("Consultar Sabores");
		btnConsultar.setRequestFocusEnabled(false);
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 14));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela2.setVisible(true);
				tela1.setVisible(false);
			}
		});
		btnConsultar.setBounds(369, 466, 186, 29);
		tela1.add(btnConsultar);
		
		JLabel image01 = new JLabel("");
		image01.setIcon(new ImageIcon(Teste01.class.getResource("/images/Pizza sharing-pana.png")));
		image01.setBounds(124, 11, 683, 422);
		tela1.add(image01);
		
		JButton btnSabores = new JButton("Escolher sabores");
		btnSabores.setRequestFocusEnabled(false);
		btnSabores.setFont(new Font("Arial", Font.BOLD, 14));
		btnSabores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela3.setVisible(true);
				tela2.setVisible(false);
				
			}
		});
		btnSabores.setBounds(131, 414, 177, 28);
		tela2.add(btnSabores);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Teste01.class.getResource("/images/n2.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(507, 183, 406, 353);
		tela2.add(lblNewLabel_1);
		
		JPanel tela4 = new JPanel();
		tela4.setBackground(new Color(153, 204, 204));
		frmPizzariaUnip.getContentPane().add(tela4, "name_164691216245800");
		tela4.setLayout(null);
		
		// Grupo de butões
		ButtonGroup btnGrupo = new ButtonGroup();
		btnGrupo.add(Individual01);
		btnGrupo.add(Regular01);
		btnGrupo.add(Familia01);

		ButtonGroup btnGrupo2 = new ButtonGroup();
		btnGrupo2.add(Individual02);
		btnGrupo2.add(Regular02);
		btnGrupo2.add(Familia02);

		ButtonGroup btnGrupo3 = new ButtonGroup();
		btnGrupo3.add(Individual03);
		btnGrupo3.add(Regular03);
		btnGrupo3.add(Familia03);
		
		ButtonGroup btnGrupo4 = new ButtonGroup();
		btnGrupo4.add(Individual04);
		btnGrupo4.add(Regular04);
		btnGrupo4.add(Familia04);
		
		ButtonGroup btnGrupo5 = new ButtonGroup();
		btnGrupo5.add(Individual05);
		btnGrupo5.add(Regular05);
		btnGrupo5.add(Familia05);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setRequestFocusEnabled(false);
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
		btnCalcular.setBounds(461, 336, 131, 29);
		tela3.add(btnCalcular);
		
		Panel telaSabores02 = new Panel();
		telaSabores02.setBounds(591, 75, 230, 198);
		tela3.add(telaSabores02);
		telaSabores02.setBackground(new Color(255, 255, 255));
		telaSabores02.setLayout(null);
		
		// Checkbox =================================================================
		JLabel lblCoberturaExtra = new JLabel("Cobertura Extra");
		lblCoberturaExtra.setBounds(28, 11, 181, 21);
		lblCoberturaExtra.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoberturaExtra.setFont(new Font("Arial", Font.BOLD, 17));
		telaSabores02.add(lblCoberturaExtra);
		
		JCheckBox CheckBacon = new JCheckBox("Bacon R$2,00");
		CheckBacon.setBackground(new Color(255, 255, 255));
		CheckBacon.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckBacon.setBounds(20, 39, 124, 23);
		telaSabores02.add(CheckBacon);
		
		JCheckBox CheckCebola = new JCheckBox("Cebola R$1,50");
		CheckCebola.setBackground(new Color(255, 255, 255));
		CheckCebola.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckCebola.setBounds(20, 91, 124, 23);
		telaSabores02.add(CheckCebola);
		
		JCheckBox CheckCatupiry = new JCheckBox("Catupiry R$3,00");
		CheckCatupiry.setBackground(new Color(255, 255, 255));
		CheckCatupiry.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckCatupiry.setBounds(20, 143, 134, 23);
		telaSabores02.add(CheckCatupiry);
		
		JCheckBox CheckChamp = new JCheckBox("Champignon R$2,50");
		CheckChamp.setBackground(new Color(255, 255, 255));
		CheckChamp.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckChamp.setBounds(20, 65, 155, 23);
		telaSabores02.add(CheckChamp);
		
		JCheckBox CheckTomate = new JCheckBox("Tomate R$1,00");
		CheckTomate.setBackground(new Color(255, 255, 255));
		CheckTomate.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckTomate.setBounds(20, 117, 134, 23);
		telaSabores02.add(CheckTomate);
		
		JCheckBox CheckPresunto = new JCheckBox("Presunto R$2,50");
		CheckPresunto.setBackground(new Color(255, 255, 255));
		CheckPresunto.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckPresunto.setBounds(20, 169, 134, 23);
		telaSabores02.add(CheckPresunto);
		
		JLabel lblTtotal = new JLabel("Pizza");
		lblTtotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTtotal.setVerticalAlignment(SwingConstants.TOP);
		lblTtotal.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		lblTtotal.setIcon(null);
		lblTtotal.setBounds(356, 279, 105, 40);
		tela3.add(lblTtotal);
		
		JLabel lblSubtotal = new JLabel("Cobertura");
		lblSubtotal.setVerticalAlignment(SwingConstants.TOP);
		lblSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtotal.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		lblSubtotal.setBounds(80, 279, 139, 40);
		tela3.add(lblSubtotal);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		txtArea.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtArea.setEditable(false);
		txtArea.setBounds(320, 330, 131, 40);
		tela3.add(txtArea);

		// btnLimpar1 =================================================================
		JButton btnLimpar1 = new JButton("Limpar");
		btnLimpar1.setRequestFocusEnabled(false);
		btnLimpar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGrupo.clearSelection();
				btnGrupo2.clearSelection();
				btnGrupo3.clearSelection();
				btnGrupo4.clearSelection();
				btnGrupo5.clearSelection();
				lblValor.setText("");
				txtArea.setText("");
				lblCobertura.setText("");
				CheckBacon.setSelected(false);
				CheckCatupiry.setSelected(false);
				CheckCebola.setSelected(false);
				CheckChamp.setSelected(false);
				CheckPresunto.setSelected(false);
				CheckTomate.setSelected(false);	
			}
		});
		btnLimpar1.setFont(new Font("Arial", Font.BOLD, 14));
		btnLimpar1.setBounds(138, 381, 131, 29);
		tela3.add(btnLimpar1);
	
		JLabel lblTotalPedido = new JLabel("Total");
		lblTotalPedido.setVerticalAlignment(SwingConstants.TOP);
		lblTotalPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPedido.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		lblTotalPedido.setBounds(222, 330, 105, 40);
		tela3.add(lblTotalPedido);
		
		lblValor = new JTextField();
		lblValor.setBackground(Color.WHITE);
		lblValor.setHorizontalAlignment(SwingConstants.LEFT);
		lblValor.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValor.setEditable(false);
		lblValor.setBounds(458, 279, 131, 35);
		tela3.add(lblValor);
		lblValor.setColumns(10);
		
		lblCobertura = new JTextField();
		lblCobertura.setBackground(Color.WHITE);
		lblCobertura.setHorizontalAlignment(SwingConstants.LEFT);
		lblCobertura.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblCobertura.setEditable(false);
		lblCobertura.setColumns(10);
		lblCobertura.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCobertura.setBounds(212, 279, 131, 35);
		tela3.add(lblCobertura);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setRequestFocusEnabled(false);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela2.setVisible(true);
				tela3.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 14));
		btnVoltar.setBounds(498, 381, 131, 29);
		tela3.add(btnVoltar);
				
		// Aparecer valores no JLabel
		btnCalcular.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				double total = 0;
				double subtotal = 0;
				if(Individual01.isSelected()) {
					total = total + 15.00;
				} if(Regular01.isSelected()) {
					total = total + 27.00;
				} if(Familia01.isSelected()) {
					total = total + 33.00;
					//
				} if(Individual02.isSelected()) {
					total = total + 12.00;
				} if(Individual03.isSelected()) {
					total = total + 17.00;
				} if(Regular02.isSelected()) {
					total = total + 21.60;
					//
				} if(Regular03.isSelected()) {
					total = total + 30.60;
				} if(Familia02.isSelected()) {
					total = total + 26.40;
				} if(Familia03.isSelected()) {
					total = total + 37.40;
					//
				} if(Individual04.isSelected()) {
					total = total + 21.00;
				} if(Regular04.isSelected()) {
					total = total + 28.60;
				} if(Familia04.isSelected()) {
					total = total + 42.00;
				}if(Individual05.isSelected()) {
					total = total + 16.00;
				} if(Regular05.isSelected()) {
					total = total + 24.00;
				} if(Familia05.isSelected()) {
					total = total + 28.00;
				}
				
				if(CheckBacon.isSelected()) {
					subtotal = subtotal + 2.00;
				} if(CheckChamp.isSelected()) {
					subtotal = subtotal + 2.50;
				} if(CheckCebola.isSelected()) {
					subtotal = subtotal + 1.50;
				}  if(CheckTomate.isSelected()) {
					subtotal = subtotal + 1.00;
				} if(CheckCatupiry.isSelected()) {
					subtotal = subtotal + 3.00;
				} if(CheckPresunto.isSelected()) {
					subtotal = subtotal + 2.50;
				} 
				lblValor.setText("R$"+Double.toString(total).format("%.2f", total));
				lblCobertura.setText("R$"+Double.toString(total).format("%.2f", subtotal));
				double pedido = total+subtotal;
				txtArea.setText("R$"+Double.toString(pedido).format("%.2f", pedido));
			}		
		});
	
		btnConfirmarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtArea.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Nenhum valor calculado, opções vazia", "Confirmação do pedido", JOptionPane.PLAIN_MESSAGE);
				} else if(txtArea.getText().equals("R$0,00")) {
					JOptionPane.showMessageDialog(null, "Nenhum valor calculado", "Confirmação do pedido", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O total do seu pedido foi de " + txtArea.getText(), "Confirmação do pedido", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
	}
}
