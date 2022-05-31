class _07_Classi {}
/*
Esistono diversi paradigmi (modelli) di programmazione. Quello usato finora si chiama "programmazione imperativa".
 Nella "programmazione imperativa" vengono usate variabili e funzioni per modificare lo stato dell'ambiente del programma,
 come il valore di una variabile.
 Questo modello andava bene quando è stato inventato, negli anni '60, ma ora i programmi sono più complicati, ed hanno
 bisogno di un sistema che permetta di modellare problemi più complessi.

I principali paradigmi di programmazione usati attualmente sono:

 - La "programmazione ad oggetti": il programma viene scritto utilizzando degli "oggetti", delle variabili con tipi
    personalizzati. Ogni oggetto ha le proprie variabili e funzioni, e l'interazione di diversi oggetti porta al
    risultato finale (proprio come nel procedimento top-down).
    La caratteristica principale è quindi che ogni oggetto ha un proprio stato, che cambia nel tempo indipendentemente
    dagli altri oggetti.
    Ad esempio, usando la programmazione ad oggetti è facile sapere quante fette di carne avrà tagliato un macellaio in
    un certo momento, perchè fa parte dello "stato" del macellaio. Si può quindi facilmente gestire il caso in cui un
    macellaio si stanchi dopo aver tagliato 100 fette di carne, e cominci a tagliare le altre fette più lentamente.

 - La "programmazione funzionale": il programma viene scritto tramite un insieme di funzioni, senza l'uso di variabili
    "globali", cioè variabili condivise da più funzioni.
    La caratteristica principale è quindi che non esiste il concetto di stato del programma. Una funzione chiamata più
    volte in qualunque momento darà sempre lo stesso output, se l'input non cambia.
    Ad esempio, usando la programmazione funzionale non ci si deve preoccupare che dopo aver tagliato 100 fette di carne
    il macellaio si stanchi, perchè magari c'è il secondo macellaio che gli dà il cambio.

Ultimamente, però, la programmazione ad oggetti ha acquisito alcune caratteristiche della programmazione funzionale,
 come la possibilità di avere una variabile di tipo funzione (eh???), e viceversa

Ci concentreremo sulla "programmazione ad oggetti" perché è la più usata, oltre al fatto che Kotlin è un linguaggio ad oggetti.

Veniamo quindi al concetto principale della programmazione ad oggetti: la "classe"
La classe può essere vista come un tipo di una variabile personalizzato. Può contenere al suo interno altre variabili e
 funzioni. La sintassi per dichiarare una classe è:
 class NomeClasse {
    constructor(parametro1: Tipo1, parametro2: Tipo2, ...) {
        ...
    }
    ...
 }
 Esempio:
 class Macellaio(nomeMacellaio: String) {
    val nome: String
    var fetteTagliate: Int = 0

    constructor(nomeMacellaio: String) {
        nome = nomeMacellaio
    }

    fun taglioCarne(): Int {
        ...
    }
 }
Le variabili che hanno come tipo una classe vengono dette "istanze" di quella classe. Per definirle la sintassi è:
 val nomeIstanza: NomeClasse = NomeClasse(parametri richiesti nel constructor)
 Esempio:
 val michele: Macellaio = Macellaio("Michele")

La parte tra parentesi tonde nella definizione di una classe, nel caso precedente il "(nomeMacellaio: String)"
 */
