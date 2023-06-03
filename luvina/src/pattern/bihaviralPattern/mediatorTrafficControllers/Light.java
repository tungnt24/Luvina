/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bihaviralPattern.mediatorTrafficControllers;

public class Light { 
    enum State { 
        ON, OFF
    } 
    private String color; //Red, Yellow, Green
    private LightMediator lightMediator;
    private State currentState; // ON, OFF;
    public Light(String color, LightMediator lightMediator) {
        this.color = color;
        this.currentState = State.OFF;
        this.lightMediator = lightMediator;
        lightMediator.registerLight(this);
    }  
    public void turnOn() {
        this.currentState = State.ON;
       
        lightMediator.notifyMediator(this);
    }

    public void turnOff() {
        this.currentState = State.OFF;
        lightMediator.notifyMediator(this);
    }

    public String getColor() {
        return color;
    }

    public State getCurrentState() {
        return currentState;
    }

    @Override
    public int hashCode() {
        return color.hashCode();//mầu duy nhất
    } 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;

        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Light light = (Light) obj;
        return color.equals(light.color);
    }
}
