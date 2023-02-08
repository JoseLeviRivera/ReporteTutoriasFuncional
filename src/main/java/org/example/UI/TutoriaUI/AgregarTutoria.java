package org.example.UI.TutoriaUI;

import org.example.Model.Alumno;
import org.example.Model.Tutor;
import org.example.Model.Tutoria;
import org.example.Respositorios.RepositorioTutoria;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.Listar.ListsContainer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AgregarTutoria extends javax.swing.JInternalFrame {
    private String hora;
    private String fecha;
    private String duracion;
    private String comentarios;

    private String idAlumno;

    /**
     * Creates new form AgregarTutoria
     */
    public AgregarTutoria() {
        initComponents();
        agregarItemsIdAlumno(obtenerListaItem(ListsContainer.obtenerListaAlumnos()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        txtComentarios = new javax.swing.JTextField();
        boxAlumno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar Tutoria");

        jLabel1.setText("Fecha");

        jLabel2.setText("Hora");

        jLabel3.setText("Duración");

        jLabel4.setText("Comentarios");

        jLabel5.setText("Alumno");

        jButton1.setText("Registrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addComponent(txtFecha)
                                                                .addComponent(jLabel3))
                                                        .addGap(25, 25, 25)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel2)
                                                                .addComponent(txtHora)
                                                                .addComponent(txtComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                                                .addComponent(boxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void cargarItemsComboxIdAlumno(String s[]){
        for(String x: s){
            boxAlumno.addItem(x);
        }
    }

    public void cargarDatos(){
        hora = txtHora.getText();
        fecha = txtDuracion.getText();
        duracion = txtDuracion.getText();
        comentarios = txtComentarios.getText();
        idAlumno = this.boxAlumno.getSelectedItem().toString();
    }

    public boolean validarDatos(){
        return !hora.isEmpty() && !fecha.isEmpty() && !duracion.isEmpty() && !comentarios.isEmpty() && !idAlumno.isEmpty();
    }

    public List<String> obtenerListaItem(List<Alumno> p){
        List<String> lista = new ArrayList<>();
        for (Alumno t: p ) {
            lista.add(t.getId());
        }
        return lista;
    }

    public void agregarItemsIdAlumno(List<String> items){
        for(String s: items){
            this.boxAlumno.addItem(s.toString());
        }
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        cargarDatos();
        if(validarDatos()){
            //Todo: Agregar a la base de datos
            if(SuperFuncion.crear(new RepositorioTutoria(), new Tutoria(hora, fecha, duracion, comentarios, idAlumno))) {
                JOptionPane.showMessageDialog(null, "Se registro correctamente la tutoria");
            } else {
                JOptionPane.showMessageDialog(null, "No se registro la tutoria");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Hay datos vacios en el formulario");
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> boxAlumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    // End of variables declaration
}
