package Exercise;

public class TriagleClassifier {
    public static  String checkTriagle(double slice1,double slice2,double slice3){
        if(isTriagle(slice1,slice2,slice3)){
            if(slice1==slice2&&slice2==slice3){
                return "tam giác đều";
            } else if (slice1==slice2||slice2==slice3||slice3==slice1) {
                return "tam giác cân";
            } else if ((slice1*slice1)==(slice2*slice2+slice3*slice3)||
                    (slice2*slice2)==(slice1*slice1+slice3*slice3)||
                    (slice3*slice3)==(slice2*slice2+slice1*slice1)) {
                return "tam giác vuông";
            }
            else return "tam giác nhọn";
        }
        else return "không phải là tam giác";
    }

    private static boolean isTriagle(double slice1,double slice2,double slice3){
        boolean checkSlice1=slice1<slice2+slice3;
        boolean checkSlice2=slice2<slice1+slice3;
        boolean checkSlice3=slice3<slice2+slice1;

        if(checkSlice1&&checkSlice3&&checkSlice2){
            return true;
        }
        return false;
    }
}
