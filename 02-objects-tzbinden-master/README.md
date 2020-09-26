# Lerneinheit 02

Im Package [ch.fhnw.oop1.le](./src/ch/fhnw/oop1/le) finden Sie Code Beispiele aus den Videos.

# Arbeitsblätter (AB)

## Arbeitsblatt Wohngemeinschaft (Objekte & Referenzen)

### Ausgangspunkt:
In der Vorlesung haben wir gesehen, dass es in Java neben den primitiven Datentypen (`byte`, `short`, `int`, `long`, `char`, `float`, `double`, `boolean`) auch noch Referenztypen gibt. Mit Referenztypen können Strukturen aufgebaut werden. In diesem Arbeitsblatt ist eine solche Struktur gegeben.

### Ziel:
Ziel ist, dass Sie sehen (und erleben), wie mit Referenzen auf Instanzen von Klassen gearbeitet wird. In den [Übungen](#übungen-(ub)) können Sie das Arbeiten mit Referenzen dann weiter vertiefen. 

### Aufgabe:
In diesem Beispiel modellieren wir die Situation, dass Studierende in Wohnungen (WGs) wohnen und dabei die Wohnung auch wechseln können. Manchmal kann ihnen dabei auch ein Missgeschick passieren. 

Wir definieren dazu die beiden folgenden Klassen:

```java
class Apartment {
	String address;
	int nOfRooms;
	boolean clean;
}

class Student {
	String name;
	Apartment ap;
}
```

Ausgehend von dieser Klasse definieren wir folgende Struktur: 
```java
Apartment smallAp = new Apartment();
smallAp.address = "Bahnhofstrasse, Windisch";
smallAp.nOfRooms = 3;
smallAp.clean = true;

Apartment bigAp = new Apartment();
bigAp.address = "Bahnhofstrasse";
bigAp.address = bigAp.address + ", Windisch";
bigAp.nOfRooms = 4;
bigAp.clean = true;

Student a, b, c;
a = new Student();
a.name = "Alice";
a.ap = bigAp; // Alice zieht in die grosse WG

b = new Student();
b.name = "Bob";
b.ap = bigAp; // Bob zieht auch in die grosse WG

c = new Student();
c.name = "Carol";
c.ap = smallAp; // Carol zieht in die kleine WG
```

Sie finden diesen Code in der Klasse [ch.fhnw.ooo1.ab.WohnGemeinschaft](./src/ch/fhnw/oop1/ab/WohnGemeinschaft.java). 
 

### Aufgaben:

1)	Zeichnen Sie ein Diagramm mit den beiden Wohnungen und den drei Studierenden und den Referenzen zwischen diesen Objekten.


2)	Wir führen nun folgende Operationen auf diesen Objekten aus:

    ```java
	a.ap.clean = false; // Alice passiert ein Missgeschick
	System.out.println("Die kleine Wohnung ist sauber: " + smallAp.clean);
	System.out.println("Die grosse Wohnung ist sauber: " + bigAp.clean);
	System.out.println("Alices Wohnung ist sauber: " + a.ap.clean);
	System.out.println("Bobs Wohnung ist sauber: " + b.ap.clean);
	System.out.println("Carol Wohnung ist sauber: " + c.ap.clean);

	b.ap.clean = true; // Bob putzt
	System.out.println("Die kleine Wohnung ist sauber: " + smallAp.clean);
	System.out.println("Die grosse Wohnung ist sauber: " + bigAp.clean);
	System.out.println("Alices Wohnung ist sauber: " + a.ap.clean);
	System.out.println("Bobs Wohnung ist sauber: " + b.ap.clean);
	System.out.println("Carol Wohnung ist sauber: " + c.ap.clean);

	b.ap = smallAp; // Bob zieht in die kleine WG
	b.ap.clean = false; // Bob passiert schon wieder ein Missgeschick
	System.out.println("Die kleine Wohnung ist sauber: " + smallAp.clean);
	System.out.println("Die grosse Wohnung ist sauber: " + bigAp.clean);
	System.out.println("Alices Wohnung ist sauber: " + a.ap.clean);
	System.out.println("Bobs Wohnung ist sauber: " + b.ap.clean);
	System.out.println("Carol Wohnung ist sauber: " + c.ap.clean);
    ```

    Was wird ausgegeben wenn dieser Code ausgeführt wird?
