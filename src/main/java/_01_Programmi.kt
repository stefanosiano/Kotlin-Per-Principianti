import kotlin.math.sqrt

class _01_Programmi {}

/*
I programmi possono essere scritti in vari linguaggi.
Ne esistono migliaia :o

I più comuni sono comunque:
 linguaggi a basso livello: c (e le varianti c++ e c#) e rust: soprattutto usati nei sistemi operativi, data la loro velocità.
    swift: usato per ios e macos
 linguaggi interpretati: javascript (il re dei siti web), python: usati soprattutto nei server o sul desktop
    dart: usato per cross-platform (oltre ad "estensioni" di javascript)
    sql: usato per i database
 linguaggi a metà: java, kotlin: gli unici usati per android, ma anche in server e desktop

Nonostante i vari linguaggi abbiano ciascuno delle peculiarità, tutti condividono la stessa struttura nella creazione di un programma.
Un programma è infatti creato da:
 - Variabili
 - Funzioni, che al loro interno possono contenere
    - Variabili
    - istruzioni

La creazione di un programma si divide in 3 fasi:
 - Analisi: risponde alla domanda "Cosa deve essere fatto?"
    Si analizzano quali sono le variabili di input, quelle di output, eventuali vincoli e formule
    Es. Nel teorema di Pitagora: le variabili di input sono il cateto1 e il cateto2. La formula è radice(cateto1^2+cateto2^2).
     Eventuale vincolo: I cateti devono avere lunghezza intera? O possono essere numeri reali? Variabili di output: ipotenusa.
 - Progettazione (design): risponde alla domanda "Come deve essere fatto?". Tecnicamente questo si chiama algoritmo.
    1) Leggere i valori; 2) elaborarli; 3) mostrare il risultato.
    Es. Nel teorema di Pitagora:
        1) cateto1 = x; cateto2 = y.
        2) ipotenusa = radice(cateto1*cateto1 + cateto2*cateto2)
        3) print(ipotenusa)
 - Realizzazione (Implementazione): scrittura effettiva del programma.
    Es. Nel teorema di Pitagora:
    fun calcolaIpotenusa(cateto1: Double, cateto2: Double) {
        val ipotenusa = sqrt(cateto1*cateto1 + cateto2*cateto2)
        println("L'ipotenusa ottenuta dai cateti $cateto1 e $cateto2 è $ipotenusa")
    }

Possono esserci 3 tipi di errori nella creazione di un programma:
 - Errore sintattico: violazione delle regole di scrittura. Es. scrivere fuc invece che fun. Il programma non viene neanche compilato e viene mostrato un errore.
 - Errore a run-time: un'operazione fallisce quando viene eseguita su determinati parametri. Es. divisione per 0. Il programma crasha e ti viene indicato il punto in cui è avvenuto l'errore.
 - Errore logico: il più bastardo. È un errore nella progettazione dell'algoritmo. Nessuno sarà in grado di dirti dov'è l'errore. Saprai solo che i risultati sono sbagliati.

Ma da dove comincia l'esecuzione di un programma?
Ogni linguaggio ha la sua sintassi per specificare l'inizio di un programma, anche se si somigliano tutti.
In kotlin la funzione "fun main() {...}" è quella che viene eseguita all'avvio del programma.

Esercizio:
Creare una funzione che mostra somma e moltiplicazione di due numeri interi.
Aiuto: per stampare a video un risultato puoi usare le funzioni "print()" o "println()".
 La prima stampa ciò che vuoi a video, mentre la seconda stampa ciò che vuoi a video e va a capo.
 */

// Questo è un commento: comincia con // e può essere messo ovunque in un programma. Il compilatore lo ignorerò, quindi ci puoi scrivere ciò che vuoi
/*
Questo è un commento multilinea: comincia con /* e finisce con */
Tutto ciò che c'è all'interno di questi caratteri verrà semplicemente ignorato, quindi puoi scriverci ciò che vuoi
 */

fun main() {
    calcolaSommaProdotto(3, 5)
    calcolaSommaProdotto(1, 98)
}

// Implementare questa funzione!
fun calcolaSommaProdotto(num1: Int, num2: Int) {

}

// Questo è la funzione dell'esempio
fun calcolaIpotenusa(cateto1: Double, cateto2: Double) {
    val ipotenusa = sqrt(cateto1*cateto1 + cateto2*cateto2)
    println("L'ipotenusa ottenuta dai cateti $cateto1 e $cateto2 è $ipotenusa")
}