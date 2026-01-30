package co.com.sst360.dao;

import co.com.sst360.modelo.Incidente;
import co.com.sst360.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IncidenteDAO {

public boolean insertarIncidente(Incidente incidente) {

    String sql = "INSERT INTO incidentes " +
                 "(tipo_evento, codigo, fecha, hora, lugar, area, descripcion, estado) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    Connection conn = ConexionDB.getConexion();

    if (conn == null) {
        System.out.println("ERROR: conexión null en IncidenteDAO");
        return false;
    }

    try (PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, incidente.getTipoEvento());
        ps.setString(2, incidente.getCodigo());
        ps.setDate(3, java.sql.Date.valueOf(incidente.getFecha()));
        ps.setTime(4, java.sql.Time.valueOf(incidente.getHora()));
        ps.setString(5, incidente.getLugar());
        ps.setString(6, incidente.getArea());
        ps.setString(7, incidente.getDescripcion());
        ps.setString(8, incidente.getEstado());

        ps.executeUpdate();
        return true;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    
    public List<Incidente> listarIncidentes() {
        List<Incidente> lista = new ArrayList<>();
        String sql = "SELECT * FROM incidentes";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Incidente incidente = new Incidente();
                incidente.setIdIncidente(rs.getInt("id_incidente"));
                incidente.setTipoEvento(rs.getString("tipo_evento"));
                incidente.setCodigo(rs.getString("codigo"));
                incidente.setFecha(rs.getDate("fecha").toLocalDate());
                incidente.setHora(rs.getTime("hora").toLocalTime());
                incidente.setLugar(rs.getString("lugar"));
                incidente.setArea(rs.getString("area"));
                incidente.setDescripcion(rs.getString("descripcion"));
                incidente.setEstado(rs.getString("estado"));

                lista.add(incidente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar incidentes: " + e.getMessage());
        }

        return lista;
    }

    public boolean actualizarEstado(int idIncidente, String nuevoEstado) {
        String sql = "UPDATE incidentes SET estado = ? WHERE id_incidente = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoEstado);
            ps.setInt(2, idIncidente);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar incidente: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarIncidente(int idIncidente) {
        String sql = "DELETE FROM incidentes WHERE id_incidente = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idIncidente);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar incidente: " + e.getMessage());
            return false;
        }
    }
}