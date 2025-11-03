/**
 * nazwa klasy: Notatka
 * opis:        klasa przeznaczona do robienia notatek
 * pola: licznikNotatek - pole numeryczne przechowujace liczbę notatek
 * identyfikator - pole numeryczne przechowujące unikatowy numer notatki
 * tytulNotatki - pole tekstowe przechowujące tytul Notatki
 * trescNotatki - pole tekstowe przechowujące tresc Notatki
 * autor: 00000000000
 */
public class Notatka {
    private static int licznikNotatek;
    private int identyfikator;
    protected String tytulNotatki;
    protected String trescNotatki;

    public Notatka(String tytulNotatki, String trescNotatki) {
        licznikNotatek++;
        identyfikator = licznikNotatek;
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
    }
    public void wypiszTytulTresc(){
        System.out.println("Tytuł: "+tytulNotatki+" Treść: "+trescNotatki);
    }
    public void diagnostyczna(){
        System.out.println(tytulNotatki+", "+trescNotatki+", "+licznikNotatek+", "+identyfikator);

    }
}
