package org.example.UI.TutoriaUI;

import org.example.Model.Alumno;
import org.example.Model.Tutoria;
import org.example.Respositorios.RepositorioTutoria;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.Listar.ListsContainer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class  ActualizarTutoria extends javax.swing.JInternalFrame {
    String hora, fecha, duracion, comentarios, idAlumno;
    /**
     * Creates new form AgregarTutoria
     */
    public ActualizarTutoria() {
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
        boxAlumnoId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdentif = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Actualizar Tutoria");

        jLabel1.setText("Fecha");

        jLabel2.setText("Hora");

        jLabel3.setText("Duración");

        jLabel4.setText("Comentarios");

        jLabel5.setText("Alumno");

        jButton1.setText("Actualizar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });



        jLabel6.setText("Identificador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(boxAlumnoId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addComponent(jLabel5))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtHora)
                                                        .addComponent(txtComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtIdentif))))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(boxAlumnoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIdentif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        //Todo al dar click
        cargarDatos();
        if(validarDatos()){
            Tutoria t = new Tutoria();
            t.setFecha(fecha);
            t.setHora(hora);
            t.setDuracion(duracion);
            t.setComentarios(comentarios);
            t.setAlumno_id(idAlumno);
            if(SuperFuncion.actualizar(new RepositorioTutoria(), t)){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente la tutoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo correctamente la tutoria");
        }

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
            this.boxAlumnoId.addItem(s.toString());
        }
    }

    public void cargarDatos(){
        hora = txtHora.getText();
        fecha = txtDuracion.getText();
        duracion = txtDuracion.getText();
        comentarios = txtComentarios.getText();
        idAlumno = this.boxAlumnoId.getSelectedItem().toString();
    }

    public boolean validarDatos(){
        return !hora.isEmpty() && !fecha.isEmpty() && !duracion.isEmpty() && !comentarios.isEmpty() && !idAlumno.isEmpty();
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> boxAlumnoId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdentif;
    // End of variables declaration
}
