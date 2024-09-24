package mx.uam.cafeteriaproyectoadsc.demo.presentacion.login;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
@Component
public class VentanaLogin extends JFrame {
    private JPanel contentPane;

    private ControlLogin control;

    public VentanaLogin() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblMiAplicacin = new JLabel("Mi Aplicación");
        lblMiAplicacin.setBounds(5, 5, 440, 16);
        contentPane.add(lblMiAplicacin);

        //JButton btnAgregarUsuario = new JButton("Agregar usuario");
        //btnAgregarUsuario.addActionListener(new ActionListener() {
        //    public void actionPerformed(ActionEvent e) {
        //        control.agregarUsuario();
        //    }
        //});
        //btnAgregarUsuario.setBounds(15, 33, 178, 29);
        //contentPane.add(btnAgregarUsuario);

        //JButton btnListarUsuarios = new JButton("Listar usuarios");
        //btnListarUsuarios.addActionListener(new ActionListener() {
        //    public void actionPerformed(ActionEvent e) {
        //        control.listarUsuarios();
        //    }
        //});


        //btnListarUsuarios.setBounds(15, 88, 178, 29);
        //contentPane.add(btnListarUsuarios);
    }

    public void muestra(ControlLogin control) {

        this.control = control;

        setVisible(true);
    }

}
