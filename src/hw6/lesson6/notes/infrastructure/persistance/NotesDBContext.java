package hw6.lesson6.notes.infrastructure.persistance;

import hw6.lesson6.database.NotesDatabase;
import hw6.lesson6.database.NotesRecord;
import hw6.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import hw6.lesson6.notes.core.domain.Note;
import hw6.lesson6.notes.infrastructure.persistance.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class NotesDBContext extends DbContext implements NotesDatabaseContext {

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }

    public NotesDBContext(Database database) {super(database);}

    @Override
    protected void onModelCreating(ModelBuilder builder) {builder.applyConfiguration(new NoteConfiguration());}
}
