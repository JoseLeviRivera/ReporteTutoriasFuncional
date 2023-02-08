package org.example.UI.ProfesorUI;

import org.example.Model.Profesor;
import org.example.Util.Listar.ListsContainer;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MostrarListaProfesores extends javax.swing.JInternalFrame {

    private String encabezados[] = {"Id", "Nombre", "Apellidos", "Correo", "Año de Ingreso", "Grado Academico", "Adscripcón"};
    private DefaultTableModel modelo = new DefaultTableModel();


    /**
     * Creates new form MostrarListaProfesores
     */
    public MostrarListaProfesores() {
        initComponents();
        modelo.setColumnIdentifiers(encabezados);
        this.jTable1.setModel(modelo);
        llenarTabla(ListsContainer.obtenerListaProfesores());
    }

    public void llenarTabla(List<Profesor> profesores){
        for(Profesor x: profesores){
            modelo.addRow(new Object[]{
                    x.getId(), x.getNombre(), x.getApellidos(),
                    x.getCorreo(), x.getAnioIngreso(),
                    x.getGradoAcademico(),x.getAdscripcion()
            });
        }
    }

    public List<Profesor> profesorList(List<Object> lista){
        return  lista.stream().filter(objecto -> objecto instanceof  Profesor)
                .map(objecto -> (Profesor) objecto).collect(Collectors.toList());
    }

    public List<Profesor> obtenerListaProfesores(List<Object> listaObject){
        List<Profesor> listaProfesores = new ArrayList<Profesor>();
        for (Object objeto : listaObject) {
            if (objeto instanceof Profesor) {
                listaProfesores.add((Profesor) objeto);
            }
        }
        return listaProfesores;
    }

    public void limpiarTabla(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(encabezados);
        this.jTable1.setModel(modelo);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tabla de profesores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}