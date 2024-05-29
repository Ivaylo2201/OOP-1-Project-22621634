package helpers;

import interfaces.FigureProcessor;
import processors.CircleProcessor;
import processors.LineProcessor;
import processors.RectangleProcessor;

import java.util.HashMap;
import java.util.Map;

/**
 * A utility class for managing figure processors.
 * This class maps figure type strings to their corresponding FigureProcessor instances.
 */
public class ProcessorMapper {
    public final Map<String, FigureProcessor> processors = new HashMap<>();

    /**
     * Constructs a new ProcessorMapper instance and initializes processors for supported figure types.
     * The supported figure types are "rectangle", "circle", and "line".
     */
    public ProcessorMapper() {
        this.processors.put("rectangle", new RectangleProcessor());
        this.processors.put("circle", new CircleProcessor());
        this.processors.put("line", new LineProcessor());
    }
}
