class _03_Funzioni {}
/*
Le funzioni rappresentano un blocco di istruzioni da eseguire. Queste accettano dei parametri di input e possono restituire un valore.
La sintassi per dichiarare una funzione in Kotlin è: fun nomeFunzione(parametro1: Int, parametro2: Boolean, ...) { ... }

Il processore esegue le istruzioni di un programma una alla volta, in ordine, finchè il programma non finisce.
Le funzioni rappresentano una "eccezione": durante l'esecuzione di un programma, se è presente la chiamata ad una funzione,
 verranno eseguite le istruzioni di quella funzione, una alla volta, in ordine. Al termine della funzione, il programma
 continuerà da dove si era fermato.

Ma perchè usare le funzioni?
Scoprilo!

Esercizio:
Dati 4 numeri, stampa la somma, il prodotto e la differenza dei primi due e poi degli ultimi 2.
Fallo prima in un'unica funzione.
Poi riprova staccando
 */

fun main() {
    val num1: Int = 4
    val num2: Int = 7
    val num3: Int = 12
    val num4: Int = -9
}

fun calcolaTuttoInsieme() {
    val num1: Int = 4
    val num2: Int = 7
    val num3: Int = 12
    val num4: Int = -9
    // stampa somma, prodotto e differenza di num1 e num2. Comincia qui

    // stampa somma, prodotto e differenza di num3 e num4. Comincia qui

}

fun calcolaStaccato(parametro1: Int, parametro2: Int) {
    // stampa somma, prodotto e differenza di parametro1 e parametro2. Dopodichè chiama questa funzione nel main() con i vari numeri.
}