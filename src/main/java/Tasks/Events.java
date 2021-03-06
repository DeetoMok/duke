package Tasks;

public class Events extends Task {
    public Events(String description) {
        super(description.substring(0, description.indexOf("/")) + "("
                + description.substring(description.indexOf("/") + 1) + ")");
    }

    @Override
    public String toString() {
        return "[E][" + getStatusIcon() + "] " + description;
    }
}
