/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherilimas;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class segiempat {
    public double Sisi ;
    public double Tinglas ;
    public void setSisi(double nilaiBaru){
        this.Sisi=nilaiBaru;
    }
    public void setTinglas(double nilaiBaru){
        this.Tinglas=nilaiBaru;
    }
    public double luassegiempat(){
        return Sisi * Sisi;
    }
    public double simir(){
        return Math.sqrt((Math.pow((Sisi/2),2)) + (Math.pow(Tinglas,2)));
    }
    public double luastegak(){
        return 4*(simir()*Sisi/2);
    }
}
