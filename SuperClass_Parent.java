/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SuperClass_Parent {
    
    //==================================Burgers====================================
    public double ZingerBurger;
    public double ZingerCheeseBurger;
    public double ChickenLegend;
    public double ChickenCheeseBurger;
    public double BaconAndCheeseBurger;
    
    
    //==================================Shake====================================
    public double MilkShake;
    public double ChoclateShake;
    public double SpecialOreoShake;
    public double VanMilkShake;
    public double SpeciakShake;
    
    //==================================Cost====================================
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    public double AllTotalofMD;
    
    
    public double getAmount(){
        
        Meals = ZingerBurger + ZingerCheeseBurger + ChickenLegend + ChickenCheeseBurger + BaconAndCheeseBurger;
        Drinks = MilkShake +ChoclateShake+ SpecialOreoShake +  VanMilkShake +SpeciakShake; 
        TotalofMD = Meals + Drinks ;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    

        
 
//==================================Price====================================

    public double pZingerBurger = 350;
    public double pZingerCheeseBurger = 450;
    public double pChickenLegend = 300 ;
    public double pChickenCheeseBurger = 350;
    public double pBaconAndCheeseBurger = 400;
    
    public double pMilkShake = 150;
    public double pChoclateShake = 200;
    public double pSpecialOreoShake = 300;
    public double pVanMilkShake = 250;
    public double pSpeciakShake = 500;
    
    public double mcTax = 0.05;

//=============================================================================

    public Double cFindTax(double cAmount){
    
        double FindTax = (cAmount*mcTax);
        return FindTax;
    
    }

}
