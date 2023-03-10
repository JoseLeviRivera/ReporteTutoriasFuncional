package org.example.UI.ProfesorUI;

import org.example.Model.Profesor;
import org.example.Respositorios.RespositorioProfesor;
import org.example.SuperFuncion.SuperFuncion;

import javax.swing.*;

public class ActualizarProfesor extends javax.swing.JInternalFrame {
    private String id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String fechaIngreso;
    private String gradoAcademico;
    private String adscripcion;

    /**
     * Creates new form AgregarProfesor
     */
    public ActualizarProfesor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAdscripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Actualizar Profesor");

        jLabel8.setText("Identificador");

        jLabel9.setText("Nombre");

        jLabel10.setText("Apellidos");

        jLabel11.setText("Correo");

        jLabel12.setText("Año de ingreso");

        jLabel1.setText("Grado Academico");

        jLabel2.setText("Adscripción(Carrera) ");

        jButton1.setText("Actualizar");
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
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addComponent(jLabel12))
                                                        .addGap(32, 32, 32)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel11)
                                                                .addComponent(jLabel9)
                                                                .addComponent(txtNombre)
                                                                .addComponent(txtCorreo)
                                                                .addComponent(txtGrado, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                                                .addComponent(txtAdscripcion)))
                                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAdscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        cargarDatos();
        if(validarCampos()){
            Profesor profesor = new Profesor(id,nombre, apellidos, correo, fechaIngreso, gradoAcademico,adscripcion);
            limpiarCajaTextos();
            Boolean status = SuperFuncion.actualizar(new RespositorioProfesor(), profesor);
            if(status){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente al profesor");
            }else {
                JOptionPane.showMessageDialog(null, "No se actualizo al profesor");
            }
            //Todo Agregar la actualizacion a la base de datos
            //Todo Lanzar a la ventana donde se muestra la tabla de todo los profesores
        }else {
            JOptionPane.showMessageDialog(null, "Hay datos vacios en el formulario");
        }
    }

    public void cargarDatos(){
        id = txtId.getText();
        nombre = txtNombre.getText();
        apellidos = txtApellidos.getText();
        correo = txtCorreo.getText();
        fechaIngreso = txtIngreso.getText();
        gradoAcademico = txtGrado.getText();
        adscripcion = txtAdscripcion.getText();
    }

    public boolean validarCampos(){
        return !id.isEmpty() && !nombre.isEmpty() && !apellidos.isEmpty()
                && !correo.isEmpty() && !fechaIngreso.isEmpty()
                && !gradoAcademico.isEmpty() && !adscripcion.isEmpty();
    }

    public void limpiarCajaTextos(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtIngreso.setText("");
        txtGrado.setText("");
        txtAdscripcion.setText("");
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdscripcion;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration
}

