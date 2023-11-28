# MementoDemo
# Overview:
  This Java program demonstrate the implementation of the Memento Design Pattern in the context of a continuos text input application with undo functionality. The Memento pattern allows user to input the text continuosly, save each state as Memento, and perform undo operations effectively.
# Components:
  - Memento:
    The Memento class represents a state snapshot, capturing the text as a specific point in time.
  - Originator:
    The Originator class, acting as a text editor, manages the text and states.
    Provide methods to add text, retrieve the current text, save the state as a Memento, and restore the state from a Memento
  - Caretaker:
    The Caretaker class serves as the undo manager, keeping track of Mementos in a stack
    Provide methods to save a Memento and retrieve the Memento for undo operations.
    
  
