package com.schmitty.MorseLearn.sound;
import java.util.*;
import java.io.ByteArrayOutputStream; // equivalent to memory stream in vb.net ????
//TODO IMPORTANT!!! ...FIND OUT IF ByteArrayOutputStream will work with wave playback! IMPORTANT!!!!
//TODO get formulas for dit dah spacing.
//TODO find vb.net memory stream equivalent for java programs.
//todo Add dictionary for character levels
//TODO Create global variables for class
//TODO copy C++ code into java for wave file creation.
//TODO find out how to playback ByteStreamOutput with wave data!

/** morse_player creates dit and dah waves and allows single character and word playback in morse code.
 *
 * @author Brian S.
 * @version Alpha
 */
public class morse_player { //( double frequency, int WPM, boolean farnsworth){
//TODO create WPM variables and wave file variables

    //variables for dit dah lengths.
    double dit_duration_ms = 100;
    double dah_duration_ms = 300;
    double dit_duration_samples = 0;
    double dah_duration_samples = 0;
    double freq_hz = 800;
    int WPM = 25;
    boolean farnsworth_space_bool = false;
    double inter_element_spacing = 50;
    double word_spacing = 300;

// variables for wave creation
    double sample_rate = 44100;
    double channels = 1;
    double theta = Math.PI * 2;

    /**
     * Convert PCM wave stream to WAVE file format returned as WAVE_sample
     * @param PCM_sample PCM based ByteArrayOutputStream (input data)
     * @param WAVE_sample WAVE file created from PCM_sample (output data)
     * @return Returns wave sample
     */
   private ByteArrayOutputStream PCM_to_Wave (ByteArrayOutputStream PCM_sample, ByteArrayOutputStream WAVE_sample)
   {
    //TODO code to add wave header to PCM stream
       return WAVE_sample;

   }


    private ByteArrayOutputStream hahn_window ( ByteArrayOutputStream PCM_sample, int rise_time, int decay_time ){
        //TODO function to create a hahn window for the wave file
        //read full wave and create a hahn window for wave file.
        //possibly not use this function but will build it into the wave creation routine.
    return PCM_sample;
    }

//create map for character to morse code conversion
//Also create map class for different levels of character learning.  level 1 5etar level 2 sln04 etc..
    //whatever combos are according to TSART book.
    Map <String, String > decode_key = new HashMap<String, String>();
    //copy dictionary from c++ project!
    public java.util.HashMap<Character, String> morsedict = new java.util.HashMap<Character, String>();
    {
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
    }
public ByteArrayOutputStream dit_stream = new ByteArrayOutputStream();
public ByteArrayOutputStream dah_stream = new ByteArrayOutputStream();

public void initialise_sounds (double freq_hz, int WPM, boolean farnsworth_space_bool ) {
    //TODO create subroutine to initialise wave files for playback.
    if (farnsworth_space_bool) {
        word_spacing = word_spacing * 3;
    }
}
    private static void play_dit(){}
    //TODO code to play_dit
    private static void play_dah(){}
    //TODO code to play dah
    public void play_character (char play_this){}
    //TODO code to play single morse character
   //This is how a dictionary is referenced in JAVA!
    String test = morsedict.get('s');

    public void play_words (String play_this){}
    //TODO code to play words using morse



}

}
