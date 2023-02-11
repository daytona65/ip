package duke.task;

/**
 * The Task class.
 */
public class Task {
    protected String description;
    protected boolean isDone = false;


    /**
     * Constructor to create a Task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns X if the task is done, and whitespace if the task is not done.
     *
     * @return The string representation of whether the task is done or not.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Returns description of the task.
     *
     * @return The description of the task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Marks the task as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Marks the task as not done.
     */
    public void markAsNotDone() {
        this.isDone = false;
    }

    /**
     * Checks if the task is done.
     *
     * @return Boolean representing if the task is done or not.
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * String representation of the task.
     *
     * @return The string representation of the task.
     */
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }
}
