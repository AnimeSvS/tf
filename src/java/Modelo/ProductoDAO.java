package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Producto buscar(int id) {
        Producto p = new Producto();
        String sql = "SELECT * FROM producto WHERE Idproducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getDouble(3));
                p.setSt(rs.getInt(4));
                p.setEst(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return p;
    }

    public int actualizarstock(int id, int stock) {
        String sql = "UPDATE producto SET Stock=? WHERE idproducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }

    //Operaciones CRUD
    public List listar() {
        String sql = "SELECT * FROM producto";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto em = new Producto();
                em.setId(rs.getInt(1));
                em.setNom(rs.getString(2));
                em.setPre(rs.getDouble(3));
                em.setSt(rs.getInt(4));
                em.setEst(rs.getString(5));

                lista.add(em);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Producto p) {
        String sql = "INSERT INTO producto(Nombres, Precio, Stock, Estado)VALUES(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, p.getNom());
            ps.setDouble(2, p.getPre());
            ps.setInt(3, p.getSt());
            ps.setString(4, p.getEst());

            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public Producto listarId(int id) {
        Producto pr = new Producto();
        String sql = "SELECT * FROM Producto WHERE IdProducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pr.setId(rs.getInt(1));
                pr.setNom(rs.getString(2));
                pr.setPre(rs.getDouble(3));
                pr.setSt(rs.getInt(4));
                pr.setEst(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return pr;
    }

    public int actualizar(Producto em) {
        String sql = "UPDATE Producto SET Nombres=?, Precio=?,Stock=?, Estado=? WHERE IdProducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, em.getNom());
            ps.setDouble(2, em.getPre());
            ps.setInt(3, em.getSt());
            ps.setString(4, em.getEst());
            ps.setInt(5, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int id) {
        String sql = "DELETE FROM Producto WHERE IdProducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
