package Principal;

// Criado por Marlon Oliveira da Luz
// Copyright by: MarlinDEV ©, 06/02/2020, Marlon Oliveira da Luz.

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class Parte1 extends JFrame {

	private JPanel contentPane;
	JNumberField bina;
	JNumberField bruno;
	JNumberField diego;
	JNumberField gildo;
	JNumberField gui;
	JNumberField gu;
	JNumberField miqueias;
	JNumberField marlon;
	JNumberField rafael;
	JNumberField samuel;
	JNumberField wesley;
	ImageIcon u1;
	ImageIcon u2;
	ImageIcon u3;
	
	public static String selecao = new String("Uniforme 1");
	
	public static String binaNum = new String();
	public static String brunoNum = new String();
	public static String diegoNum = new String();
	public static String gildoNum = new String();
	public static String guiNum = new String();
	public static String guNum = new String();
	public static String miqueiasNum = new String();
	public static String marlonNum = new String();
	public static String rafaelNum = new String();
	public static String samuNum = new String();
	public static String wesleyNum = new String();
	
	public static String binaNome = new String();
	public static String brunoNome = new String();
	public static String diegoNome = new String();
	public static String gildoNome = new String();
	public static String guiNome = new String();
	public static String guNome = new String();
	public static String miqueiasNome = new String();
	public static String marlonNome = new String();
	public static String rafaelNome = new String();
	public static String samuNome = new String();
	public static String wesleyNome = new String();
	
	public static String capitao = new String();
	
	/**
	 * @author Marlon 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parte1 frame = new Parte1();
					frame.setVisible(true);
					frame.setTitle("Xapinhal Football Manager");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Parte1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		ImageIcon titulo = new ImageIcon(getClass().getResource("imagens/tecnico.png"));
		setIconImage(titulo.getImage());
		
		ImageIcon logoImg = new ImageIcon(getClass().getResource("imagens/marca.png"));
		logoImg.setImage(logoImg.getImage().getScaledInstance(180, 60, 1));
		JLabel logo = new JLabel(logoImg);
		logo.setBounds(30, 430, 180, 60);
		contentPane.add(logo);
		
		JLabel binat = new JLabel("Bina");
		binat.setBounds(38, 56, 190, 22);
		binat.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		contentPane.add(binat);
		
		JLabel brunot = new JLabel("Bruno Nariga");
		brunot.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		brunot.setBounds(38, 89, 190, 22);
		contentPane.add(brunot);
		
		JLabel diegot = new JLabel("Diego Ribeiro");
		diegot.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		diegot.setBounds(38, 122, 190, 22);
		contentPane.add(diegot);
		
		JLabel gildot = new JLabel("Gabriel Gildo");
		gildot.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		gildot.setBounds(38, 155, 190, 22);
		contentPane.add(gildot);
		
		JLabel guit = new JLabel("Guilherme A.");
		guit.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		guit.setBounds(38, 188, 190, 22);
		contentPane.add(guit);
		
		JLabel gut = new JLabel("Gustavo R.");
		gut.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		gut.setBounds(38, 221, 190, 22);
		contentPane.add(gut);
		
		JLabel miqueiast = new JLabel("Miqueias");
		miqueiast.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		miqueiast.setBounds(38, 254, 190, 22);
		contentPane.add(miqueiast);
		
		JLabel marlont = new JLabel("Marlon");
		marlont.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		marlont.setBounds(38, 287, 190, 22);
		contentPane.add(marlont);
		
		JLabel rafat = new JLabel("Rafael Cibi");
		rafat.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		rafat.setBounds(38, 320, 190, 22);
		contentPane.add(rafat);
		
		JLabel samut = new JLabel("Samuel L.");
		samut.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		samut.setBounds(38, 353, 190, 22);
		contentPane.add(samut);
		
		JLabel wesleyt = new JLabel("Wesley A.");
		wesleyt.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		wesleyt.setBounds(38, 386, 190, 22);
		contentPane.add(wesleyt);
		
		JLabel escalacao = new JLabel("ESCALA\u00C7\u00C3O:");
		escalacao.setFont(new Font("KG Second Chances Sketch", Font.PLAIN, 22));
		escalacao.setBounds(21, 19, 190, 26);
		contentPane.add(escalacao);
		
		bina = new JNumberField(2);
		bina.setEditable(false);
		bina.setHorizontalAlignment(SwingConstants.CENTER);
		bina.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		bina.setText("1");
		bina.setBounds(238, 58, 86, 20);
		contentPane.add(bina);
		bina.setColumns(10);
		bina.setName("Cadu Bina");
		binaNome = bina.getName();
		
		bruno = new JNumberField(2);
		bruno.setHorizontalAlignment(SwingConstants.CENTER);
		bruno.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		bruno.setColumns(10);
		bruno.setBounds(238, 91, 86, 20);
		contentPane.add(bruno);
		bruno.setName("Bruno N.");
		brunoNome = bruno.getName();
		
		diego = new JNumberField(2);
		diego.setHorizontalAlignment(SwingConstants.CENTER);
		diego.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		diego.setColumns(10);
		diego.setBounds(238, 124, 86, 20);
		contentPane.add(diego);
		diego.setName("Diego R.");
		diegoNome = diego.getName();
		
		gildo = new JNumberField(2);
		gildo.setHorizontalAlignment(SwingConstants.CENTER);
		gildo.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		gildo.setColumns(10);
		gildo.setBounds(238, 157, 86, 20);
		contentPane.add(gildo);
		gildo.setName("Gabriel M.");
		gildoNome = gildo.getName();
		
		gui = new JNumberField(2);
		gui.setHorizontalAlignment(SwingConstants.CENTER);
		gui.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		gui.setColumns(10);
		gui.setBounds(238, 190, 86, 20);
		contentPane.add(gui);
		gui.setName("Guilherme");
		guiNome = gui.getName();
		
		gu = new JNumberField(2);
		gu.setHorizontalAlignment(SwingConstants.CENTER);
		gu.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		gu.setColumns(10);
		gu.setBounds(238, 223, 86, 20);
		contentPane.add(gu);
		gu.setName("Gustavo");
		guNome = gu.getName();
		
		miqueias = new JNumberField(2);
		miqueias.setHorizontalAlignment(SwingConstants.CENTER);
		miqueias.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		miqueias.setColumns(10);
		miqueias.setBounds(238, 256, 86, 20);
		contentPane.add(miqueias);
		miqueias.setName("Miqueias");
		miqueiasNome = miqueias.getName();
		
		marlon = new JNumberField(2);
		marlon.setHorizontalAlignment(SwingConstants.CENTER);
		marlon.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		marlon.setColumns(10);
		marlon.setBounds(238, 289, 86, 20);
		contentPane.add(marlon);
		marlon.setName("Marlon O.");
		marlonNome = marlon.getName();
		
		rafael = new JNumberField(2);
		rafael.setHorizontalAlignment(SwingConstants.CENTER);
		rafael.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		rafael.setColumns(10);
		rafael.setBounds(238, 322, 86, 20);
		contentPane.add(rafael);
		rafael.setName("Rafael C.");
		rafaelNome = rafael.getName();
		
		samuel = new JNumberField(2);
		samuel.setHorizontalAlignment(SwingConstants.CENTER);
		samuel.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		samuel.setColumns(10);
		samuel.setBounds(238, 355, 86, 20);
		contentPane.add(samuel);
		samuel.setName("Samuel L.");
		samuNome = samuel.getName();
		
		wesley = new JNumberField(2);
		wesley.setHorizontalAlignment(SwingConstants.CENTER);
		wesley.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		wesley.setColumns(10);
		wesley.setBounds(238, 388, 86, 20);
		contentPane.add(wesley);
		wesley.setName("Wesley A.");
		wesleyNome = wesley.getName();
		
		ButtonGroup g = new ButtonGroup();
		
		ImageIcon u1 = new ImageIcon(getClass().getResource("imagens/logo-uniformes/cam1.png"));
		u1.setImage(u1.getImage().getScaledInstance(160, 130, 1));
		JRadioButton Uniforme1 = new JRadioButton(u1);
		Uniforme1.setSelected(true);
		Uniforme1.setBounds(380, 40, 160, 130);
		contentPane.add(Uniforme1);
		Uniforme1.setBackground(Color.LIGHT_GRAY);
		g.add(Uniforme1);
		
		ImageIcon u2 = new ImageIcon(getClass().getResource("imagens/logo-uniformes/cam2.png"));
		u2.setImage(u2.getImage().getScaledInstance(160, 130, 1));
		JRadioButton Uniforme2 = new JRadioButton(u2);
		Uniforme2.setBounds(380, 170, 160, 130);
		contentPane.add(Uniforme2);
		g.add(Uniforme2);
		
		ImageIcon u3 = new ImageIcon(getClass().getResource("imagens/logo-uniformes/cam3.png"));
		u3.setImage(u3.getImage().getScaledInstance(160, 130, 1));
		JRadioButton Uniforme3 = new JRadioButton(u3);
		Uniforme3.setBounds(380, 300, 160, 130);
		contentPane.add(Uniforme3);
		g.add(Uniforme3);

		Uniforme1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Uniforme1.isSelected()) {
					Uniforme1.setBackground(Color.LIGHT_GRAY);
					Uniforme2.setBackground(null);
					Uniforme3.setBackground(null);
					selecao = "Uniforme 1";
				}
			}
		});
		
		Uniforme2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Uniforme2.isSelected()) {
					Uniforme1.setBackground(null);
					Uniforme2.setBackground(Color.LIGHT_GRAY);
					Uniforme3.setBackground(null);
					selecao = "Uniforme 2";
				}
			}
		});
		
		Uniforme3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Uniforme3.isSelected()) {
					Uniforme1.setBackground(null);
					Uniforme2.setBackground(null);
					Uniforme3.setBackground(Color.LIGHT_GRAY);
					selecao = "Uniforme 3";
				}
			}
		});
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setFont(new Font("Jersey M54", Font.PLAIN, 15));
		btnNewButton.setBounds(410, 435, 100, 23);
		contentPane.add(btnNewButton);
		
		ImageIcon bpadrao = new ImageIcon(getClass().getResource("imagens/botao1.png"));
		ImageIcon bselect = new ImageIcon(getClass().getResource("imagens/botao2.png"));
		
		ButtonGroup c = new ButtonGroup();
		
		JCheckBox cap1 = new JCheckBox("");
		cap1.setBounds(330, 56, 21, 22);
		cap1.setIcon(bpadrao);
		cap1.setSelectedIcon(bselect);
		cap1.setSelected(true);
		contentPane.add(cap1);
		c.add(cap1);
		
		JCheckBox cap2 = new JCheckBox("");
		cap2.setBounds(330, 89, 21, 23);
		cap2.setIcon(bpadrao);
		cap2.setSelectedIcon(bselect);
		contentPane.add(cap2);
		c.add(cap2);
		
		JCheckBox cap3 = new JCheckBox("");
		cap3.setBounds(330, 122, 21, 23);
		cap3.setIcon(bpadrao);
		cap3.setSelectedIcon(bselect);
		contentPane.add(cap3);
		c.add(cap3);
		
		JCheckBox cap4 = new JCheckBox("");
		cap4.setBounds(330, 155, 21, 23);
		cap4.setIcon(bpadrao);
		cap4.setSelectedIcon(bselect);
		contentPane.add(cap4);
		c.add(cap4);
		
		JCheckBox cap5 = new JCheckBox("");
		cap5.setBounds(330, 188, 21, 23);
		cap5.setIcon(bpadrao);
		cap5.setSelectedIcon(bselect);
		contentPane.add(cap5);
		c.add(cap5);
		
		JCheckBox cap6 = new JCheckBox("");
		cap6.setBounds(330, 221, 21, 23);
		cap6.setIcon(bpadrao);
		cap6.setSelectedIcon(bselect);
		contentPane.add(cap6);
		c.add(cap6);
		
		JCheckBox cap7 = new JCheckBox("");
		cap7.setBounds(330, 254, 21, 23);
		cap7.setIcon(bpadrao);
		cap7.setSelectedIcon(bselect);
		contentPane.add(cap7);
		c.add(cap7);
		
		JCheckBox cap8 = new JCheckBox("");
		cap8.setBounds(330, 287, 21, 23);
		cap8.setIcon(bpadrao);
		cap8.setSelectedIcon(bselect);
		contentPane.add(cap8);
		c.add(cap8);
		
		JCheckBox cap9 = new JCheckBox("");
		cap9.setBounds(330, 320, 21, 23);
		cap9.setIcon(bpadrao);
		cap9.setSelectedIcon(bselect);
		contentPane.add(cap9);
		c.add(cap9);
		
		JCheckBox cap10 = new JCheckBox("");
		cap10.setBounds(330, 353, 21, 23);
		cap10.setIcon(bpadrao);
		cap10.setSelectedIcon(bselect);
		contentPane.add(cap10);
		c.add(cap10);
		
		JCheckBox cap11 = new JCheckBox("");
		cap11.setBounds(330, 386, 21, 23);
		cap11.setIcon(bpadrao);
		cap11.setSelectedIcon(bselect);
		contentPane.add(cap11);
		c.add(cap11);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Vazio
				if (bruno.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + bruno.getName());
				} else if (diego.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + diego.getName());
				} else if (gildo.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + gildo.getName());
				} else if (gui.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + gui.getName());
				} else if (gu.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + gu.getName());
				} else if (miqueias.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + miqueias.getName());
				} else if (marlon.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + marlon.getName());
				} else if (rafael.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + rafael.getName());
				} else if (samuel.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + samuel.getName());
				} else if (wesley.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe um numero de camisa para o jogador " + wesley.getName());
				} else 
				// Bruno:
				if (bruno.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else if (bruno.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + bruno.getText() + " já está sendo utilizada!");
				} else 
				// Diego:
				if (diego.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else if (diego.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + diego.getText() + " já está sendo utilizada!");
				} else 
				// Gildo:
				if (gildo.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else if (gildo.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gildo.getText() + " já está sendo utilizada!");
				} else 
				// Gui:
				if (gui.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else if (gui.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gui.getText() + " já está sendo utilizada!");
				} else
				// Gustavo:
				if (gu.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else if (gu.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + gu.getText() + " já está sendo utilizada!");
				} else
				// Miqueias:
				if (miqueias.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else if (miqueias.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + miqueias.getText() + " já está sendo utilizada!");
				} else
				// Marlon:
				if (marlon.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else if (marlon.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + marlon.getText() + " já está sendo utilizada!");
				} else
				// Rafael:
				if (rafael.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else if (rafael.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + rafael.getText() + " já está sendo utilizada!");
				} else
				// Samuel:
				if (samuel.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else if (samuel.getText().equals(wesley.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + samuel.getText() + " já está sendo utilizada!");
				} else
				// Wesley:
				if (wesley.getText().equals(bina.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(bruno.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(diego.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(gildo.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(gui.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(gu.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(miqueias.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(marlon.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(rafael.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else if (wesley.getText().equals(samuel.getText())) {
					JOptionPane.showMessageDialog(null, "A Camisa " + wesley.getText() + " já está sendo utilizada!");
				} else {
					JOptionPane.showMessageDialog(null, "Time Escalado");
					JOptionPane.showMessageDialog(null, "Uniforme escolhido foi: " + selecao);
					
					if (cap1.isSelected()) {
						capitao = "1";
					} else if (cap2.isSelected()) {
						capitao = "2";
					} else if (cap3.isSelected()) {
						capitao = "3";
					} else if (cap4.isSelected()) {
						capitao = "4";
					} else if (cap5.isSelected()) {
						capitao = "5";
					} else if (cap6.isSelected()) {
						capitao = "6";
					} else if (cap7.isSelected()) {
						capitao = "7";
					} else if (cap8.isSelected()) {
						capitao = "8";
					} else if (cap9.isSelected()) {
						capitao = "9";
					} else if (cap10.isSelected()) {
						capitao = "10";
					} else if (cap11.isSelected()) {
						capitao = "11";
					}
					
					binaNum = bina.getText();
					brunoNum = bruno.getText();
					diegoNum = diego.getText();
					gildoNum = gildo.getText();
					guiNum = gui.getText();
					guNum = gu.getText();
					miqueiasNum = miqueias.getText();
					marlonNum = marlon.getText();
					rafaelNum = rafael.getText();
					samuNum = samuel.getText();
					wesleyNum = wesley.getText();
					Parte1.this.dispose();
					new Parte2().setVisible(true);
				}
			}
		});
	}
}
