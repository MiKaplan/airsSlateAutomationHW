package operators;

import java.util.Date;


public class CurrentTime {
    public static void main(String[] args) {
        int offset = 256;

        long currentTime = System.currentTimeMillis();
        long offsetMillis = offset * 3600 *1000;

        long gmtTime = currentTime + offsetMillis;
        Date date = new Date(gmtTime);

        System.out.println("Текущее время " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
    }
}
