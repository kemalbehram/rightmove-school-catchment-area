package uk.co.novinet.scraper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class PropertyInfo {
    private Location location;
    private String price;
    private String address;
    private String description;
    private String uri;
    private float distanceToSchoolMeters;
    private float distanceToTootingCommonMeters;
    private LocalDate dateAdded;
}
