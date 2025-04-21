public class Film extends MediaBiblioteczne{
    private String rezyser;
    private int czasTrwania;

    public Film(String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }


    //Metody
    @Override
    public String wyswietlInformacje() {
        return super.wyswietlInformacje() + "Reżyser: " + rezyser + ", czas trwania: " + czasTrwania;
    }
    public String sprawdzCzasTrwania() {
        if (czasTrwania > 120) {
            return "Długi film: " + tytul + "Czas trwania: " + czasTrwania;
        }
        return "Film standardowy: " + tytul + " Czas trwania: " + czasTrwania;
    }
}
