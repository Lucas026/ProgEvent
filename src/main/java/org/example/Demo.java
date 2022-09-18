package org.example;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Demo extends JFrame {
    private static final long serialVersionUID = -4939544011287453046L;
    private final JButton btnClickMe = new JButton( "Click me!" );
    private final JButton btnPushMe = new JButton( "Push me!" );
    private final JButton btnActivateMe = new JButton( "Activate me!" );
    public Demo() {
        super( "Implémentation d'interface" );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new FlowLayout() );

        contentPane.add( btnClickMe );
        contentPane.add( btnPushMe );
        contentPane.add( btnActivateMe );

        btnClickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnActivateMe.setText( "First button clicked!" + e.getSource());
            }
        });

        btnPushMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println( "btnPushMe clicked" + e.getSource());
            }
        });

        btnActivateMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle( "Button clicked" + e.getSource() );
            }
        });

        this.setSize( 400, 200 );
        this.setLocationRelativeTo( null );
    }

    public static void main( String[] args ) throws Exception {
        // Try to set Nimbus look and feel
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        // Start the demo
        Demo demo = new Demo();
        demo.setVisible( true );
    }
}