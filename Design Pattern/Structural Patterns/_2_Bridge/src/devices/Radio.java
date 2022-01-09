package devices;

public class Radio implements Device{
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;


    @Override
    public boolean isEnable() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (this.volume > 100)
            this.volume = 100;
        else if (this.volume < 0)
            this.volume = 0;
        else
            this.volume = percent;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("-------------------------------");
        System.out.println("Jestem radio");
        System.out.println("Jestem " + (on ? "właczony" : "wyłaczony"));
        System.out.println("Mam głośność " + this.getVolume() + "%");
        System.out.println("Aktualny kanał " + this.getChannel());
        System.out.println("-------------------------------");
    }
}
