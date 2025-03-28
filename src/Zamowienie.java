import java.util.Arrays;

public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double obliczWartoscZamowienia(){
        //TODO
        double suma = 0.0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosci[i];
        }
        return suma;
    }

    public double zastosujZnizke(){
        //TODO
        double wartosc = obliczWartoscZamowienia();
        if (klient.isCzyStaly()) {
            wartosc *= 0.9;
        }
        return wartosc;
    }

    public void wyswietlSzczegoly(){
        //TODO
        System.out.println("Id: " + id);
        System.out.println("KLIENT: ");
        klient.wyswietlInformacje();
        System.out.println("PRODUKTY: ");
        for (int i = 0; i < produkty.length; i++) {
            produkty[i].wyswietlInformacje();
            System.out.println("Ilość: " + ilosci[i]);
        }
        System.out.println("ILOSCI: " + Arrays.toString(ilosci));
        System.out.println("DATAZAMOWIENIA: " + dataZamowienia);
        System.out.println("STATUS: " + status);
    }
}