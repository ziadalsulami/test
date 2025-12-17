package RiyadhMetro.StationSearch;

public class StationInfo {
    private int id;
    private String nameE;
    private String nameAa;
    private String metroLines;
    private int platforms;
    private String facilities;
    private String accessability;
    private int passengers;
    private String hours;

    public StationInfo(int id, String nameE, String nameAa, String metroLines) {
        this.id = id;
        this.nameE = nameE;
        this.nameAa = nameAa;
        this.metroLines = metroLines;
        this.platforms = 2;
        this.facilities = "parking, restroom, waiting area";
        this.accessability = "wheelchair accessible";
        this.passengers = 5000;
        this.hours = "5-9";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getNameAa() {
        return nameAa;
    }

    public void setNameAa(String nameAa) {
        this.nameAa = nameAa;
    }

    public String getMetroLines() {
        return metroLines;
    }

    public void setMetroLines(String metroLines) {
        this.metroLines = metroLines;
    }

    public int getPlatforms() {
        return platforms;
    }

    public void setPlatforms(int platforms) {
        this.platforms = platforms;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getAccessability() {
        return accessability;
    }

    public void setAccessability(String accessability) {
        this.accessability = accessability;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "\n-----------------"+"\nStationInfo \nID: " + id + "\nname (english): " + nameE + "\nname (arabic): " + nameAa + "\nmetroLines: " + metroLines
                + "\nplatforms: " + platforms + "\nfacilities: " + facilities + "\naccessability: " + accessability
                + "\ndaily passengers: " + passengers + "\nhours: " + hours +"\n-----------------";
    }

    

    

    





}
