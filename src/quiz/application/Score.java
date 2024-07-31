package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {

        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 100, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank You " + name + " for playing Simple Minds ");
        heading.setBounds(50, 40, 700, 40);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        add(heading);

        JLabel result = new JLabel("Your score is " + score);
        result.setBounds(400, 200, 700, 30);
        result.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        add(result);

        JButton submit = new JButton("Play Again ");
        submit.setBounds(420, 290, 150, 50);
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma", Font.BOLD, 20));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {
        new Score("user", 0);
    }

}
