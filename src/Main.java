import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.ITALY);
        DateTimeFormatter formatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ITALY);
        DateTimeFormatter formatterFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ITALY);


        String dataShort = data.atZoneSameInstant(ZoneId.of("Europe/Rome")).format(formatterShort);
        String dataMedium = data.atZoneSameInstant(ZoneId.of("Europe/Rome")).format(formatterMedium);
        String dataFull = data.atZoneSameInstant(ZoneId.of("Europe/Rome")).format(formatterFull);


        System.out.println("Data in formato SHORT: " + dataShort);
        System.out.println("Data in formato MEDIUM: " + dataMedium);
        System.out.println("Data in formato FULL: " + dataFull);

    }
}

