package Exercise;

public class TriangleEdgesCheck {
    // Ham kiem tra tam giac hop le
    public void checkTriangleEdges(double a, double b, double c) throws  triangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new triangleEdgesException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
