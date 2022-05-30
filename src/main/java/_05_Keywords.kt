class _05_Keywords {}
/*
Veniamo ora alle keyword, le parole chiave.
Come detto nei preliminari, le keyword sono una specie di istruzione per il compilatore, che in questo modo capisce ciò che vogliamo fare.
Ne abbiamo già incontrate alcune. Ogni linguaggio ha le proprie keyword e regole sintattiche, anche se generalmente
 sono simili, ma in kotlin le principali sono:
 Dichiarazioni:
  - fun: viene usato per dichiarare una funzione. La sintassi è:
    fun nomeFunzione(nomeParametro1: Tipo1, nomeParametro2: Tipo2, ...): TipoRitorno { ... }
  - val: viene usato per dichiarare un valore, cioè una variabile che non cambia nel tempo. La sintassi è:
    val nomeValore: TipoValore = valore
  - var: viene usato per dichiarare una variabile che può cambiare valore nel tempo. La sintassi è:
    var nomeVariabile: TipoVariabile = valore
  Per quanto riguarda var e val, questi possono essere utilizzati anche senza definire il valore inizialmente. Esempio:
   var nomeVariabile: TipoVariabile
   val nomeValore: TipoValore
  In questo caso si può definire il valore delle variabili successivamente. Esempio:
   nomeVariabile = 4
   nomeValore = 7
  Il valore dichiarato con la keyword val, non può essere definito più di una volta, mentre le variabili dichiarate con
   var possono essere definite tutte le volte che si vuole. Esempio:
   val nomeValore: Int = 0
   nomeValore = 2 <--- Errore di compilazione: nomeValore è 0 e non può essere cambiato!

   val nomeValore: Int
   nomeValore = 4 <--- Nessun problema: nomeValore non ha ancora un valore, quindi gli può essere assegnato qualunque valore
   nomeValore = 5 <--- Errore di compilazione: nomeValore è 4 e non può essere cambiato!

   var nomeVariabile: Int = 0
   nomeVariabile = 3 <--- Nessun problema: nomeVariabile è un var, quindi può essere cambiato tutte le volte che si vuole
   nomeVariabile = 5 <--- Nessun problema: nomeVariabile è un var, quindi può essere cambiato tutte le volte che si vuole

  L'unica accortenza è che la variabile (sia val che var) deve avere un valore prima di essere utilizzata. Esempio:
   val addendo1: Int = 0
   var addendo2: Int
   val somma = addendo1 + addendo2 <--- Errore! addendo2 non ha ancora un valore, quindi non può essere utilizzato!

 Salti condizionali
 - if: (Se) Valuta una condizione ed esegue un blocco di codice nel caso in cui la condizione sia vera. La sintassi è:
    if (condizione) { ... }
 - else: (Altrimenti) Può essere utilizzato subito dopo un "if". Se la condizione valutata nell'if non è vera, viene
    eseguito il blocco di codice dell'else. La sintassi è:
    if (condizione) { ... } else { ... }
    Gli "if" e gli "else" possono essere innestati. Esempio:
    if (condizione) { ... }
    else if (condizione2) { ... }
    else { ... }
 - when: (Quando) Valuta una serie di condizioni ed esegue la prima vera. La sintassi è:
    when {
        condizione1 -> { ... }
        condizione2 -> { ... }
        condizione3 -> { ... }
        ...
        else -> { ... }
    }
    In altre parole, equivale ad una serie di "if" ed "else". Il when precedente potrebbe infatti essere riscritto così:
    if (condizione1) { ... }
    else if (condizione2) { ... }
    else if (condizione3) { ... }
    ...
    else { ... }

 - for: (Per) Esegue ciclicamente un blocco di codice per ogni elemento in una collezione. La sintassi è:
    for(elemento in collezione) { ... }
    Esempio: for(i: Int in 1..3) { ... } <--- Esegue 3 volte il blocco di codice tra le graffe
 - while: (Finché) Valuta una condizione ed esegue ciclicamente un blocco di codice, finché questa condizione resta vera.
    La sintassi è: while(condizione) { ... }
 - do: (Fai) Viene usato insieme al while. Esegue un blocco di codice, poi valuta la condizione e riesegue ciclicamente
    il blocco finché la condizione è vera. In altre parole, è un "while" in cui la prima volta il blocco di codice viene
    eseguito sicuramente. La sintassi è:
    do { ... } while (condizione)

 - return: Termina la funzione e ritorna il valore specificato, se richiesto. Esempio:
    return true

Esercizio:
Calcoliamo il numero di fette di carne tagliate in un minuto in un reparto di macelleria di un negozio.
Abbiamo già effettuato il calcolo scrivendo la funzione "taglioCarneConIf", che puoi vedere qui sotto.
Come puoi notare, però, è piuttosto brutta da vedere.
Scrivi una nuova funzione, la "taglioCarneConWhen", che usa solo il when, e nessun if o else.
Aiuto: potresti aver bisogno di usare gli and (&&) nelle condizioni.
*/

// Lascia il main così com'è: ti tornerà utile per confrontare i valori delle due funzioni, in modo da capire se la
// funzione creata usando il when è corretta, cioè restituisce lo stesso valore della funzione con gli if.
fun main() {
    var fetteAlMinuto1 = taglioCarneConIf(5, 2, true)
    var fetteAlMinuto2 = taglioCarneConWhen(5, 2, true)
    println("La funzione con gli if ha ritornato come valore $fetteAlMinuto1, la funzione con il when ha ritornato $fetteAlMinuto2")
    fetteAlMinuto1 = taglioCarneConIf(5, 8, false)
    fetteAlMinuto2 = taglioCarneConWhen(5, 8, false)
    println("La funzione con gli if ha ritornato come valore $fetteAlMinuto1, la funzione con il when ha ritornato $fetteAlMinuto2")
    fetteAlMinuto1 = taglioCarneConIf(5, 8, true)
    fetteAlMinuto2 = taglioCarneConWhen(5, 8, true)
    println("La funzione con gli if ha ritornato come valore $fetteAlMinuto1, la funzione con il when ha ritornato $fetteAlMinuto2")
}

fun taglioCarneConIf(numeroMacellai: Int, numeroColtelli: Int, carneBuona: Boolean): Int {
    // Se la carne non è buona i macellai fanno fatica a tagliarla, e tagliano quindi solo 10 fette al minuto, anziché 15
    var fetteAlMinuto: Int = 0
    // Ogni macellaio riesce a tagliare 15 fette di carne al minuto, ma solo chi ha un coltello può tagliarle!
    if (numeroColtelli < numeroMacellai) {
        if (carneBuona) {
            fetteAlMinuto = numeroColtelli * 15
        }
        else {
            fetteAlMinuto = numeroColtelli * 10
        }
    }
    else {
        if (carneBuona) {
            fetteAlMinuto = numeroMacellai * 15
        }
        else {
            fetteAlMinuto = numeroMacellai * 10
        }
    }
    return fetteAlMinuto
}

fun taglioCarneConWhen(numeroMacellai: Int, numeroColtelli: Int, carneBuona: Boolean): Int {
    // Usa solo "when" per implementare tutta la funzione, e vedrai come viene bella!
    var fetteAlMinuto: Int = 0
    // Scrivi il when qui di seguito

    return fetteAlMinuto
}