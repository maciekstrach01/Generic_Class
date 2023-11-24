import java.util.*;
public class Triple<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
        implements Comparable<Triple<T1, T2, T3>> {
    private T1 first;
    private T2 second;
    private T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T1 getFirst() {
        return first;
    } // biblioteka lombok

    public T2 getSecond() {
        return second;
    } // biblioteka lombok

    public T3 getThird() {
        return third;
    } // biblioteka lombok

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
        return first.equals(triple.first) &&
                second.equals(triple.second) &&
                third.equals(triple.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public int compareTo(Triple<T1, T2, T3> o) {
        if (this.first.compareTo(o.first) != 0) {
            return this.first.compareTo(o.first);
        } else if (this.second.compareTo(o.second) != 0) {
            return this.second.compareTo(o.second);
        } else {
            return this.third.compareTo(o.third);
        }
    }

    @Override
    public String toString() {
        return "Triple<" + first + ", " + second + ", " + third + ">";
    }
}
