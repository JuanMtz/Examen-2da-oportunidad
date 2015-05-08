/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.examen2.clase;

/**
 *
 * @author Juan Antonio Martinez
 */
public class datos {


   public String entrada;
   public String plato;
   public String bebida;
   public String postre;
   public String cliente;
   public String adicionales;
   public int total;

   
    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
 public String getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(String adicionales) {
        this.adicionales = adicionales;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "La orden{" + " \n" +"entrada: " + entrada +" \n" + "platillo:" +"  "+ plato+" \n" + "bebida:"+"  " + bebida+ " \n" +"postre:"+"  " + postre+ " \n"  +"Adicional:"+"  " + cliente+ " \n" +  "cliente:"+"  " + adicionales+ " \n" +"total a pagar: " + total +" \n" +" \n" +'}';
    }

}
