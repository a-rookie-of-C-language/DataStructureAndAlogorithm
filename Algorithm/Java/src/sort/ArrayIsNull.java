package sort;

import java.util.function.Supplier;

public class ArrayIsNull extends Throwable implements Supplier<ArrayIsNull>{
    public ArrayIsNull() {}

    public ArrayIsNull(String s) {
        super(s);
    }

    @Override
    public ArrayIsNull get() {
        return new ArrayIsNull("array is null");
    }

}
