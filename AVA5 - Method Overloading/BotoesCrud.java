import java.awt.*;
import javax.swing.*;

public class BotoesCrud {

    public JPanel criarPainelBotoes(JDialog dialog) {
        return criarPainelBotoes(dialog, null);
    }

    public JPanel criarPainelBotoes(JDialog dialog, String[] customLabels) {
        JPanel painelBotoes = new JPanel(new FlowLayout());
        String[] labels = (customLabels == null || customLabels.length == 0)
                ? new String[]{"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"}
                : customLabels;

        for (String label : labels) {
            JButton button = new JButton(label);
            if (label.equals("Sair")) {
                button.addActionListener(e -> dialog.setVisible(false));
            } else {
                button.addActionListener(e -> JOptionPane.showMessageDialog(dialog, "Botão " + label + " clicado!"));
            }
            painelBotoes.add(button);
        }
        return painelBotoes;
    }
}
