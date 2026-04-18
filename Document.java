public interface Document extends Cloneable {
    Document clone() throws CloneNotSupportedException;
    void open();
    String getType();
}
