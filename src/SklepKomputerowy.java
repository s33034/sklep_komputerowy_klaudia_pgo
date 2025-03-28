import java.time.LocalDate;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;


    public void dodajKlienta(Klient klient1) {
        //TODO
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient1;
        } else {
            System.out.println("Brak miejsca na nowego klienta!");
        }
    }

    public void dodajProdukt(Produkt produkt1) {
        //TODO
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt1;
        } else {
            System.out.println("Brak miejsca na nowy produkt!");
        }
    }

    public Zamowienie utworzZamowienie(
            Klient klient1,
            Produkt[] produktyZamowienia1,
            int[] ilosciZamowienia1) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.setIlosci(ilosciZamowienia1);
        zamowienie.setId(liczbaZamowien + 1);
        zamowienie.setStatus("Nowe");
        String dataZamowienia = LocalDate.now().toString();
        zamowienie.setDataZamowienia(dataZamowienia);

        if (liczbaZamowien < zamowienia.length) {
            zamowienia[liczbaZamowien++] = zamowienie;
        }
        return zamowienie;
    }

    //TODO
    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().length; i++) {
            Produkt produkt = zamowienie.getProdukty()[i];
            produkt.setIloscWMagazynie(produkt.getIloscWMagazynie() - zamowienie.getIlosci()[i]);
        }
    }
    //TODO
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie != null && zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
                break;
            }
        }
    }
    //todo
    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : produkty) {
            if (produkt != null && produkt.getKategoria().equalsIgnoreCase(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }
    //TODO
    public void wyswietlZamowieniaKlienta(int idKlienta) {
        boolean found = false;  // Flaga do sprawdzenia, czy znaleziono zamówienie
        for (Zamowienie zamowienie : zamowienia) {
            // Sprawdzamy, czy zamówienie nie jest null i czy klient ma odpowiedni ID
            if (zamowienie != null && zamowienie.getKlient() != null && zamowienie.getKlient().getId() == idKlienta) {
                zamowienie.wyswietlSzczegoly();  // Wyświetlanie szczegółów zamówienia
                found = true;
            }
        }

        }

}