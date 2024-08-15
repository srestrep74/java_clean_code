package design_principles.solid.dip.example1.bad_practice;

public class RemoteControl {
    private Television television ;
    boolean clicked ;

    public RemoteControl(){
        this.television = new Television();
        this.clicked = false;
    }

    public void click(){
        if(this.clicked){
            television.turnOff();
            this.clicked = false;
        }else{
            television.turnOn();
            this.clicked = true;
        }
    }
}

/*
Here there is a directly dependency between a High level class (RemoteControl) and a low level class (Television).
If Televesion changes its methods or another things in the class, the most probably is that we need also to change the implementation on RemoControl
*/