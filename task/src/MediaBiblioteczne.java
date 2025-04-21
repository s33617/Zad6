public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny = true;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
    }
    //METODY
    public String wyswietlInformacje() {
        return "Tytuł: " + tytul + " Rok wydania: " + rokWydania + " " + "Status: " + (dostepny ? "Dostępne" : "Wypożyczone");
    }

    public boolean wypozycz() {
        if (dostepny == true) {
            dostepny = false;
            System.out.println("Wypożyczenie: " + tytul + " powiódł się");
            return true;
        }
        System.out.println("Wypożyczenie: " + tytul + " niepowiódł się");
        System.out.println();
        return false;
    }

    public boolean zwroc() {
        if (dostepny == false) {
            dostepny = true;
            System.out.println("Zwrot: " + tytul + " powiódł się");
            return true;
        }
        System.out.println("Zwrot" + tytul + " niepowiódł się");
        return false;
    }

}
