
import java.util.Scanner;

public class TestMemento {
    public static void main(String[] args) {
        Originator textEditor = new Originator();
        Caretaker undoManager = new Caretaker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Take text input from the user
            System.out.print("Enter Text (type 'end' to exit, or 'undo' to undo): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                // Exit the loop when the user types 'end'
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                // Undo to the previous text
                Memento undoMemento = undoManager.getUndoMemento();
                if (undoMemento != null) {
                    textEditor.restore(undoMemento);
                    System.out.println("After Undo: " + textEditor.getText());
                } else {
                    System.out.println("Nothing to undo.");
                }
            } else {
                // Add the entered text to the editor
                textEditor.addText(input);
                undoManager.saveMemento(textEditor.save());
                System.out.println("Current Text: " + textEditor.getText());
            }
        }

        // Close the scanner
        scanner.close();
    }
}