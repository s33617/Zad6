public class Ksiazka extends MediaBiblioteczne{
    protected String autor;
    protected int liczbaStron;

    public Ksiazka(String tytul, int rokWydania,String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    //METODY
    @Override
    public String wyswietlInformacje() {
        return super.wyswietlInformacje() + "Autor: " + autor + ", LiczbaStron: " + liczbaStron;
    }

    public String sprawdzLiczbeStron() {
        if (liczbaStron > 500) {
            return "Długa Książka: " + tytul + "Ilość stron: " + liczbaStron;
        }
        return "Książka standardowa: " + tytul + " Ilość stron: " + liczbaStron;
    }
}
