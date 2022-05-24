class _04_Funzioni2 {}
/*
Come detto in precedenza, la sintassi per dichiarare una funzione in Kotlin è:
fun nomeFunzione(parametro1: Tipo, parametro2: Tipo, ...): TipoRitorno { ... }

Prendiamo come esempio la seguente funzione taglioCarne, che conta quante fette di carne possono essere tagliate in base
 al numero di macellai, di coltelli, e alla bontà della carne:
fun taglioCarne(numeroMacellai: Int, numeroColtelli: Int, carneBuona: Boolean) : Int {
    ...
}

Il nome della funzione, così come quello delle variabili e dei parametri, può essere qualunque cosa, ma ci sono alcune restrizioni,
 come avere degli spazi all'interno del nome, o il divieto di iniziare un nome con un numero.
 Quando un nome è composto da più parole, queste non vengono separate, ma l'iniziale di ogni parola è maiuscola.
 Questo almeno in Kotlin. In altri linguaggi viene usato il _ per separare le parole, es. taglio_carne, numero_macellai, ecc.

I parametri che vengono passati alla funzione equivalgono a delle variabili che esistono solo all'interno della funzione stessa.
 Non possono quindi essere utilizzate da altre funzioni.
 Il loro valore, poi, viene assegnato al momento in cui la funzione viene chiamata. Ad esempio, nel main() potremmo avere
 taglioCarne(2, 5, true)   oppure   taglioCarne(1,3, false)
 Nel primo caso numeroMacellai sarà uguale a 2, nel secondo caso sarà 1. Al termine della funzione taglioCarne, numeroMacellai smetterà di esistere.

Infine possiamo notare come taglioCarne ritorni come valore un Int.
Per terminare una funzione ritornando un valore si usa la keyword "return".

 */