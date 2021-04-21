package ie.tudublin;

public class Note {
    //private fields
    private char note;
    private int duration;

    //constructor
    public Note(char note, int duration)
    {
        this.note = note;
        this.duration = duration;
    }

    //toString method
    public String toString() {
        return "Notes [note= " + note + "length of note = " + duration + "]";

    }

}
