import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

// FUNKCIJOS
        // 1. Sukurkite Funkciją kuri priima du kintamuosius. Juos susumuoja ir atspausdina.

        System.out.println("\n nr.1");
        sumTwo(2, 3);

        //   2. Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę.
        //   Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

        System.out.println("\n nr.2");
        System.out.println(PISq());

        //3. Sukurkite Funkciją kuri priima du int tipo kintamuosius.
        // Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.

        System.out.println("\n nr.3");
        System.out.println("Sandauga yra " + multpl(3, 5));

        // 4. Sukurkite Funkciją kuri priima int[], prasuka ciklą ir atspausdina kiekvieną skaičių.

        System.out.println("\n nr.4");
        int[] array = {1, 2, 3, 4, 5};
        printArr(array);

        // 5. Sukurkite Funkciją kuri sugeneruotų 5 elementų masyvą ir jį gražintų.
        System.out.println();
        System.out.println("\n nr.5");
        int[] getArray = getRndArray();
        System.out.println("Gautas masyvas is funkcijos:");
        for (int j = 0; j < 5; j++)
        {
            System.out.print(getArray[j]);
        }

        // 6.	Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
        System.out.println();
        System.out.println("\n nr.6");
        int sum = sumElements(getArray);

        System.out.println("5 uzduoties masyvo elementu suma = " + sum );

        //7.	Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

        System.out.println("\n nr.7");
        double average = averElemets(getArray);

        System.out.println("5 uzduoties masyvo elementu vidurkis = " + average );

        // 8.	Sukurkite Funkciją, kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
        // Pirmas int - išoriniam ciklui, antras vidiniam.

        System.out.println("\n nr.8");

        printRectangle(5, 10);

// 9.	Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
// Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

        System.out.println("\n nr.9");

        String text = "Rytoj mokslo metu pradzia";
        countLetSpace(text);

// 10.	Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
// Pvz “Naglis” turi gautis “silgaN”.

        System.out.println("\n \n nr.10");

        String sentence = "Ingrida";
        System.out.print(sentence + " atvirksciai yra ");
        System.out.println(getReverse(sentence));





    }

    // Funkcija 1 : 2 skaiciu suma
    public static void sumTwo(int a, int b) {
        int sum = a+b;
        System.out.println("Suma = " + sum);
    }

    // Funkcija 2 : PISq
    public static double PISq() {
        double sum = 9.8596;
        return sum;
    }
    // Funkcija 3 : 2 skaiciu sandauga
    public static int multpl(int a, int b) {
        int mult = a * b;
        return mult;
    }
    // Funkcija 4 : masyvo spausdinimas
    public static void printArr(int[] arr) {
        System.out.println("Masyvo spausdinimas");
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

// Funkcija 5 : masyvo generavimas

    public static int[] getRndArray()
    {
        int[] getArr = new int[5];

        for (int k=0; k < 5; k++)
        {
            getArr[k] = (int) (Math.random()*5);

        }
        return getArr;
    }

// Funkcija 6 : gauto masyvo elementu sumavimas

    public static int sumElements(int[] getArr)
    {
        int sumEl = 0;
        int n = 0;
        while (n < getArr.length)
        {
            sumEl = sumEl + getArr[n];
            n++;
        }
        return sumEl;
    }

// Funkcija 7 : gauto masyvo elementu sandauga

    public static double averElemets(int[] getArr)
    {

        double aver = 0;
        int sume = 0;
        int count = 0;
        for (int p = 0; p < getArr.length; p++)
        {
            sume = sume + getArr[p];
            count++;
        }
        aver =  (double) sume / (double) count  ;
        return aver;
    }

// Funkcija 8 : staciakampio spausdinimas

    public static void printRectangle(int high, int wide)
    {
        for (int h = 0; h< high; h++)
        {
            for (int w =0; w < wide; w++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
// Funkcija 9 : raidziu ir tarpu skaiciavimas

    public static void countLetSpace(String sentence)
    {
        int i=0;
        int countLetter = 0;
        int countSpace = 0;
        while (i < sentence.length())
        {
            if (sentence.charAt(i) == ' ')
            {
                countSpace = countSpace +1;
            } else
                countLetter = countLetter + 1;
            i++;
        }
        System.out.print("Raidziu yra " + countLetter + ", tarpu yra " + countSpace);
    }


// Funkcija 9 : raidziu ir tarpu skaiciavimas

    public static String getReverse(String sent)
    {
        String rev = "";
        int j = sent.length()-1;

        while (j >= 0 )
        {
            rev = rev + sent.charAt(j);
            j--;
        }

        return rev;
    }


}