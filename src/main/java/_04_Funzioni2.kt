class _04_Funzioni2 {}
/*
Come detto in precedenza, la sintassi per dichiarare una funzione in Kotlin è:
fun nomeFunzione(parametro1: Tipo, parametro2: Tipo, ...): TipoRitorno { ... }

Prendiamo come esempio la seguente funzione taglioCarne, che conta quante fette di carne possono essere tagliate in un
 minuto in base al numero di macellai e alla bontà della carne:
fun taglioCarne(numeroMacellai: Int) : Int {
    ...
}

Il nome della funzione, così come quello delle variabili e dei parametri, può essere qualunque cosa, ma ci sono alcune
 restrizioni, come avere degli spazi all'interno del nome, o il divieto di iniziare un nome con un numero.
 Quando un nome è composto da più parole, queste non vengono separate, ma l'iniziale di ogni parola è maiuscola.
 Questo almeno in Kotlin. In altri linguaggi viene usato il "_" per separare le parole, es. taglio_carne, numero_macellai, ecc.

I parametri che vengono passati alla funzione equivalgono a delle variabili che esistono solo all'interno della funzione stessa.
 Non possono quindi essere utilizzate da altre funzioni.
 Il loro valore, poi, viene assegnato al momento in cui la funzione viene chiamata. Ad esempio, nel main() potremmo avere
 taglioCarne(2, true)   oppure   taglioCarne(1, false)
 Nel primo caso numeroMacellai sarà uguale a 2, nel secondo caso sarà 1. Al termine della funzione taglioCarne,
 numeroMacellai smetterà di esistere.

Infine possiamo notare come taglioCarne ritorni come valore un Int.
Per terminare una funzione ritornando un valore si usa la keyword "return".
 Es. Se ogni macellaio tagliasse 15 fette di carne al minuto, la funzione taglioCarne potrebbe essere scritta così:
 fun taglioCarne(numeroMacellai: Int) : Int {
     return numeroMacellai * 15
 }

Il valore ritornato come output dalla funzione può essere utilizzato ed assegnato ad una variabile.
Consideriamo il caso in cui ci sia un negozio con due reparti di macelleria. Si vuole sapere quante fette di carne si
 possono tagliare in un minuto in totale, sapendo che un reparto ha 2 macellai, mentre l'altro, più grande, ne ha 4.
 fun fetteAlMinutoNegozio() {
    val fetteAlMinutoReparto1: Int = taglioCarne(2)
    val fetteAlMinutoReparto2: Int = taglioCarne(4)
    val fetteAlMinutoTotali: Int = fetteAlMinutoReparto1 + fetteAlMinutoReparto2
    println("Al minuto possono essere tagliate $fetteAlMinutoTotali fette")
 }
Come abbiamo visto in questo esempio, una funzione può essere chiamata all'interno di un'altra funzione. In questo caso,
 fetteAlMinutoNegozio è detta la funzione chiamante, mentre taglioCarne è detta la funzione chiamata.

Tutto bello con queste funzioni, ma a che servono effettivamente?
Nella progettazione di un programma viene spesso utilizzato un procedimento chiamato "top-down", anche noto come
 "divide et impera" (dividi ed unisci).
Si tratta di un procedimento in cui un problema viene scomposto in sotto-problemi più piccoli ("dividi"). Una volta trovate
 le soluzioni a questi sotto-problemi, queste soluzioni vengono combinate per risolvere il problema originale ("unisci").
 Questo procedimento può essere riapplicato a propria volta ai vari sotto-problemi, fino a raggiungere un problema facilmente risolvibile.

Esempio:
In un paese ci sono 5 negozi che hanno dei reparti di macelleria. Ognuno di loro ha a disposizione un certo numero di
macellai, e vende la propria carne ad un certo prezzo:
 Negozio1: 1 reparto con 2 macellai, 5 euro al chilo
 Negozio2: 1 reparto con 3 macellai, un altro reparto con 2 macellai, 4.50 euro al chilo
 Negozio3: 1 reparto con 1 macellaio, 6 euro al chilo
 Negozio4: 1 reparto con 1 macellaio, 5 euro al chilo
 Negozio5: 1 reparto con 4 macellai, un altro reparto con 2 macellai, 5 euro al chilo
Tutti i macellai hanno avuto lo stesso maestro, ed hanno quindi imparato a tagliare precisamente 15 fette di carne al minuto.
Tenendo conto che tutti i macellai sono così bravi da tagliare delle fette di carne perfette da 100 grammi l'una, quanto
 potrebbero spendere in tutto le persone del paese in un giorno, se tutti i 5 negozi fossero sempre pieni?
 (non siamo mica schiavisti, eh! I macellai lavorano 8 ore al giorno, con mezz'ora di pausa, non di più).

Applichiamo il procedimento top-down e dividiamo il problema in più sotto-problemi:
 - Per capire la spesa totale del paese dobbiamo prima capire la spesa fatta per ognuno dei 5 negozi, e poi sommare il tutto.
 - La spesa fatta in un negozio corrisponde al numero di fette tagliate in un giorno moltiplicate per il loro prezzo.
 - Il numero di fette tagliate in un giorno corrisponde al numero di fette tagliate in un minuto moltiplicato per il
    numero di minuti di lavoro.
 - Il numero di fette tagliate in un minuto corrisponde al numero di macellai moltiplicato per 15.
 La soluzione potrebbe quindi consistere in:
  - una funzione che in base al numero di macellai riporta quante fette di carne siano tagliate in un minuto
  - una funzione che in base al numero di macellai ritorna il numero di fette di carne tagliate in un giorno
  - una funzione che in base al numero di macellai ed al prezzo della carne ritorna la spesa fatta in un negozio
  - una funzione che somma tutte le spese fatte nei 5 negozi
  - la funzione principale (il main) che stampa il risultato finale

ESERCIZIO:
Implementa l'esempio.

 */
fun main() {
}
