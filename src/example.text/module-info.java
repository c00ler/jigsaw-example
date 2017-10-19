module example.text {
    requires transitive java.sql;
    exports com.n26.text;

    opens com.n26.text to example.main;
//    opens com.n26.text;
}
