/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bihaviralPattern.memetoPattern;
public class Memento { 
    private double x;
    private double y;  
    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    } 
    public double getX() {
        return x;
    } 
    public double getY() {
        return y;
    }
}
