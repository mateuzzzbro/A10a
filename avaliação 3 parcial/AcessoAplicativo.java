import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menus and submenus
        JMenuBar menuBar = new JMenuBar();
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenuItem usuariosItem = new JMenuItem("Usuários");
        JMenuItem pessoasItem = new JMenuItem("Pessoas");
        cadastroMenu.add(usuariosItem);
        cadastroMenu.add(pessoasItem);
        menuBar.add(cadastroMenu);

        JMenu visualizacaoMenu = new JMenu("Visualização");
        JMenuItem listaUsuariosItem = new JMenuItem("Lista de Usuários");
        JMenuItem listaPessoasItem = new JMenuItem("Lista de Pessoas");
        visualizacaoMenu.add(listaUsuariosItem);
        visualizacaoMenu.add(listaPessoasItem);
        menuBar.add(visualizacaoMenu);

        JMenu sairMenu = new JMenu("Sair");
        JMenuItem sairItem = new JMenuItem("Sair");
        sairMenu.add(sairItem);
        menuBar.add(sairMenu);

        // Create footer
        JLabel footer = new JLabel("Versão: 12.1.2024  Usuário: denys.silva  Data de acesso: 20/09/2024 10:58");

        // Add components to the frame
        frame.setJMenuBar(menuBar);
        frame.add(footer, BorderLayout.SOUTH);

        // Define action for "Sair" item
        sairItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
