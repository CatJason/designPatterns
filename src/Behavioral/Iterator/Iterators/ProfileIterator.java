package Behavioral.Iterator.Iterators;


import Behavioral.Iterator.Profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
