package remotes;

import devices.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Pilot: zasilanie");
        if (this.device.isEnable())
            this.device.disable();
        else
            this.device.enable();
    }

    @Override
    public void volumeDown() {
        System.out.println("Pilot: zmniejsz głośność");
        this.device.setVolume(this.device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Pilot: zwiększ głośność");
        this.device.setVolume(this.device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Pilot: zmień kanał w dół");
        this.device.setChannel(this.device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Pilot: zmień kanał w górę");
        this.device.setChannel(this.device.getChannel() + 1);
    }
}
