package hw6;

import hw6.lesson6.database.NotesDatabase;
import hw6.lesson6.notes.core.application.ConcreteNoteEditor;
import hw6.lesson6.notes.infrastructure.persistance.NotesDbContext;
import hw6.lesson6.notes.presentation.queries.controllers.NotesController;
import hw6.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {

        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase(), new NotesConsolePresenter())));
        controller.routeGetAll();
    }
}
