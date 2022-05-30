class _00_Preliminari {}
/*
Un computer è formato da varie componenti, l'hardware:
 - il case, che contiene tutti i pezzi fisici
 - il processore, che svolge le operazioni
 - la ram, la memoria a breve termine
 - il disco, la memoria a lungo termine
 - scheda video, una sorta di processore creato apposta per la grafica
 - le periferiche, come monitor, tastiera, mouse, stampante, o qualunque cosa possa essere attaccato al pc

Il processore è il cuore del computer. È composto da diverse celle microscopiche chiamate registri.
Questi registri contengono le istruzioni da eseguire e i dati su cui eseguire quelle istruzioni.

La ram è la memoria a breve termine. Se salta la corrente, o comunque quando si spegne il computer, perde tutto.
La ram è composta da tante piccole celle, ognuna delle quali può memorizzare 1 byte di dati.
Avere una ram da 4 Gb significa avere 4 miliardi di queste celle.

Il disco è come la ram, ma non perde i dati quando si spegne.
Non viene usato direttamente dal processore perché è più lento della ram, e rallenterebbe tutto.

Queste componenti vengono fatte funzionare tramite i programmi, i software.
Ci sono diversi livelli di programmazione, ossia diverse astrazioni:
 - il linguaggio macchina: genera le istruzioni che il processore può eseguire.
 - i linguaggi di basso livello: permettono con una istruzione di eseguire più istruzioni di linguaggio macchina.
    Questi sono i linguaggi che generano i programmi più veloci, perchè creano file apposta per il sistema operativo su
    cui devono girare.
    Il sistema operativo poi converte le varie istruzioni in istruzioni digeribili direttamente dal processore.
    Ad esempio, "x = 1 + 2". In linguaggio macchina questo diventerebbe "salva '1' in questo registro; salva '2' in
        questo registro; fai la somma dei due registri salvati prima e salvala in quest'altro registro"
    Si possono comunque fare cose particolari, come leggere ciò che si trova in un punto preciso della ram
 - i linguaggi ad alto livello: più si sale di livello, più cose vengono "nascoste" a chi scrive un programma.
    Meglio, altrimenti uscirebbe pazzo!
    Non c'è però una vera distinzione per capire quale linguaggio è più in alto rispetto agli altri.
    Questi linguaggi sfruttano programmi che girano sui vari sistemi operativi, chiamati interpreti.
    Gli interpreti leggono il programma e lo trasformano in tempo reale in qualcosa che piace al sistema operativo.

Solitamente un programma è composto da un file, o un insieme di file, che vengono salvati sul disco.
Quando viene eseguito un programma, questo viene letto dal disco e salvato nella ram, finchè non lo legge tutto o si riempie.
    Se la ram dovesse riempirsi, il computer potrebbe decidere di staccare la spina al programma oppure rimuovere qualcosa
    di vecchio che non gli serve dalla ram e continuare a leggere il programma, nella speranza di farcela.
A questo punto il processore legge dalla ram le varie istruzioni presenti nel programma e le esegue.

Ma come si crea un programma?
Si scrive un testo, chiamato codice sorgente, che contiene le varie istruzioni da eseguire. Questo testo viene poi preso
 da un programma, chiamato compilatore, che ne fa uscire un file (o una serie di file) che può essere eseguito dal processore.

Come fa il compilatore a creare il programma dal testo?
Per prima cosa il testo deve seguire certe regole: la sintassi.
Ci sono varie keyword, parole chiave, che servono a far capire al compilatore cosa stiamo facendo.
Una volta scritto il testo seguendo la sintassi, facciamo un atto di fede e il programma uscirà fuori.

 */