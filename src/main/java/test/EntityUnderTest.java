package test;


import java.util.Objects;


public class EntityUnderTest {

    private ChildEntity faultInjectionParameters = new ChildEntity();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityUnderTest that = (EntityUnderTest) o;
        return Objects.equals(faultInjectionParameters, that.faultInjectionParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faultInjectionParameters);
    }

}
