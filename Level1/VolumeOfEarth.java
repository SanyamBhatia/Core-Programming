package Level1;
// Write a Program to compute the volume of Earth in km^3 and miles^3

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6371; // Radius of Earth in kilometers
        double radiusMiles = 3959; // Radius of Earth in miles

        // Volume formula: V = 4/3 * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("Volume of Earth in km^3: %.2f km^3%n", volumeKm3);
        System.out.printf("Volume of Earth in miles^3: %.2f miles^3%n", volumeMiles3);
    }
    
}
