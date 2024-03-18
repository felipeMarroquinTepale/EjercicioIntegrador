package plantas;

public class Arbusto extends Planta{
    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePodaOno;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double ancho, boolean esDomestico, String variedad, String colorHojas, boolean sePodaOno) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePodaOno = sePodaOno;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaOno() {
        return sePodaOno;
    }

    public void setSePodaOno(boolean sePodaOno) {
        this.sePodaOno = sePodaOno;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Soy un arbusto");
    }
}
