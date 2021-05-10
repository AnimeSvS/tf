package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Cliente buscar(String dni) {
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE Dni=" + dni;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDirec(rs.getString(4));
                c.setTel(rs.getString(5));
                c.setEsta(rs.getString(6));

            }
        } catch (Exception e) {
        }
        return c;
    }
    //Operaciones CRUD

    public List listar() {
        String sql = "SELECT * FROM cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDirec(rs.getString(4));
                c.setTel(rs.getString(5));
                c.setEsta(rs.getString(6));

                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Cliente c) {
        String sql = "INSERT INTO cliente(Dni, Nombres, Direccion,Telefono, Estado, User)VALUES(?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getDirec());
            ps.setString(4, c.getTel());
            ps.setString(5, c.getEsta());

            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public Cliente listarId(int id) {
        Cliente cli = new Cliente();
        String sql = "SELECT * FROM cliente WHERE IdCliente=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cli.setDni(rs.getString(2));
                cli.setNom(rs.getString(3));
                cli.setDirec(rs.getString(4));
                cli.setTel(rs.getString(5));
                cli.setEsta(rs.getString(6));

            }
        } catch (Exception e) {
        }
        return cli;
    }

    public int actualizar(Cliente c) {
        String sql = "UPDATE cliente SET Dni=?, Nombres=?, Direccion=?,Telefono=?, Estado=? WHERE IdCliente=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getDirec());
            ps.setString(4, c.getTel());
            ps.setString(5, c.getEsta());

            ps.setInt(6, c.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int id) {
        String sql = "DELETE FROM cliente WHERE IdCliente=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
