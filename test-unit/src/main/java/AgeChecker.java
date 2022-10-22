
public class AgeChecker {
    // Description: BR is 18, USA is 21, JP is 20.
    public boolean personAgeChecker(int age, String coutry){
        Boolean personIsMajor = null;

        if (coutry.equalsIgnoreCase("USA")){
            personIsMajor = age < 21? false : true;
        }else if (coutry.equalsIgnoreCase("BR")) {
            personIsMajor = age < 18? false : true;
        } else if (coutry.equalsIgnoreCase("JP")) {
            personIsMajor = age < 20? false : true;
        }

        return personIsMajor;
    }


}
