package ie.tudublin;

public class Note {
    //private fields
    private char note;
    private int duration;

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //constructor
    public Note(char note, int duration)
    {
        this.note = note;
        this.duration = duration;
    }


    public Note(String score) {
    }

    //toString method
    @Override
    public String toString() {
        return "Notes [note = " + note + " length of note = " + duration + "]";

    }

}
