package design_principles.solid.dip.example1.good_practice;

public class RemoteControl {
    private OnOffDevice onOffDevice ;
    boolean clicked ;

    public RemoteControl(OnOffDevice onOffDevice){
        this.onOffDevice = onOffDevice;
        this.clicked = false;
    }

    public void click(){
        if(this.clicked){
            this.onOffDevice.turnOff();
            this.clicked = false;
        }else{
            this.onOffDevice.turnOn();
            this.clicked = true;
        }
    }
}

/*The high level class depends on the abstraction*/
