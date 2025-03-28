public class Klient {
    private int Id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }

    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
// TODO wyswietlInformacje()
    public void wyswietlInformacje() {
        System.out.println("ID: " + Id);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("CzyStaly: " + czyStaly);
    }

}