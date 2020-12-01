package com.company.view;

import com.company.dao.AlunoDao;
import com.company.model.Aluno;
import com.company.model.Curso;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class FormAluno {
    private JTextField textRM;
    private JTextField textNome;
    private JTextField textEmail;
    private JTextField textTelefone;
    private JTextField textEndereço;
    private JComboBox comboCurso;
    private JButton gravarButton;
    private JButton sairButton;
    private JPanel alunoPanel;

    public FormAluno() {
        gravarButton.addMouseListener(new  MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Aluno aluno = new Aluno();
                aluno.setRm(Integer.parseInt(textRM.getText()));
                aluno.setNome(textNome.getText());
                aluno.setEmail(textEmail.getText());
                aluno.setTelefone(textTelefone.getText());
                aluno.setEndereço(textEndereço.getText());
                Curso curso = Curso.EMDS;
                switch (comboCurso.getSelectedIndex()){
                    case 0:
                        curso = Curso.EMIA;
                        break;
                    case 1:
                        curso = Curso.EMDS;
                        break;
                    case 2:
                        curso = Curso.EMLOG;
                        break;
                    case 3:
                        curso = Curso.EMAD;
                        break;

                }
                aluno.setCurso(curso);

                JOptionPane.showMessageDialog(
                        null,
                        "Dados do Aluno \n" + aluno.toString(),
                        "Cadastro Efetuado",
                        JOptionPane.INFORMATION_MESSAGE
                );
                limparTela();
            }

            private void limparTela() {
                textEmail.setText("");
                textEndereço.setText("");
                textNome.setText("");
                textRM.setText("");
                textTelefone.setText("");
                comboCurso.setSelectedIndex(0);

            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
    }

    public JPanel getAlunoPanel() {
        return alunoPanel;
    }
}
