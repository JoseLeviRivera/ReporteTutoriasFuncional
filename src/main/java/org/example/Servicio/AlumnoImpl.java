package org.example.Servicio;

import org.example.Model.Alumno;
import org.example.Model.Profesor;
import org.example.Util.DatabaseConection.ConexionDB;
import org.example.interfaces.CrudRepositorioAlumno;
import org.example.interfaces.OrderSuperior;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlumnoImpl implements CrudRepositorioAlumno, OrderSuperior {
    private Statement statement = null;
    private Connection connection = null;

    public AlumnoImpl(Connection _dbCon){
        this.connection = _dbCon;
    }

    @Override
    public List<Alumno> listar() {
        List<Alumno> listsAlumnos = new ArrayList<>();
        Alumno a = new Alumno();
        String readSql = "SELECT * FROM alumnos";
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    a.setId(id);
                    String matricula = resultSet.getString("matricula");
                    a.setMatricula(matricula);
                    String nombre = resultSet.getString("nombre");
                    a.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    a.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    a.setCorreo(correo);
                    String telefonoCasa = resultSet.getString("telefonoCasa");
                    a.setTelefonoCasa(telefonoCasa);
                    String telefonoCelular = resultSet.getString("telefonoCelular");
                    a.setTelefonoCelular(telefonoCelular);
                    String fechaNacimiento = resultSet.getString("fechaNacimiento");
                    a.setFechaNacimiento(fechaNacimiento);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    a.setAnioIngreso(anioIngreso);
                    String carrera = resultSet.getString("carrera");
                    a.setCarrera(carrera);
                    String id_tutor = resultSet.getString("tutor_id");
                    a.setTutorId(id_tutor);
                    listsAlumnos.add(a);
                    a = new Alumno();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listsAlumnos;
    }

    @Override
    public Alumno porId(String identificador) {
        String sql = "SELECT * FROM alumnos WHERE id=?";
        Alumno a = new Alumno();
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(sql)) {
            readStatement.setString(1, identificador);
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    a.setId(id);
                    String matricula = resultSet.getString("matricula");
                    a.setMatricula(matricula);
                    String nombre = resultSet.getString("nombre");
                    a.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    a.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    a.setCorreo(correo);
                    String telefonoCasa = resultSet.getString("telefonoCasa");
                    a.setTelefonoCasa(telefonoCasa);
                    String telefonoCelular = resultSet.getString("telefonoCelular");
                    a.setTelefonoCelular(telefonoCelular);
                    String fechaNacimiento = resultSet.getString("fechaNacimiento");
                    a.setFechaNacimiento(fechaNacimiento);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    a.setAnioIngreso(anioIngreso);
                    String carrera = resultSet.getString("carrera");
                    a.setCarrera(carrera);
                    String idTutor = resultSet.getString("tutor_id");
                    a.setTutorId(idTutor);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    @Override
    public void crear(Alumno t) {
        PreparedStatement statement = null;
        try {
            String sql = "INSERT INTO alumnos (id,nombre,matricula,apellidos,correo,telefonoCasa,telefonoCelular,fechaNacimiento,anioIngreso,carrera,tutor_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            if (!existe(t.getId())) {
                statement = this.connection.prepareStatement(sql);
                statement.setString(1, t.getId());
                statement.setString(2, t.getNombre());
                statement.setString(3, t.getMatricula());
                statement.setString(4, t.getApellidos());
                statement.setString(5, t.getCorreo());
                statement.setString(6, t.getTelefonoCasa());
                statement.setString(7, t.getTelefonoCelular());
                statement.setString(8, t.getFechaNacimiento());
                statement.setString(9, t.getAnioIngreso());
                statement.setString(10, t.getCarrera());
                statement.setString(11, t.getTutorId());
                int rowsAffected = statement.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
            }else {
                System.out.println("Ya se encuentra registrado un alumno con la misma matrícula");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    @Override
    public void editar(Alumno t) {
        String updateSql = "UPDATE alumnos SET matricula = ?, nombre = ?, apellidos = ?, correo = ?, telefonoCasa = ?, telefonoCelular = ?, fechaNacimiento = ?, anioIngreso = ?, carrera = ? WHERE id = ?";
        try (PreparedStatement updateStatement = ConexionDB.getInstance().getConnection().prepareStatement(updateSql)) {
            updateStatement.setString(1, t.getMatricula());
            updateStatement.setString(2, t.getNombre());
            updateStatement.setString(3, t.getApellidos());
            updateStatement.setString(4, t.getCorreo());
            updateStatement.setString(5, t.getTelefonoCasa());
            updateStatement.setString(6, t.getTelefonoCelular());
            updateStatement.setString(7, t.getFechaNacimiento());
            updateStatement.setString(8, t.getAnioIngreso());
            updateStatement.setString(9, t.getCarrera());
            updateStatement.setString(10, t.getId());
            int rowsAffected = updateStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {}

    }
    @Override
    public boolean eliminar(String id) {
        PreparedStatement deleteStatement = null;
        try {
            String sql = "DELETE FROM alumnos WHERE id = ?";
            deleteStatement = this.connection.prepareStatement(sql);
            deleteStatement.setString(1, id);
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean existe(String id) {
        return this.porId(id).getId() != null;
    }

    @Override
    public void imprimirLista() {
        listar().forEach(System.out::println);
    }

    @Override
    public long contar() {
        return listar().stream().count();
    }
}