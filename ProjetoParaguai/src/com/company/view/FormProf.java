package com.company.view;

import com.company.model.Prof;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormProf {
    private JTextField textCod;
    private JTextField textNome;
    private JTextField textEmail;
    private JButton gravarButton;
    private JButton sairButton;
    private JPanel profPanel;

    public JPanel getProfPanel() {
        return profPanel;
    }

    public FormProf() {
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Prof prof = new Prof();
                prof.setCod(Integer.parseInt(textCod.getText()));
                prof.setNome(textNome.getText());
                prof.setEmail(textEmail.getText());
                JOptionPane.showMessageDialog(
                        null,
                        "Dados do Professor \n" + prof.toString(),
                        "Cadastro Efetuado",
                        JOptionPane.INFORMATION_MESSAGE
                );
                limparTela();
            }

            private void limparTela() {
                textNome.setText("");
                textEmail.setText("");
                textCod.setText("");
            }

        });
    }
}
