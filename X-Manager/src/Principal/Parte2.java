package Principal;

// Criado por Marlon Oliveira da Luz
// Copyright by: MarlinDEV ©, 06/02/2020, Marlon Oliveira da Luz.

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

@SuppressWarnings("serial")
public class Parte2 extends JFrame {

	String select = new String(Parte1.selecao);
	String binaNum = new String(Parte1.binaNum);
	String binaNom = new String(Parte1.binaNome);
	
	String brunoNum = new String(Parte1.brunoNum);
	String brunoNom = new String(Parte1.brunoNome);
	
	String diegoNom = new String(Parte1.diegoNome);
	String diegoNum = new String(Parte1.diegoNum);
	
	String gildoNom = new String(Parte1.gildoNome);
	String gildoNum = new String(Parte1.gildoNum);
	
	String guiNom = new String(Parte1.guiNome);
	String guiNum = new String(Parte1.guiNum);
	
	String guNom = new String(Parte1.guNome);
	String guNum = new String(Parte1.guNum);
	
	String miqNom = new String(Parte1.miqueiasNome);
	String miqNum = new String(Parte1.miqueiasNum);
	
	String marNom = new String(Parte1.marlonNome);
	String marNum = new String(Parte1.marlonNum);
	
	String rafaNom = new String(Parte1.rafaelNome);
	String rafaNum = new String(Parte1.rafaelNum);
	
	String samNom = new String(Parte1.samuNome);
	String samNum = new String(Parte1.samuNum);
	
	String wesNom = new String(Parte1.wesleyNome);
	String wesNum = new String(Parte1.wesleyNum);
	
	String cpt = new String(Parte1.capitao);
	
