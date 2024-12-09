public class Wagen {
    private final String serienummer, brandstoftype;
    private final int zitplaatsen;
    private boolean verhuurd;

    public Wagen(String serienummer, String brandstoftype, int zitplaatsen) {
        this.serienummer = serienummer;
        this.brandstoftype = brandstoftype;
        this.zitplaatsen = zitplaatsen;
        this.verhuurd = false;
    }

    public boolean rent() {
        return !this.verhuurd && (this.verhuurd = true);
    }

    public boolean free() {
        return this.verhuurd && ((this.verhuurd = false) || true);
    }

    @Override
    public String toString() {
        return
                "\nSerienummer: " + this.serienummer
                + "\nBrandstoftype: " + this.brandstoftype
                + "\nZitplaatsen: " + this.zitplaatsen
                + "\nVerhuurd: " + this.verhuurd;
    }
}
