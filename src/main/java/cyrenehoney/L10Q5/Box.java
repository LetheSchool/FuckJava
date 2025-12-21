package cyrenehoney.L10Q5;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public void setContent(T item) {
        this.content = item;
    }

    public T getContent() {
        return content;
    }
}