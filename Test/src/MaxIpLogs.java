import java.util.*;

public class MaxIpLogs {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "192.168.1.1 2023-07-08 10:30:00",
                "192.168.1.2 2023-07-08 11:45:00",
                "192.168.1.1 2023-07-08 12:15:00",
                "192.168.1.3 2023-07-08 14:20:00",
                "192.168.1.1 2023-07-08 16:10:00",
                "192.168.1.2 2023-07-08 17:30:00"
        );

        Map<String, Integer> ipCounts = new HashMap<>();

        for (String log : logs) {
            String ipAddress = log.split(" ")[0];
            ipCounts.put(ipAddress, ipCounts.getOrDefault(ipAddress, 0) + 1);
        }

        String ipAddressWithMaxLogs = null;
        int maxLogs = 0;

        for (Map.Entry<String, Integer> entry : ipCounts.entrySet()) {
            if (entry.getValue() > maxLogs) {
                ipAddressWithMaxLogs = entry.getKey();
                maxLogs = entry.getValue();
            }
        }

        System.out.println("IP address with the maximum number of log entries: " + ipAddressWithMaxLogs);
        System.out.println(maxLogs);
    }
}
