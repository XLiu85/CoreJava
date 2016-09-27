// datetime/DisplayAllZoneIdAndItsUTCOffset.java
package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Display all the ZoneId and its OffSet hours and minutes.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayAllZoneIdAndItsUTCOffset {

    /**
     * DisplayAllZoneIdAndItsUTCOffset Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> sortedMap = new LinkedHashMap<>();

        List<String> zoneList = new ArrayList<>(ZoneId.getAvailableZoneIds());

        //Get all ZoneIds
        Map<String, String> allZoneIds = getAllZoneIds(zoneList);

        //sort map by key
        allZoneIds.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));

        // print map
        sortedMap.forEach((k, v)
                -> {
            String out = String.format("%35s (UTC%s) %n", k, v);
            System.out.printf(out);
        });

        System.out.println("\nTotal Zone IDs " + sortedMap.size());
    }

    private static Map<String, String> getAllZoneIds(List<String> zoneList) {
        Map<String, String> result = new HashMap<>();

        LocalDateTime dt = LocalDateTime.now();

        zoneList.stream().map((zoneId) -> ZoneId.of(zoneId)).forEachOrdered((zone) -> {
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset zos = zdt.getOffset();

            //replace Z to +00:00
            String offset = zos.getId().replaceAll("Z", "+00:00");
            result.put(zone.toString(), offset);
        });

        return result;
    }

}
