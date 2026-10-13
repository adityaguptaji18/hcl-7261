package com.hcl.library.model;

abstract class LibraryItem implements Comparable<LibraryItem>{
    private int id;
    private String title;
    private int year;
    private boolean available;

    public LibraryItem(int id,String title,int year,boolean available){
        if(title.isBlank()|| !(year>1900 && year<2026)){
            throw new IllegalArgumentException("Invalid Year");
        }
        this.id=id;
        this.title=title;
        this.year=year;
        this.available=available;
    }
    abstract double lateFee(int daysLate);
    @Override
    public int compareTo(LibraryItem o){
        return this.title.compareTo(o.title);
    }
}
