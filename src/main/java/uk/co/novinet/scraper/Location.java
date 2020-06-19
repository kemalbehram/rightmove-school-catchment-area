package uk.co.novinet.scraper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Location {
    private float latitude;
    private float longitude;
}
