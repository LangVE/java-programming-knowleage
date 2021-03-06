package study.ducksunlee.chap10.deok;

/**
 * Created by 이상덕 on 2017-11-21.
 */
public class ValueContainer {
    private final String value;

    public ValueContainer(final String value) {
        this.value = value;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.printf("Finalizing for [%s]%n", toString());
    }

}
