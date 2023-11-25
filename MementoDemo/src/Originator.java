// Originator
class Originator {
    private StringBuilder text;

    public Originator() {
        this.text = new StringBuilder();
    }

    public void addText(String newText) {
        if (text.length() > 0) {
            // Add a space if there is existing text
            text.append(". ");
        }
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        this.text = new StringBuilder(memento.getText());
    }
}