Überlegen Sie sich die Antwort bevor Sie das Programm ausführen.


3)	Schreiben Sie eine kleine Methode printStudent welche den Namen und die Adresse eines Studenten ausgibt. Wird diese Methode z.B. mit dem Argument a (Alice) aufgerufen, dann soll folgendes Resultat ausgegeben werden:

    `Alices Adresse lautet Bahnhofstrasse, Windisch`


4)	Schreiben Sie eine kleine Methode compareApartments welche Prüft, ob die drei übergebenen Studierenden

    a)	in derselben Wohnung und

    b)	an derselben Adresse wohnen.

    Wird diese Methode auf der Struktur die Sie in Aufgabe 1) gezeichnet haben angewendet, dann sollte folgendes Resultat ausgegeben werden:

    `Alice, Bob and Carol wohnen in derselben WG: false`
   `Alice, Bob and Carol wohnen an derselben Adresse: true`

&nbsp;

# Übungen (UB)

## Netzwerke (Twitter)

### Ausgangspunkt:
In dieser Übung arbeiten wir neben Objekten und Referenzen zwischen den Objekten auch mit Arrays. Beachten Sie, dass ein Array auch eine Referenz auf ein Array-Objekt ist, in welchem Elemente abgelegt sind (in unserem Fall Referenzen auf Objekte).

### Ziel:
Ziel ist, dass Sie sehen (und erleben), wie mit Referenzen (Arrays und Instanzen von Klassen) gearbeitet wird und dass mit wenig Objekten bereits komplizierte Strukturen entstehen können. In der Übung JosephusRing können Sie das Arbeiten mit Referenzen dann weiter vertiefen.

### Aufgabe:
Gegeben ist eine Klasse Person, mit der wir ein Netzwerk aufbauen. Eine Person hat einen Namen (vom Typ `String`) und kennt mehrere Personen (Referenz auf ein Array `Person[]`). 
Bemerkung: Wenn A die Person B kennt, dann muss B nicht zwingend auch A kennen (wie bei Twitter oder Google+). 

```java
public class Person {
	String name;
	Person[] knows;
}
```

Ausgehend von dieser Klasse definieren wir vier Personen und setzen Beziehungen zwischen diesen Personen.

```java
Person a = new Person();
a.name = "Alice";
a.knows = new Person[2]; 	// alice has two friends

Person b = new Person();
b.name = "Bob";
b.knows = new Person[2]; 	// bob has two friends

Person c = new Person();
c.name = "Carol";
c.knows = a.knows; 		// carol has the same friends as alice

Person d = new Person();
d.name = "Daniel";
d.knows = new Person[3]; 	// daniel has three friends

a.knows[0] = b;
a.knows[1] = d;

b.knows[0] = c;
b.knows[1] = d;

d.knows[0] = c;
d.knows[1] = d;
d.knows[2] = a;
```

Aufgaben:

1)	Zeichnen Sie ein Diagramm mit den vier Instanzen der Klasse Person, mit den Instanzen der Arrays (Tipp: Es sind nur drei Arrays erzeugt worden) und mit den Referenzen zwischen diesen Instanzen. 

    Ausgehend von diesem Diagramm können Sie dann die folgenden Aufgaben beantworten. 

