public class TestBiblioteki {
    public static void main(String[] args) {
    Ksiazka k1 = new Ksiazka("Lalka", 1990, "Kochanowski", 600);
    Ksiazka k2 = new Ksiazka("Wiedźmin", 1990, "Andrzej Sapkowski", 320);
    Film f1 = new Film("Zielona Mila", 1999, "Frank Darabont", 189);
    Film f2 = new Film("Stepup", 2004, "Andrzej Kowalski", 110);

    MediaBiblioteczne[] mediaArray = new MediaBiblioteczne[4];
    mediaArray[0] = k1;
    mediaArray[1] = k2;
    mediaArray[2] = f1;
    mediaArray[3] = f2;

    for(int i = 0; i < mediaArray.length; i++) {
        System.out.println(mediaArray[i].wyswietlInformacje());
        System.out.println("------------------------------------------------------------------------------------------------");
    }

    k1.wypozycz();
    k1.wypozycz();
    System.out.println("---------------------------------------------------------------------------");
    k1.zwroc();
    System.out.println("---------------------------------------------------------------------------");
    System.out.println(k1.sprawdzLiczbeStron());
    System.out.println(f1.sprawdzCzasTrwania());

        System.out.println("---------------------------------------------------------------------------");
    for (MediaBiblioteczne m : mediaArray) {
        if(m instanceof Ksiazka){
            System.out.println(((Ksiazka) m).sprawdzLiczbeStron());;
        } else if(m instanceof Film){
            System.out.println(((Film) m).sprawdzCzasTrwania());
        }
    }
    }
}