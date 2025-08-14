
// Custom unchecked exception for significant failure cases
public class FailedSignificantlyException extends RuntimeException {
    public FailedSignificantlyException(String message) {
        super(message);
    }
}
