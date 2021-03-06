/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Traductores.idetl;

import com.Traductores.idetl.Controllers.*;
import com.Traductores.idetl.Utils.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JC
 */
public class NewJDialogConfiguracion extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialogConfiguracion
     */
    public NewJDialogConfiguracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldNombreClase = new javax.swing.JTextField();
        botonGenerarClase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textFielNombreVariable = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldTipoValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldValor = new javax.swing.JTextField();
        botonAgregarVariable = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textFieldNombreMetodo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textFieldTipoRetorno = new javax.swing.JTextField();
        botonAgregarMetodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaXML = new javax.swing.JTextArea();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAceptar.setText("Aceptar");
        botonAceptar.setEnabled(false);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de la clase:");

        textFieldNombreClase.setText("Ingrear nombre de la clase");

        botonGenerarClase.setText("Generar");
        botonGenerarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarClaseActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de variable:");

        textFielNombreVariable.setText("variable");

        jLabel3.setText("Tipo de valor:");

        textFieldTipoValor.setText("String");

        jLabel5.setText("Valor:");

        textFieldValor.setText("valor");

        botonAgregarVariable.setText("Agregar");
        botonAgregarVariable.setEnabled(false);
        botonAgregarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarVariableActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre del metodo:");

        jLabel7.setText("Tipo de retorno:");

        botonAgregarMetodo.setText("Agregar");
        botonAgregarMetodo.setEnabled(false);
        botonAgregarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMetodoActionPerformed(evt);
            }
        });

        textAreaXML.setColumns(20);
        textAreaXML.setRows(5);
        jScrollPane1.setViewportView(textAreaXML);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(botonGenerarClase))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFielNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTipoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAgregarVariable))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAceptar)
                        .addGap(83, 83, 83)
                        .addComponent(botonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombreMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAgregarMetodo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textFieldNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGenerarClase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textFielNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldTipoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregarVariable))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textFieldNombreMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(textFieldTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregarMetodo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAceptar)
                            .addComponent(botonCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonGenerarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarClaseActionPerformed
        // TODO add your handling code here:
        //ClaseControlador controladorClase = new ClaseControlador(textFieldNombreClase.getText(), this);
        if(ClaseControlador.esNombreValido(textFieldNombreClase.getText()))// si el nombre de la clase es un identificador valido
        {
            if(!ClaseControlador.esPalabraReservada(textFieldNombreClase.getText()))// si no es palabra reservada
            {
                ClaseControlador.crearClase(textFieldNombreClase.getText());// se crea la clase
                JOptionPane.showMessageDialog(this, "Se creo correctamente la clase " + textFieldNombreClase.getText(), "Exito!", JOptionPane.INFORMATION_MESSAGE);
                botonAceptar.setEnabled(true);
                botonAgregarVariable.setEnabled(true);
                botonAgregarMetodo.setEnabled(true);
            }else{// si es palabra resrvada
                JOptionPane.showMessageDialog(this, textFieldNombreClase.getText() + " es una palabra reservada", "Error", JOptionPane.ERROR_MESSAGE);
            }//fin if - else que checa que no sea palabra reservada
        }else{// si no es valido
            JOptionPane.showMessageDialog(this, textFieldNombreClase.getText() + " no es valido el nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }//fin if - else que checa que el nombre sera valido
    }//GEN-LAST:event_botonGenerarClaseActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        JFileChooser fc=new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".xml","xml");
        fc.setFileFilter(filtro);

        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showSaveDialog(this);

        //Si el usuario, pincha en aceptar
        if(seleccion == JFileChooser.APPROVE_OPTION)
        {          
            ArchivoXML.contendioXML(fc.getSelectedFile().toString());
            textAreaXML.setText(LectorArchivoXML.obtenerXML(fc.getSelectedFile().toString()+".xml"));
            botonAceptar.setEnabled(false);
        }

        
        //mostar el contenido en un XML
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonAgregarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarVariableActionPerformed
        // TODO add your handling code here:
        //VariableControlador controladorVariable = new VariableControlador(this, textFielNombreVariable.getText(), 
                //textFieldTipoValor.getText(), textFieldValor.getText());
        if(VariableControlador.validar(textFielNombreVariable.getText(), textFieldTipoValor.getText()))// si es valido el nombre y el tipo de valor
        {
            if(VariableControlador.agregarVariable(textFielNombreVariable.getText(), textFieldTipoValor.getText(), textFieldValor.getText()))// si se puede agregar
            {
                JOptionPane.showMessageDialog(this, VariableControlador.obtenerMensaje(), "Exito", JOptionPane.INFORMATION_MESSAGE);
            }else{// de lo contariro manda mensaejd e error
                JOptionPane.showMessageDialog(this, VariableControlador.obtenerMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{// de lo contario mande mensaje de error
            JOptionPane.showMessageDialog(this, VariableControlador.obtenerMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarVariableActionPerformed

    private void botonAgregarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarMetodoActionPerformed
        // TODO add your handling code here:
        MetodoControlador controladorMetodo = new MetodoControlador();
        if(MetodoControlador.esNombreValido(textFieldNombreMetodo.getText()))// si el nombre del metodo es valid
        {
            if(!MetodoControlador.esPalabraReservada(textFieldNombreMetodo.getText()))// si no es palabra reservada
            {
                if(MetodoControlador.validarTipoRetorno(textFieldTipoRetorno.getText()))// si el tipo de retorno que especifico es valido
                {
                    if(MetodoControlador.agregarMetodo(textFieldNombreMetodo.getText(), textFieldTipoRetorno.getText()))//si fue exitoso agregar el metodo
                    {
                        JOptionPane.showMessageDialog(this, "SE agrego correctamente el metodo: " + textFieldNombreMetodo.getText());
                        MetodoControlador.agregarMetodo(textFieldNombreMetodo.getText(), textFieldTipoRetorno.getText());
                        VentanaParametros ventanaParametros = new VentanaParametros();
                        ventanaParametros.setModal(true);
                        ventanaParametros.setVisible(true);
                    }else{// ya esta repedito el metodo
                        JOptionPane.showMessageDialog(this, "Ya esta el metodo: " + textFieldNombreMetodo.getText());
                    }
                }else{// si el tipo de retorno no es valido
                    JOptionPane.showMessageDialog(this, textFieldTipoRetorno.getText() + " Tipo de retorno invalido ");
                }//fin else - if de validar el tipo de retorno
            }else{// el nombre del metodo es palabra reservada
                JOptionPane.showMessageDialog(this, textFieldNombreMetodo.getText() + " Es palabra reservada");
            }// fin if - else que valida que el nombre del metodo  no sea palabra reservada
        }else{// el nombre del metodo no es valido
            JOptionPane.showMessageDialog(this, textFieldNombreMetodo.getText() + " No es un nombre valido");
        }// fin if -else que valida que el nombre sea valido
    }//GEN-LAST:event_botonAgregarMetodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJDialogConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialogConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialogConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialogConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialogConfiguracion dialog = new NewJDialogConfiguracion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAgregarMetodo;
    private javax.swing.JButton botonAgregarVariable;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGenerarClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaXML;
    private javax.swing.JTextField textFielNombreVariable;
    private javax.swing.JTextField textFieldNombreClase;
    private javax.swing.JTextField textFieldNombreMetodo;
    private javax.swing.JTextField textFieldTipoRetorno;
    private javax.swing.JTextField textFieldTipoValor;
    private javax.swing.JTextField textFieldValor;
    // End of variables declaration//GEN-END:variables
}
