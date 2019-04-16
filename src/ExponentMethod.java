public class ExponentMethod {
    public static int raiseToPower(int baseVal, int exponentVal) {
        int resultVal;

        if (exponentVal == 0) {
            resultVal = 1;
        }
        else {
            resultVal = baseVal * raiseToPower(baseVal,exponentVal-1);
        }

        return resultVal;
    }

    public static void main (String [] args) {
        int userBase;
        int userExponent;

        userBase = 4;
        userExponent = 2;
        System.out.println(userBase + "^" + userExponent + " = "
                + raiseToPower(userBase, userExponent));
    }
}