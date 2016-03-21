package pl.angrymarschmallow.calculatoran;

/**
 * Interfejs do klasy kalkulatora.
 */
public interface CalculatorEngine {
    double multip(double a, double b);   // Mnożenie
    double div(double a, double b);      // Dzielenie
    double sum(double... a);             // Dodawanie
    double substr(double a, double b);   // Odejmowanie
    double pow(double a, double b);      // Potęgowanie
    double sqrt(double a, double b);     // Pierwiastkowanie

    double[] quadratic(double a, double b, double c); // Zakładam, że zwraca listę pierwiastków i deltę, opisz dokładnie

    double sin(double a);
    double cos(double a);
    double tg(double a);
    double ctg(double a);

    //Usuwany DFT, zbyt trudna w połączeniu z prostym kalkulatorem

    boolean perfect(int a);     // Liczba doskonała
    boolean first(int a);       // Liczba pierwsza
    double nwd(int a, int b);   // NWD

    int mod(int a, int b);
    int fact(int a);

    String decToBin(int a);  //zamiana Z decymalnych na binarne
    int binToDec(String a);  //zamiana Z binarnych na decymalnych
    String decToHex(int a);  //zamiana Z decymalnych na hexalne
    int hexToDec(String a);  //zamiana Z hexalnych na binarne
}
