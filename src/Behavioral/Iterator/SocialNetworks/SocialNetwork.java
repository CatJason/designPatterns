package Behavioral.Iterator.SocialNetworks;

import Behavioral.Iterator.Iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}