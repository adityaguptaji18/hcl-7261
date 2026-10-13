
package com.hcl.library.model;

public class Book implements LibraryItem {

    String author;
    int isbn;
    double lateFee = 2.0;

    @Override
    public double getLateFee() {
        return lateFee;
    }
}
