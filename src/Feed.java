public interface Feed {
    // interface för de metoder vi behöver ha med i alla klasser. Här kommer även polymorfismen in då det beror på vilken klass
    // som anropar metoden så får man ut olika resultat av dessa metoder.

    double howMuchFeed();

    String printOut();

    String wichFluid();
}

