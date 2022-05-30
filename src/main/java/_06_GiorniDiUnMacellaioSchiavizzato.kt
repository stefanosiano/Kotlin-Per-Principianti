class _06_GiorniDiUnMacellaioSchiavizzato {}
/*
Esercizio1: Giorni di un macellaio schiavizzato
Scrivere una funzione che, dato un giorno, un mese ed un anno, calcola il numero di giorni che il macellaio dovrà
 lavorare ancora fino alla fine di quell'anno (incluso il giorno stesso). Essendo schiavizzato, lavorerà anche nei
 festivi, di sabato e di domenica.
Dovrai scrivere quindi una funzione come la seguente:
fun giorniMacellaio(giorno: Int, mese: Int, anno: Int): Int { ... }
Esempio:
    giorniMacellaio(1, 1, 2021) --> 365
    giorniMacellaio(1, 12, 2021) --> 31
    giorniMacellaio(1, 1, 2020) --> 366
Fare attenzione all'anno bisestile! Gli anni bisestili sono:
- gli anni non secolari il cui numero è divisibile per 4
- gli anni secolari il cui numero è divisibile per 400
https://it.wikipedia.org/wiki/Anno_bisestile
Se il giorno non è valido (è minore di 0 o maggiore di 31) la funzione deve ritornare -1.
Se il mese non è valido (è minore di 0 o maggiore di 12) la funzione deve ritornare -2.
Se l'anno non è valido (è minore di 0) la funzione deve ritornare -3.
Se la data non è valida (30 febbraio, 31 febbraio, 31 aprile, 31 giugno, 31 settembre, 31 novembre) la funzione deve ritornare -4.
Se la data è 29 febbraio, ma l'anno non è bisestile, la funzione deve ritornare -5.

Aiuto:
Questo esercizio metterà in pratica tutto ciò che ti è stato spiegato finora. Hai piena libertà su cosa fare.
Ricorda però il metodo top-down!
 */

// Puoi lasciare il main così com'è
fun main() {
    var giorni: Int = 0
    giorni = giorniMacellaio(1, 1, 2021)
    println("Dal 1 1 2021 mancano $giorni giorni di lavoro alla fine dell'anno")
    giorni = giorniMacellaio(1, 12, 2021)
    println("Dal 1 12 2021 mancano $giorni giorni di lavoro alla fine dell'anno")
    giorni = giorniMacellaio(1, 1, 2020)
    println("Dal 1 1 2020 mancano $giorni giorni di lavoro alla fine dell'anno")
    giorni = giorniMacellaio(15, 1, 2100)
    println("Dal 15 1 2100 mancano $giorni giorni di lavoro alla fine dell'anno")
    giorni = giorniMacellaio(15, 2, 2000)
    println("Dal 15 2 2000 mancano $giorni giorni di lavoro alla fine dell'anno")
}

// Questa è la funzione da implementare
fun giorniMacellaio(giorno: Int, mese: Int, anno: Int): Int {
    var giorni: Int = 0
    return giorni
}