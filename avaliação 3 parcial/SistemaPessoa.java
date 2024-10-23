import java.awt.*;
import javax.swing.*;

public class SistemaPessoa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Pessoas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o menu
        JMenuBar menuBar = criarMenu();
        frame.setJMenuBar(menuBar);

        // Cria o rodapé
        JLabel rotuloRodape = new JLabel("Versão: 12.1.2024 Usuário: denys.silva Data de acesso: 20/09/2024 10:58");
        frame.add(rotuloRodape, BorderLayout.SOUTH);

        // Adiciona um painel central para outros componentes (opcional)
        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private static JMenuBar criarMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenuItem menuItemUsuarios = new JMenuItem("Usuários");
        JMenuItem menuItemPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(menuItemUsuarios);
        menuCadastro.add(menuItemPessoas);
        menuBar.add(menuCadastro);

        // ... (adicione outros menus e itens)

        return menuBar;
    }
}
