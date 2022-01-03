# Interactive-Bookshelf

The task for this homework is to create an interactive bookshelf for storing various pieces of literature. Model
the classes (the names of classes to implement are written in verbatim font), inheritance and composition as
follows. Each piece of Literature is described by its title, author and year of publication. Literature
cannot be instantiated but has two special derived cases: Book (Book has the property publisher in addition
to the basic properties of Literature) and Comic (has property genre in addition to the basic properties of
Literature). Author has his name and surname defined.

Bookshelf contains a collection of Literature and implements an interface LiteratureHolder with following methods:

1. public void addLiterature(Literature lit) – adds literature to the collection of the pieces of literature in the shelf.
2. public void removeLiteratue(Literature lit) – removes literature from the collection of literatures
in the shelf.
3. public void printShelf() – prints all of the literature inside shelf SORTED by the following key: 1.
author’s surname, 2. author’s name, 3. title of the literature, 4. year of publication. Each entry will
be printed in the following format: ”Author: Title (Year) – Book / Comic (Publisher / Genre)”, e.g.
”Tolkien, John Ronald Reuel: The Hobbit (1937) – Book (GAU UK)”.
4. public void printLiteratureBy(Author a) – prints all of the literature in the shelf written by the
Author a.
5. public void printLiteratureBetweenYears(int yearFrom, int yearTo) – prints all of the literature
in the shelf that was published between the years yearFrom and yearTo (these years included).
