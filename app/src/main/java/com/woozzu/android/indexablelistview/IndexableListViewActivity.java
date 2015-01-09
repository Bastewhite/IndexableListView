package com.woozzu.android.indexablelistview;

import android.app.Activity;
import android.os.Bundle;

import com.woozzu.android.widget.IndexableListView;

import java.util.ArrayList;
import java.util.Collections;

public class IndexableListViewActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ContentAdapter adapter = new ContentAdapter<>(populateExample3());

        IndexableListView mListView = (IndexableListView) findViewById(R.id.listview);
        mListView.setAdapter(adapter);
        mListView.setFastScrollEnabled(true);
    }

    private ArrayList<String> populateExample1() {
        ArrayList<String> mItems = new ArrayList<>();
        mItems.add("Diary of a Wimpy Kid 6: Cabin Fever");
        mItems.add("Steve Jobs");
        mItems.add("Inheritance (The Inheritance Cycle)");
        mItems.add("11/22/63: A Novel");
        mItems.add("The Hunger Games");
        mItems.add("The LEGO Ideas Book");
        mItems.add("Explosive Eighteen: A Stephanie Plum Novel");
        mItems.add("Catching Fire (The Second Book of the Hunger Games)");
        mItems.add("Elder Scrolls V: Skyrim: Prima Official Game Guide");
        mItems.add("Death Comes to Pemberley");
        mItems.add("Diary of a Wimpy Kid 6: Cabin Fever");
        mItems.add("Steve Jobs");
        mItems.add("Inheritance (The Inheritance Cycle)");
        mItems.add("11/22/63: A Novel");
        mItems.add("The Hunger Games");
        mItems.add("The LEGO Ideas Book");
        mItems.add("Explosive Eighteen: A Stephanie Plum Novel");
        mItems.add("Catching Fire (The Second Book of the Hunger Games)");
        mItems.add("Elder Scrolls V: Skyrim: Prima Official Game Guide");
        mItems.add("Death Comes to Pemberley");
        Collections.sort(mItems);
        return mItems;
    }

    private ArrayList<String> populateExample2() {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Afghanistan");
        countries.add("Albania");
        countries.add("Bahrain");
        countries.add("Bangladesh");
        countries.add("Cambodia");
        countries.add("Cameroon");
        countries.add("Denmark");
        countries.add("Djibouti");
        countries.add("East Timor");
        countries.add("Ecuador");
        countries.add("Fiji");
        countries.add("Finland");
        countries.add("Gabon");
        countries.add("Georgia");
        countries.add("Haiti");
        countries.add("Holy See");
        countries.add("Iceland");
        countries.add("India");
        countries.add("Jamaica");
        countries.add("Japan");
        countries.add("Kazakhstan");
        countries.add("Kenya");
        countries.add("Laos");
        countries.add("Latvia");
        countries.add("Macau");
        countries.add("Macedonia");
        countries.add("Namibia");
        countries.add("Nauru");
        countries.add("Oman");
        countries.add("Pakistan");
        countries.add("Palau");
        countries.add("Qatar");
        countries.add("Romania");
        countries.add("Russia");
        countries.add("Saint Kitts and Nevis");
        countries.add("Saint Lucia");
        countries.add("Taiwan");
        countries.add("Tajikistan");
        countries.add("Uganda");
        countries.add("Ukraine");
        countries.add("Vanuatu");
        countries.add("Venezuela");
        countries.add("Yemen");
        countries.add("Zambia");
        countries.add("Zimbabwe");
        countries.add("0");
        countries.add("2");
        countries.add("9");
        Collections.sort(countries);
        return countries;
    }

    private ArrayList<Book> populateExample3() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Things Fall Apart ", "Chinua Achebe ", "1958", " Nigeria ", "English"));
        bookList.add(new Book("Fairy tales ", "Hans Christian Andersen ", "1835�37 ", "Denmark ", "Danish"));
        bookList.add(new Book("511352312 Fall Apart ", "Chinua Achebe ", "1958", " Nigeria ", "English"));
        bookList.add(new Book("The Divine Comedy ", "Dante Alighieri ", "1265�1321 ", "Florence ", "Italian"));
        bookList.add(new Book("Epic of Gilgamesh ", "Anonymous ", "18th � 17th century BC ", "Sumer and Akkadian Empire ", "Akkadian"));
        bookList.add(new Book("Book of Job ", "Anonymous ", "6th � 4th century BC ", "Achaemenid Empire ", "Hebrew"));
        bookList.add(new Book("One Thousand and One Nights ", "Anonymous ", "700�1500 ", "India/Iran/Iraq/Egypt ", "Arabic"));
        bookList.add(new Book("Nj�l's Saga ", "Anonymous ", "13th century ", "Iceland ", "Old Norse"));
        bookList.add(new Book("Pride and Prejudice ", "Jane Austen ", "1813", " United Kingdom ", "English"));
        bookList.add(new Book("Le P�re Goriot ", "Honor� de Balzac ", "1835", " France ", "French"));
        bookList.add(new Book("Molloy, Malone Dies, The Unnamable, a trilogy ", "Samuel Beckett ", "1951�53 ", "Republic of Ireland ", "French, English"));
        bookList.add(new Book("The Decameron ", "Giovanni Boccaccio ", "1349�53 ", "Ravenna ", "Italian"));
        bookList.add(new Book("Ficciones ", "Jorge Luis Borges ", "1944�86 ", "Argentina ", "Spanish"));
        bookList.add(new Book("Wuthering Heights ", "Emily Bront� ", "1847", "  United Kingdom ", "English"));
        bookList.add(new Book("The Stranger ", "Albert Camus ", "1942", "   Algeria, French Empire ", "French"));
        bookList.add(new Book("Poems ", "Paul Celan ", "1952", "    Romania, France ", "German"));
        bookList.add(new Book("Journey to the End of the Night ", "Louis-Ferdinand C�line ", "1932", "  France ", "French"));
        bookList.add(new Book("Don Quixote ", "Miguel de Cervantes ", "1605 (part 1), 1615 (part 2) ", "Spain ", "Spanish"));
        bookList.add(new Book("The Canterbury Tales ", "Geoffrey Chaucer ", "14th century ", "England ", "English"));
        bookList.add(new Book("Stories ", "Anton Chekhov ", "1886", "   Russia ", "Russian"));
        bookList.add(new Book("Nostromo ", "Joseph Conrad ", "1904", "  United Kingdom ", "English"));
        bookList.add(new Book("Great Expectations ", "Charles Dickens ", "1861", "  United Kingdom ", "English"));
        bookList.add(new Book("Jacques the Fatalist ", "Denis Diderot ", "1796", "  France ", "French"));
        bookList.add(new Book("Berlin Alexanderplatz ", "Alfred D�blin ", "1929", " Germany ", "German"));
        bookList.add(new Book("Crime and Punishment ", "Fyodor Dostoyevsky ", "1866", " Russia ", "Russian"));
        bookList.add(new Book("The Idiot ", "Fyodor Dostoyevsky ", "1869", "    Russia ", "Russian"));
        bookList.add(new Book("The Possessed ", "Fyodor Dostoyevsky ", "1872", "    Russia ", "Russian"));
        bookList.add(new Book("The Brothers Karamazov ", "Fyodor Dostoyevsky ", "1880", "   Russia ", "Russian"));
        bookList.add(new Book("Middlemarch ", "George Eliot ", "1871", "    United Kingdom ", "English"));
        bookList.add(new Book("Invisible Man ", "Ralph Ellison ", "1952", " United States ", "English"));
        bookList.add(new Book("Medea ", "Euripides ", "431 BC ", "Athens ", "Classical Greek"));
        bookList.add(new Book("Absalom, Absalom! ", "William Faulkner ", "1936", "  United States ", "English"));
        bookList.add(new Book("The Sound and the Fury ", "William Faulkner ", "1929", " United States ", "English"));
        bookList.add(new Book("Madame Bovary ", "Gustave Flaubert ", "1857", "  France ", "French"));
        bookList.add(new Book("Sentimental Education ", "Gustave Flaubert ", "1869", "  France ", "French"));
        bookList.add(new Book("Gypsy Ballads ", "Federico Garc�a Lorca ", "1928", " Spain ", "Spanish"));
        bookList.add(new Book("One Hundred Years of Solitude ", "Gabriel Garc�a M�rquez ", "1967", "    Colombia ", "Spanish"));
        bookList.add(new Book("Love in the Time of Cholera ", "Gabriel Garc�a M�rquez ", "1985", "  Colombia ", "Spanish"));
        bookList.add(new Book("Faust ", "Johann Wolfgang von Goethe ", "1832", "    Saxe-Weimar, Germany ", "German"));
        bookList.add(new Book("Dead Souls ", "Nikolai Gogol ", "1842", "    Russia ", "Russian"));
        bookList.add(new Book("The Tin Drum ", "G�nter Grass ", "1959", "   West Germany ", "German"));
        bookList.add(new Book("The Devil to Pay in the Backlands ", "Jo�o Guimar�es Rosa ", "1956", "   Brazil ", "Portuguese"));
        bookList.add(new Book("Hunger ", "Knut Hamsun ", "1890", "  Norway ", "Norwegian"));
        bookList.add(new Book("The Old Man and the Sea ", "Ernest Hemingway ", "1952", "    United States ", "English"));
        bookList.add(new Book("Iliad ", "Homer ", "850�750 BC ", "Possibly Smyrna ", "Classical Greek"));
        bookList.add(new Book("Odyssey ", "Homer ", "8th century BC ", "Possibly Smyrna ", "Classical Greek"));
        bookList.add(new Book("A Doll's House ", "Henrik Ibsen ", "1879", " Norway ", "Norwegian"));
        bookList.add(new Book("Ulysses ", "James Joyce ", "1922", " Irish Free State ", "English"));
        bookList.add(new Book("Stories ", "Franz Kafka ", "1924", " Austria ", "German"));
        bookList.add(new Book("The Trial ", "Franz Kafka ", "1925", "   Austria ", "German"));
        bookList.add(new Book("The Castle ", "Franz Kafka ", "1926", "  Austria ", "German"));
        bookList.add(new Book("Shakuntala ", "Kalidasa ", "1st century BC � 4th century AD ", "India ", "Sanskrit"));
        bookList.add(new Book("The Sound of the Mountain ", "Yasunari Kawabata ", "1954", " Japan ", "Japanese"));
        bookList.add(new Book("Zorba the Greek ", "Nikos Kazantzakis ", "1946", "   Greece ", "Greek"));
        bookList.add(new Book("Sons and Lovers ", "D. H. Lawrence ", "1913", "  United Kingdom ", "English"));
        bookList.add(new Book("Independent People ", "Halld�r Laxness ", "1934�35 ", "Iceland ", "Icelandic"));
        bookList.add(new Book("Poems ", "Giacomo Leopardi ", "1818", "  Italy ", "Italian"));
        bookList.add(new Book("The Golden Notebook ", "Doris Lessing ", "1962", "   United Kingdom ", "English"));
        bookList.add(new Book("Pippi Longstocking ", "Astrid Lindgren ", "1945", "  Sweden ", "Swedish"));
        bookList.add(new Book("A Madman's Diary ", "Lu Xun ", "1918", " China ", "Chinese"));
        bookList.add(new Book("Children of Gebelawi ", "Naguib Mahfouz ", "1959", " Egypt ", "Arabic"));
        bookList.add(new Book("Buddenbrooks ", "Thomas Mann ", "1901", "    Germany ", "German"));
        bookList.add(new Book("The Magic Mountain ", "Thomas Mann ", "1924", "  Germany ", "German"));
        bookList.add(new Book("Moby-Dick ", "Herman Melville ", "1851", "   United States ", "English"));
        bookList.add(new Book("Essays ", "Michel de Montaigne ", "1595", "  France ", "French"));
        bookList.add(new Book("History ", "Elsa Morante ", "1974", "    Italy ", "Italian"));
        bookList.add(new Book("Beloved ", "Toni Morrison ", "1987", "   United States ", "English"));
        bookList.add(new Book("The Tale of Genji ", "Murasaki Shikibu ", "11th century ", "Japan ", "Japanese"));
        bookList.add(new Book("The Man Without Qualities ", "Robert Musil ", "1930�32 ", "Austria ", "German"));
        bookList.add(new Book("Lolita ", "Vladimir Nabokov ", "1955", " Russia/United States ", "English"));
        bookList.add(new Book("Nineteen Eighty-Four ", "George Orwell ", "1949", "  United Kingdom ", "English"));
        bookList.add(new Book("Metamorphoses ", "Ovid ", "1st century AD ", "Roman Empire ", "Classical Latin"));
        bookList.add(new Book("The Book of Disquiet ", "Fernando Pessoa ", "1928", "    Portugal ", "Portuguese"));
        bookList.add(new Book("Tales ", "Edgar Allan Poe ", "19th century ", "United States ", "English"));
        bookList.add(new Book("In Search of Lost Time ", "Marcel Proust ", "1913�27 ", "France ", "French"));
        bookList.add(new Book("The Life of Gargantua and of Pantagruel ", "Fran�ois Rabelais ", "1532�34 ", "France ", "French"));
        bookList.add(new Book("Pedro P�ramo ", "Juan Rulfo ", "1955", " Mexico ", "Spanish"));
        bookList.add(new Book("Masnavi ", "Rumi ", "1258�73 ", "Persia, Mongol Empire ", "Persian"));
        bookList.add(new Book("Midnight's Children ", "Salman Rushdie ", "1981", "  United Kingdom ", "English"));
        bookList.add(new Book("Bostan ", "Saadi ", "1257", "    Persia, Mongol Empire ", "Persian"));
        bookList.add(new Book("Season of Migration to the North ", "Tayeb Salih ", "1971", "    Sudan ", "Arabic"));
        bookList.add(new Book("Blindness ", "Jos� Saramago ", "1995", " Portugal ", "Portuguese"));
        bookList.add(new Book("Hamlet ", "William Shakespeare ", "1603", "  England ", "English"));
        bookList.add(new Book("King Lear ", "William Shakespeare ", "1608", "   England ", "English"));
        bookList.add(new Book("Othello ", "William Shakespeare ", "1609", " England ", "English"));
        bookList.add(new Book("Oedipus the King ", "Sophocles ", "430 BC ", "Athens ", "Classical Greek"));
        bookList.add(new Book("The Red and the Black ", "Stendhal ", "1830", "  France ", "French"));
        bookList.add(new Book("Tristram Shandy ", "Laurence Sterne ", "1760", " England ", "English"));
        bookList.add(new Book("Confessions of Zeno ", "Italo Svevo ", "1923", " Italy ", "Italian"));
        bookList.add(new Book("Gulliver's Travels ", "Jonathan Swift ", "1726", "   Ireland ", "English"));
        bookList.add(new Book("War and Peace ", "Leo Tolstoy ", "1865�1869 ", "Russia ", "Russian"));
        bookList.add(new Book("Anna Karenina ", "Leo Tolstoy ", "1877", "   Russia ", "Russian"));
        bookList.add(new Book("The Death of Ivan Ilyich ", "Leo Tolstoy ", "1886", "    Russia ", "Russian"));
        bookList.add(new Book("Adventures of Huckleberry Finn ", "Mark Twain ", "1884", "   United States ", "English"));
        bookList.add(new Book("Ramayana ", "Valmiki ", "3rd century BC � 3rd century AD ", "India ", "Sanskrit"));
        bookList.add(new Book("Aeneid ", "Virgil ", "29�19 BC ", "Roman Empire ", "Classical Latin"));
        bookList.add(new Book("Mahabharata ", "Vyasa ", "4th century BC � 4th century AD ", "India ", "Sanskrit"));
        bookList.add(new Book("Leaves of Grass ", "Walt Whitman ", "1855", "    United States ", "English"));
        bookList.add(new Book("Mrs Dalloway ", "Virginia Woolf ", "1925", " United Kingdom ", "English"));
        bookList.add(new Book("To the Lighthouse ", "Virginia Woolf ", "1927", "    United Kingdom ", "English"));
        bookList.add(new Book("Memoirs of Hadrian ", "Marguerite Yourcenar ", "1951", " France ", "French"));
        bookList.add(new Book("9228241614 Fall Apart ", "Chinua Achebe ", "1958", " Nigeria ", "English"));

        Collections.sort(bookList);
        return bookList;
    }
}