2)	Gegeben ist folgende Methode, welche als Parameter eine Referenz auf einen Knoten erhält und den Referenzen nachfolgt und die Namen der besuchten Personen ausgibt.

    ```java
	static void printTrace(Person p, int index) {
		for(int i = 0; i < 4; i++) {
			System.out.println(p.name);
			p = p.knows[index];
		}
		System.out.println();
	}
    ```
	
    Was gibt diese Methode aus, wenn sie mit folgenden Argumenten aufgerufen wird:

    a) printTrace(a, 0);

    b) printTrace(a, 1);



3)	Gegeben ist folgende Methode, welche als Parameter eine Referenz auf eine Person erhält und über unterschiedliche Beziehungen den Referenzen folgt und am Ende ausgibt, bei welchen Instanzen sie angelangt ist.

    ```java
	static void path(Person p) {
		Person x = p.knows[0].knows[0];
		Person y = p.knows[1].knows[0];
		System.out.println(x.name);
		System.out.println(y.name);
		System.out.println(x == y);
		System.out.println();
	}
    ```

    Was gibt diese Methode aus, wenn sie mit folgenden Argumenten aufgerufen wird?

    a) path(a);

    b) path(b);

    c) path(c);

&nbsp;

## Josephusring – Objekte und Klassen

In dieser Aufgabe wird aus mehreren Objekten eine ringförmige Struktur aufgebaut, in der jedes Objekt das nachfolgende Objekt der gleichen Klasse referenziert. Anschliessend wird dieser Ring schrittweise abgebaut, bis er nur noch aus einem Objekt besteht.

Der Josephusring ist eine Variante des Abzählreimes "A-zelle, Bölle-schelle, d'Chatz goht uff Walliselle, chunnt sie wieder hei….". Er wurde verwendet um zu bestimmen, welcher Gefangene am Geburtstag des Königs freigelassen werden soll. Die Gefangenen mussten sich dazu im Kreis aufstellen. Nun wurde, beginnend mit dem ersten Gefangenen, reihum von 1 bis zu einer vorher festgelegten "fatalen Zahl" abgezählt. Wer die fatale Zahl traf, der musste weiterhin im Gefängnis bleiben und das Abzählen wurde mit dem nächsten Gefangenen neu begonnen. Der Letzte, der übrig blieb, wurde schliesslich begnadigt.

Aufgabe: An welcher Position im Kreis muss sich Josephus aufstellen, um begnadigt zu werden? Entwickeln Sie ein Programm Josephus, das die Gesamtzahl der Verurteilten (prisoners) und die fatale Zahl, bis zu der abgezählt wird (fatalNumber), mit dem Scanner einliest und die Gnadenposition ausgibt. Die Positionen sind, beginnend mit dem ersten Gefangenen an Position 0, in Zählrichtung bis zur Position prisoners-1 fortlaufend durchnummeriert.

Beispiel: 4 Gefangene und fatale Zahl ist 3.

Ablauf: 


| Gefangener 0 | Gefangener 1 | Gefangener 2 | Gefangener 3  |
|---|---|---|---|
| eins | zwei | DREI (und weg) | eins  |   
| zwei | DREI (und weg) | - | eins |   
| zwei | - | - | DREI (und weg) |   


Die Gnadenposition ist in diesem Beispiel `0`.

Implementieren Sie das Programm Josephus, in dem Sie die Gefangenen als Objekte vom Typ `Prisoner` modellieren. Jeder Gefangene kennt seinen Nachfolger (und enthält als weiteres Attribut seine Position vom Typ `int` mit Werten im Bereich `0..n-1`).

Für die Erzeugung der `n` Gefangenen brauchen Sie `n` Variablen, in welchen sie die erzeugten Objekte verankern können. Es ist am einfachsten, wenn Sie dazu ein Array der Grösse `n` erzeugen. Die `n` Gefangenen könnten jedoch auch ohne Array erzeugt werden.

Sie finden die Klasse mit der zu implementierenden Methode und eine Test-Klasse im Package [ch.fhnw.oop1.ub.josephus](./src/ch/fhnw/oop1/ub/josephus).

