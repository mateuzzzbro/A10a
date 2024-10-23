// SistemaPessoa.java
import javax.swing.*; // Exemplo usando Swing

public class SistemaPessoa {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame janela = new JFrame("Sistema de Pessoas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar o menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem menuItemSair = new JMenuItem("Sair");
        menuItemSair.addActionListener(e -> System.exit(0));
        menuArquivo.add(menuItemSair);
        menuBar.add(menuArquivo);
        janela.setJMenuBar(menuBar);

        // Criar o rodapé
        JLabel rotuloRodape = new JLabel("Rodapé da aplicação");
        janela.add(rotuloRodape, BorderLayout.SOUTH);

        // Configurar o tamanho da janela e torná-la visível
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;

public class SistemaPessoa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação do menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenuItem menuItemUsuarios = new JMenuItem("Usuários");
        JMenuItem menuItemPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(menuItemUsuarios);
        menuCadastro.add(menuItemPessoas);
        menuBar.add(menuCadastro);

        // ... (similar para o menu "Visualização")

        // Criação do rodapé
        JLabel rotuloRodape = new JLabel("Versão: 12.1.2024 Usuário: denys.silva Data de acesso: 20/09/2024 10:58");
        frame.add(rotuloRodape, BorderLayout.SOUTH);

        // ... (adicione outros componentes e layout)

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
