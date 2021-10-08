package e3;

import java.util.ArrayList;

public class Melody {
    public enum Notes {
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI;
    }

    public enum Accidentals {
        NATURAL,
        SHARP,
        FLAT;
    }

    public Notes note;
    public Accidentals accidental;
    public float time;
    public ArrayList<Melody> arrayMelody = new ArrayList<Melody>();

    /**
     * Creates an empty Melody instance .
     */
    public Melody() {
    }

    public Melody(Notes note, Accidentals accidental, float time) {
        this.note = note;
        this.accidental = accidental;
        this.time = time;
    }

    /**
     * Add a note at the end of this melody .
     *
     * @param note       The note to add
     * @param accidental The accidental of the note
     * @param time       The duration of the note in milliseconds
     * @throws IllegalArgumentException if the note , the accidental
     *                                  or the time are not valid values .
     */
    public void addNote(Notes note, Accidentals accidental, float time) {
        if (note == null || accidental == null || time <= 0) {
            throw new IllegalArgumentException("Not A Valid Value");
        }
        arrayMelody.add(new Melody(note, accidental, time));
    }

    /**
     * Returns the note on the given position
     *
     * @param index The position of the note to get .
     * @return The note on index .
     * @throws IllegalArgumentException if the index is not a valid position .
     */
    public Notes getNote(int index) {
        if (index < 0 || index >= arrayMelody.size()) {
            throw new IllegalArgumentException("Not a valid note position");
        }
        if(arrayMelody.get(index)==null){
            throw new IllegalArgumentException("Nulo");
        }
        Melody Selected = arrayMelody.get(index);
        return Selected.note;
    }

    /**
     * Returns the accidental of the note on the given position
     *
     * @param index The position of the accidental to get .
     * @return The accidental on index .
     * @throws IllegalArgumentException if the index is not a valid position .
     */
    public Accidentals getAccidental(int index) {
        if (index < 0 || index > arrayMelody.size() - 1) {
            throw new IllegalArgumentException("Accidental not valid position");
        }
        Melody Selected = arrayMelody.get(index);
        return Selected.accidental;
    }

    /**
     * Returns the duration of the note on the given position
     *
     * @param index The position of the time to get .
     * @return The time on index .
     * @throws IllegalArgumentException if the index is not a valid position .
     */
    public float getTime(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Time not a valid position");
        }
        Melody Selected = arrayMelody.get(index);
        return Selected.time;
    }

    /**
     * Returns the number of notes in this melody .
     *
     * @return The number of notes in this melody .
     */
    public int size() {
        return arrayMelody.size();
    }

    /**
     * Returns the duration of this melody .
     *
     * @return The duration of this melody in milliseconds .
     */
    public float getDuration() {
        int i;
        float Seltime, ttime = 0;
        for (i = 0; i < arrayMelody.size(); i++) {
            Melody Selected = arrayMelody.get(i);
            Seltime = Selected.time;
            ttime = ttime + Seltime;
        }
        return ttime;
    }

    /**
     * Performs the equality tests of the current melody with another melody
     * passed as a parameter . Two melodies are equal if they represent the same
     * music fragment regardless of the name of its notes .
     * @param o The melody to be compared with the current melody .
    6
     * @return true if the melodies are equals , false otherwise .
     */


    @Override
    public boolean equals(Object o) {
        Melody melody1, melody2;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Melody melody3 = (Melody) o;
        if ((this.arrayMelody).size() == (melody3.arrayMelody).size()) {
            for (int i = 0; i < (melody3.arrayMelody).size(); i++) {
                melody1 = melody3.arrayMelody.get(i);
                melody2 = this.arrayMelody.get(i);

                if(melody1.time != melody2.time){
                    return false;
                }
                else if(melody1.note != melody2.note && melody1.accidental == melody2.accidental){
                    return false;
                }
                else if(melody1.note == melody2.note && melody1.accidental != melody2.accidental){
                    return false;
                }
                else if(melody1.note == melody2.note){
                        continue;
                }
                else{
                    if (melody1.note==Notes.DO && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.RE && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.DO && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.SI && melody2.accidental == Accidentals.NATURAL){
                        continue;
                    }
                    else if(melody1.note==Notes.DO && melody1.accidental == Accidentals.NATURAL && melody2.note == Notes.SI && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.RE && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.MI && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.RE && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.DO && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.MI && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.RE && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.MI && melody1.accidental == Accidentals.NATURAL && melody2.note == Notes.FA && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.MI && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.FA && melody2.accidental == Accidentals.NATURAL){
                        continue;
                    }
                    else if(melody1.note==Notes.FA && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.MI && melody2.accidental == Accidentals.NATURAL){
                        continue;
                    }
                    else if(melody1.note==Notes.FA && melody1.accidental == Accidentals.NATURAL && melody2.note == Notes.MI && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.FA && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.SOL && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.SOL && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.FA && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.SOL && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.LA && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.LA && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.SOL && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.LA && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.SI && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.SI && melody1.accidental == Accidentals.FLAT && melody2.note == Notes.LA && melody2.accidental == Accidentals.SHARP){
                        continue;
                    }
                    else if(melody1.note==Notes.SI && melody1.accidental == Accidentals.NATURAL && melody2.note == Notes.DO && melody2.accidental == Accidentals.FLAT){
                        continue;
                    }
                    else if(melody1.note==Notes.SI && melody1.accidental == Accidentals.SHARP && melody2.note == Notes.DO && melody2.accidental == Accidentals.NATURAL){
                        continue;
                    }
                }
            }return true;
        } else return false;
    }

    /**
     * Returns an integer that is a hash code representation of the melody .
     * Two melodies m1 , m2 that are equals (m1. equals (m2) == true ) must
     * have the same hash code .
     * @return The hash code of this melody .
     */
    @Override
    public int hashCode () {
        return 0;
    }
    /**
     * The string representation of this melody .
     * @return The String representantion of this melody .
     */
    @Override
    public String toString () {
        String concat1="";
        for (int i = 0; i < this.size(); i++) {
            String notes = String.valueOf(this.getNote(i));
            String accidentals = String.valueOf(this.getAccidental(i));
            if (accidentals == "FLAT") {
                accidentals = "b";
            } else if (accidentals == "SHARP") {
                accidentals = "#";
            } else if (accidentals == "NATURAL") {
                accidentals = "";
            }
            String time = String.valueOf(this.getTime(i));
            if(i == this.size()-1){
                concat1 += notes.concat(accidentals).concat("(").concat(time).concat(")");
            }else{
                concat1 += notes.concat(accidentals).concat("(").concat(time).concat(")").concat(" ");
            }
        }
        return concat1;
    }

}
