package design_patterns.factory.simple_factory.example2.factories;

import design_patterns.factory.simple_factory.example2.zones.*;

public class ZoneFactory {
    public static Zone createZone(String zoneId){
        Zone zone = switch (zoneId){
            case "USEastern" -> new ZoneUSEastern();
            case "USCentral" -> new ZoneUSCentral();
            case "USMountain" -> new ZoneUSMountain();
            case "USPacific" -> new ZoneUSPacific();
            default -> null;
        };

        return zone;
    }
}
