package com.schmitty.MorseLearn.sound;
import java.util.*;

//Add dictionary for character levels
public class morse_player {
//create map for character to morse code conversion
//Also create map class for different levels of character learning.  level 1 5etar level 2 sln04 etc..
    //whatever combos are according to TSART book.
    Map <String, String > decode_key = new HashMap<String, String>();
    //copy dictionary from c++ project!
    public java.util.HashMap<Character, String> morsedict = new java.util.HashMap<Character, String>();
    {
       // convert {} to () and , to ; later

        morsedict.put ('a', ".-");
        morsedict.put ('b', "-...");
        morsedict.put ('c', "-.-.");
        morsedict.put('d', "-..");
        morsedict.put('e', ".");
        morsedict.put('f', "..-.");
        morsedict.put('g', "--.");
        morsedict.put('h', "....");
        morsedict.put('i', "..");
        morsedict.put('j', ".---");
        morsedict.put('k', "-.-");
        morsedict.put ('l', ".-..");
        morsedict.put('m', "--");
        morsedict.put('n', "-.");
        morsedict.put('o', "---");
        morsedict.put('p', ".--.");
        morsedict.put('q', "--.-");
        morsedict.put('r', ".-.");
        morsedict.put('s', "...");
        morsedict.put('t', "-");
        morsedict.put('u', "..-");
        morsedict.put('v', "...-");
        morsedict.put('w', ".--");
        morsedict.put('x', "-..-");
        morsedict.put('y', "-.--");
        morsedict.put('z', "--..");
        morsedict.put('0', "-----");
        morsedict.put('1', ".----");
        morsedict.put('2', "..---");
        morsedict.put('3', "...--");
        morsedict.put('4', "....-");
        morsedict.put('5', ".....");
        morsedict.put('6', "-....");
        morsedict.put('7', "--...");
        morsedict.put('8', "---..");
        morsedict.put('9', "----.");
        morsedict.put('?', "..--..");
        morsedict.put('!', ".-.-");
        morsedict.put('(', "--..--");
        morsedict.put (')', ".........");
        morsedict.put(' ', " ");
        morsedict.put('@', ".--.-.");
        morsedict.put('/', "-..-.");

        //finish fixing dictionary
        //add that one command to convert it to unchangeable.....whatever it was called...
    };

}
