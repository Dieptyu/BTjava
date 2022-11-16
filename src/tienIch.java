
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class tienIch {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public tienIch() {
        prepareGUI();
    }

    public static void main(String[] args) {
        tienIch swingJButton = new tienIch();
        swingJButton.showButtonDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Quan ly chung cu - tien ich");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showButtonDemo() {
        headerLabel.setText("Chon tien ich");
        JButton themButton = new JButton("them phong");
        JButton xoaButton = new JButton("xoa phong");
        JButton capnhatButton = new JButton("cap nhat phong");
        capnhatButton.setHorizontalTextPosition(SwingConstants.LEFT);
        themButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        xoaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        capnhatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        controlPanel.add(themButton);
        controlPanel.add(xoaButton);
        controlPanel.add(capnhatButton);
        mainFrame.setVisible(true);
    }
}

