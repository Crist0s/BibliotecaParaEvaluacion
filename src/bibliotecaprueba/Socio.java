/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaprueba;

/**
 *
 * @author Lab22
 */
public class Socio extends Lector{
    
    //datos del socio
    private String nombre; // nombre.
    private String NumIdent; //numero de identificacion o pasaparte.
    private int CodigoPostal; //codigo postal.
    private int NumeroSocio; //Numero Identificador del socio dentro del sistema.
    private int NumLibroPrestado; //Cantidad de libros que el socio a pedido.
    private boolean Confiable; //valor que cambia temporalmente para los socios que piden mas de 10 libros. 
    private boolean Funcionario; //Este variabble determina si el socio es un empleado de la bilbioteca.

    //constructores, getters and setters
    public Socio() {
    }

    public Socio(String nombre, String NumIdent, int CodigoPostal, int NumeroSocio, int NumLibroPrestado, boolean Confiable, boolean Funcionario) {
        this.nombre = nombre;
        this.NumIdent = NumIdent;
        this.CodigoPostal = CodigoPostal;
        this.NumeroSocio = NumeroSocio;
        this.NumLibroPrestado = NumLibroPrestado;
        this.Confiable = Confiable;
        this.Funcionario = Funcionario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumIdent() {
        return NumIdent;
    }

    public void setNumIdent(String NumIdent) {
        this.NumIdent = NumIdent;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public int getNumeroSocio() {
        return NumeroSocio;
    }

    public void setNumeroSocio(int NumeroSocio) {
        this.NumeroSocio = NumeroSocio;
    }

    public int getNumLibroPrestado() {
        return NumLibroPrestado;
    }

    public void setNumLibroPrestado(int NumLibroPrestado) {
        this.NumLibroPrestado = NumLibroPrestado;
    }

    public boolean isConfiable() {
        return Confiable;
    }

    public void setConfiable(boolean Confiable) {
        this.Confiable = Confiable;
    }

    public boolean isFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(boolean Funcionario) {
        this.Funcionario = Funcionario;
    }

    public String getConsLibro() {
        return ConsLibro;
    }

    public void setConsLibro(String ConsLibro) {
        this.ConsLibro = ConsLibro;
    }


    
    
}
