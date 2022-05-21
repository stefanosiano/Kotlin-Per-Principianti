class _02_Variabili {}
/*
Il processore di un computer ragiona in maniera binaria, cioè conosce solo due valori: 0 e 1.
Come fa quindi a sapere se una variabile è un numero, e come lo rappresenta?
L'unità fondamentale con cui ragiona il processore, lo 0 o 1, si chiama "bit".
Data la sua inutilità da solo, questo viene raggruppato in gruppi di 8. 8 bit formano un byte.
La conversione da un byte ad un numero "umano" avviene in questo modo:

2^posizione * 0 o 1
Che?????

01001001 diventa:
2^7*0 = 0
2^6*1 = 64
2^5*0 = 0
2^4*0 = 0
2^3*1 = 8
2^2*0 = 0
2^1*0 = 0
2^0*1 = 1
Quindi 01001001 = 73

00000001 -> 1
00000010 -> 2
00000100 -> 4
00000101 -> 5
11111111 -> 255

In realtà il primo bit può essere utilizzato per calcolare il segno: 0 positivo, 1 negativo.
11111111 -> -127, 01111111 -> 127, 10000000 -> -128, 00000000 -> 0
I numeri rappresentabili vanno quindi da -128 a +127

E per numeri più alti di 127?
Ecco che intervengono i tipi delle variabili.
In kotlin (come nella maggior parte dei linguaggi) ci sono diversi tipi:
 Numeri:
 - Byte: 1 byte - vanno da -128 a 127
 - Short: 2 byte - vanno da -32768 a 32767
 - Int: 4 byte - vanno da -2^31 a 2^31-1 (circa da -2 miliardi e passa a 2 miliardi e passa)
 - Long: 8 byte - vanno da -2^63 a 2^63-1 (circa da -8 miliardi di miliardi a 8 miliardi di miliardi)
 - Float: 4 byte - riesce a salvare fino a 7 cifre. Quindi può essere impreciso su numeri con la virgola e tante cifre
 - Double: 8 byte - riesce a salvare fino a 15 cifre. Quindi può essere impreciso su numeri con la virgola e tante cifre, anche se più preciso del float
 Booleani:
 - Boolean: 1 bit (in realtà dipende da forze oscure e misteriose) - vero o falso
 Caratteri:
 - Char: 1 byte - i 255 possibili valori del byte sono associati a 255 caratteri possibili in una tabella chiamata ascii
 - String: dipende dalla lunghezza - È un testo che comprende una serie di caratteri. Ognuno di questi caratteri può essere grande da 1 a 4 byte, secondo regole brutte.
 */

fun main() {
    numeri()
}

fun numeri() {
    // La somma di due byte, o due short ritorna sempre un Int
    val b1: Short = 120
    val b2 = (b1+b1) as Byte
    println(b2)
}