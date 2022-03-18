package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3 {
    static String csillagok = "********************";
    static String duplaVonal = "====================";
    static String szaggatottVonal = "--------------------";
    static String rovidVonal = "_______";
    static String rovidVonalValaszto = "      ";
    static final String HUF = "Ft";
    static final String eur = "\u20ac";
    static int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
    static int szervizDijMertek = 10;
    
    public static void main(String[] args) {
        kiir();
    }

    private static void kiir(){
         System.out.println(csillagok);
        //System.out.println("     Nyugta 3");
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);
        System.out.println(duplaVonal);
        System.out.printf("%10s: %5d %s\n", "Összesen", Osszesen(), HUF);
        System.out.println(szaggatottVonal);
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", Szervizdij(), HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        System.out.println(duplaVonal);
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo(), HUF);
        System.out.printf("%10s%7.2f %s\n","", Euro(), eur);//
        System.out.println(szaggatottVonal);
        System.out.println("");
        System.out.print(rovidVonal);
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        System.out.println(csillagok);    
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }
    public static int Osszesen(){
        int osszesen = tetel1 + tetel2 + tetel3;
        return osszesen;
    }
    public static int Szervizdij(){
        int szervizDij = Osszesen() / szervizDijMertek;
        return szervizDij;
    }
    public static int fizetendo(){
        int fizetendo = Osszesen() + Szervizdij();
        return fizetendo;
    }
    public static double Euro(){
        double euro = fizetendo() / 350.0;
        return euro;
    }
}
