package A11;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Controller{
    private final Model model;
    private final A11.Gui gui;
    private final List<IMemento> history;
    private final List<IMemento> future;
    private final LinkedHashMap<Date, String> savedHistory;

    public Controller(A11.Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.future = new ArrayList<>();
        this.savedHistory = new LinkedHashMap<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        future.clear();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        future.clear();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            saveToFuture();
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo(){
        if (!future.isEmpty()) {
            saveToHistory();
            IMemento previousState = future.remove(future.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public LinkedHashMap<Date, String> getHistory(){
        return savedHistory;
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        savedHistory.put(currentState.getCreationDate(), currentState.getParsedOptions());
        history.add(currentState);
    }

    private void saveToFuture() {
        IMemento currentState = model.createMemento();
        future.add(currentState);
    }
}
