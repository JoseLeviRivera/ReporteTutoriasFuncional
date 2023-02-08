package org.example.UI;

import org.example.Respositorios.RepositorioAlumno;
import org.example.Respositorios.RepositorioTutor;
import org.example.Respositorios.RepositorioTutoria;
import org.example.SuperFuncion.SuperFuncion;
import org.example.UI.AlumnoUI.ActualizarAlumno;
import org.example.UI.AlumnoUI.MostrarListaAlumnos;
import org.example.UI.AlumnoUI.RegistrarAlumno;
import org.example.UI.ProfesorUI.ActualizarProfesor;
import org.example.UI.ProfesorUI.AgregarProfesor;
import org.example.UI.ProfesorUI.MostrarListaProfesores;
import org.example.UI.TutorUI.AgregarTutor;
import org.example.UI.TutorUI.MostrarTutores;
import org.example.UI.TutoriaUI.ActualizarTutoria;
import org.example.UI.TutoriaUI.AgregarTutoria;
import org.example.UI.TutoriaUI.MostrarListaTutoria;

import javax.swing.*;

public class Root extends javax.swing.JFrame {

    /**
     * Creates new form InterfazProfesor
     */
    public Root() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        jMenu1.setText("Profesor");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setText("Actualizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenu8.setText("Tutor");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem5.setText("Registrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem6.setText("MostrarTutores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem19.setText("Eliminar");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenu1.add(jMenu8);
        jMenu1.add(jSeparator4);

        jMenu5.setText("Mas opciones");

        jMenuItem17.setText("Limitar");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumno");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Listar ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Registrar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setText("Actualizar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem10.setText("Eliminar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator2);

        jMenu6.setText("Mas opciones");

        jMenuItem16.setText("Limitar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tutoria");

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem13.setText("Listar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem11.setText("Registrar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem12.setText("Actualizar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem14.setText("Eliminar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);
        jMenu3.add(jSeparator3);

        jMenu7.setText("Mas opciones");

        jMenuItem18.setText("Limitar");
        jMenu7.add(jMenuItem18);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Detalles");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem15.setText("Salir");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Registrar");
        AgregarProfesor agregarProfesor = new AgregarProfesor();
        Escritorio.add(agregarProfesor);
        agregarProfesor.show();
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Actualizar");
        ActualizarProfesor actprf = new ActualizarProfesor();
        Escritorio.add(actprf);
        actprf.show();
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Listar!");
        MostrarListaProfesores m = new MostrarListaProfesores();
        Escritorio.add(m);
        m.show();
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        JTextField identificador = new JTextField();
        Object [] mensaje = {
                "Identificador: ", identificador
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje,
                "Eliminar a un Profesor", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION && !identificador.getText().isEmpty()) {
            String id = identificador.getText();
            System.out.println("Identificador del profesor ingresado es: " + id);
            //Todo Eliminar Profesor
        }
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Registrar como tutor");
        AgregarTutor m = new AgregarTutor();
        Escritorio.add(m);
        m.show();
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
        MostrarListaAlumnos listaAl = new MostrarListaAlumnos();
        Escritorio.add(listaAl);
        listaAl.show();
    }

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        //Todo: Tabla para mostrar Los Tutores
        MostrarTutores mso = new MostrarTutores();
        Escritorio.add(mso);
        mso.show();

    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        RegistrarAlumno alumnR = new RegistrarAlumno();
        Escritorio.add(alumnR);
        alumnR.show();
    }

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ActualizarAlumno act = new ActualizarAlumno();
        Escritorio.add(act);
        act.show();
    }

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JTextField identificador = new JTextField();
        Object [] mensaje = {
                "Identificador: ", identificador
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje,
                "Eliminar Alumno", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION && !identificador.getText().isEmpty()) {
            String id = identificador.getText();
            System.out.println("Identificador del alumno ingresado es: " + id);
            //Todo eliminar alumno
            if(SuperFuncion.eliminar(new RepositorioAlumno(), id)){
                JOptionPane.showMessageDialog(null, "Se Elimino correctamente al alumno");
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino al alumno");
            }
        }
    }

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        AgregarTutoria reg = new AgregarTutoria();
        Escritorio.add(reg);
        reg.show();
    }

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ActualizarTutoria act = new ActualizarTutoria();
        Escritorio.add(act);
        act.show();
    }

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JTextField identificador = new JTextField();
        Object [] mensaje = {
                "Identificador: ", identificador
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje,
                "Eliminar Tutoria", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION && !identificador.getText().isEmpty()) {
            String id = identificador.getText();
            System.out.println("Identificador del Tutoria ingresado es: " + id);
            //Todo eliminar Tutoria
            if(SuperFuncion.eliminar(new RepositorioTutoria(), id)){
                JOptionPane.showMessageDialog(null, "Se elimino correctamente la tutoria");
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino a la tutoria");
            }
        }

    }

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MostrarListaTutoria t = new MostrarListaTutoria();
        Escritorio.add(t);
        t.show();
    }

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        //Todo: Eliminar a un Tutor AQUI

        JTextField identificador = new JTextField();
        Object [] mensaje = {
                "Identificador: ", identificador
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje,
                "Eliminar Tutor", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION && !identificador.getText().isEmpty()) {
            String id = identificador.getText();
            System.out.println("Identificador del Tutor ingresado es: " + id);
            //Todo eliminar Tutoria
            if(SuperFuncion.eliminar(new RepositorioTutor(), id)){
                JOptionPane.showMessageDialog(null, "Se Elimino correctamente al tutor");
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino al tutor");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Root().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration
}