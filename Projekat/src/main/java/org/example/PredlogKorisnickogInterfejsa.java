package org.example;

import javax.swing.*;
import java.awt.event.*;

public class PredlogKorisnickogInterfejsa extends JDialog {
    private JPanel contentPane;
    private JButton buttonClose;
    private JButton buttonSave;
    private JButton buttonOpen;
    private JButton buttonGetSelection;
    private JTextArea textAreaTop;
    private JTextArea textAreaBottom;
    private JTextArea textAreaNew;

    public PredlogKorisnickogInterfejsa() {
        setContentPane(contentPane);
        setModal(true);
        //    getRootPane().setDefaultButton(buttonOpen);

        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onButtonClose();
            }
        });


        // call onCancel() when cross is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onButtonClose();
            }
        });
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        buttonGetSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void onButtonClose() {
        // add your code here if necessary
        dispose();
    }
    public static void main(String[] args) {
        PredlogKorisnickogInterfejsa dialog = new PredlogKorisnickogInterfejsa();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setData(FileEditor data) {
    }

    public void getData(FileEditor data) {
    }

    public boolean isModified(FileEditor data) {
        return false;
    }
}
