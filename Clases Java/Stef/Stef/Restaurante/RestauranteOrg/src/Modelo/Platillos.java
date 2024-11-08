/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Platillos {
    private int NumeroPlatillo;
    private String NombrePlatillo;
    private int Porciones;
    private String Categoria; 
    private int PrecioPlatillo;

    public int getNumeroPlatillo() {
        return NumeroPlatillo;
    }

    public void setNumeroPlatillo(int NumeroPlatillo) {
        this.NumeroPlatillo = NumeroPlatillo;
    }

    public String getNombrePlatillo() {
        return NombrePlatillo;
    }

    public void setNombrePlatillo(String NombrePlatillo) {
        this.NombrePlatillo = NombrePlatillo;
    }

    public int getPorciones() {
        return Porciones;
    }

    public void setPorciones(int Porciones) {
        this.Porciones = Porciones;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getPrecioPlatillo() {
        return PrecioPlatillo;
    }

    public void setPrecioPlatillo(int PrecioPlatillo) {
        this.PrecioPlatillo = PrecioPlatillo;
    }

   
}
