package ekud.task;

public class ToDo extends Task {
    /**
     * Constructor that instantiates an instance of ToDo.
     * 
     * @param description Description of task.
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFileFormat() {
        assert this.getStatusIcon().equals("X") || this.getStatusIcon().equals(" ");
        int isDone = this.getStatusIcon().equals("X") ? 1 : 0;
        return String.format("T|%d|%s", isDone, this.getDescription());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format("[T]%s", super.toString());
    }
}
