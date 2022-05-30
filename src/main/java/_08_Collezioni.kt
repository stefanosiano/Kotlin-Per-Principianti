class _08_Collezioni {}
/*
Abbiamo nominato le collezioni in passato, anche se non abbiamo avuto modo di usarle.
Ma cosa sono?
Le collezioni sono tipi di dati che rappresentano insiemi di valori. Ci sono diversi tipi di collezioni. Le più comuni sono:

 - List (lista): una collezione ordinata a cui si può accedere ad ogni elemento attraverso un indice, un numero che va
    da 0 al numero di elementi della lista. Una List potrebbe essere una lista di nomi di macellai che lavorano in un
    negozio. La sintassi è List<TipoElemento>.
    Esempio:
    val listaNomiMacellai: List<String> = listOf("Michele", "Giorgio", "Franco", "Michele")
    listaNomiMacellai[0] <--- ritorna "Michele"
    listaNomiMacellai[1] <--- ritorna "Giorgio"
    listaNomiMacellai[2] <--- ritorna "Franco"
    listaNomiMacellai[3] <--- ritorna "Michele"
    listaNomiMacellai[4] <--- Errore! Il programma crasha!

 - Map (mappa): un insieme di coppie chiave-valore. Le chiavi sono univoche, mentre i valori possono essere ripetuti.
    Ad ogni valore salvato nella mappa si può accedere tramite la sua chiave. Una Map potrebbe essere un insieme di
    coppie "tipo della carne" - "Prezzo della carne al chilo". La sintassi è Map<TipoChiave, TipoValore>.
    Esempio:
    val prezziCarne: Map<String, Double> = mapOf("Maiale" to 6.49, "Vitello" to 7.99, "Pollo" to 5.99)
    prezziCarne["Maiale"] <--- ritorna 6.49
    prezziCarne["Vitello"] <--- ritorna 7.99
    prezziCarne["Pollo"] <--- ritorna 5.99
    prezziCarne["Cammello"] <--- ritorna null

 - Set (insieme): una collezione senza alcun ordine in cui gli elementi devono essere univoci: non possono esserci
    ripetizioni. Non è possibile accedere ad uno specifico elemento nel set, perché non avrebbe senso.
    L'unica cosa che si può fare è controllare se un elemento esiste nel set oppure no attraverso la funzione "contains".
    Un Set potrebbe essere l'insieme delle carni vendute nel reparto di macelleria. La sintassi è Set<TipoElemento>.
    Esempio:
    val setCarni: Set<String> = setOf("Maiale", "Vitello", "Pollo")
    setColtelli.contains("Maiale") <--- ritorna true
    setColtelli.contains("Pollo") <--- ritorna true
    setColtelli.contains("Cammello") <--- ritorna false

Tutte le collezioni hanno delle operazioni in comune. Infatti, è possibile conoscere la grandezza della collezione
 usando la sua variabile "size". In questo modo è possibile eseguire un blocco di istruzioni per ogni elemento della
 collezione utilizzando il for. Esempio:
 for (i in 0 until listaNomiMacellai.size) { ... }
L'altra operazione in comune è "iterator()", che ritorna un oggetto di tipo Iterator.
Questo Iterator ha la possibilità di ciclare gli elementi di una lista. In particolare ha 2 metodi importanti:
 - hasNext(): ritorna true se nella collezione c'è un elemento
 - next(): ritorna l'elemento successivo nella collezione
Solitamente questi metodi si usano in un ciclo while per eseguire un blocco di codice su ogni elemento di una collezione.
Esempio:
fun stampaElementiDiUnaCollezione(collezione: List<String>) {
    val iterator: Iterator<String> = collezione.iterator()
    while (iterator.hasNext()) {
        val elemento: String = iterator.next()
        println("L'elemento della collezione è $elemento")
    }
}
In alternativa, ma solo per la liste, si può usare un ciclo for per eseguire un blocco di codice su ogni elemento, usando
 la grandezza e gli indici degli elementi.
Esempio:
fun stampaElementiDiUnaCollezione(lista: List<String>) {
    for (i in 0 until lista.size) {
        val elemento: String = lista[i]
        println("L'elemento della collezione è $elemento")
    }
}

Esercizio 1:
Scrivere una funzione che, data una lista di numeri di fette di carne ordinate, stampa il minimo ed il massimo delle
fette ordinate. Numeri negativi indicano che le fette sono state riportate indietro, e devono essere considerate
normalmente. In altre parole, tra -4, 2 e 5, il minimo sarà -4 ed il massimo sarà 5.

Esercizio 2:
Scrivere una funzione che, data una mappa di macellai ed il loro stipendio, stampa il nome del più povero e del più ricco.

Esercizio 3:
Riscrivere la funzione dell'esercizio 1 usando la funzione della lista "forEach { }" (anche Map e Set hanno questa
 funzione, in caso te lo stia chiedendo).
Aiuto:
Cerca su internet se non sai come fare. Il sito stackoverflow sarà tra i primi risultati, e ti piacerà tanto.
Non ti preoccupare se non arrivi immediatamente alla soluzione. Questo è un assaggio di un argomento che tratteremo in
 seguito: passare funzioni come variabili, cioè passare variabili di tipo funzione.

*/

// Lascia questa funzione così com'è
fun main() {
    val fetteOrdinate1: List<Int> = listOf(4, 7, -1, -520, 42, -29, 14, 921, 124, -1242)
    val fetteOrdinate2: List<Int> = listOf(56, 12, 241, 124, 7, 86, 35, 3, 36, 60, 69)
    stampaMinimoMassimo(fetteOrdinate1)
    stampaMinimoMassimo(fetteOrdinate2)
    val macellai: Map<String, Int> = mapOf("Giovanni" to 1200, "Franco" to 1500, "Michele" to 600, "Giovanna" to 800)
    stampaPoveroRicco(macellai)
    stampaMinimoMassimoConForEach(fetteOrdinate1)
    stampaMinimoMassimoConForEach(fetteOrdinate2)
}

// Implementa questa funzione
fun stampaMinimoMassimo(fetteOrdinate: List<Int>) {
}

// Implementa questa funzione
fun stampaPoveroRicco(macellai: Map<String, Int>) {
}

// Implementa questa funzione
fun stampaMinimoMassimoConForEach(fetteOrdinate: List<Int>) {
}
