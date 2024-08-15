package design_patterns.factory.simple_factory.example2.zones;

public class ZoneUSCentral extends Zone {

    public ZoneUSCentral(){
        this.displayName = "USCentral";
        this.offset = -6;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public int getOffset() {
        return this.offset;
    }
}
