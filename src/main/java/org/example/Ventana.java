package org.example;

import java.awt.*;

public class Ventana extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private FlowLayout layout;

    //forzando que se procese una excepcion de tipo atendida
    public Ventana(String title) throws HeadlessException {
        //dejamos para que se ponga el titulo
        super(title);
        // ponemos nom de conztante en lugar de numero
        layout= new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1);
        // text field acepta caracteres
        txtCuadro1 = new TextField(60);
        this.add(txtCuadro1);

        lblEtiqueta2 = new Label("Etiqueta 2");
        this.add(lblEtiqueta2);
        // text field acepta caracteres
        txtCuadro2 = new TextField(60);
        this.add(txtCuadro2);

        this.setSize(800, 600);
        this.setVisible(true);

    }

}
