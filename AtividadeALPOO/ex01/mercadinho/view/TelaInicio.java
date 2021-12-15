package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import model.Carrinho;
import model.Produto;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private List<JPanel> paineis = new ArrayList<JPanel>();
	private Produto produto = new Produto();
	private Carrinho carrinho = new Carrinho();
	private String msg;
	private JTextField textField;
	private JTextField textField_1;

	public TelaInicio() {
		setResizable(false);
		produto.inicializaProdutosMock();
		setTitle("Mercadinho");
		setSize(900, 640);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));

		// Paineis
		JPanel painelInicio = new JPanel();
		painelInicio.setBackground(SystemColor.menu);
		getContentPane().add(painelInicio);

		JPanel painelCatalogo = new JPanel();
		painelCatalogo.setBackground(SystemColor.menu);
		getContentPane().add(painelCatalogo, "name_4889517989500");

		JPanel painelCarrinho = new JPanel();
		painelCarrinho.setBackground(SystemColor.menu);
		getContentPane().add(painelCarrinho, "name_4893702392500");

		JPanel painelEditaCatalogo = new JPanel();
		getContentPane().add(painelEditaCatalogo, "name_4898516126500");

		JPanel painelPedidoFinalizado = new JPanel();
		painelPedidoFinalizado.setBackground(SystemColor.menu);
		getContentPane().add(painelPedidoFinalizado, "name_4926951236700");

		// painel Inicio
		JButton entrar = new JButton("ENTRAR");
		entrar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		entrar.setForeground(SystemColor.desktop);
		entrar.setBackground(UIManager.getColor("Button.background"));
		entrar.setBounds(707, 546, 100, 30);
		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelCatalogo.setVisible(true);

			}
		});
		painelInicio.setLayout(null);
		painelInicio.add(entrar);

		// painel Catalogo
		JButton voltar = new JButton("Voltar");
		voltar.setBounds(160, 457, 150, 30);
		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelInicio.setVisible(true);
			}

		});

		DefaultListModel<Produto> listaModeloCatalogo = new DefaultListModel<Produto>();
		DefaultListModel<Produto> listaModeloCarrinho = new DefaultListModel<Produto>();
		for (Produto p : produto.getCatalogo()) {
			listaModeloCatalogo.addElement(p);
		}
		painelCatalogo.setLayout(null);

		JList<Produto> listaCatalogo = new JList<Produto>();
		listaCatalogo.setBounds(10, 145, 150, 300);
		listaCatalogo.setModel(listaModeloCatalogo);
		
		JScrollPane listaCatalogoPainel = new JScrollPane(listaCatalogo);
		listaCatalogoPainel.setBorder(new TitledBorder(null, "Lista de Produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listaCatalogoPainel.setLocation(10, 145);
		listaCatalogoPainel.setSize(300, 200);
		painelCatalogo.add(listaCatalogoPainel);
		

		JList<Produto> listaCarrinho = new JList<Produto>();
		listaCarrinho.setBounds(726, 145, 150, 300);
		
		JScrollPane listaCarrinhoPainel = new JScrollPane(listaCarrinho);
		listaCarrinhoPainel.setBorder(new TitledBorder(null, "Carrinho", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listaCarrinhoPainel.setSize(300, 200);
		listaCarrinhoPainel.setLocation(570, 145);

		painelCatalogo.add(listaCarrinhoPainel);

		painelCatalogo.add(voltar);

		paineis.add(painelInicio);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/mercadinho.png")));
		lblNewLabel.setBounds(111, 10, 661, 566);
		painelInicio.add(lblNewLabel);
		paineis.add(painelCatalogo);

		JButton adiciona = new JButton("Adiciona");
		adiciona.setBounds(360, 188, 150, 30);
		adiciona.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listaModeloCarrinho.addElement(listaCatalogo.getSelectedValue());
				listaCarrinho.setModel(listaModeloCarrinho);
			}

		});
		painelCatalogo.add(adiciona);

		JButton finalizarPedido = new JButton("Finalizar Pedido");
		finalizarPedido.setBounds(570, 457, 150, 30);
		finalizarPedido.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelCarrinho.setVisible(true);
			}

		});
		painelCatalogo.add(finalizarPedido);

		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				listaModeloCarrinho.removeElementAt(listaCarrinho.getSelectedIndex());
				listaCarrinho.setModel(listaModeloCarrinho);
			}

		});
		remove.setBounds(360, 258, 150, 30);
		painelCatalogo.add(remove);
		
		JButton cadastrarProduto = new JButton("Cadastrar Produto");
		cadastrarProduto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelEditaCatalogo.setVisible(true);
			}

		});
		cadastrarProduto.setBounds(158, 355, 150, 30);
		painelCatalogo.add(cadastrarProduto);

		paineis.add(painelCarrinho);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBorder(new TitledBorder(null, "Valor Total", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_3.setBounds(293, 354, 300, 47);
		JButton confirmarPedido = new JButton("Confirmar");
		confirmarPedido.setBounds(453, 373, 140, 30);
		JList<Produto> listaFinal = new JList<Produto>();
		listaFinal.setEnabled(false);
		listaFinal.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Itens", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		listaFinal.setBounds(new Rectangle(293, 48, 300, 300));
		confirmarPedido.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<Produto> lista = new ArrayList<Produto>();
				lista.clear();
				for (int i = 0; i < listaModeloCarrinho.size(); i++) {
					lista.add(listaModeloCarrinho.get(i));
				}
				msg = carrinho.calcularPreco(lista);
				desativaPaineis();
				painelPedidoFinalizado.setVisible(true);
				lblNewLabel_3.setText(msg);
				listaFinal.setModel(listaModeloCarrinho);
			}

		});
		painelPedidoFinalizado.setLayout(null);
		
		painelPedidoFinalizado.add(listaFinal);
		
		painelCarrinho.setLayout(null);
		painelCarrinho.add(confirmarPedido);
		
		JButton voltar2 = new JButton("Voltar");
		voltar2.setBounds(293, 373, 140, 30);
		voltar2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelCatalogo.setVisible(true);
			}
			
		});
		
		JList<Produto> listaConfirmacao = new JList<Produto>();
		listaConfirmacao.setEnabled(false);
		listaConfirmacao.setBorder(new TitledBorder(null, "Lista Itens", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listaConfirmacao.setLocation(293, 26);
		listaConfirmacao.setSize(300, 300);
		listaConfirmacao.setModel(listaModeloCarrinho);
		
		painelCarrinho.add(listaConfirmacao);
		painelCarrinho.add(voltar2);
		paineis.add(painelEditaCatalogo);
		painelEditaCatalogo.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(98, 141, 96, 19);
		painelEditaCatalogo.add(textField);
		textField.setColumns(10);
		
		JButton adicionarProduto = new JButton("Adicionar");
		adicionarProduto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() != " " && textField_1.getText() != " ") {
					produto.cadastrarNovoProduto(textField.getText(), Double.valueOf(textField_1.getText().replace(',', '.')));
					listaModeloCatalogo.add(listaModeloCatalogo.size(), produto.getCatalogo().get(produto.getCatalogo().size()-1));
					listaCatalogo.setModel(listaModeloCatalogo);
				}
			}
			
		});
		
		adicionarProduto.setBounds(109, 222, 85, 21);
		painelEditaCatalogo.add(adicionarProduto);
		
		JButton voltar3 = new JButton("Voltar");
		voltar3.setBounds(84, 511, 68, 21);
		voltar3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelCatalogo.setVisible(true);
			}

		});
		
		painelEditaCatalogo.add(voltar3);
		textField_1 = new JTextField();
		textField_1.setBounds(98, 170, 96, 19);
		painelEditaCatalogo.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nome Produto");
		lblNewLabel_4.setBounds(10, 144, 81, 13);
		painelEditaCatalogo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o");
		lblNewLabel_5.setBounds(10, 173, 45, 13);
		painelEditaCatalogo.add(lblNewLabel_5);
		paineis.add(painelPedidoFinalizado);

		JLabel lblNewLabel_2 = new JLabel("Pedido Registrado com Sucesso!!");
		lblNewLabel_2.setBounds(0, 0, 886, 38);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		painelPedidoFinalizado.add(lblNewLabel_2);

//		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		painelPedidoFinalizado.add(lblNewLabel_3);
		
		JButton telaInicial = new JButton("Tela Inicial");
		telaInicial.setBounds(453, 468, 140, 30);
		painelPedidoFinalizado.add(telaInicial);
		
		JButton novoPedido = new JButton("Novo Pedido");
		novoPedido.setBounds(293, 468, 140, 30);
		painelPedidoFinalizado.add(novoPedido);
		
		telaInicial.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelInicio.setVisible(true);
				listaModeloCarrinho.removeAllElements();
				System.out.println(listaModeloCarrinho);
				listaFinal.setModel(new DefaultListModel<Produto>());
			}

		});
		
		novoPedido.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				desativaPaineis();
				painelCatalogo.setVisible(true);
				listaModeloCarrinho.removeAllElements();
				listaFinal.setModel(new DefaultListModel<Produto>());
			}
			
		});

	}

	// metodo desativa paineis
	public void desativaPaineis() {
		for (JPanel p : paineis) {
			p.setVisible(false);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio ti = new TelaInicio();
					ti.paineis.get(0).setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
