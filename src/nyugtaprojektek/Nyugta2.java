package nyugtaprojektek;
/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/
public class Nyugta2 {
    
    static int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
    static String csillagok = "*******************";
    static String huf = "Ft";
    static String duplaVonal = "===================";
    static String szaggatottVonal = "-------------------";
    static String rovidVonal = "_______";
    static int kedvMertek = 10;

    public static void main(String[] args) {
        kiiras();
    }
    
    public static void kiiras(){
        System.out.println(csillagok);
        System.out.println("     Nyugta 2");
        System.out.println(csillagok);
        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);
        System.out.println(duplaVonal);
        System.out.printf("Összesen:   %d %s\n", Osszesen(), huf);
        System.out.println(szaggatottVonal);
        System.out.printf("Kedvezmény:  %d %s\n", Kedvezmenyek(), huf);
        System.out.printf("(%d%%)\n", kedvMertek);
        System.out.println(duplaVonal);
        System.out.printf("Fizetendő:  %d %s\n", Fizetendo(), huf);
        huf = "\u20ac";
        System.out.printf("            %f %s\n", Euro(), huf);
        System.out.println(szaggatottVonal);
        System.out.println("");
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "     ";
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
    public static int Kedvezmenyek(){
        int kedvezmeny = Osszesen() / kedvMertek;
        return kedvezmeny;
    }
    public static int Fizetendo(){
        int fizetendo = Osszesen() - Kedvezmenyek();
        return fizetendo;
    }
    public static double Euro(){
        double euro = Fizetendo() / 350.0;
        return euro;
    }
}
