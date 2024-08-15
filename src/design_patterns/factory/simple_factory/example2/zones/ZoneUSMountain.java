package design_patterns.factory.simple_factory.example2.zones;

public class ZoneUSMountain extends Zone {

    public ZoneUSMountain(){
        this.displayName = "USMountain";
        this.offset = -7;
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
