package org.patterns.behavioral.Strategy;


/** Strategy :
 * Define a family of algorithms encapsulates each one and make them interchangeable. The strategy design
 * pattern lets the algorithm vary independently from clients that use it. The interface can then have other
 * dynamic implementations (behaviors) Flyslowly flyfast notflying etc ...
 */
public interface Flys {
    public String Fly();
    public String Dive();
}
