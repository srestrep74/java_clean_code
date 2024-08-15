package design_patterns.factory.simple_factory.example2.zones;

public abstract class Zone {
    protected String displayName;
    protected int offset ;

    public abstract String getDisplayName();

    public abstract int getOffset();
}
