package design_patterns.factory.simple_factory.example2.calendars;

import design_patterns.factory.simple_factory.example2.factories.ZoneFactory;
import design_patterns.factory.simple_factory.example2.zones.Zone;

public class PacificCalendar extends Calendar{
    @Override
    public void print() {
        System.out.println("Printing Pacific Calendar ...");
    }

    @Override
    public Zone createCalendar(String zoneId) {
        System.out.println("Creating calendar in zone : " + zoneId);

        return ZoneFactory.createZone(zoneId);
    }
}
