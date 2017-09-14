/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.model;

/**
 *
 * @author Roshan
 */
public class CalculatorService {
    private final double  PI = Math.PI;

    
    public String calculateArea(String length, String width){
        try{
            double area = Math.round(Double.parseDouble(length) * Double.parseDouble(width))/1.0;
            return String.valueOf(area);
        }catch (NumberFormatException ex) {
            return ex.getMessage();
        }    
    }
    
    public String calculateArea(String radius){
        try{
            double area = Math.round(PI * Double.parseDouble(radius) * Double.parseDouble(radius))/1.0;
            return String.valueOf(area);
        }catch (NumberFormatException ex) {
            return ex.getMessage();
        }    
    }
    public String calculateHypotenuseSide(String length1, String length2){
        try{
            double lengthSqure = (Double.parseDouble(length1)*Double.parseDouble(length1))
                   + (Double.parseDouble(length2)*Double.parseDouble(length2));
            double hypotenuseside = Math.round(Math.sqrt(lengthSqure))/1.0;
            return String.valueOf(hypotenuseside);
        }catch (NumberFormatException ex) {
            return ex.getMessage();
        }    
    }
}
