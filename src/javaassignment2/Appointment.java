//Class called from AppointmentReport class

package javaassignment2;

public class Appointment extends Agent{
    public int appId = 0;
    
    public void viewAppointments(){
        Agent a = new Agent();
        GUIViewAppointments va = new GUIViewAppointments(a.agentName);
        va.run();
    }
    
}