package hw6.lesson6.notes.core.application.interfaces;

import hw6.lesson6.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer>{

    void printAll();

}
