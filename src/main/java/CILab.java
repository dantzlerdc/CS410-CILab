public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String allUpper = myString.toUpperCase();
        String allLower = myString.toLowerCase();

        if(myString.equals(allUpper))
            return true;

        if(myString.equals(allLower))
            return true;

        if (myString.charAt(0) == allUpper.charAt(0))
            return true;

        return false;
    }

}

