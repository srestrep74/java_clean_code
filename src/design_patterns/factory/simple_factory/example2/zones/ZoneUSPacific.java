package design_patterns.factory.simple_factory.example2.zones;

public class ZoneUSPacific extends Zone {

    public ZoneUSPacific(){
        this.displayName = "USPacific";
        this.offset = -8;
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
