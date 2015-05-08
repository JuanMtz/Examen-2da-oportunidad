/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.examen2.consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mx.examen2.clase.datos;
import mx.examen2.conexion.conexion;

/**
 *
 * @author Jan Jan
 */
public class consultasql {

    public static List<datos> obtenerdatos() {
        List<datos> lstdatos = new ArrayList<datos>();
        String query = "select e.Entrada, f.Platillo,  b.Bebida, p.Postre, a.Adicionales, c.Nombre, (e.precio+f.precio+b.precio+p.precio+a.precio) as total from entrada e inner join platillo f on e.identrada=f.idplatillo inner join bebidas b on f.idplatillo=b.idbebida inner join postres p on b.idbebida=p.idpostre inner join cliente c on p.idpostre=c.idcliente inner join adicionales a on c.idcliente=a.idadicional";
        Connection cn = conexion.getConexion();
        try {
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                String entrada = rs.getString(1);
                String plato = rs.getString(2);
                String bebida = rs.getString(3);
                String postre = rs.getString(4);
                String cliente = rs.getString(5);
                String adicionales = rs.getString(6);
                int total = rs.getInt(7);

                datos a = new datos();
                a.setEntrada(entrada);
                a.setPlato(plato);
                a.setBebida(bebida);
                a.setPostre(postre);
                a.setAdicionales(adicionales);
                a.setCliente(cliente);
               a.setTotal(total);


                lstdatos.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstdatos;
    }

    public static void main(String[] args) {
        List<datos> lstdatos = obtenerdatos();
        for (datos datos : lstdatos) {
            System.out.println(datos);
        }
    }



}
