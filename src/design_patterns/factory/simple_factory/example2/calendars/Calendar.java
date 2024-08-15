package design_patterns.factory.simple_factory.example2.calendars;

import design_patterns.factory.simple_factory.example2.factories.ZoneFactory;
import design_patterns.factory.simple_factory.example2.zones.Zone;

public abstract class Calendar {

    public abstract void print();

    public abstract Zone createCalendar(String zoneId);
}
