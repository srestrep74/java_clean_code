package design_patterns.strategy.example2.concretes;

import design_patterns.strategy.example2.strategies.ShareStrategy;

public abstract class PhoneCameraApp {
    ShareStrategy shareStrategy;

    public void take(){
        System.out.println("Taking photo");
    }

    public abstract void edit();

    public void save(){
        System.out.println("Saving photos");
    }

    public void share(){
        this.shareStrategy.share();
    }

    public void setShareStrategy(ShareStrategy shareStrategy){
        this.shareStrategy = shareStrategy;
    }
}