	/**
	 * @author Marlon
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parte2 frame = new Parte2();
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
	public Parte2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		ImageIcon background = new ImageIcon(getClass().getResource("imagens/background.png"));
		background.setImage(background.getImage().getScaledInstance(1200, 716, 1));
		getContentPane().setLayout(null);
		setResizable(false);
		
		ImageIcon titulo = new ImageIcon(getClass().getResource("imagens/tecnico.png"));
		setIconImage(titulo.getImage());
		
		JLabel bg = new JLabel(background);
		getContentPane().add(bg);
		bg.setBounds(0, 0, 1200, 716);
		bg.setLayout(null);
		
		ImageIcon logoImg = new ImageIcon(getClass().getResource("imagens/marca.png"));
		logoImg.setImage(logoImg.getImage().getScaledInstance(300, 100, 1));
		JLabel logo = new JLabel(logoImg);
		logo.setBounds(920, 590, 300, 100);
		bg.add(logo);
		
		JLabel aviso = new JLabel();
		aviso.setForeground(Color.DARK_GRAY);
		aviso.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		aviso.setText("Maximo 6 jogadores em campo!");
		aviso.setBounds(320, -5, 260, 50);
		bg.add(aviso);
		
		ImageIcon faixa = new ImageIcon(getClass().getResource("imagens/faixa.png"));
		faixa.setImage(faixa.getImage().getScaledInstance(20, 20, 1));
		JLabel fx = new JLabel(faixa);
		
		if (cpt.equalsIgnoreCase("1")) {
			fx.setBounds(435, 116, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("2")) {
			fx.setBounds(718, 106, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("3")) {
			fx.setBounds(829, 106, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("4")) {
			fx.setBounds(940, 106, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("5")) {
			fx.setBounds(1051, 106, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("6")) {
			fx.setBounds(1160, 106, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("7")) {
			fx.setBounds(744, 231, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("8")) {
			fx.setBounds(852, 231, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("9")) {
			fx.setBounds(959, 231, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("10")) {
			fx.setBounds(1067, 231, 20, 20);
			bg.add(fx);
		} else if (cpt.equalsIgnoreCase("11")) {
			fx.setBounds(1174, 231, 20, 20);
			bg.add(fx);
		}
		
		// Inicio Bruno
		ImageIcon bruno;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			bruno = new ImageIcon(getClass().getResource("imagens/jogadores/bruno/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			bruno = new ImageIcon(getClass().getResource("imagens/jogadores/bruno/uni2.png"));
		} else {
			bruno = new ImageIcon(getClass().getResource("imagens/jogadores/bruno/uni3.png"));
		}
		bruno.setImage(bruno.getImage().getScaledInstance(100, 150, 1));
		
		JLabel brunoNome = new JLabel(brunoNom);
		brunoNome.setForeground(Color.WHITE);
		brunoNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		brunoNome.setBounds(665, 109, 100, 50);
		bg.add(brunoNome);
		
		JLabel brunoNumero = new JLabel(brunoNum);
		brunoNumero.setForeground(Color.WHITE);
		brunoNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		brunoNumero.setBounds(645, 109, 100, 50);
		bg.add(brunoNumero);
		
		JLabel brunoImg = new JLabel(bruno);
		brunoImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				brunoImg.setLocation(brunoImg.getLocation().x + e.getX() - brunoImg.getWidth() / 2, brunoImg.getLocation().y + e.getY() - brunoImg.getHeight() / 2);
				brunoNome.setLocation(brunoImg.getLocation().x + e.getX() - brunoImg.getWidth() / 2 + 27 , brunoImg.getLocation().y + e.getY() - brunoImg.getHeight() / 2 + 98);
				brunoNumero.setLocation(brunoImg.getLocation().x + e.getX() - brunoImg.getWidth() / 2 + 7, brunoImg.getLocation().y + e.getY() - brunoImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("2")) {
					fx.setLocation(brunoImg.getLocation().x + e.getX() - brunoImg.getWidth() / 2 + 80, brunoImg.getLocation().y + e.getY() - brunoImg.getHeight() / 2 + 95);
				}
			}
		});
		brunoImg.setBounds(638, 10, 100, 150);
		bg.add(brunoImg);
		// Final Bruno
		
		// Inicio Diego
		ImageIcon diego;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			diego = new ImageIcon(getClass().getResource("imagens/jogadores/diego/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			diego = new ImageIcon(getClass().getResource("imagens/jogadores/diego/uni2.png"));
		} else {
			diego = new ImageIcon(getClass().getResource("imagens/jogadores/diego/uni3.png"));
		}
		diego.setImage(diego.getImage().getScaledInstance(100, 150, 1));
		
		JLabel diegoNome = new JLabel(diegoNom);
		diegoNome.setForeground(Color.WHITE);
		diegoNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		diegoNome.setBounds(780, 109, 100, 50);
		bg.add(diegoNome);
		
		JLabel diegoNumero = new JLabel(diegoNum);
		diegoNumero.setForeground(Color.WHITE);
		diegoNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		diegoNumero.setBounds(760, 109, 100, 50);
		bg.add(diegoNumero);
		
		JLabel diegoImg = new JLabel(diego);
		diegoImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				diegoImg.setLocation(diegoImg.getLocation().x + e.getX() - diegoImg.getWidth() / 2, diegoImg.getLocation().y + e.getY() - diegoImg.getHeight() / 2);
				diegoNome.setLocation(diegoImg.getLocation().x + e.getX() - diegoImg.getWidth() / 2 + 30 , diegoImg.getLocation().y + e.getY() - diegoImg.getHeight() / 2 + 98);
				diegoNumero.setLocation(diegoImg.getLocation().x + e.getX() - diegoImg.getWidth() / 2 + 10, diegoImg.getLocation().y + e.getY() - diegoImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("3")) {
					fx.setLocation(diegoImg.getLocation().x + e.getX() - diegoImg.getWidth() / 2 + 80, diegoImg.getLocation().y + e.getY() - diegoImg.getHeight() / 2 + 95);
				}
			}
		});
		diegoImg.setBounds(750, 10, 100, 150);
		bg.add(diegoImg);
		// Fim Diego
		
		// Inicio Gildo
		ImageIcon gildo;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			gildo = new ImageIcon(getClass().getResource("imagens/jogadores/gildo/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			gildo = new ImageIcon(getClass().getResource("imagens/jogadores/gildo/uni2.png"));
		} else {
			gildo = new ImageIcon(getClass().getResource("imagens/jogadores/gildo/uni3.png"));
		}
		gildo.setImage(gildo.getImage().getScaledInstance(100, 150, 1));
		
		JLabel gildoNome = new JLabel(gildoNom);
		gildoNome.setForeground(Color.WHITE);
		gildoNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		gildoNome.setBounds(882, 109, 100, 50);
		bg.add(gildoNome);
		
		JLabel gildoNumero = new JLabel(gildoNum);
		gildoNumero.setForeground(Color.WHITE);
		gildoNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		gildoNumero.setBounds(865, 109, 100, 50);
		bg.add(gildoNumero);
		
		JLabel gildoImg = new JLabel(gildo);
		gildoImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				gildoImg.setLocation(gildoImg.getLocation().x + e.getX() - gildoImg.getWidth() / 2, gildoImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2);
				gildoNome.setLocation(gildoImg.getLocation().x + e.getX() - gildoImg.getWidth() / 2 + 20, gildoImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2 + 98);
				gildoNumero.setLocation(gildoImg.getLocation().x + e.getX() - gildoImg.getWidth() / 2 + 3, gildoImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("4")) {
					fx.setLocation(gildoImg.getLocation().x + e.getX() - gildoImg.getWidth() / 2 + 80, gildoImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2 + 95);
				}
			}
		});
		gildoImg.setBounds(862, 10, 100, 150);
		bg.add(gildoImg);
		// Fim Gildo
		
		// Inicio Gui
		ImageIcon gui;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			gui = new ImageIcon(getClass().getResource("imagens/jogadores/gui/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			gui = new ImageIcon(getClass().getResource("imagens/jogadores/gui/uni2.png"));
		} else {
			gui = new ImageIcon(getClass().getResource("imagens/jogadores/gui/uni3.png"));
		}
		gui.setImage(gui.getImage().getScaledInstance(100, 150, 1));
		
		JLabel guiNome = new JLabel(guiNom);
		guiNome.setForeground(Color.WHITE);
		guiNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		guiNome.setBounds(993, 109, 100, 50);
		bg.add(guiNome);
		
		JLabel guiNumero = new JLabel(guiNum);
		guiNumero.setForeground(Color.WHITE);
		guiNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		guiNumero.setBounds(975, 109, 100, 50);
		bg.add(guiNumero);
		
		JLabel guiImg = new JLabel(gui);
		guiImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				guiImg.setLocation(guiImg.getLocation().x + e.getX() - guiImg.getWidth() / 2, guiImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2);
				guiNome.setLocation(guiImg.getLocation().x + e.getX() - guiImg.getWidth() / 2 + 21, guiImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2 + 98);
				guiNumero.setLocation(guiImg.getLocation().x + e.getX() - guiImg.getWidth() / 2 + 3, guiImg.getLocation().y + e.getY() - gildoImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("5")) {
					fx.setLocation(guiImg.getLocation().x + e.getX() - guiImg.getWidth() / 2 + 80, guiImg.getLocation().y + e.getY() - guiImg.getHeight() / 2 + 95);
				}
			}
		});
		guiImg.setBounds(972, 10, 100, 150);
		bg.add(guiImg);
		// Fim Gui
		
		// Inicio Gu
		ImageIcon gu;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			gu = new ImageIcon(getClass().getResource("imagens/jogadores/gu/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			gu = new ImageIcon(getClass().getResource("imagens/jogadores/gu/uni2.png"));
		} else {
			gu = new ImageIcon(getClass().getResource("imagens/jogadores/gu/uni3.png"));
		}
		gu.setImage(gu.getImage().getScaledInstance(100, 150, 1));
		
		JLabel guNome = new JLabel(guNom);
		guNome.setForeground(Color.WHITE);
		guNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		guNome.setBounds(1108, 109, 100, 50);
		bg.add(guNome);
		
		JLabel guNumero = new JLabel(guNum);
		guNumero.setForeground(Color.WHITE);
		guNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		guNumero.setBounds(1088, 109, 100, 50);
		bg.add(guNumero);
		
		JLabel guImg = new JLabel(gu);
		guImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				guImg.setLocation(guImg.getLocation().x + e.getX() - guImg.getWidth() / 2, guImg.getLocation().y + e.getY() - guImg.getHeight() / 2);
				guNome.setLocation(guImg.getLocation().x + e.getX() - guImg.getWidth() / 2 + 26, guImg.getLocation().y + e.getY() - guImg.getHeight() / 2 + 98);
				guNumero.setLocation(guImg.getLocation().x + e.getX() - guImg.getWidth() / 2 + 6, guImg.getLocation().y + e.getY() - guImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("6")) {
					fx.setLocation(guImg.getLocation().x + e.getX() - guImg.getWidth() / 2 + 80, guImg.getLocation().y + e.getY() - guImg.getHeight() / 2 + 95);
				}
			}
		});
		guImg.setBounds(1082, 10, 100, 150);
		bg.add(guImg);
		//Fim Gu
		
		// Inicio Miqueias
		ImageIcon miqueias;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			miqueias = new ImageIcon(getClass().getResource("imagens/jogadores/miqueias/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			miqueias = new ImageIcon(getClass().getResource("imagens/jogadores/miqueias/uni2.png"));
		} else {
			miqueias = new ImageIcon(getClass().getResource("imagens/jogadores/miqueias/uni3.png"));
		}
		miqueias.setImage(miqueias.getImage().getScaledInstance(100, 150, 1));
		
		JLabel miqNome = new JLabel(miqNom);
		miqNome.setForeground(Color.WHITE);
		miqNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		miqNome.setBounds(692, 233, 100, 50);
		bg.add(miqNome);
		
		JLabel miqNumero = new JLabel(miqNum);
		miqNumero.setForeground(Color.WHITE);
		miqNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		miqNumero.setBounds(672, 233, 100, 50);
		bg.add(miqNumero);
		
		JLabel miqImg = new JLabel(miqueias);
		miqImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				miqImg.setLocation(miqImg.getLocation().x + e.getX() - miqImg.getWidth() / 2, miqImg.getLocation().y + e.getY() - miqImg.getHeight() / 2);
				miqNome.setLocation(miqImg.getLocation().x + e.getX() - miqImg.getWidth() / 2 + 26, miqImg.getLocation().y + e.getY() - miqImg.getHeight() / 2 + 98);
				miqNumero.setLocation(miqImg.getLocation().x + e.getX() - miqImg.getWidth() / 2 + 6, miqImg.getLocation().y + e.getY() - miqImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("7")) {
					fx.setLocation(miqImg.getLocation().x + e.getX() - miqImg.getWidth() / 2 + 80, miqImg.getLocation().y + e.getY() - miqImg.getHeight() / 2 + 95);
				}
			}
		});
		miqImg.setBounds(665, 135, 100, 150);
		bg.add(miqImg);
		//Fim Miqueias
		
		// Inicio Marlon
		ImageIcon marlon;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			marlon = new ImageIcon(getClass().getResource("imagens/jogadores/marlon/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			marlon = new ImageIcon(getClass().getResource("imagens/jogadores/marlon/uni2.png"));
		} else {
			marlon = new ImageIcon(getClass().getResource("imagens/jogadores/marlon/uni3.png"));
		}
		marlon.setImage(marlon.getImage().getScaledInstance(100, 150, 1));
		
		JLabel marNome = new JLabel(marNom);
		marNome.setForeground(Color.WHITE);
		marNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		marNome.setBounds(797, 233, 100, 50);
		bg.add(marNome);
		
		JLabel marNumero = new JLabel(marNum);
		marNumero.setForeground(Color.WHITE);
		marNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		marNumero.setBounds(777, 233, 100, 50);
		bg.add(marNumero);
		
		JLabel marImg = new JLabel(marlon);
		marImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				marImg.setLocation(marImg.getLocation().x + e.getX() - marImg.getWidth() / 2, marImg.getLocation().y + e.getY() - marImg.getHeight() / 2);
				marNome.setLocation(marImg.getLocation().x + e.getX() - marImg.getWidth() / 2 + 24, marImg.getLocation().y + e.getY() - marImg.getHeight() / 2 + 98);
				marNumero.setLocation(marImg.getLocation().x + e.getX() - marImg.getWidth() / 2 + 4, marImg.getLocation().y + e.getY() - marImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("8")) {
					fx.setLocation(marImg.getLocation().x + e.getX() - marImg.getWidth() / 2 + 80, marImg.getLocation().y + e.getY() - marImg.getHeight() / 2 + 95);
				}
			}
		});
		marImg.setBounds(773, 135, 100, 150);
		bg.add(marImg);
		// Fim Marlon
		
		// Inicio Rafael
		ImageIcon rafael;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			rafael = new ImageIcon(getClass().getResource("imagens/jogadores/rafael/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			rafael = new ImageIcon(getClass().getResource("imagens/jogadores/rafael/uni2.png"));
		} else {
			rafael = new ImageIcon(getClass().getResource("imagens/jogadores/rafael/uni3.png"));
		}
		rafael.setImage(rafael.getImage().getScaledInstance(100, 150, 1));
		
		JLabel rafaNome = new JLabel(rafaNom);
		rafaNome.setForeground(Color.WHITE);
		rafaNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		rafaNome.setBounds(905, 233, 100, 50);
		bg.add(rafaNome);
		
		JLabel rafaNumero = new JLabel(rafaNum);
		rafaNumero.setForeground(Color.WHITE);
		rafaNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		rafaNumero.setBounds(885, 233, 100, 50);
		bg.add(rafaNumero);
		
		JLabel rafaImg = new JLabel(rafael);
		rafaImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				rafaImg.setLocation(rafaImg.getLocation().x + e.getX() - rafaImg.getWidth() / 2, rafaImg.getLocation().y + e.getY() - rafaImg.getHeight() / 2);
				rafaNome.setLocation(rafaImg.getLocation().x + e.getX() - rafaImg.getWidth() / 2 + 25, rafaImg.getLocation().y + e.getY() - rafaImg.getHeight() / 2 + 98);
				rafaNumero.setLocation(rafaImg.getLocation().x + e.getX() - rafaImg.getWidth() / 2 + 5, rafaImg.getLocation().y + e.getY() - rafaImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("9")) {
					fx.setLocation(rafaImg.getLocation().x + e.getX() - rafaImg.getWidth() / 2 + 80, rafaImg.getLocation().y + e.getY() - rafaImg.getHeight() / 2 + 95);
				}
			}
		});
		rafaImg.setBounds(880, 135, 100, 150);
		bg.add(rafaImg);
		// Fim Rafael
		
		// Inicio Samuel
		ImageIcon samuel;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			samuel = new ImageIcon(getClass().getResource("imagens/jogadores/samuel/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			samuel = new ImageIcon(getClass().getResource("imagens/jogadores/samuel/uni2.png"));
		} else {
			samuel = new ImageIcon(getClass().getResource("imagens/jogadores/samuel/uni3.png"));
		}
		samuel.setImage(samuel.getImage().getScaledInstance(100, 150, 1));
		
		JLabel samNome = new JLabel(samNom);
		samNome.setForeground(Color.WHITE);
		samNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		samNome.setBounds(1013, 233, 100, 50);
		bg.add(samNome);
		
		JLabel samNumero = new JLabel(samNum);
		samNumero.setForeground(Color.WHITE);
		samNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		samNumero.setBounds(993, 233, 100, 50);
		bg.add(samNumero);
		
		JLabel samImg = new JLabel(samuel);
		samImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				samImg.setLocation(samImg.getLocation().x + e.getX() - samImg.getWidth() / 2, samImg.getLocation().y + e.getY() - samImg.getHeight() / 2);
				samNome.setLocation(samImg.getLocation().x + e.getX() - samImg.getWidth() / 2 + 25, samImg.getLocation().y + e.getY() - samImg.getHeight() / 2 + 98);
				samNumero.setLocation(samImg.getLocation().x + e.getX() - samImg.getWidth() / 2 + 5, samImg.getLocation().y + e.getY() - samImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("10")) {
					fx.setLocation(samImg.getLocation().x + e.getX() - samImg.getWidth() / 2 + 80, samImg.getLocation().y + e.getY() - samImg.getHeight() / 2 + 95);
				}
			}
		});
		samImg.setBounds(988, 135, 100, 150);
		bg.add(samImg);
		// Fim Samuel
		
		// Inicio Wesley
		ImageIcon wesley;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			wesley = new ImageIcon(getClass().getResource("imagens/jogadores/wesley/uni1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			wesley = new ImageIcon(getClass().getResource("imagens/jogadores/wesley/uni2.png"));
		} else {
			wesley = new ImageIcon(getClass().getResource("imagens/jogadores/wesley/uni3.png"));
		}
		wesley.setImage(wesley.getImage().getScaledInstance(100, 150, 1));
		
		JLabel wesNome = new JLabel(wesNom);
		wesNome.setForeground(Color.WHITE);
		wesNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		wesNome.setBounds(1118, 233, 100, 50);
		bg.add(wesNome);
		
		JLabel wesNumero = new JLabel(wesNum);
		wesNumero.setForeground(Color.WHITE);
		wesNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		wesNumero.setBounds(1098, 233, 100, 50);
		bg.add(wesNumero);
		
		JLabel wesImg = new JLabel(wesley);
		wesImg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				wesImg.setLocation(wesImg.getLocation().x + e.getX() - wesImg.getWidth() / 2, wesImg.getLocation().y + e.getY() - wesImg.getHeight() / 2);
				wesNome.setLocation(wesImg.getLocation().x + e.getX() - wesImg.getWidth() / 2 + 23, wesImg.getLocation().y + e.getY() - wesImg.getHeight() / 2 + 98);
				wesNumero.setLocation(wesImg.getLocation().x + e.getX() - wesImg.getWidth() / 2 + 3, wesImg.getLocation().y + e.getY() - wesImg.getHeight() / 2 + 98);
				if (cpt.equalsIgnoreCase("11")) {
					fx.setLocation(wesImg.getLocation().x + e.getX() - wesImg.getWidth() / 2 + 80, wesImg.getLocation().y + e.getY() - wesImg.getHeight() / 2 + 95);
				}
			}
		});
		wesImg.setBounds(1095, 135, 100, 150);
		bg.add(wesImg);
		// Fim Wesley
		
		// Inicio Bina
		ImageIcon bina1;
		if (select.equalsIgnoreCase("Uniforme 1")) {
			bina1 = new ImageIcon(getClass().getResource("imagens/jogadores/bina/gol1.png"));
		} else if (select.equalsIgnoreCase("Uniforme 2")) {
			bina1 = new ImageIcon(getClass().getResource("imagens/jogadores/bina/gol1.png"));
		} else {
			bina1 = new ImageIcon(getClass().getResource("imagens/jogadores/bina/gol2.png"));
		}
		bina1.setImage(bina1.getImage().getScaledInstance(100, 150, 1));
		
		JLabel binaNome = new JLabel(binaNom);
		binaNome.setForeground(Color.WHITE);
		binaNome.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		binaNome.setBounds(372, 118, 100, 50);
		bg.add(binaNome); 
		
		JLabel binaNumero = new JLabel(binaNum);
		binaNumero.setForeground(Color.WHITE);
		binaNumero.setFont(new Font("Jersey M54", Font.PLAIN, 18));
		binaNumero.setBounds(362, 118, 100, 50);
		bg.add(binaNumero);
		
		JLabel bina = new JLabel(bina1);
		bina.setBounds(356, 20, 100, 150);
		bg.add(bina);
		// Final Bina
		
		// Re-Montar
		JButton reiniciar = new JButton();
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Bruno:
				onResetPlayer(brunoImg, 638, 10);
				onResetPlayer(brunoNome, 665, 109);
				onResetPlayer(brunoNumero, 645, 109);
				if (cpt.equalsIgnoreCase("2")) {
					onResetPlayer(fx, 718, 106);
				}
				
				// Diego:
				onResetPlayer(diegoImg, 750, 10);
				onResetPlayer(diegoNome, 780, 109);
				onResetPlayer(diegoNumero, 760, 109);
				if (cpt.equalsIgnoreCase("3")) {
					onResetPlayer(fx, 829, 106);
				}
				
				// Gildo:
				onResetPlayer(gildoImg, 862, 10);
				onResetPlayer(gildoNome, 882, 109);
				onResetPlayer(gildoNumero, 865, 109);
				if (cpt.equalsIgnoreCase("4")) {
					onResetPlayer(fx, 940, 106);
				}
				
				// Guilherme:
				onResetPlayer(guiImg, 972, 10);
				onResetPlayer(guiNome, 993, 109);
				onResetPlayer(guiNumero, 975, 109);
				if (cpt.equalsIgnoreCase("5")) {
					onResetPlayer(fx, 1051, 106);
				}
				
				// Gustavo:
				onResetPlayer(guImg, 1082, 10);
				onResetPlayer(guNome, 1108, 109);
				onResetPlayer(guNumero, 1088, 109);
				if (cpt.equalsIgnoreCase("6")) {
					onResetPlayer(fx, 1160, 106);
				}
				
				// Miqueias:
				onResetPlayer(miqImg, 665, 135);
				onResetPlayer(miqNome, 692, 233);
				onResetPlayer(miqNumero, 672, 233);
				if (cpt.equalsIgnoreCase("7")) {
					onResetPlayer(fx, 744, 231);
				}
				
				// Marlon:
				onResetPlayer(marImg, 773, 135);
				onResetPlayer(marNome, 797, 233);
				onResetPlayer(marNumero, 777, 233);
				if (cpt.equalsIgnoreCase("8")) {
					onResetPlayer(fx, 852, 231);
				}
				
				// Rafael:
				onResetPlayer(rafaImg, 880, 135);
				onResetPlayer(rafaNome, 905, 233);
				onResetPlayer(rafaNumero, 885, 233);
				if (cpt.equalsIgnoreCase("9")) {
					onResetPlayer(fx, 959, 231);
				}
				
				// Samuel:
				onResetPlayer(samImg, 988, 135);
				onResetPlayer(samNome, 1013, 233);
				onResetPlayer(samNumero, 993, 233);
				if (cpt.equalsIgnoreCase("10")) {
					onResetPlayer(fx, 1067, 231);
				}
				
				// Wesley:
				onResetPlayer(wesImg, 1095, 135);
				onResetPlayer(wesNome, 1118, 233);
				onResetPlayer(wesNumero, 1098, 233);
				if (cpt.equalsIgnoreCase("11")) {
					onResetPlayer(fx, 1174, 231);
				}
			}
		});
		reiniciar.setHorizontalAlignment(SwingConstants.LEFT);
		reiniciar.setText("Re-montar Elenco");
		reiniciar.setForeground(Color.black);
		reiniciar.setBackground(Color.white);
		reiniciar.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		reiniciar.setBounds(150, 10, 150, 30);
		bg.add(reiniciar);
		
		JButton voltar = new JButton();
		voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Parte2.this.dispose();
				new Parte1().setVisible(true);
			}
		});
		voltar.setHorizontalAlignment(SwingConstants.LEFT);
		voltar.setText("Trocar Numeros");
		voltar.setForeground(Color.black);
		voltar.setBackground(Color.white);
		voltar.setFont(new Font("Jersey M54", Font.PLAIN, 16));
		voltar.setBounds(150, 50, 150, 30);
		bg.add(voltar);
		
		setSize(1214, 750);
	}
	
	public void onResetPlayer(JLabel player, int x, int y) {
		player.setBounds(x, y, player.getWidth(), player.getHeight());
	}
}
