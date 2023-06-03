/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bihaviralPattern.mediatorTrafficControllers;
import java.util.HashSet;
import java.util.Set; 
/**
 * Mediator
 */
public class LightMediator {
    private Set<Light> trafficSignals = new HashSet<>();   //  
    public void registerLight(Light light) {
        trafficSignals.add(light);
    }
 
    public void unRegisterLight(Light light) {
        trafficSignals.remove(light);
    }
 
    public void notifyMediator(Light light) {
        System.out.printf("%s is turned %s \n", light.getColor()
                , light.getCurrentState()); //
        if (light.getCurrentState() == Light.State.ON) {
            turnOffAllOtherLights(light); // tắt các đèn còn lại
        }
    }
 
    private void turnOffAllOtherLights(Light light) {
        for (Light otherLight : trafficSignals) {
            if (!(light.equals(otherLight))) {
                otherLight.turnOff();
            }
        }
        System.out.println("---");
    }
}