
package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Beosztas[] BeosztasArray = {
        new Beosztas(1, "00:00-02:00"),
        new Beosztas(2, "00:00-04:00"),
        new Beosztas(3, "00:00-08:00"),
        new Beosztas(4, "08:00-10:00"),
        new Beosztas(5, "08:00-12:00"),
        new Beosztas(6, "08:00-16:00"),
        new Beosztas(7, "16:00-18:00"),
        new Beosztas(8, "16:00-20:00"),
        new Beosztas(9, "16:00-24:00"),
        new Beosztas(10, "00:00-12:00"),

    };
    public Vector<Beosztas> BeosztasList = 
        new Vector<>(Arrays.asList(BeosztasArray)); 
    Worker[] workerArray = {
        new Worker(1, "Pala Sándor", 1),
        new Worker(2, "Alga Irén", 1),
        new Worker(3, "Rota Valér", 2),
        new Worker(4, "Siku Ferenc", 3),
        new Worker(5, "Hari Béla", 3),
        new Worker(6, "Közle Mihály", 4),
        new Worker(7, "Csont Emőke", 4),
        new Worker(8, "Ete Levente", 5),
        new Worker(9, "Erős István", 6),
        new Worker(10, "Remek Elek", 7),
        new Worker(11, "Erő Jenő", 7),
        new Worker(12, "Kiss Áron", 8),
        new Worker(13, "Szép Ilona", 8),
        new Worker(14, "Cserepes Virág", 8),
        new Worker(15, "Uzumaki Naruto", 9),
        new Worker(16, "Gubis Zsombor", 10),
    };
    public Vector<Worker> workerList =
        new Vector<>(Arrays.asList(workerArray));
}