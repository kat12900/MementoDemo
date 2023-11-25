import java.util.Stack;
class Caretaker {
    private Stack<Memento> mementos = new Stack<>();

    public void saveMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento getUndoMemento() {
        // Check if there is a previous state to undo to
        if (mementos.size() > 1) {
            // Pop the last Memento (current state) from the stack
            mementos.pop();
            // Return the now current Memento (previous state)
            return mementos.peek();
        }
        return null; // Return null if there is no previous state to undo to
    }
}