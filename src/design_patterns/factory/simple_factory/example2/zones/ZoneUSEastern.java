package design_patterns.factory.simple_factory.example2.zones;

public class ZoneUSEastern extends Zone {

    public ZoneUSEastern(){
        this.displayName = "USEastern";
        this.offset = -5;
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
