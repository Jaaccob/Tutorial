package remotes;

import devices.Device;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device){
        super.device = device;
    }

    public void mute(){
        System.out.println("Pilot: wyciszenie");
        this.device.setVolume(0);
    }
}
