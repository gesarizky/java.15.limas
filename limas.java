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
public class limas extends segiempat {
    public double Tinggi ;
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumelimas (){
        return (luassegiempat()*Tinggi)/3;
    }
    public double luaspermukaanlimas (){
        return  luassegiempat()+ luastegak();
    }
}
